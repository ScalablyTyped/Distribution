package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Models extends StObject {
  
  var models: js.UndefOr[Account] = js.undefined
}
object Models {
  
  @scala.inline
  def apply(): Models = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Models]
  }
  
  @scala.inline
  implicit class ModelsMutableBuilder[Self <: Models] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: Account): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
  }
}
