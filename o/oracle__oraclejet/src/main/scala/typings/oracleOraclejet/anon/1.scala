package typings.oracleOraclejet.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var insert: HTMLElement | String
}
object `1` {
  
  inline def apply(insert: HTMLElement | String): `1` = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: HTMLElement | String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
