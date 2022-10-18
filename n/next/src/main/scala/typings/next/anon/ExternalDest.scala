package typings.next.anon

import typings.next.distSharedLibRouterUtilsParseRelativeUrlMod.ParsedRelativeUrl
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalDest extends StObject {
  
  var asPath: String
  
  var externalDest: js.UndefOr[Boolean] = js.undefined
  
  var matchedPage: Boolean
  
  var parsedAs: ReturnType[js.Function2[/* url */ String, /* base */ js.UndefOr[String], ParsedRelativeUrl]]
  
  var resolvedHref: js.UndefOr[String] = js.undefined
}
object ExternalDest {
  
  inline def apply(
    asPath: String,
    matchedPage: Boolean,
    parsedAs: ReturnType[js.Function2[/* url */ String, /* base */ js.UndefOr[String], ParsedRelativeUrl]]
  ): ExternalDest = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], matchedPage = matchedPage.asInstanceOf[js.Any], parsedAs = parsedAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDest]
  }
  
  extension [Self <: ExternalDest](x: Self) {
    
    inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
    
    inline def setExternalDest(value: Boolean): Self = StObject.set(x, "externalDest", value.asInstanceOf[js.Any])
    
    inline def setExternalDestUndefined: Self = StObject.set(x, "externalDest", js.undefined)
    
    inline def setMatchedPage(value: Boolean): Self = StObject.set(x, "matchedPage", value.asInstanceOf[js.Any])
    
    inline def setParsedAs(
      value: ReturnType[js.Function2[/* url */ String, /* base */ js.UndefOr[String], ParsedRelativeUrl]]
    ): Self = StObject.set(x, "parsedAs", value.asInstanceOf[js.Any])
    
    inline def setResolvedHref(value: String): Self = StObject.set(x, "resolvedHref", value.asInstanceOf[js.Any])
    
    inline def setResolvedHrefUndefined: Self = StObject.set(x, "resolvedHref", js.undefined)
  }
}
