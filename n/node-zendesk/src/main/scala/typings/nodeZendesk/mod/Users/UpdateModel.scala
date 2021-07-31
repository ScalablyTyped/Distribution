package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#update-user|Zendesk Users Update}
  */
trait UpdateModel
  extends StObject
     with BaseModel {
  
  var name: js.UndefOr[String] = js.undefined
}
object UpdateModel {
  
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  
  @scala.inline
  implicit class UpdateModelMutableBuilder[Self <: UpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
