package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.DrawGeometryFunctionType
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.geom.GeometryType
import typings.openlayers.mod.geom.SimpleGeometry
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawOptions extends StObject {
  
  var clickTolerance: js.UndefOr[Double] = js.undefined
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  
  var finishCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var freehand: js.UndefOr[Boolean] = js.undefined
  
  var freehandCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.undefined
  
  var geometryName: js.UndefOr[String] = js.undefined
  
  var maxPoints: js.UndefOr[Double] = js.undefined
  
  var minPoints: js.UndefOr[Double] = js.undefined
  
  var snapTolerance: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[Vector] = js.undefined
  
  var stopClick: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  
  var `type`: GeometryType
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object DrawOptions {
  
  @scala.inline
  def apply(`type`: GeometryType): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
  
  @scala.inline
  implicit class DrawOptionsMutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFinishCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "finishCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
    
    @scala.inline
    def setFreehand(value: Boolean): Self = StObject.set(x, "freehand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreehandCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "freehandCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFreehandConditionUndefined: Self = StObject.set(x, "freehandCondition", js.undefined)
    
    @scala.inline
    def setFreehandUndefined: Self = StObject.set(x, "freehand", js.undefined)
    
    @scala.inline
    def setGeometryFunction(
      value: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => SimpleGeometry
    ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    @scala.inline
    def setMinPoints(value: Double): Self = StObject.set(x, "minPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPointsUndefined: Self = StObject.set(x, "minPoints", js.undefined)
    
    @scala.inline
    def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStopClick(value: Boolean): Self = StObject.set(x, "stopClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopClickUndefined: Self = StObject.set(x, "stopClick", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GeometryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
