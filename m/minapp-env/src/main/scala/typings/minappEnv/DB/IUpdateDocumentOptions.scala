package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateDocumentOptions
  extends StObject
     with IAPIParam[js.Any] {
  
  var data: IUpdateCondition
}
object IUpdateDocumentOptions {
  
  @scala.inline
  def apply(data: IUpdateCondition): IUpdateDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDocumentOptions]
  }
  
  @scala.inline
  implicit class IUpdateDocumentOptionsMutableBuilder[Self <: IUpdateDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
