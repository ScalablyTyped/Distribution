package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardModel extends js.Object {
  val CheckedOutTo: IMetadataCardControl = js.native
  val ClassSelector: IMetadataCardControl = js.native
  val Comment: IMetadataCardControl = js.native
  val DataModels: ICollection = js.native
  val Events: IEvents = js.native
  val ID: java.lang.String = js.native
  val IconURL: java.lang.String = js.native
  val IsFileAvailableForPreview: scala.Boolean = js.native
  val IsUpdating: scala.Boolean = js.native
  val ObjVers: IObjVers = js.native
  val ObjectId: IMetadataCardControl = js.native
  val ObjectType: IMetadataCardControl = js.native
  val ObjectTypeId: IMetadataCardControl = js.native
  val ObjectVersion: IMetadataCardControl = js.native
  val PermissionsDescription: java.lang.String = js.native
  val PropertyControls: ICollection = js.native
  val PropertySelector: IMetadataCardControl = js.native
  val SaveAsTypeSelector: IMetadataCardControl = js.native
  val Title: IMetadataCardControl = js.native
  val UncreatedObject: scala.Boolean = js.native
  def AddProperty(propertyDefId: mfilesLib.MFilesNs.MFBuiltInPropertyDef): scala.Unit = js.native
  def AddProperty(propertyDefId: scala.Double): scala.Unit = js.native
  def GetCommentVersionHistory(): js.Any = js.native
  def GetError(): js.Any = js.native
  def GetIconOverlayHint(): java.lang.String = js.native
  def GetObjectSourceFiles(): js.Any = js.native
  def GetObjectTemplateDescription(): java.lang.String = js.native
  def GetRemoteVaultAction(): IMetadataCardAction = js.native
  def GetSubObjectsAction(): IMetadataCardAction = js.native
  def GetValueListItemIdByGUID(propertyDefId: mfilesLib.MFilesNs.MFBuiltInPropertyDef, guidToLookFor: java.lang.String): scala.Double = js.native
  def GetValueListItemIdByGUID(propertyDefId: scala.Double, guidToLookFor: java.lang.String): scala.Double = js.native
  def IsModified(): scala.Boolean = js.native
  def Rebuild(iterationCounter: scala.Double, classChanged: scala.Boolean, addedPropertyDef: scala.Double): scala.Boolean = js.native
  def SetAdditionalPropertyDefs(additionalPropertyDefs: js.Any): scala.Unit = js.native
  def SetCustomPlaceholders(customPlaceholders: js.Any): scala.Unit = js.native
  def SetRequiredPropertyDefs(requiredPropertyDefs: js.Any): scala.Unit = js.native
  def SetUnevaluatedPropertyValues(unevaluatedValues: js.Any): scala.Unit = js.native
  def ShowFilePreview(previewer: js.Any): scala.Unit = js.native
}

