package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typings.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typings.react.mod.ComponentType
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editingItemTypesMod {
  
  @js.native
  trait IEditingSelectedPeopleItemProps extends ISelectedPeopleItemProps {
    
    var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.native
    
    var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.native
    
    def onEditingComplete(oldItem: js.Any, newItem: js.Any): Unit = js.native
    
    var onRenderFloatingPicker: js.UndefOr[ComponentType[IBaseFloatingPickerProps[IPersonaProps]]] = js.native
  }
  object IEditingSelectedPeopleItemProps {
    
    @scala.inline
    def apply(onEditingComplete: (js.Any, js.Any) => Unit): IEditingSelectedPeopleItemProps = {
      val __obj = js.Dynamic.literal(onEditingComplete = js.Any.fromFunction2(onEditingComplete))
      __obj.asInstanceOf[IEditingSelectedPeopleItemProps]
    }
    
    @scala.inline
    implicit class IEditingSelectedPeopleItemPropsMutableBuilder[Self <: IEditingSelectedPeopleItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFloatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): Self = StObject.set(x, "floatingPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingPickerPropsUndefined: Self = StObject.set(x, "floatingPickerProps", js.undefined)
      
      @scala.inline
      def setGetEditingItemText(value: /* item */ IExtendedPersonaProps => String): Self = StObject.set(x, "getEditingItemText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEditingItemTextUndefined: Self = StObject.set(x, "getEditingItemText", js.undefined)
      
      @scala.inline
      def setOnEditingComplete(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "onEditingComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[IPersonaProps]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRenderFloatingPickerUndefined: Self = StObject.set(x, "onRenderFloatingPicker", js.undefined)
    }
  }
  
  @js.native
  trait IEditingSelectedPeopleItemStyles extends StObject {
    
    var input: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IEditingSelectedPeopleItemStyles {
    
    @scala.inline
    def apply(): IEditingSelectedPeopleItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditingSelectedPeopleItemStyles]
    }
    
    @scala.inline
    implicit class IEditingSelectedPeopleItemStylesMutableBuilder[Self <: IEditingSelectedPeopleItemStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNull: Self = StObject.set(x, "input", null)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  @js.native
  trait IEditingSelectedPeopleItemStylesProps extends StObject
}
