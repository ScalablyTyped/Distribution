package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageScrollToArgs
  extends StObject
     with AsyncVoidCallback {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var scrollTo: js.UndefOr[Double] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
}
object PageScrollToArgs {
  
  inline def apply(): PageScrollToArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageScrollToArgs] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setScrollTo(value: Double): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
    
    inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
