package typings.nightwatch.mod

import typings.nightwatch.anon.Autostartsession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestRunner extends StObject {
  
  var options: js.UndefOr[Autostartsession] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object NightwatchTestRunner {
  
  inline def apply(): NightwatchTestRunner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestRunner]
  }
  
  extension [Self <: NightwatchTestRunner](x: Self) {
    
    inline def setOptions(value: Autostartsession): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
