package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.dual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dual extends StObject {
  
  var `type`: dual
}
object Dual {
  
  @scala.inline
  def apply(): Dual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dual")
    __obj.asInstanceOf[Dual]
  }
  
  @scala.inline
  implicit class DualMutableBuilder[Self <: Dual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dual): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
