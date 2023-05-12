package typings.postgres.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  /** Transform function for values in result rows */
  var from: js.UndefOr[
    js.Function2[/* value */ Any, /* column */ js.UndefOr[typings.postgres.mod.Column[String]], Any]
  ] = js.undefined
  
  /** Transform function for interpolated values passed to tagged template literal */
  var to: Unit
}
object To {
  
  inline def apply(to: Unit): To = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: To] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: (/* value */ Any, /* column */ js.UndefOr[typings.postgres.mod.Column[String]]) => Any): Self = StObject.set(x, "from", js.Any.fromFunction2(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Unit): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
