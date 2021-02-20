package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestSuite extends StObject {
  
  var group: String = js.native
  
  var module: String = js.native
  
  var name: String = js.native
  
  var results: js.Any = js.native
}
object NightwatchTestSuite {
  
  @scala.inline
  def apply(group: String, module: String, name: String, results: js.Any): NightwatchTestSuite = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestSuite]
  }
  
  @scala.inline
  implicit class NightwatchTestSuiteMutableBuilder[Self <: NightwatchTestSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
