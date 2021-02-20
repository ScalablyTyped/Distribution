package typings.oracleOraclejet.anon

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertSVGElement extends StObject {
  
  var insert: SVGElement = js.native
}
object InsertSVGElement {
  
  @scala.inline
  def apply(insert: SVGElement): InsertSVGElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertSVGElement]
  }
  
  @scala.inline
  implicit class InsertSVGElementMutableBuilder[Self <: InsertSVGElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: SVGElement): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
