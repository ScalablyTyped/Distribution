package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: String
  
  var left: String
  
  var position: PositioningStrategy
  
  var right: String
  
  var top: String
  
  var transform: String
}
object Bottom {
  
  @scala.inline
  def apply(
    bottom: String,
    left: String,
    position: PositioningStrategy,
    right: String,
    top: String,
    transform: String
  ): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: PositioningStrategy): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
