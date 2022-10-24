package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionItem
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
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

object distTagSrcTagListMod {
  
  @JSImport("@orbit-ui/react-components/dist/tag/src/TagList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTagList(param0: InnerTagListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTagList")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tag/src/TagList", "TagList")
  @js.native
  val TagList: OrbitComponent[HTMLElement, InnerTagListProps] = js.native
  
  trait InnerTagListProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when all items are cleared from the list.
      * @param {SyntheticEvent} event - React's original event.
      * @returns {void}
      */
    var onClear: js.UndefOr[js.Function1[/* event */ SyntheticEvent[typings.std.Element, Event], Unit]] = js.undefined
    
    /**
      * Called when an item is removed from the list.
      * @param {SyntheticEvent} event - React's original event.
      * @param {string} key - The item key.
      * @returns {void}
      */
    var onRemove: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* key */ String, Unit]
      ] = js.undefined
    
    /**
      * Whether or not tag items should be render as readonly.
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A tag list can vary in size.
      */
    var size: js.UndefOr[sm | md] = js.undefined
  }
  object InnerTagListProps {
    
    inline def apply(): InnerTagListProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTagListProps]
    }
    
    extension [Self <: InnerTagListProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnClear(value: /* event */ SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnRemove(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* key */ String) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @orbit-ui/react-components.@orbit-ui/react-components/dist/tag/src/Tag.TagProps, 'children'> ]: @orbit-ui/react-components.@orbit-ui/react-components/dist/tag/src/Tag.TagProps[P]} */ trait TagItemProps extends StObject {
    
    var item: js.UndefOr[CollectionItem] = js.undefined
    
    var onRemove: Any
    
    var readOnly: Boolean
    
    var size: sm | md
  }
  object TagItemProps {
    
    inline def apply(onRemove: Any, readOnly: Boolean, size: sm | md): TagItemProps = {
      val __obj = js.Dynamic.literal(onRemove = onRemove.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagItemProps]
    }
    
    extension [Self <: TagItemProps](x: Self) {
      
      inline def setItem(value: CollectionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOnRemove(value: Any): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type TagListProps = ComponentProps[OrbitComponent[HTMLElement, InnerTagListProps]]
}
