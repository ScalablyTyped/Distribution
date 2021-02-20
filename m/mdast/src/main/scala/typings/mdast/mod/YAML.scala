package typings.mdast.mod

import typings.mdast.mdastStrings.yaml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAML extends Literal {
  
  @JSName("type")
  var type_YAML: yaml = js.native
}
object YAML {
  
  @scala.inline
  def apply(`type`: yaml, value: js.Any): YAML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAML]
  }
  
  @scala.inline
  implicit class YAMLMutableBuilder[Self <: YAML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: yaml): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
