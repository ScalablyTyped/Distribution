package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddDocumentOptions
  extends StObject
     with IAPIParam[Any] {
  
  var data: IDocumentData
}
object IAddDocumentOptions {
  
  inline def apply(data: IDocumentData): IAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddDocumentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAddDocumentOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
