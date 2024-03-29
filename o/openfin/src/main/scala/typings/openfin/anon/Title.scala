package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var identity: typings.openfin.shapesIdentityMod.Identity
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: String
}
object Title {
  
  inline def apply(identity: typings.openfin.shapesIdentityMod.Identity, url: String): Title = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setIdentity(value: typings.openfin.shapesIdentityMod.Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
