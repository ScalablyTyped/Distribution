package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMetadataCardControl extends js.Object {
  val AllowAdding: scala.Boolean
  val Events: IEvents
  val Hierarchical: scala.Boolean
  val ID: java.lang.String
  var Label: java.lang.String
  val Linked: scala.Boolean
  var Modified: scala.Boolean
  var MustExist: scala.Boolean
  val PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double
  var ReadOnly: scala.Boolean
  val RealObjectType: scala.Boolean
  val Type: java.lang.String
  var Value: js.Any
  var ValueRequired: scala.Boolean
  val Valuelist: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double
  var Visible: scala.Boolean
  def ActivateLink(valuePart: js.Any): scala.Unit
  def AddNewItem(name: java.lang.String): js.Any
  def AddNewSubItem(name: java.lang.String, valueParent: js.Any): js.Any
  def AllowHitHighlighting(): scala.Boolean
  def CanActivateLink(valuePart: js.Any): scala.Boolean
  def CanAddNewSubItem(name: java.lang.String, valueParent: js.Any): scala.Boolean
  def CanEditItem(value: js.Any): scala.Boolean
  def CreateSelectionList(): IMetadataCardSelectionList
  def CreateUnvalidatedValue(valueString: java.lang.String): IMetadataCardUnvalidatedValue
  def EditItem(value: js.Any): js.Any
  def FindItem(name: java.lang.String): js.Any
  def FindItemByID(itemID: scala.Double): js.Any
  def GetSelectableValueItemStates(): js.Any
  def GetValueSuggestions(): js.Any
  def HasAutomaticValue(): scala.Boolean
  def HasInitialValue(): scala.Boolean
  def HasUncalculatedAutomaticValue(): scala.Boolean
  def IsExternal(): scala.Boolean
  def RefreshList(): scala.Unit
  def Remove(): scala.Unit
  def RevertToInitialValue(): scala.Unit
  def SetValueItemState(itemID: java.lang.String, state: js.Any): scala.Unit
}

