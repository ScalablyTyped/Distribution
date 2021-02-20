package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import typings.minappEnv.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetResult extends IAPISuccessParam {
  
  var _id: DocumentId = js.native
  
  var stats: Created = js.native
}
object ISetResult {
  
  @scala.inline
  def apply(_id: DocumentId, errMsg: String, stats: Created): ISetResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetResult]
  }
  
  @scala.inline
  implicit class ISetResultMutableBuilder[Self <: ISetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: Created): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
