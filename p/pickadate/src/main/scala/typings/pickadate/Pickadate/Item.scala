package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  /**
    * The "pick" value used for comparisons.
    */
  var pick: Double
}
object Item {
  
  inline def apply(pick: Double): Item = {
    val __obj = js.Dynamic.literal(pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setPick(value: Double): Self = StObject.set(x, "pick", value.asInstanceOf[js.Any])
  }
}
