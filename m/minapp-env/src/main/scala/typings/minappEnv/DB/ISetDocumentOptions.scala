package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetDocumentOptions
  extends StObject
     with IAPIParam[Any] {
  
  var data: IUpdateCondition
}
object ISetDocumentOptions {
  
  inline def apply(data: IUpdateCondition): ISetDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetDocumentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISetDocumentOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
