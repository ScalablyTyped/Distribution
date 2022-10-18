package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListboxSrcListboxSectionMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxSection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListboxSection(hasIdTitleAsChildrenForwardedRefRest: InnerListboxSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxSection")(hasIdTitleAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxSection", "ListboxSection")
  @js.native
  val ListboxSection: OrbitComponent[HTMLElement, InnerListboxSectionProps] = js.native
  
  trait InnerListboxSectionProps
    extends StObject
       with DomProps {
    
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
      * The section name.
      */
    var title: String
  }
  object InnerListboxSectionProps {
    
    inline def apply(title: String): InnerListboxSectionProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerListboxSectionProps]
    }
    
    extension [Self <: InnerListboxSectionProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type ListboxSectionProps = ComponentProps[OrbitComponent[HTMLElement, InnerListboxSectionProps]]
}
