package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25`[K] extends StObject {
  
  var row: K
}
object `25` {
  
  inline def apply[K](row: K): `25`[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`[K]]
  }
  
  extension [Self <: `25`[?], K](x: Self & `25`[K]) {
    
    inline def setRow(value: K): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
