package typings.paypalPaypalJs.anon

import typings.std.PromiseConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var PromisePonyfill: js.UndefOr[PromiseConstructor] = js.undefined
  
  var attributes: js.UndefOr[Record[String, String]] = js.undefined
  
  var url: String
}
object Attributes {
  
  inline def apply(url: String): Attributes = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setPromisePonyfill(value: PromiseConstructor): Self = StObject.set(x, "PromisePonyfill", value.asInstanceOf[js.Any])
    
    inline def setPromisePonyfillUndefined: Self = StObject.set(x, "PromisePonyfill", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
