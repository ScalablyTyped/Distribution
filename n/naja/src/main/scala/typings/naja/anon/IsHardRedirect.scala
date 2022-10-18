package typings.naja.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHardRedirect extends StObject {
  
  var isHardRedirect: Boolean
  
  var options: typings.naja.distNajaMod.Options
  
  def setHardRedirect(value: Boolean): Unit
  
  var url: String
}
object IsHardRedirect {
  
  inline def apply(
    isHardRedirect: Boolean,
    options: typings.naja.distNajaMod.Options,
    setHardRedirect: Boolean => Unit,
    url: String
  ): IsHardRedirect = {
    val __obj = js.Dynamic.literal(isHardRedirect = isHardRedirect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setHardRedirect = js.Any.fromFunction1(setHardRedirect), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHardRedirect]
  }
  
  extension [Self <: IsHardRedirect](x: Self) {
    
    inline def setIsHardRedirect(value: Boolean): Self = StObject.set(x, "isHardRedirect", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetHardRedirect(value: Boolean => Unit): Self = StObject.set(x, "setHardRedirect", js.Any.fromFunction1(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
