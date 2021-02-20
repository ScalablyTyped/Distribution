package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFBuiltInValueList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardControl extends StObject {
  
  def ActivateLink(valuePart: js.Any): Unit = js.native
  
  def AddNewItem(name: String): js.Any = js.native
  
  def AddNewSubItem(name: String, valueParent: js.Any): js.Any = js.native
  
  val AllowAdding: Boolean = js.native
  
  def AllowHitHighlighting(): Boolean = js.native
  
  def CanActivateLink(valuePart: js.Any): Boolean = js.native
  
  def CanAddNewSubItem(name: String, valueParent: js.Any): Boolean = js.native
  
  def CanEditItem(value: js.Any): Boolean = js.native
  
  def CreateSelectionList(): IMetadataCardSelectionList = js.native
  
  def CreateUnvalidatedValue(valueString: String): IMetadataCardUnvalidatedValue = js.native
  
  def EditItem(value: js.Any): js.Any = js.native
  
  val Events: IEvents = js.native
  
  def FindItem(name: String): js.Any = js.native
  
  def FindItemByID(itemID: Double): js.Any = js.native
  
  def GetSelectableValueItemStates(): js.Any = js.native
  
  def GetValueSuggestions(): js.Any = js.native
  
  def HasAutomaticValue(): Boolean = js.native
  
  def HasInitialValue(): Boolean = js.native
  
  def HasUncalculatedAutomaticValue(): Boolean = js.native
  
  val Hierarchical: Boolean = js.native
  
  val ID: String = js.native
  
  def IsExternal(): Boolean = js.native
  
  var Label: String = js.native
  
  val Linked: Boolean = js.native
  
  var Modified: Boolean = js.native
  
  var MustExist: Boolean = js.native
  
  val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  var ReadOnly: Boolean = js.native
  
  val RealObjectType: Boolean = js.native
  
  def RefreshList(): Unit = js.native
  
  def Remove(): Unit = js.native
  
  def RevertToInitialValue(): Unit = js.native
  
  def SetValueItemState(itemID: String, state: js.Any): Unit = js.native
  
  val Type: String = js.native
  
  var Value: js.Any = js.native
  
  var ValueRequired: Boolean = js.native
  
  val Valuelist: MFBuiltInValueList | Double = js.native
  
  var Visible: Boolean = js.native
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
    val __obj = js.Dynamic.literal(ActivateLink = js.Any.fromFunction1(ActivateLink), AddNewItem = js.Any.fromFunction1(AddNewItem), AddNewSubItem = js.Any.fromFunction2(AddNewSubItem), AllowAdding = AllowAdding.asInstanceOf[js.Any], AllowHitHighlighting = js.Any.fromFunction0(AllowHitHighlighting), CanActivateLink = js.Any.fromFunction1(CanActivateLink), CanAddNewSubItem = js.Any.fromFunction2(CanAddNewSubItem), CanEditItem = js.Any.fromFunction1(CanEditItem), CreateSelectionList = js.Any.fromFunction0(CreateSelectionList), CreateUnvalidatedValue = js.Any.fromFunction1(CreateUnvalidatedValue), EditItem = js.Any.fromFunction1(EditItem), Events = Events.asInstanceOf[js.Any], FindItem = js.Any.fromFunction1(FindItem), FindItemByID = js.Any.fromFunction1(FindItemByID), GetSelectableValueItemStates = js.Any.fromFunction0(GetSelectableValueItemStates), GetValueSuggestions = js.Any.fromFunction0(GetValueSuggestions), HasAutomaticValue = js.Any.fromFunction0(HasAutomaticValue), HasInitialValue = js.Any.fromFunction0(HasInitialValue), HasUncalculatedAutomaticValue = js.Any.fromFunction0(HasUncalculatedAutomaticValue), Hierarchical = Hierarchical.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsExternal = js.Any.fromFunction0(IsExternal), Label = Label.asInstanceOf[js.Any], Linked = Linked.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], MustExist = MustExist.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealObjectType = RealObjectType.asInstanceOf[js.Any], RefreshList = js.Any.fromFunction0(RefreshList), Remove = js.Any.fromFunction0(Remove), RevertToInitialValue = js.Any.fromFunction0(RevertToInitialValue), SetValueItemState = js.Any.fromFunction2(SetValueItemState), Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueRequired = ValueRequired.asInstanceOf[js.Any], Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardControl]
  }
  
  @scala.inline
  implicit class IMetadataCardControlMutableBuilder[Self <: IMetadataCardControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateLink(value: js.Any => Unit): Self = StObject.set(x, "ActivateLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddNewItem(value: String => js.Any): Self = StObject.set(x, "AddNewItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddNewSubItem(value: (String, js.Any) => js.Any): Self = StObject.set(x, "AddNewSubItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowAdding(value: Boolean): Self = StObject.set(x, "AllowAdding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHitHighlighting(value: () => Boolean): Self = StObject.set(x, "AllowHitHighlighting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanActivateLink(value: js.Any => Boolean): Self = StObject.set(x, "CanActivateLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanAddNewSubItem(value: (String, js.Any) => Boolean): Self = StObject.set(x, "CanAddNewSubItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCanEditItem(value: js.Any => Boolean): Self = StObject.set(x, "CanEditItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSelectionList(value: () => IMetadataCardSelectionList): Self = StObject.set(x, "CreateSelectionList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateUnvalidatedValue(value: String => IMetadataCardUnvalidatedValue): Self = StObject.set(x, "CreateUnvalidatedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditItem(value: js.Any => js.Any): Self = StObject.set(x, "EditItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindItem(value: String => js.Any): Self = StObject.set(x, "FindItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindItemByID(value: Double => js.Any): Self = StObject.set(x, "FindItemByID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectableValueItemStates(value: () => js.Any): Self = StObject.set(x, "GetSelectableValueItemStates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueSuggestions(value: () => js.Any): Self = StObject.set(x, "GetValueSuggestions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAutomaticValue(value: () => Boolean): Self = StObject.set(x, "HasAutomaticValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasInitialValue(value: () => Boolean): Self = StObject.set(x, "HasInitialValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasUncalculatedAutomaticValue(value: () => Boolean): Self = StObject.set(x, "HasUncalculatedAutomaticValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHierarchical(value: Boolean): Self = StObject.set(x, "Hierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternal(value: () => Boolean): Self = StObject.set(x, "IsExternal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinked(value: Boolean): Self = StObject.set(x, "Linked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: Boolean): Self = StObject.set(x, "Modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustExist(value: Boolean): Self = StObject.set(x, "MustExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealObjectType(value: Boolean): Self = StObject.set(x, "RealObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshList(value: () => Unit): Self = StObject.set(x, "RefreshList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRevertToInitialValue(value: () => Unit): Self = StObject.set(x, "RevertToInitialValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueItemState(value: (String, js.Any) => Unit): Self = StObject.set(x, "SetValueItemState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRequired(value: Boolean): Self = StObject.set(x, "ValueRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuelist(value: MFBuiltInValueList | Double): Self = StObject.set(x, "Valuelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
