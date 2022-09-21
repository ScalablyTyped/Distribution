package typings.moxyNextRouterScroll

import typings.moxyNextRouterScroll.anon.Children
import typings.moxyNextRouterScroll.contextMod.RouterScrollContext
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@moxy/next-router-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object RouterScrollProvider {
    
    inline def apply(hasDisableNextLinkScrollShouldUpdateScrollChildren: Children): Element = ^.asInstanceOf[js.Dynamic].apply(hasDisableNextLinkScrollShouldUpdateScrollChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@moxy/next-router-scroll", "RouterScrollProvider")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("@moxy/next-router-scroll", "RouterScrollProvider.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@moxy/next-router-scroll", "RouterScrollProvider.defaultProps.disableNextLinkScroll")
      @js.native
      val disableNextLinkScroll: Boolean = js.native
      
      inline def shouldUpdateScroll(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdateScroll")().asInstanceOf[Boolean]
    }
    
    object propTypes {
      
      @JSImport("@moxy/next-router-scroll", "RouterScrollProvider.propTypes.children")
      @js.native
      val children: ReactNode = js.native
      
      @JSImport("@moxy/next-router-scroll", "RouterScrollProvider.propTypes.disableNextLinkScroll")
      @js.native
      val disableNextLinkScroll: Boolean = js.native
      
      @JSImport("@moxy/next-router-scroll", "RouterScrollProvider.propTypes.shouldUpdateScroll")
      @js.native
      val shouldUpdateScroll: Any = js.native
    }
  }
  
  inline def useRouterScroll(): RouterScrollContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouterScroll")().asInstanceOf[RouterScrollContext]
  
  inline def withRouterScroll(WrappedComponent: ComponentType[js.Object]): ForwardRefExoticComponent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouterScroll")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[Any]]
}
