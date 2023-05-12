package typings.postgres.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /** Transform function for values in result rows */
  var from: js.UndefOr[
    js.Function2[/* value */ Any, /* column */ typings.postgres.mod.Column[String], Any]
  ] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: (/* value */ Any, /* column */ typings.postgres.mod.Column[String]) => Any): Self = StObject.set(x, "from", js.Any.fromFunction2(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
  }
}
