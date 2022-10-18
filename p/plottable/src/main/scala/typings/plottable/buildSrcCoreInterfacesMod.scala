package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCoreInterfacesMod {
  
  type AppliedProjector = js.Function2[/* datum */ Any, /* index */ Double, Any]
  
  type AttributeToAppliedProjector = StringDictionary[AppliedProjector]
  
  type AttributeToProjector = StringDictionary[Projector]
  
  trait Bounds extends StObject {
    
    var bottomRight: Point
    
    var topLeft: Point
  }
  object Bounds {
    
    inline def apply(bottomRight: Point, topLeft: Point): Bounds = {
      val __obj = js.Dynamic.literal(bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setBottomRight(value: Point): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Point): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    }
  }
  
  type IAccessor[T] = js.Function3[/* datum */ Any, /* index */ Double, /* dataset */ Dataset, T]
  
  trait IEntity[C /* <: Component */] extends StObject {
    
    var bounds: IEntityBounds
    
    var component: C
    
    var datum: Any
    
    var position: Point
    
    var selection: SimpleSelection[Any]
  }
  object IEntity {
    
    inline def apply[C /* <: Component */](bounds: IEntityBounds, component: C, datum: Any, position: Point, selection: SimpleSelection[Any]): IEntity[C] = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntity[C]]
    }
    
    extension [Self <: IEntity[?], C /* <: Component */](x: Self & IEntity[C]) {
      
      inline def setBounds(value: IEntityBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: C): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: SimpleSelection[Any]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEntityBounds extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object IEntityBounds {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): IEntityBounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntityBounds]
    }
    
    extension [Self <: IEntityBounds](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type IRangeProjector[T] = js.Function4[/* value */ T, /* datum */ Any, /* index */ Double, /* dataset */ Dataset, T]
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Projector = js.Function3[/* datum */ Any, /* index */ Double, /* dataset */ Dataset, Any]
  
  trait Range extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object Range {
    
    inline def apply(max: Double, min: Double): Range = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleSelection[Datum] = Selection_[BaseType, Datum | js.Object, Any, Any]
  
  trait SpaceRequest extends StObject {
    
    var minHeight: Double
    
    var minWidth: Double
  }
  object SpaceRequest {
    
    inline def apply(minHeight: Double, minWidth: Double): SpaceRequest = {
      val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceRequest]
    }
    
    extension [Self <: SpaceRequest](x: Self) {
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
}
