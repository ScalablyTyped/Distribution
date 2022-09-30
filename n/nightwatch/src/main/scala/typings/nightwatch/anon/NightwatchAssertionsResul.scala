package typings.nightwatch.anon

import typings.nightwatch.mod.JSON_WEB_OBJECT
import typings.nightwatch.nightwatchBooleans.`true`
import typings.nightwatch.nightwatchInts.`0`
import typings.nightwatch.nightwatchInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined nightwatch.nightwatch.NightwatchAssertionsResult<std.Array<nightwatch.nightwatch.JSON_WEB_OBJECT>> & {  WebdriverElementId :string} */
trait NightwatchAssertionsResul extends StObject {
  
  var WebdriverElementId: String
  
  var passed: `true`
  
  var returned: `1`
  
  var status: `0`
  
  var value: js.Array[JSON_WEB_OBJECT]
}
object NightwatchAssertionsResul {
  
  inline def apply(WebdriverElementId: String, value: js.Array[JSON_WEB_OBJECT]): NightwatchAssertionsResul = {
    val __obj = js.Dynamic.literal(WebdriverElementId = WebdriverElementId.asInstanceOf[js.Any], passed = true, returned = 1, status = 0, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchAssertionsResul]
  }
  
  extension [Self <: NightwatchAssertionsResul](x: Self) {
    
    inline def setPassed(value: `true`): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setReturned(value: `1`): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[JSON_WEB_OBJECT]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: JSON_WEB_OBJECT*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWebdriverElementId(value: String): Self = StObject.set(x, "WebdriverElementId", value.asInstanceOf[js.Any])
  }
}
