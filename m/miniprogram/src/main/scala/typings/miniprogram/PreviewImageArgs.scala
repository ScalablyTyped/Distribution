package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewImageArgs extends AsyncCallback[Unit] {
  
  var current: js.UndefOr[Double] = js.native
  
  var urls: js.Array[String] = js.native
}
object PreviewImageArgs {
  
  @scala.inline
  def apply(urls: js.Array[String]): PreviewImageArgs = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageArgs]
  }
  
  @scala.inline
  implicit class PreviewImageArgsMutableBuilder[Self <: PreviewImageArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
