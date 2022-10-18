package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  /**
    * Id of the selected Datset item
    */
  var itemId: js.UndefOr[String] = js.undefined
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
  }
}
