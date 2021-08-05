package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefix extends StObject {
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[js.Object] = js.undefined
}
object Prefix {
  
  inline def apply(): Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prefix]
  }
  
  extension [Self <: Prefix](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSource(value: js.Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
