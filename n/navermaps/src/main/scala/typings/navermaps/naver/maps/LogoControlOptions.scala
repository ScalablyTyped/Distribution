package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogoControlOptions extends StObject {
  
  var position: Position = js.native
}
object LogoControlOptions {
  
  @scala.inline
  def apply(position: Position): LogoControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoControlOptions]
  }
  
  @scala.inline
  implicit class LogoControlOptionsMutableBuilder[Self <: LogoControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
