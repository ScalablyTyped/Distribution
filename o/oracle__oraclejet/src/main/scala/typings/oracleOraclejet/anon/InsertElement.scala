package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertElement extends StObject {
  
  var insert: typings.std.Element
}
object InsertElement {
  
  inline def apply(insert: typings.std.Element): InsertElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertElement]
  }
  
  extension [Self <: InsertElement](x: Self) {
    
    inline def setInsert(value: typings.std.Element): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
