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
  
  extension [Self <: `1`](x: Self) {
    
    inline def setInsert(value: HTMLElement | String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
