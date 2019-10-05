package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFBuiltInValueList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardControl extends js.Object {
  val AllowAdding: Boolean
  val Events: IEvents
  val Hierarchical: Boolean
  val ID: String
  var Label: String
  val Linked: Boolean
  var Modified: Boolean
  var MustExist: Boolean
  val PropertyDef: MFBuiltInPropertyDef | Double
  var ReadOnly: Boolean
  val RealObjectType: Boolean
  val Type: String
  var Value: js.Any
  var ValueRequired: Boolean
  val Valuelist: MFBuiltInValueList | Double
  var Visible: Boolean
  def ActivateLink(valuePart: js.Any): Unit
  def AddNewItem(name: String): js.Any
  def AddNewSubItem(name: String, valueParent: js.Any): js.Any
  def AllowHitHighlighting(): Boolean
  def CanActivateLink(valuePart: js.Any): Boolean
  def CanAddNewSubItem(name: String, valueParent: js.Any): Boolean
  def CanEditItem(value: js.Any): Boolean
  def CreateSelectionList(): IMetadataCardSelectionList
  def CreateUnvalidatedValue(valueString: String): IMetadataCardUnvalidatedValue
  def EditItem(value: js.Any): js.Any
  def FindItem(name: String): js.Any
  def FindItemByID(itemID: Double): js.Any
  def GetSelectableValueItemStates(): js.Any
  def GetValueSuggestions(): js.Any
  def HasAutomaticValue(): Boolean
  def HasInitialValue(): Boolean
  def HasUncalculatedAutomaticValue(): Boolean
  def IsExternal(): Boolean
  def RefreshList(): Unit
  def Remove(): Unit
  def RevertToInitialValue(): Unit
  def SetValueItemState(itemID: String, state: js.Any): Unit
}

object IMetadataCardControl {
  @scala.inline
  def apply(
    ActivateLink: js.Any => Unit,
    AddNewItem: String => js.Any,
    AddNewSubItem: (String, js.Any) => js.Any,
    AllowAdding: Boolean,
    AllowHitHighlighting: () => Boolean,
    CanActivateLink: js.Any => Boolean,
    CanAddNewSubItem: (String, js.Any) => Boolean,
    CanEditItem: js.Any => Boolean,
    CreateSelectionList: () => IMetadataCardSelectionList,
    CreateUnvalidatedValue: String => IMetadataCardUnvalidatedValue,
    EditItem: js.Any => js.Any,
    Events: IEvents,
    FindItem: String => js.Any,
    FindItemByID: Double => js.Any,
    GetSelectableValueItemStates: () => js.Any,
    GetValueSuggestions: () => js.Any,
    HasAutomaticValue: () => Boolean,
    HasInitialValue: () => Boolean,
    HasUncalculatedAutomaticValue: () => Boolean,
    Hierarchical: Boolean,
    ID: String,
    IsExternal: () => Boolean,
    Label: String,
    Linked: Boolean,
    Modified: Boolean,
    MustExist: Boolean,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ReadOnly: Boolean,
    RealObjectType: Boolean,
    RefreshList: () => Unit,
    Remove: () => Unit,
    RevertToInitialValue: () => Unit,
    SetValueItemState: (String, js.Any) => Unit,
    Type: String,
    Value: js.Any,
    ValueRequired: Boolean,
    Valuelist: MFBuiltInValueList | Double,
    Visible: Boolean
  ): IMetadataCardControl = {
    val __obj = js.Dynamic.literal(ActivateLink = js.Any.fromFunction1(ActivateLink), AddNewItem = js.Any.fromFunction1(AddNewItem), AddNewSubItem = js.Any.fromFunction2(AddNewSubItem), AllowAdding = AllowAdding, AllowHitHighlighting = js.Any.fromFunction0(AllowHitHighlighting), CanActivateLink = js.Any.fromFunction1(CanActivateLink), CanAddNewSubItem = js.Any.fromFunction2(CanAddNewSubItem), CanEditItem = js.Any.fromFunction1(CanEditItem), CreateSelectionList = js.Any.fromFunction0(CreateSelectionList), CreateUnvalidatedValue = js.Any.fromFunction1(CreateUnvalidatedValue), EditItem = js.Any.fromFunction1(EditItem), Events = Events, FindItem = js.Any.fromFunction1(FindItem), FindItemByID = js.Any.fromFunction1(FindItemByID), GetSelectableValueItemStates = js.Any.fromFunction0(GetSelectableValueItemStates), GetValueSuggestions = js.Any.fromFunction0(GetValueSuggestions), HasAutomaticValue = js.Any.fromFunction0(HasAutomaticValue), HasInitialValue = js.Any.fromFunction0(HasInitialValue), HasUncalculatedAutomaticValue = js.Any.fromFunction0(HasUncalculatedAutomaticValue), Hierarchical = Hierarchical, ID = ID, IsExternal = js.Any.fromFunction0(IsExternal), Label = Label, Linked = Linked, Modified = Modified, MustExist = MustExist, PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly, RealObjectType = RealObjectType, RefreshList = js.Any.fromFunction0(RefreshList), Remove = js.Any.fromFunction0(Remove), RevertToInitialValue = js.Any.fromFunction0(RevertToInitialValue), SetValueItemState = js.Any.fromFunction2(SetValueItemState), Type = Type, Value = Value, ValueRequired = ValueRequired, Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible)
  
    __obj.asInstanceOf[IMetadataCardControl]
  }
}

