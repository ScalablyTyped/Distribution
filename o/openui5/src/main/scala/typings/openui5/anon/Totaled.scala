package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totaled extends StObject {
  
  /**
    * The key of the property.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The new value.
    */
  var totaled: js.UndefOr[Boolean] = js.undefined
}
object Totaled {
  
  inline def apply(): Totaled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Totaled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Totaled] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTotaled(value: Boolean): Self = StObject.set(x, "totaled", value.asInstanceOf[js.Any])
    
    inline def setTotaledUndefined: Self = StObject.set(x, "totaled", js.undefined)
  }
}
