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
  
  inline def apply(): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestHooks]
  }
  
  extension [Self <: NightwatchTestHooks](x: Self) {
    
    inline def setAfter(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setAfterEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
    
    inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2(value))
    
    inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
