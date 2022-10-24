package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListboxSrcListboxOptionMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListboxOption(param0: InnerListboxOptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxOption")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxOption", "ListboxOption")
  @js.native
  val ListboxOption: OrbitComponent[HTMLElement, InnerListboxOptionProps] = js.native
  
  type CollectionItem = typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionItem
  
  trait InnerListboxOptionProps
    extends StObject
       with DomProps
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the option is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Matching collection item.
      */
    var item: CollectionItem
  }
  object InnerListboxOptionProps {
    
    inline def apply(item: CollectionItem): InnerListboxOptionProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerListboxOptionProps]
    }
    
    extension [Self <: InnerListboxOptionProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setItem(value: CollectionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type ListboxOptionProps = ComponentProps[OrbitComponent[HTMLElement, InnerListboxOptionProps]]
}
