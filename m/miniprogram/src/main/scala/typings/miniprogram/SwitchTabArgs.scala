package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchTabArgs extends AsyncCallback[Unit] {
  
  /**
    * Path of the jumping tabBar page (page to be defined in the
    * tabBar field in the app.json). Note: The path cannot be
    * followed by parameters.
    */
  var url: String = js.native
}
object SwitchTabArgs {
  
  @scala.inline
  def apply(url: String): SwitchTabArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTabArgs]
  }
  
  @scala.inline
  implicit class SwitchTabArgsMutableBuilder[Self <: SwitchTabArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
