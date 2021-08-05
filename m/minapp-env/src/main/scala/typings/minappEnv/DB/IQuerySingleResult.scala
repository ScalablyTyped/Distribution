package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuerySingleResult
  extends StObject
     with IAPISuccessParam {
  
  var data: IDocumentData
}
object IQuerySingleResult {
  
  inline def apply(data: IDocumentData, errMsg: String): IQuerySingleResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuerySingleResult]
  }
  
  extension [Self <: IQuerySingleResult](x: Self) {
    
    inline def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
