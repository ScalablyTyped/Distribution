package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nightwatch.mod.NightwatchTestFunctions
  - typings.nightwatch.mod.NightwatchTestHooks
*/
trait NightwatchTests extends StObject
object NightwatchTests {
  
  inline def NightwatchTestFunctions(): typings.nightwatch.mod.NightwatchTestFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.nightwatch.mod.NightwatchTestFunctions]
  }
  
  inline def NightwatchTestHooks(
    afterTestCase: Any => js.Promise[Unit],
    afterTestSuite: Any => js.Promise[Unit],
    beforeTestCase: Any => js.Promise[Unit],
    beforeTestSuite: Any => js.Promise[Unit],
    onBrowserNavigate: Any => js.Promise[Unit],
    onBrowserQuit: Any => js.Promise[Unit],
    reporter: (Any, Any) => Unit
  ): typings.nightwatch.mod.NightwatchTestHooks = {
    val __obj = js.Dynamic.literal(afterTestCase = js.Any.fromFunction1(afterTestCase), afterTestSuite = js.Any.fromFunction1(afterTestSuite), beforeTestCase = js.Any.fromFunction1(beforeTestCase), beforeTestSuite = js.Any.fromFunction1(beforeTestSuite), onBrowserNavigate = js.Any.fromFunction1(onBrowserNavigate), onBrowserQuit = js.Any.fromFunction1(onBrowserQuit), reporter = js.Any.fromFunction2(reporter))
    __obj.asInstanceOf[typings.nightwatch.mod.NightwatchTestHooks]
  }
}
