package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grouped extends StObject {
  
  /**
    * The new grouped state.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key of the property to be grouped.
    */
  var key: js.UndefOr[String] = js.undefined
}
object Grouped {
  
  inline def apply(): Grouped = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grouped]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Grouped] (val x: Self) extends AnyVal {
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
