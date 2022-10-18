package typings.nextAuth

import typings.nextAuth.anon.Html
import typings.nextAuth.coreTypesMod.Theme
import typings.nextAuth.utilsParseUrlMod.InternalUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesErrorMod {
  
  @JSImport("next-auth/core/pages/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ErrorProps): Html = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Html]
  
  trait ErrorProps extends StObject {
    
    var error: js.UndefOr[ErrorType] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var url: js.UndefOr[InternalUrl] = js.undefined
  }
  object ErrorProps {
    
    inline def apply(): ErrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorProps]
    }
    
    extension [Self <: ErrorProps](x: Self) {
      
      inline def setError(value: ErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUrl(value: InternalUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.nextAuthStrings.default
    - typings.nextAuth.nextAuthStrings.configuration
    - typings.nextAuth.nextAuthStrings.accessdenied
    - typings.nextAuth.nextAuthStrings.verification
  */
  trait ErrorType extends StObject
  object ErrorType {
    
    inline def default: typings.nextAuth.nextAuthStrings.default = "default".asInstanceOf[typings.nextAuth.nextAuthStrings.default]
    
    inline def accessdenied: typings.nextAuth.nextAuthStrings.accessdenied = "accessdenied".asInstanceOf[typings.nextAuth.nextAuthStrings.accessdenied]
    
    inline def configuration: typings.nextAuth.nextAuthStrings.configuration = "configuration".asInstanceOf[typings.nextAuth.nextAuthStrings.configuration]
    
    inline def verification: typings.nextAuth.nextAuthStrings.verification = "verification".asInstanceOf[typings.nextAuth.nextAuthStrings.verification]
  }
}
