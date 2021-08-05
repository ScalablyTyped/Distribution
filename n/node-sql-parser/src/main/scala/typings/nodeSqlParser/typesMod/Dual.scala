package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.dual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dual extends StObject {
  
  var `type`: dual
}
object Dual {
  
  inline def apply(): Dual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dual")
    __obj.asInstanceOf[Dual]
  }
  
  extension [Self <: Dual](x: Self) {
    
    inline def setType(value: dual): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
