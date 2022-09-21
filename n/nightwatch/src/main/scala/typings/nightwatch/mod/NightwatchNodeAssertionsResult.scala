package typings.nightwatch.mod

import typings.nightwatch.nightwatchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchNodeAssertionsResult extends StObject {
  
  var returned: `1`
  
  var value: Null
}
object NightwatchNodeAssertionsResult {
  
  inline def apply(value: Null): NightwatchNodeAssertionsResult = {
    val __obj = js.Dynamic.literal(returned = 1, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchNodeAssertionsResult]
  }
  
  extension [Self <: NightwatchNodeAssertionsResult](x: Self) {
    
    inline def setReturned(value: `1`): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
