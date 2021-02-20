package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomControlOptions extends StObject {
  
  var legendDisabled: Boolean = js.native
  
  var position: Position = js.native
  
  var style: ZoomControlStyle = js.native
}
object ZoomControlOptions {
  
  @scala.inline
  def apply(legendDisabled: Boolean, position: Position, style: ZoomControlStyle): ZoomControlOptions = {
    val __obj = js.Dynamic.literal(legendDisabled = legendDisabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControlOptions]
  }
  
  @scala.inline
  implicit class ZoomControlOptionsMutableBuilder[Self <: ZoomControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegendDisabled(value: Boolean): Self = StObject.set(x, "legendDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ZoomControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
