package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/Section", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerSection(props: InnerSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSection")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/Section", "Section")
  @js.native
  val Section: OrbitComponent[HTMLElement, InnerSectionProps] = js.native
  
  trait InnerSectionProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The section name.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object InnerSectionProps {
    
    inline def apply(): InnerSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerSectionProps]
    }
    
    extension [Self <: InnerSectionProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type SectionProps = ComponentProps[OrbitComponent[HTMLElement, InnerSectionProps]]
}
