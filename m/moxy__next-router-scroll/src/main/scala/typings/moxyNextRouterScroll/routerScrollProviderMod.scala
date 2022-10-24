package typings.moxyNextRouterScroll

import typings.moxyNextRouterScroll.anon.Children
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerScrollProviderMod {
  
  object default {
    
    inline def apply(param0: Children): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@moxy/next-router-scroll/RouterScrollProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("@moxy/next-router-scroll/RouterScrollProvider", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@moxy/next-router-scroll/RouterScrollProvider", "default.defaultProps.disableNextLinkScroll")
      @js.native
      val disableNextLinkScroll: Boolean = js.native
      
      inline def shouldUpdateScroll(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdateScroll")().asInstanceOf[Boolean]
    }
    
    object propTypes {
      
      @JSImport("@moxy/next-router-scroll/RouterScrollProvider", "default.propTypes.children")
      @js.native
      val children: ReactNode = js.native
      
      @JSImport("@moxy/next-router-scroll/RouterScrollProvider", "default.propTypes.disableNextLinkScroll")
      @js.native
      val disableNextLinkScroll: Boolean = js.native
      
      @JSImport("@moxy/next-router-scroll/RouterScrollProvider", "default.propTypes.shouldUpdateScroll")
      @js.native
      val shouldUpdateScroll: Any = js.native
    }
  }
}
