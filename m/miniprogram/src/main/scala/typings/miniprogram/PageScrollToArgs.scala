package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageScrollToArgs extends AsyncCallback[Unit] {
  
  var duration: js.UndefOr[Double] = js.native
  
  var scrollTo: js.UndefOr[Double] = js.native
  
  var selector: js.UndefOr[String] = js.native
}
object PageScrollToArgs {
  
  @scala.inline
  def apply(): PageScrollToArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToArgs]
  }
  
  @scala.inline
  implicit class PageScrollToArgsMutableBuilder[Self <: PageScrollToArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setScrollTo(value: Double): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
