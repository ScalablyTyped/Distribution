package typings.oracleOraclejet.anon

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertSVGElement extends StObject {
  
  var insert: SVGElement
}
object InsertSVGElement {
  
  inline def apply(insert: SVGElement): InsertSVGElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertSVGElement]
  }
  
  extension [Self <: InsertSVGElement](x: Self) {
    
    inline def setInsert(value: SVGElement): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
