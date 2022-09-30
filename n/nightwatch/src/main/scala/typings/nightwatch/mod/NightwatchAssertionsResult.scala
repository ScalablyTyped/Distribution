package typings.nightwatch.mod

import typings.nightwatch.nightwatchBooleans.`true`
import typings.nightwatch.nightwatchInts.`0`
import typings.nightwatch.nightwatchInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchAssertionsResult[T] extends StObject {
  
  var passed: `true`
  
  var returned: `1`
  
  var status: `0`
  
  var value: T
}
object NightwatchAssertionsResult {
  
  inline def apply[T](value: T): NightwatchAssertionsResult[T] = {
    val __obj = js.Dynamic.literal(passed = true, returned = 1, status = 0, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchAssertionsResult[T]]
  }
  
  extension [Self <: NightwatchAssertionsResult[?], T](x: Self & NightwatchAssertionsResult[T]) {
    
    inline def setPassed(value: `true`): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setReturned(value: `1`): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
