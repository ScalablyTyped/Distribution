package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  var components: ColorComponents = js.native
  
  var format: ColorFormat = js.native
}
object Color {
  
  @scala.inline
  def apply(components: ColorComponents, format: ColorFormat): Color = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: ColorComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ColorFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
