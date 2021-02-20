package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryResult extends IAPISuccessParam {
  
  var data: Array[IDocumentData] = js.native
}
object IQueryResult {
  
  @scala.inline
  def apply(data: Array[IDocumentData], errMsg: String): IQueryResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryResult]
  }
  
  @scala.inline
  implicit class IQueryResultMutableBuilder[Self <: IQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Array[IDocumentData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
