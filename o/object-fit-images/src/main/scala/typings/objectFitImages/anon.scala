package typings.objectFitImages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SkipTest extends StObject {
    
    var skipTest: js.UndefOr[Boolean] = js.undefined
    
    var watchMQ: js.UndefOr[Boolean] = js.undefined
  }
  object SkipTest {
    
    inline def apply(): SkipTest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipTest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipTest] (val x: Self) extends AnyVal {
      
      inline def setSkipTest(value: Boolean): Self = StObject.set(x, "skipTest", value.asInstanceOf[js.Any])
      
      inline def setSkipTestUndefined: Self = StObject.set(x, "skipTest", js.undefined)
      
      inline def setWatchMQ(value: Boolean): Self = StObject.set(x, "watchMQ", value.asInstanceOf[js.Any])
      
      inline def setWatchMQUndefined: Self = StObject.set(x, "watchMQ", js.undefined)
    }
  }
}
