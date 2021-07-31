package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AroundControlOptions extends StObject {
  
  var position: Position
}
object AroundControlOptions {
  
  @scala.inline
  def apply(position: Position): AroundControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AroundControlOptions]
  }
  
  @scala.inline
  implicit class AroundControlOptionsMutableBuilder[Self <: AroundControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
