package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typings.officeUiFabricReact.libComponentsOverflowSetOverflowSetDotbaseMod.OverflowSetBase
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsOverflowSetOverflowSetDottypesMod {
  
  @js.native
  trait IOverflowSet extends StObject {
    
    /**
      * Sets focus to the first tabbable item in the zone.
      * @param forceIntoFirstElement - If true, focus will be forced into the first element, even if
      * focus is already in the focus zone.
      * @returns True if focus could be set to an active element, false if no operation was taken.
      */
    def focus(): Boolean = js.native
    def focus(forceIntoFirstElement: Boolean): Boolean = js.native
    
    /**
      * Sets focus to a specific child element within the zone. This can be used in conjunction with
      * shouldReceiveFocus to created delayed focus scenarios (like animate the scroll position to the correct
      * location and then focus.)
      * @param childElement - The child element within the zone to focus.
      * @returns True if focus could be set to an active element, false if no operation was taken.
      */
    def focusElement(): Boolean = js.native
    def focusElement(childElement: HTMLElement): Boolean = js.native
  }
  
  trait IOverflowSetItemProps
    extends StObject
       with /**
    * Any additional properties to use when custom rendering menu items.
    */
  /* propertyName */ StringDictionary[Any] {
    
    /**
      * Unique id to identify the item.
      */
    var key: String
    
    /**
      * Optional keytip for the overflowSetItem.
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  }
  object IOverflowSetItemProps {
    
    inline def apply(key: String): IOverflowSetItemProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverflowSetItemProps]
    }
    
    extension [Self <: IOverflowSetItemProps](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      inline def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
    }
  }
  
  trait IOverflowSetProps
    extends StObject
       with ClassAttributes[OverflowSetBase] {
    
    /**
      * Class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IOverflowSet]] = js.undefined
    
    /**
      * If true do not contain the OverflowSet inside of a FocusZone,
      * otherwise the OverflowSet will contain a FocusZone.
      * If this is set to true focusZoneProps will be ignored.
      * Use one or the other.
      * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
      */
    var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom properties for OverflowSet's FocusZone.
      * If doNotContainWithinFocusZone is set to true focusZoneProps will be ignored.
      * Use one or the other.
      * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
    
    /**
      * Function that will take in an IOverflowSetItemProps and return the subMenu for that item.
      * If not provided, will use 'item.subMenuProps.items' by default.
      * Alternatively accepts a boolean, return True if the item has a menu and False if not
      * This is only used if your overflow set has keytips.
      */
    var itemSubMenuProvider: js.UndefOr[
        js.Function1[/* item */ IOverflowSetItemProps, js.UndefOr[js.Array[Any] | Boolean]]
      ] = js.undefined
    
    /**
      * An array of items to be rendered by your onRenderItem function in the primary content area
      */
    var items: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.undefined
    
    /**
      * Optional full keytip sequence for the overflow button, if it will have a keytip.
      */
    var keytipSequences: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Method to call when trying to render an item.
      */
    def onRenderItem(item: IOverflowSetItemProps): Any
    
    /**
      * Rendering method for overflow button and contextual menu. The argument to the function is
      * the overflowItems passed in as props to this function.
      */
    var onRenderOverflowButton: IRenderFunction[js.Array[Any]]
    
    /**
      * An array of items to be passed to overflow contextual menu
      */
    var overflowItems: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.undefined
    
    /**
      * Controls wether or not the overflow button is placed at the start or end of the items.
      * This gives a reveresed visual behavior but maintains correct keyboard navigation.
      * @defaultValue 'end'
      */
    var overflowSide: js.UndefOr[start | end] = js.undefined
    
    /**
      * The role for the OverflowSet.
      * @defaultvalue 'group'
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]] = js.undefined
    
    /**
      * Change item layout direction to vertical/stacked.
      * If role is set to `menubar`, `vertical={true}` will also add proper `aria-orientation`.
      * @defaultvalue false
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object IOverflowSetProps {
    
    inline def apply(
      onRenderItem: IOverflowSetItemProps => Any,
      onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[Any]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[Any]], Element | Null]]) => Element | Null
    ): IOverflowSetProps = {
      val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
      __obj.asInstanceOf[IOverflowSetProps]
    }
    
    extension [Self <: IOverflowSetProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IOverflowSet]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IOverflowSet | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDoNotContainWithinFocusZone(value: Boolean): Self = StObject.set(x, "doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
      
      inline def setDoNotContainWithinFocusZoneUndefined: Self = StObject.set(x, "doNotContainWithinFocusZone", js.undefined)
      
      inline def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      inline def setItemSubMenuProvider(value: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[Any] | Boolean]): Self = StObject.set(x, "itemSubMenuProvider", js.Any.fromFunction1(value))
      
      inline def setItemSubMenuProviderUndefined: Self = StObject.set(x, "itemSubMenuProvider", js.undefined)
      
      inline def setItems(value: js.Array[IOverflowSetItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IOverflowSetItemProps*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKeytipSequences(value: js.Array[String]): Self = StObject.set(x, "keytipSequences", value.asInstanceOf[js.Any])
      
      inline def setKeytipSequencesUndefined: Self = StObject.set(x, "keytipSequences", js.undefined)
      
      inline def setKeytipSequencesVarargs(value: String*): Self = StObject.set(x, "keytipSequences", js.Array(value*))
      
      inline def setOnRenderItem(value: IOverflowSetItemProps => Any): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
      
      inline def setOnRenderOverflowButton(
        value: (/* props */ js.UndefOr[js.Array[Any]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[Any]], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderOverflowButton", js.Any.fromFunction2(value))
      
      inline def setOverflowItems(value: js.Array[IOverflowSetItemProps]): Self = StObject.set(x, "overflowItems", value.asInstanceOf[js.Any])
      
      inline def setOverflowItemsUndefined: Self = StObject.set(x, "overflowItems", js.undefined)
      
      inline def setOverflowItemsVarargs(value: IOverflowSetItemProps*): Self = StObject.set(x, "overflowItems", js.Array(value*))
      
      inline def setOverflowSide(value: start | end): Self = StObject.set(x, "overflowSide", value.asInstanceOf[js.Any])
      
      inline def setOverflowSideUndefined: Self = StObject.set(x, "overflowSide", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IOverflowSetProps => DeepPartial[IOverflowSetStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.types.IOverflowSetProps, 'vertical' | 'className'> */
  trait IOverflowSetStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object IOverflowSetStyleProps {
    
    inline def apply(): IOverflowSetStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverflowSetStyleProps]
    }
    
    extension [Self <: IOverflowSetStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait IOverflowSetStyles extends StObject {
    
    /** The style that is layered onto each individual item in the overflow set. */
    var item: js.UndefOr[IStyle] = js.undefined
    
    /** The style that is layered onto the overflow button for the overflow set. */
    var overflowButton: js.UndefOr[IStyle] = js.undefined
    
    /** The style that is layered onto the root element of OverflowSet. */
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IOverflowSetStyles {
    
    inline def apply(): IOverflowSetStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverflowSetStyles]
    }
    
    extension [Self <: IOverflowSetStyles](x: Self) {
      
      inline def setItem(value: IStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "item", null)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOverflowButton(value: IStyle): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonNull: Self = StObject.set(x, "overflowButton", null)
      
      inline def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
