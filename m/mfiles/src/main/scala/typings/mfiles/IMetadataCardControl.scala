package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFBuiltInValueList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardControl extends StObject {
  
  def ActivateLink(valuePart: Any): Unit
  
  def AddNewItem(name: String): Any
  
  def AddNewSubItem(name: String, valueParent: Any): Any
  
  val AllowAdding: Boolean
  
  def AllowHitHighlighting(): Boolean
  
  def CanActivateLink(valuePart: Any): Boolean
  
  def CanAddNewSubItem(name: String, valueParent: Any): Boolean
  
  def CanEditItem(value: Any): Boolean
  
  def CreateSelectionList(): IMetadataCardSelectionList
  
  def CreateUnvalidatedValue(valueString: String): IMetadataCardUnvalidatedValue
  
  def EditItem(value: Any): Any
  
  val Events: IEvents
  
  def FindItem(name: String): Any
  
  def FindItemByID(itemID: Double): Any
  
  def GetSelectableValueItemStates(): Any
  
  def GetValueSuggestions(): Any
  
  def HasAutomaticValue(): Boolean
  
  def HasInitialValue(): Boolean
  
  def HasUncalculatedAutomaticValue(): Boolean
  
  val Hierarchical: Boolean
  
  val ID: String
  
  def IsExternal(): Boolean
  
  var Label: String
  
  val Linked: Boolean
  
  var Modified: Boolean
  
  var MustExist: Boolean
  
  val PropertyDef: MFBuiltInPropertyDef | Double
  
  var ReadOnly: Boolean
  
  val RealObjectType: Boolean
  
  def RefreshList(): Unit
  
  def Remove(): Unit
  
  def RevertToInitialValue(): Unit
  
  def SetValueItemState(itemID: String, state: Any): Unit
  
  val Type: String
  
  var Value: Any
  
  var ValueRequired: Boolean
  
  val Valuelist: MFBuiltInValueList | Double
  
  var Visible: Boolean
}
object IMetadataCardControl {
  
