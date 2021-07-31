package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleControlOptions extends StObject {
  
  var position: Position
}
object ScaleControlOptions {
  
  @scala.inline
  def apply(position: Position): ScaleControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleControlOptions]
  }
  
  @scala.inline
  implicit class ScaleControlOptionsMutableBuilder[Self <: ScaleControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
