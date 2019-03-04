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
    ActivateLink: js.Function1[js.Any, scala.Unit],
    AddNewItem: js.Function1[java.lang.String, js.Any],
    AddNewSubItem: js.Function2[java.lang.String, js.Any, js.Any],
    AllowAdding: scala.Boolean,
    AllowHitHighlighting: js.Function0[scala.Boolean],
    CanActivateLink: js.Function1[js.Any, scala.Boolean],
    CanAddNewSubItem: js.Function2[java.lang.String, js.Any, scala.Boolean],
    CanEditItem: js.Function1[js.Any, scala.Boolean],
    CreateSelectionList: js.Function0[IMetadataCardSelectionList],
    CreateUnvalidatedValue: js.Function1[java.lang.String, IMetadataCardUnvalidatedValue],
    EditItem: js.Function1[js.Any, js.Any],
    Events: IEvents,
    FindItem: js.Function1[java.lang.String, js.Any],
    FindItemByID: js.Function1[scala.Double, js.Any],
    GetSelectableValueItemStates: js.Function0[js.Any],
    GetValueSuggestions: js.Function0[js.Any],
    HasAutomaticValue: js.Function0[scala.Boolean],
    HasInitialValue: js.Function0[scala.Boolean],
    HasUncalculatedAutomaticValue: js.Function0[scala.Boolean],
    Hierarchical: scala.Boolean,
    ID: java.lang.String,
    IsExternal: js.Function0[scala.Boolean],
    Label: java.lang.String,
    Linked: scala.Boolean,
    Modified: scala.Boolean,
    MustExist: scala.Boolean,
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef | scala.Double,
    ReadOnly: scala.Boolean,
    RealObjectType: scala.Boolean,
    RefreshList: js.Function0[scala.Unit],
    Remove: js.Function0[scala.Unit],
    RevertToInitialValue: js.Function0[scala.Unit],
    SetValueItemState: js.Function2[java.lang.String, js.Any, scala.Unit],
    Type: java.lang.String,
    Value: js.Any,
    ValueRequired: scala.Boolean,
    Valuelist: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double,
    Visible: scala.Boolean
  ): IMetadataCardControl = {
    val __obj = js.Dynamic.literal(ActivateLink = ActivateLink, AddNewItem = AddNewItem, AddNewSubItem = AddNewSubItem, AllowAdding = AllowAdding, AllowHitHighlighting = AllowHitHighlighting, CanActivateLink = CanActivateLink, CanAddNewSubItem = CanAddNewSubItem, CanEditItem = CanEditItem, CreateSelectionList = CreateSelectionList, CreateUnvalidatedValue = CreateUnvalidatedValue, EditItem = EditItem, Events = Events, FindItem = FindItem, FindItemByID = FindItemByID, GetSelectableValueItemStates = GetSelectableValueItemStates, GetValueSuggestions = GetValueSuggestions, HasAutomaticValue = HasAutomaticValue, HasInitialValue = HasInitialValue, HasUncalculatedAutomaticValue = HasUncalculatedAutomaticValue, Hierarchical = Hierarchical, ID = ID, IsExternal = IsExternal, Label = Label, Linked = Linked, Modified = Modified, MustExist = MustExist, PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly, RealObjectType = RealObjectType, RefreshList = RefreshList, Remove = Remove, RevertToInitialValue = RevertToInitialValue, SetValueItemState = SetValueItemState, Type = Type, Value = Value, ValueRequired = ValueRequired, Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible)
  
    __obj.asInstanceOf[IMetadataCardControl]
  }
}

