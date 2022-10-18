package typings.nextAuth

import typings.nextAuth.coreTypesMod.Theme
import typings.nextAuth.utilsParseUrlMod.InternalUrl
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesSignoutMod {
  
  @JSImport("next-auth/core/pages/signout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SignoutProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SignoutProps extends StObject {
    
    var csrfToken: String
    
    var theme: Theme
    
    var url: InternalUrl
  }
  object SignoutProps {
    
    inline def apply(csrfToken: String, theme: Theme, url: InternalUrl): SignoutProps = {
      val __obj = js.Dynamic.literal(csrfToken = csrfToken.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignoutProps]
    }
    
    extension [Self <: SignoutProps](x: Self) {
      
      inline def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: InternalUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
