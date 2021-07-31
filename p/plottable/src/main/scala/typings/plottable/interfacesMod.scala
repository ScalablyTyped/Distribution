package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.plottable.componentMod.Component
import typings.plottable.datasetMod.Dataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type AppliedProjector = js.Function2[/* datum */ js.Any, /* index */ Double, js.Any]
  
  type AttributeToAppliedProjector = StringDictionary[AppliedProjector]
  
  type AttributeToProjector = StringDictionary[Projector]
  
  trait Bounds extends StObject {
    
    var bottomRight: Point
    
    var topLeft: Point
  }
  object Bounds {
    
    @scala.inline
    def apply(bottomRight: Point, topLeft: Point): Bounds = {
      val __obj = js.Dynamic.literal(bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomRight(value: Point): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: Point): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    }
  }
  
  type IAccessor[T] = js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, T]
  
  trait IEntity[C /* <: Component */] extends StObject {
    
    var bounds: IEntityBounds
    
    var component: C
    
    var datum: js.Any
    
    var position: Point
    
    var selection: SimpleSelection[js.Any]
  }
  object IEntity {
    
    @scala.inline
    def apply[C /* <: Component */](
      bounds: IEntityBounds,
      component: C,
      datum: js.Any,
      position: Point,
      selection: SimpleSelection[js.Any]
    ): IEntity[C] = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntity[C]]
    }
    
    @scala.inline
    implicit class IEntityMutableBuilder[Self <: IEntity[?], C /* <: Component */] (val x: Self & IEntity[C]) extends AnyVal {
      
      @scala.inline
      def setBounds(value: IEntityBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: C): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatum(value: js.Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelection(value: SimpleSelection[js.Any]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEntityBounds extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object IEntityBounds {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): IEntityBounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEntityBounds]
    }
    
    @scala.inline
    implicit class IEntityBoundsMutableBuilder[Self <: IEntityBounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type IRangeProjector[T] = js.Function4[/* value */ T, /* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, T]
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Projector = js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, js.Any]
  
  trait Range extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object Range {
    
    @scala.inline
    def apply(max: Double, min: Double): Range = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleSelection[Datum] = Selection_[BaseType, Datum | js.Object, js.Any, js.Any]
  
  trait SpaceRequest extends StObject {
    
    var minHeight: Double
    
    var minWidth: Double
  }
  object SpaceRequest {
    
    @scala.inline
    def apply(minHeight: Double, minWidth: Double): SpaceRequest = {
      val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceRequest]
    }
    
    @scala.inline
    implicit class SpaceRequestMutableBuilder[Self <: SpaceRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
}
