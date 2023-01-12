package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestHooks
  extends StObject
     with NightwatchGlobals
     with NightwatchTests {
  
  var after: js.UndefOr[GlobalNightwatchTestHook] = js.undefined
  
  var afterEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.undefined
  
  var before: js.UndefOr[GlobalNightwatchTestHook] = js.undefined
  
  var beforeEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.undefined
}
object NightwatchTestHooks {
  
  inline def apply(
    afterTestCase: Any => js.Promise[Unit],
    afterTestSuite: Any => js.Promise[Unit],
    beforeTestCase: Any => js.Promise[Unit],
    beforeTestSuite: Any => js.Promise[Unit],
    onBrowserNavigate: Any => js.Promise[Unit],
    onBrowserQuit: Any => js.Promise[Unit],
    reporter: (Any, Any) => Unit
  ): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal(afterTestCase = js.Any.fromFunction1(afterTestCase), afterTestSuite = js.Any.fromFunction1(afterTestSuite), beforeTestCase = js.Any.fromFunction1(beforeTestCase), beforeTestSuite = js.Any.fromFunction1(beforeTestSuite), onBrowserNavigate = js.Any.fromFunction1(onBrowserNavigate), onBrowserQuit = js.Any.fromFunction1(onBrowserQuit), reporter = js.Any.fromFunction2(reporter))
    __obj.asInstanceOf[NightwatchTestHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchTestHooks] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setAfterEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Unit
    ): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
    
    inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Unit
    ): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2(value))
    
    inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
