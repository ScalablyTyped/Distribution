package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import typings.minappEnv.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetResult
  extends StObject
     with IAPISuccessParam {
  
  var _id: DocumentId
  
  var stats: Created
}
object ISetResult {
  
  inline def apply(_id: DocumentId, errMsg: String, stats: Created): ISetResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISetResult] (val x: Self) extends AnyVal {
    
    inline def setStats(value: Created): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
