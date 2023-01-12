package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22`[K] extends StObject {
  
  var column: K
}
object `22` {
  
  inline def apply[K](column: K): `22`[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`[?], K] (val x: Self & `22`[K]) extends AnyVal {
    
    inline def setColumn(value: K): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
