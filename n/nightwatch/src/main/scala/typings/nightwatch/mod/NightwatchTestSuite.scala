package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestSuite extends StObject {
  
  var group: String
  
  var module: String
  
  var name: String
  
  var results: Any
}
object NightwatchTestSuite {
  
  inline def apply(group: String, module: String, name: String, results: Any): NightwatchTestSuite = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestSuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchTestSuite] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
