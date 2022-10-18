package typings.next

import typings.next.anon.HandleUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTryToParsePathMod {
  
  @JSImport("next/dist/lib/try-to-parse-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryToParsePath(route: String): ParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("tryToParsePath")(route.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
  inline def tryToParsePath(route: String, options: HandleUrl): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("tryToParsePath")(route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  
  trait ParseResult extends StObject {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var parsedPath: String
    
    var regexStr: js.UndefOr[String] = js.undefined
    
    var route: String
    
    var tokens: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Token */ Any
        ]
      ] = js.undefined
  }
  object ParseResult {
    
    inline def apply(parsedPath: String, route: String): ParseResult = {
      val __obj = js.Dynamic.literal(parsedPath = parsedPath.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    extension [Self <: ParseResult](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setParsedPath(value: String): Self = StObject.set(x, "parsedPath", value.asInstanceOf[js.Any])
      
      inline def setRegexStr(value: String): Self = StObject.set(x, "regexStr", value.asInstanceOf[js.Any])
      
      inline def setRegexStrUndefined: Self = StObject.set(x, "regexStr", js.undefined)
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setTokens(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Token */ Any
            ]
      ): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Token */ Any)*
      ): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
