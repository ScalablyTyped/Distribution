package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetDocumentOptions
  extends IAPIParam[js.Any] {
  
  var data: IUpdateCondition = js.native
}
object ISetDocumentOptions {
  
  @scala.inline
  def apply(data: IUpdateCondition): ISetDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetDocumentOptions]
  }
  
  @scala.inline
  implicit class ISetDocumentOptionsMutableBuilder[Self <: ISetDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
