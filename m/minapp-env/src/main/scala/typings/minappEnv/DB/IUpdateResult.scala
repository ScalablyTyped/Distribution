package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import typings.minappEnv.anon.Updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateResult
  extends StObject
     with IAPISuccessParam {
  
  var stats: Updated
}
object IUpdateResult {
  
  inline def apply(errMsg: String, stats: Updated): IUpdateResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUpdateResult] (val x: Self) extends AnyVal {
    
    inline def setStats(value: Updated): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
