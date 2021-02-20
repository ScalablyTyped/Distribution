package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rendered extends StObject {
  
  var color: String = js.native
  
  var rendered: off | auto = js.native
}
object Rendered {
  
  @scala.inline
  def apply(color: String, rendered: off | auto): Rendered = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  
  @scala.inline
  implicit class RenderedMutableBuilder[Self <: Rendered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: off | auto): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
