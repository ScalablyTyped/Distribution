package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuerySingleResult extends IAPISuccessParam {
  
  var data: IDocumentData = js.native
}
object IQuerySingleResult {
  
  @scala.inline
  def apply(data: IDocumentData, errMsg: String): IQuerySingleResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuerySingleResult]
  }
  
  @scala.inline
  implicit class IQuerySingleResultMutableBuilder[Self <: IQuerySingleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
