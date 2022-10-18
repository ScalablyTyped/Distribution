package typings.nextAuth

import typings.nextAuth.coreTypesMod.Theme
import typings.nextAuth.utilsParseUrlMod.InternalUrl
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesVerifyRequestMod {
  
  @JSImport("next-auth/core/pages/verify-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: VerifyRequestPageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait VerifyRequestPageProps extends StObject {
    
    var theme: Theme
    
    var url: InternalUrl
  }
  object VerifyRequestPageProps {
    
    inline def apply(theme: Theme, url: InternalUrl): VerifyRequestPageProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyRequestPageProps]
    }
    
    extension [Self <: VerifyRequestPageProps](x: Self) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: InternalUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
