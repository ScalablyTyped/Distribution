package typings.minappEnv.DB

import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRemoveDocumentOptions
  extends StObject
     with IAPIParam[js.Any] {
  
  var query: IQueryCondition
}
object IRemoveDocumentOptions {
  
  @scala.inline
  def apply(query: IQueryCondition): IRemoveDocumentOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveDocumentOptions]
  }
  
  @scala.inline
  implicit class IRemoveDocumentOptionsMutableBuilder[Self <: IRemoveDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: IQueryCondition): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
