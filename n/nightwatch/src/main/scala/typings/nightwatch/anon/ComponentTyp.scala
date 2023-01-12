package typings.nightwatch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentTyp extends StObject {
  
  var componentTyp: String
  
  var scriptType: String
}
object ComponentTyp {
  
  inline def apply(componentTyp: String, scriptType: String): ComponentTyp = {
    val __obj = js.Dynamic.literal(componentTyp = componentTyp.asInstanceOf[js.Any], scriptType = scriptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentTyp] (val x: Self) extends AnyVal {
    
    inline def setComponentTyp(value: String): Self = StObject.set(x, "componentTyp", value.asInstanceOf[js.Any])
    
    inline def setScriptType(value: String): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
  }
}
