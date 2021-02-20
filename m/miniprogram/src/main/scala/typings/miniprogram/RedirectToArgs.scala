package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectToArgs extends AsyncCallback[Unit] {
  
  /**
    * The application for the jumping does not include the destination
    * page path of the tabBar. The path can be followed by parameters.
    * Rules for the parameters: The path and parameter are separated
    * with ?, the parameter key and the parameter value are connected
    * with =, and different parameters must be separated with &, such
    * as path?key1=value1&key2=value2.
    */
  var url: String = js.native
}
object RedirectToArgs {
  
  @scala.inline
  def apply(url: String): RedirectToArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectToArgs]
  }
  
  @scala.inline
  implicit class RedirectToArgsMutableBuilder[Self <: RedirectToArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