  inline def apply(
    ActivateLink: Any => Unit,
    AddNewItem: String => Any,
    AddNewSubItem: (String, Any) => Any,
    AllowAdding: Boolean,
    AllowHitHighlighting: () => Boolean,
    CanActivateLink: Any => Boolean,
    CanAddNewSubItem: (String, Any) => Boolean,
    CanEditItem: Any => Boolean,
    CreateSelectionList: () => IMetadataCardSelectionList,
    CreateUnvalidatedValue: String => IMetadataCardUnvalidatedValue,
    EditItem: Any => Any,
    Events: IEvents,
    FindItem: String => Any,
    FindItemByID: Double => Any,
    GetSelectableValueItemStates: () => Any,
    GetValueSuggestions: () => Any,
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
    SetValueItemState: (String, Any) => Unit,
    Type: String,
    Value: Any,
    ValueRequired: Boolean,
    Valuelist: MFBuiltInValueList | Double,
    Visible: Boolean
  ): IMetadataCardControl = {
    val __obj = js.Dynamic.literal(ActivateLink = js.Any.fromFunction1(ActivateLink), AddNewItem = js.Any.fromFunction1(AddNewItem), AddNewSubItem = js.Any.fromFunction2(AddNewSubItem), AllowAdding = AllowAdding.asInstanceOf[js.Any], AllowHitHighlighting = js.Any.fromFunction0(AllowHitHighlighting), CanActivateLink = js.Any.fromFunction1(CanActivateLink), CanAddNewSubItem = js.Any.fromFunction2(CanAddNewSubItem), CanEditItem = js.Any.fromFunction1(CanEditItem), CreateSelectionList = js.Any.fromFunction0(CreateSelectionList), CreateUnvalidatedValue = js.Any.fromFunction1(CreateUnvalidatedValue), EditItem = js.Any.fromFunction1(EditItem), Events = Events.asInstanceOf[js.Any], FindItem = js.Any.fromFunction1(FindItem), FindItemByID = js.Any.fromFunction1(FindItemByID), GetSelectableValueItemStates = js.Any.fromFunction0(GetSelectableValueItemStates), GetValueSuggestions = js.Any.fromFunction0(GetValueSuggestions), HasAutomaticValue = js.Any.fromFunction0(HasAutomaticValue), HasInitialValue = js.Any.fromFunction0(HasInitialValue), HasUncalculatedAutomaticValue = js.Any.fromFunction0(HasUncalculatedAutomaticValue), Hierarchical = Hierarchical.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsExternal = js.Any.fromFunction0(IsExternal), Label = Label.asInstanceOf[js.Any], Linked = Linked.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], MustExist = MustExist.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealObjectType = RealObjectType.asInstanceOf[js.Any], RefreshList = js.Any.fromFunction0(RefreshList), Remove = js.Any.fromFunction0(Remove), RevertToInitialValue = js.Any.fromFunction0(RevertToInitialValue), SetValueItemState = js.Any.fromFunction2(SetValueItemState), Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueRequired = ValueRequired.asInstanceOf[js.Any], Valuelist = Valuelist.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardControl] (val x: Self) extends AnyVal {
    
    inline def setActivateLink(value: Any => Unit): Self = StObject.set(x, "ActivateLink", js.Any.fromFunction1(value))
    
    inline def setAddNewItem(value: String => Any): Self = StObject.set(x, "AddNewItem", js.Any.fromFunction1(value))
    
    inline def setAddNewSubItem(value: (String, Any) => Any): Self = StObject.set(x, "AddNewSubItem", js.Any.fromFunction2(value))
    
    inline def setAllowAdding(value: Boolean): Self = StObject.set(x, "AllowAdding", value.asInstanceOf[js.Any])
    
    inline def setAllowHitHighlighting(value: () => Boolean): Self = StObject.set(x, "AllowHitHighlighting", js.Any.fromFunction0(value))
    
    inline def setCanActivateLink(value: Any => Boolean): Self = StObject.set(x, "CanActivateLink", js.Any.fromFunction1(value))
    
    inline def setCanAddNewSubItem(value: (String, Any) => Boolean): Self = StObject.set(x, "CanAddNewSubItem", js.Any.fromFunction2(value))
    
    inline def setCanEditItem(value: Any => Boolean): Self = StObject.set(x, "CanEditItem", js.Any.fromFunction1(value))
    
    inline def setCreateSelectionList(value: () => IMetadataCardSelectionList): Self = StObject.set(x, "CreateSelectionList", js.Any.fromFunction0(value))
    
    inline def setCreateUnvalidatedValue(value: String => IMetadataCardUnvalidatedValue): Self = StObject.set(x, "CreateUnvalidatedValue", js.Any.fromFunction1(value))
    
    inline def setEditItem(value: Any => Any): Self = StObject.set(x, "EditItem", js.Any.fromFunction1(value))
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFindItem(value: String => Any): Self = StObject.set(x, "FindItem", js.Any.fromFunction1(value))
    
    inline def setFindItemByID(value: Double => Any): Self = StObject.set(x, "FindItemByID", js.Any.fromFunction1(value))
    
    inline def setGetSelectableValueItemStates(value: () => Any): Self = StObject.set(x, "GetSelectableValueItemStates", js.Any.fromFunction0(value))
    
    inline def setGetValueSuggestions(value: () => Any): Self = StObject.set(x, "GetValueSuggestions", js.Any.fromFunction0(value))
    
    inline def setHasAutomaticValue(value: () => Boolean): Self = StObject.set(x, "HasAutomaticValue", js.Any.fromFunction0(value))
    
    inline def setHasInitialValue(value: () => Boolean): Self = StObject.set(x, "HasInitialValue", js.Any.fromFunction0(value))
    
    inline def setHasUncalculatedAutomaticValue(value: () => Boolean): Self = StObject.set(x, "HasUncalculatedAutomaticValue", js.Any.fromFunction0(value))
    
    inline def setHierarchical(value: Boolean): Self = StObject.set(x, "Hierarchical", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIsExternal(value: () => Boolean): Self = StObject.set(x, "IsExternal", js.Any.fromFunction0(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLinked(value: Boolean): Self = StObject.set(x, "Linked", value.asInstanceOf[js.Any])
    
    inline def setModified(value: Boolean): Self = StObject.set(x, "Modified", value.asInstanceOf[js.Any])
    
    inline def setMustExist(value: Boolean): Self = StObject.set(x, "MustExist", value.asInstanceOf[js.Any])
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRealObjectType(value: Boolean): Self = StObject.set(x, "RealObjectType", value.asInstanceOf[js.Any])
    
    inline def setRefreshList(value: () => Unit): Self = StObject.set(x, "RefreshList", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    inline def setRevertToInitialValue(value: () => Unit): Self = StObject.set(x, "RevertToInitialValue", js.Any.fromFunction0(value))
    
    inline def setSetValueItemState(value: (String, Any) => Unit): Self = StObject.set(x, "SetValueItemState", js.Any.fromFunction2(value))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueRequired(value: Boolean): Self = StObject.set(x, "ValueRequired", value.asInstanceOf[js.Any])
    
    inline def setValuelist(value: MFBuiltInValueList | Double): Self = StObject.set(x, "Valuelist", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
