package typings.postgres.anon

import typings.postgres.mod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTo extends StObject {
  
  /** Transform function for entire result rows */
  var from: js.UndefOr[js.Function1[/* row */ Row, Any]] = js.undefined
  
  var to: Unit
}
object FromTo {
  
  inline def apply(to: Unit): FromTo = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromTo] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: /* row */ Row => Any): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Unit): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
