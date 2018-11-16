package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectCreationInfo extends js.Object {
  var DisallowTemplateSelection: scala.Boolean = js.native
  var ExplicitObjectID: scala.Double = js.native
  var IsObjectShortcut: scala.Boolean = js.native
  var ObjectGUID: java.lang.String = js.native
  var OkToAllButtonVisible: scala.Boolean = js.native
  var SkipThisButtonVisible: scala.Boolean = js.native
  def GetDisableObjectCreation(): scala.Boolean = js.native
  def GetExtension(): java.lang.String = js.native
  def GetMetadataCardTitle(): java.lang.String = js.native
  def GetObjectType(): scala.Double = js.native
  def GetSelectableFileClasses(): IFileClasses = js.native
  def GetSelectedFileClass(): IFileClass = js.native
  def GetSingleFileDocument(): scala.Boolean = js.native
  def GetSourceFiles(): ISourceObjectFiles = js.native
  def GetTemplate(): IObjVer = js.native
  def GetTitle(): ITypedValue = js.native
  def GetTitleAsText(): java.lang.String = js.native
  def GetUseAsDefaults(): scala.Boolean = js.native
  def SetDisableObjectCreation(Disable: scala.Boolean): scala.Unit = js.native
  def SetExtension(Extension: java.lang.String, Editable: scala.Boolean): scala.Unit = js.native
  def SetMetadataCardTitle(MetadataCardTitle: java.lang.String): scala.Unit = js.native
  def SetObjectType(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType, Editable: scala.Boolean): scala.Unit = js.native
  def SetObjectType(ObjectType: scala.Double, Editable: scala.Boolean): scala.Unit = js.native
  def SetSelectableFileClasses(FileClasses: IFileClasses): scala.Unit = js.native
  def SetSelectedFileClass(FileClass: IFileClass, Editable: scala.Boolean): scala.Unit = js.native
  def SetSingleFileDocument(SingleFile: scala.Boolean, Editable: scala.Boolean): scala.Unit = js.native
  def SetSourceFiles(SourceFiles: ISourceObjectFiles): scala.Unit = js.native
  def SetTemplate(Template: IObjVer): scala.Unit = js.native
  def SetTitle(Title: ITypedValue, Editable: scala.Boolean): scala.Unit = js.native
  def SetTitleAsDatatypeText(Title: java.lang.String, Editable: scala.Boolean): scala.Unit = js.native
  def SetUseAsDefaults(UseAsDefaults: scala.Boolean, Editable: scala.Boolean): scala.Unit = js.native
}

