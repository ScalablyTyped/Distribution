package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetSingleDocumentOptions
  extends StObject
     with IAPIParam[Any] {
  
  var data: IUpdateCondition
}
object ISetSingleDocumentOptions {
  
  inline def apply(data: IUpdateCondition): ISetSingleDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetSingleDocumentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISetSingleDocumentOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
