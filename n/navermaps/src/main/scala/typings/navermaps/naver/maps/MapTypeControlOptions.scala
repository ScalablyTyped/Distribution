package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeControlOptions extends StObject {
  
  var mapTypeIds: js.Array[MapTypeId] | Null = js.native
  
  var position: Position = js.native
  
  var style: MapTypeControlStyle = js.native
}
object MapTypeControlOptions {
  
  @scala.inline
  def apply(position: Position, style: MapTypeControlStyle): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  @scala.inline
  implicit class MapTypeControlOptionsMutableBuilder[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapTypeIds(value: js.Array[MapTypeId]): Self = StObject.set(x, "mapTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeIdsNull: Self = StObject.set(x, "mapTypeIds", null)
    
    @scala.inline
    def setMapTypeIdsVarargs(value: MapTypeId*): Self = StObject.set(x, "mapTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: MapTypeControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
