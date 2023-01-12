package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsListProps
import typings.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.ISelectedItemProps
import typings.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListMod.BaseSelectedItemsList
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "BasePeopleSelectedItemsList")
  @js.native
  open class BasePeopleSelectedItemsList protected () extends BaseSelectedItemsList[IExtendedPersonaProps, ISelectedPeopleProps] {
    def this(basePickerProps: ISelectedPeopleProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "SelectedPeopleList")
  @js.native
  open class SelectedPeopleList protected () extends BasePeopleSelectedItemsList {
    def this(basePickerProps: ISelectedPeopleProps) = this()
    
    /* private */ var _beginEditing: Any = js.native
    
    /* private */ var _completeEditing: Any = js.native
    
    /* private */ var _createMenuItems: Any = js.native
    
    /* private */ var _renderItem: Any = js.native
  }
  /* static members */
  object SelectedPeopleList {
    
    @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "SelectedPeopleList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/SelectedPeopleList", "SelectedPeopleList.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IExtendedPersonaProps
    extends StObject
       with IPersonaProps {
    
    var blockRecipientRemoval: js.UndefOr[Boolean] = js.undefined
    
    var canExpand: js.UndefOr[Boolean] = js.undefined
    
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    var isValid: Boolean
    
    var key: js.UndefOr[Key] = js.undefined
    
    var shouldBlockSelection: js.UndefOr[Boolean] = js.undefined
  }
  object IExtendedPersonaProps {
    
    inline def apply(isValid: Boolean): IExtendedPersonaProps = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExtendedPersonaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExtendedPersonaProps] (val x: Self) extends AnyVal {
      
      inline def setBlockRecipientRemoval(value: Boolean): Self = StObject.set(x, "blockRecipientRemoval", value.asInstanceOf[js.Any])
      
      inline def setBlockRecipientRemovalUndefined: Self = StObject.set(x, "blockRecipientRemoval", js.undefined)
      
      inline def setCanExpand(value: Boolean): Self = StObject.set(x, "canExpand", value.asInstanceOf[js.Any])
      
      inline def setCanExpandUndefined: Self = StObject.set(x, "canExpand", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setShouldBlockSelection(value: Boolean): Self = StObject.set(x, "shouldBlockSelection", value.asInstanceOf[js.Any])
      
      inline def setShouldBlockSelectionUndefined: Self = StObject.set(x, "shouldBlockSelection", js.undefined)
    }
  }
  
  trait ISelectedPeopleItemProps
    extends StObject
       with ISelectedItemProps[IExtendedPersonaProps] {
    
    var onExpandItem: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
    
    var renderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  }
  object ISelectedPeopleItemProps {
    
    inline def apply(ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps]): ISelectedPeopleItemProps = {
      val __obj = js.Dynamic.literal()
      js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
      __obj.asInstanceOf[ISelectedPeopleItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISelectedPeopleItemProps] (val x: Self) extends AnyVal {
      
      inline def setOnExpandItem(value: () => Unit): Self = StObject.set(x, "onExpandItem", js.Any.fromFunction0(value))
      
      inline def setOnExpandItemUndefined: Self = StObject.set(x, "onExpandItem", js.undefined)
      
      inline def setRenderPersonaCoin(
        value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "renderPersonaCoin", js.Any.fromFunction2(value))
      
      inline def setRenderPersonaCoinUndefined: Self = StObject.set(x, "renderPersonaCoin", js.undefined)
      
      inline def setRenderPrimaryText(
        value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "renderPrimaryText", js.Any.fromFunction2(value))
      
      inline def setRenderPrimaryTextUndefined: Self = StObject.set(x, "renderPrimaryText", js.undefined)
    }
  }
  
  trait ISelectedPeopleProps
    extends StObject
       with IBaseSelectedItemsListProps[IExtendedPersonaProps] {
    
    var copyMenuItemText: js.UndefOr[String] = js.undefined
    
    var editMenuItemText: js.UndefOr[String] = js.undefined
    
    var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.undefined
    
    var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.undefined
    
    var onExpandGroup: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
    
    var onRenderFloatingPicker: js.UndefOr[ComponentType[IBaseFloatingPickerProps[IPersonaProps]]] = js.undefined
    
    var removeMenuItemText: js.UndefOr[String] = js.undefined
  }
  object ISelectedPeopleProps {
    
    inline def apply(): ISelectedPeopleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectedPeopleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISelectedPeopleProps] (val x: Self) extends AnyVal {
      
      inline def setCopyMenuItemText(value: String): Self = StObject.set(x, "copyMenuItemText", value.asInstanceOf[js.Any])
      
      inline def setCopyMenuItemTextUndefined: Self = StObject.set(x, "copyMenuItemText", js.undefined)
      
      inline def setEditMenuItemText(value: String): Self = StObject.set(x, "editMenuItemText", value.asInstanceOf[js.Any])
      
      inline def setEditMenuItemTextUndefined: Self = StObject.set(x, "editMenuItemText", js.undefined)
      
      inline def setFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = StObject.set(x, "floatingPickerProps", value.asInstanceOf[js.Any])
      
      inline def setFloatingPickerPropsUndefined: Self = StObject.set(x, "floatingPickerProps", js.undefined)
      
      inline def setGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = StObject.set(x, "getEditingItemText", js.Any.fromFunction1(value))
      
      inline def setGetEditingItemTextUndefined: Self = StObject.set(x, "getEditingItemText", js.undefined)
      
      inline def setOnExpandGroup(value: /* item */ IExtendedPersonaProps => Unit): Self = StObject.set(x, "onExpandGroup", js.Any.fromFunction1(value))
      
      inline def setOnExpandGroupUndefined: Self = StObject.set(x, "onExpandGroup", js.undefined)
      
      inline def setOnRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[IPersonaProps]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      inline def setOnRenderFloatingPickerUndefined: Self = StObject.set(x, "onRenderFloatingPicker", js.undefined)
      
      inline def setRemoveMenuItemText(value: String): Self = StObject.set(x, "removeMenuItemText", value.asInstanceOf[js.Any])
      
      inline def setRemoveMenuItemTextUndefined: Self = StObject.set(x, "removeMenuItemText", js.undefined)
    }
  }
}
