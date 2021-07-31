package typings.polished

import typings.polished.sideKeywordMod.SideKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangleConfigurationMod {
  
  trait TriangleConfiguration extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var foregroundColor: String
    
    var height: Double | String
    
    var pointingDirection: SideKeyword
    
    var width: Double | String
  }
  object TriangleConfiguration {
    
    @scala.inline
    def apply(
      foregroundColor: String,
      height: Double | String,
      pointingDirection: SideKeyword,
      width: Double | String
    ): TriangleConfiguration = {
      val __obj = js.Dynamic.literal(foregroundColor = foregroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pointingDirection = pointingDirection.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriangleConfiguration]
    }
    
    @scala.inline
    implicit class TriangleConfigurationMutableBuilder[Self <: TriangleConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointingDirection(value: SideKeyword): Self = StObject.set(x, "pointingDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
