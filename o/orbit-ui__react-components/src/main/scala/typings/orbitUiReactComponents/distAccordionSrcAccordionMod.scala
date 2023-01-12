package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.bordered
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.borderless
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.single
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccordionSrcAccordionMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/Accordion", "Accordion")
  @js.native
  val Accordion: OrbitComponent[HTMLElement, InnerAccordionProps] = js.native
  
  inline def InnerAccordion(param0: InnerAccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordion")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AccordionProps = ComponentProps[OrbitComponent[HTMLElement, InnerAccordionProps]]
  
  trait InnerAccordionProps
    extends StObject
       with DomProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the first focusable accordion item should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children
      */
    var children: ReactNode
    
    /**
      * The initial value of `expandedKeys` when uncontrolled.
      */
    var defaultExpandedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A controlled set of expanded item keys.
      */
    var expandedKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The type of expansion that is allowed.
      */
    var expansionMode: js.UndefOr[single | multiple] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when an accordion item is toggled.
      * @param {SyntheticEvent} event - React's original event.
      * @param {String[]} keys - The keys of the expanded items.
      * @returns {void}
      */
    var onExpansionChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* keys */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The accordion style to use.
      */
    var variant: js.UndefOr[borderless | bordered] = js.undefined
  }
  object InnerAccordionProps {
    
    inline def apply(): InnerAccordionProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerAccordionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerAccordionProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultExpandedKeys(value: js.Array[String]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      inline def setDefaultExpandedKeysVarargs(value: String*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value*))
      
      inline def setExpandedKeys(value: js.Array[String]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysNull: Self = StObject.set(x, "expandedKeys", null)
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: String*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setExpansionMode(value: single | multiple): Self = StObject.set(x, "expansionMode", value.asInstanceOf[js.Any])
      
      inline def setExpansionModeUndefined: Self = StObject.set(x, "expansionMode", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnExpansionChange(
        value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* keys */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onExpansionChange", js.Any.fromFunction2(value))
      
      inline def setOnExpansionChangeUndefined: Self = StObject.set(x, "onExpansionChange", js.undefined)
      
      inline def setVariant(value: borderless | bordered): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
