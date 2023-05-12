package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redelivery extends StObject {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var redelivery: js.UndefOr[Boolean] = js.undefined
}
object Redelivery {
  
  inline def apply(): Redelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Redelivery] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRedelivery(value: Boolean): Self = StObject.set(x, "redelivery", value.asInstanceOf[js.Any])
    
    inline def setRedeliveryUndefined: Self = StObject.set(x, "redelivery", js.undefined)
  }
}
