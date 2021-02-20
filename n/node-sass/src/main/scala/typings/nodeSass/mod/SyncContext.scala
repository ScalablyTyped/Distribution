package typings.nodeSass.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncContext extends Context {
  
  @JSName("callback")
  var callback_SyncContext: js.UndefOr[scala.Nothing] = js.native
}
object SyncContext {
  
  @scala.inline
  def apply(options: Options): SyncContext = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncContext]
  }
}
