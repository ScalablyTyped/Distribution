package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.NextAuthOptions
import typings.nextAuth.utilsParseUrlMod.InternalUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var url: InternalUrl
  
  var userOptions: NextAuthOptions
}
object Url {
  
  inline def apply(url: InternalUrl, userOptions: NextAuthOptions): Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], userOptions = userOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setUrl(value: InternalUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUserOptions(value: NextAuthOptions): Self = StObject.set(x, "userOptions", value.asInstanceOf[js.Any])
  }
}
