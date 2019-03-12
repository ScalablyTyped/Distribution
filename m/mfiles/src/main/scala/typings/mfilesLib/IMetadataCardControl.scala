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

object IMetadataCardControl {
  @scala.inline
  def apply(
    ActivateLink: js.Any => scala.Unit,
    AddNewItem: java.lang.String => js.Any,
    AddNewSubItem: (java.lang.String, js.Any) => js.Any,
    AllowAdding: scala.Boolean,
    AllowHitHighlighting: () => scala.Boolean,
    CanActivateLink: js.Any => scala.Boolean,
    CanAddNewSubItem: (java.lang.String, js.Any) => scala.Boolean,
    CanEditItem: js.Any => scala.Boolean,
    CreateSelectionList: () => IMetadataCardSelectionList,
    CreateUnvalidatedValue: java.lang.String => IMetadataCardUnvalidatedValue,
    EditItem: js.Any => js.Any,
    Events: IEvents,
    FindItem: java.lang.String => js.Any,
    FindItemByID: scala.Double => js.Any,
    GetSelectableValueItemStates: () => js.Any,
    GetValueSuggestions: () => js.Any,
    HasAutomaticValue: () => scala.Boolean,
    HasInitialValue: () => scala.Boolean,
    HasUncalculatedAutomaticValue: () => scala.Boolean,
    Hierarchical: scala.Boolean,
    ID: java.lang.String,
    IsExternal: () => scala.Boolean,
    Label: java.lang.String,
    Linked: scala.Boolean,
    Modified: scala.Boolean,
    MustExist: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    ReadOnly: scala.Boolean,
    RealObjectType: scala.Boolean,
    RefreshList: () => scala.Unit,
    Remove: () => scala.Unit,
    RevertToInitialValue: () => scala.Unit,
    SetValueItemState: (java.lang.String, js.Any) => scala.Unit,
    Type: java.lang.String,
    Value: js.Any,
    ValueRequired: scala.Boolean,
    Valuelist: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double,
    Visible: scala.Boolean
  ): IMetadataCardControl = {
    val __obj = js.Dynamic.literal(ActivateLink = js.Any.fromFunction1(ActivateLink), AddNewItem = js.Any.fromFunction1(AddNewItem), AddNewSubItem = js.Any.fromFunction2(AddNewSubItem), AllowAdding = AllowAdding, AllowHitHighlighting = js.Any.fromFunction0(AllowHitHighlighting), CanActivateLink = js.Any.fromFunction1(CanActivateLink), CanAddNewSubItem = js.Any.fromFunction2(CanAddNewSubItem), CanEditItem = js.Any.fromFunction1(CanEditItem), CreateSelectionList = js.Any.fromFunction0(CreateSelectionList), CreateUnvalidatedValue = js.Any.fromFunction1(CreateUnvalidatedValue), EditItem = js.Any.fromFunction1(EditItem), Events = Events, FindItem = js.Any.fromFunction1(FindItem), FindItemByID = js.Any.fromFunction1(FindItemByID), GetSelectableValueItemStates = js.Any.fromFunction0(GetSelectableValueItemStates), GetValueSuggestions = js.Any.fromFunction0(GetValueSuggestions), HasAutomaticValue = js.Any.fromFunction0(HasAutomaticValue), HasInitialValue = js.Any.fromFunction0(HasInitialValue), HasUncalculatedAutomaticValue = js.Any.fromFunction0(HasUncalculatedAutomaticValue), Hierarchical = Hierarchical, ID = ID, IsExternal = js.Any.fromFunction0(IsExternal), Label = Label, Linked = Linked, Modified = Modified, MustExist = MustExist, PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly, RealObjectType = RealObjectType, RefreshList = js.Any.fromFunction0(RefreshList), Remove = js.Any.fromFunction0(Remove), RevertToInitialValue = js.Any.fromFunction0(RevertToInitialValue), SetValueItemState = js.Any.fromFunction2(SetValueItemState), Type = Type, Value = Value, ValueRequired = ValueRequired, Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible)
  
    __obj.asInstanceOf[IMetadataCardControl]
  }
}

