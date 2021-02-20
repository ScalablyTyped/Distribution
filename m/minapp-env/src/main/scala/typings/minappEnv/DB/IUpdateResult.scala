package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import typings.minappEnv.anon.Updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUpdateResult extends IAPISuccessParam {
  
  var stats: Updated = js.native
}
object IUpdateResult {
  
  @scala.inline
  def apply(errMsg: String, stats: Updated): IUpdateResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateResult]
  }
  
  @scala.inline
  implicit class IUpdateResultMutableBuilder[Self <: IUpdateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: Updated): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
