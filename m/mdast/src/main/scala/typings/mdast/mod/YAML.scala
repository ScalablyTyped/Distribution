package typings.mdast.mod

import typings.mdast.mdastStrings.yaml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAML
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_YAML: yaml
}
object YAML {
  
  @scala.inline
  def apply(value: js.Any): YAML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("yaml")
    __obj.asInstanceOf[YAML]
  }
  
  @scala.inline
  implicit class YAMLMutableBuilder[Self <: YAML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: yaml): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
