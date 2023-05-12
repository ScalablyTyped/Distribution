package typings.ol

import typings.ol.resolutionconstraintMod.Type
import typings.ol.sizeMod.Size
import typings.proj4.mod.Converter
import typings.proj4.mod.InterfaceCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientX extends StObject {
    
    var clientX: Double
    
    var clientY: Double
  }
  object ClientX {
    
    inline def apply(clientX: Double, clientY: Double): ClientX = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientX] (val x: Self) extends AnyVal {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Constraint extends StObject {
    
    def constraint(arg0: Double, arg1: Double, arg2: Size): js.UndefOr[Double]
    def constraint(arg0: Double, arg1: Double, arg2: Size, arg3: Boolean): js.UndefOr[Double]
    def constraint(arg0: Unit, arg1: Double, arg2: Size): js.UndefOr[Double]
    def constraint(arg0: Unit, arg1: Double, arg2: Size, arg3: Boolean): js.UndefOr[Double]
    @JSName("constraint")
    var constraint_Original: Type
    
    var maxResolution: Double
    
    var minResolution: Double
    
    var minZoom: Double
    
    var zoomFactor: Double
  }
  object Constraint {
    
    inline def apply(
      constraint: (/* arg0 */ js.UndefOr[Double], /* arg1 */ Double, /* arg2 */ Size, /* arg3 */ js.UndefOr[Boolean]) => js.UndefOr[Double],
      maxResolution: Double,
      minResolution: Double,
      minZoom: Double,
      zoomFactor: Double
    ): Constraint = {
      val __obj = js.Dynamic.literal(constraint = js.Any.fromFunction4(constraint), maxResolution = maxResolution.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
      
      inline def setConstraint(
        value: (/* arg0 */ js.UndefOr[Double], /* arg1 */ Double, /* arg2 */ Size, /* arg3 */ js.UndefOr[Boolean]) => js.UndefOr[Double]
      ): Self = StObject.set(x, "constraint", js.Any.fromFunction4(value))
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(fromProjection: String): Converter = js.native
    def apply(fromProjection: String, toProjection: String): Converter = js.native
    def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
    def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
    def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = js.native
    def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var heights: js.Array[Double]
    
    var lineWidths: js.Array[Double]
    
    var width: Double
    
    var widths: js.Array[Double]
  }
  object Height {
    
    inline def apply(
      height: Double,
      heights: js.Array[Double],
      lineWidths: js.Array[Double],
      width: Double,
      widths: js.Array[Double]
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heights = heights.asInstanceOf[js.Any], lineWidths = lineWidths.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widths = widths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeights(value: js.Array[Double]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      inline def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value*))
      
      inline def setLineWidths(value: js.Array[Double]): Self = StObject.set(x, "lineWidths", value.asInstanceOf[js.Any])
      
      inline def setLineWidthsVarargs(value: Double*): Self = StObject.set(x, "lineWidths", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value*))
    }
  }
  
  trait Https extends StObject {
    
    var https: String
  }
  object Https {
    
    inline def apply(https: String): Https = {
      val __obj = js.Dynamic.literal(https = https.asInstanceOf[js.Any])
      __obj.asInstanceOf[Https]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Https] (val x: Self) extends AnyVal {
      
      inline def setHttps(value: String): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var size: Double
    
    var `type`: Double
  }
  object Name {
    
    inline def apply(name: String, size: Double, `type`: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transform extends StObject {
    
    var transform_ : String
    
    var visible: Boolean
  }
  object Transform {
    
    inline def apply(transform_ : String, visible: Boolean): Transform = {
      val __obj = js.Dynamic.literal(transform_ = transform_.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      inline def setTransform_(value: String): Self = StObject.set(x, "transform_", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
