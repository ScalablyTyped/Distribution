package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAddDocumentOptions
  extends IAPIParam[js.Any] {
  
  var data: IDocumentData = js.native
}
object IAddDocumentOptions {
  
  @scala.inline
  def apply(data: IDocumentData): IAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddDocumentOptions]
  }
  
  @scala.inline
  implicit class IAddDocumentOptionsMutableBuilder[Self <: IAddDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
