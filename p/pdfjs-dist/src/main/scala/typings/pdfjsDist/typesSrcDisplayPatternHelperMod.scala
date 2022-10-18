package typings.pdfjsDist

import typings.pdfjsDist.anon.OffsetY
import typings.pdfjsDist.anon.Scale
import typings.pdfjsDist.anon.ScaleX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayPatternHelperMod {
  
  @JSImport("pdfjs-dist/types/src/display/pattern_helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PathType {
    
    @JSImport("pdfjs-dist/types/src/display/pattern_helper", "PathType.FILL")
    @js.native
    val FILL: String = js.native
    
    @JSImport("pdfjs-dist/types/src/display/pattern_helper", "PathType.SHADING")
    @js.native
    val SHADING: String = js.native
    
    @JSImport("pdfjs-dist/types/src/display/pattern_helper", "PathType.STROKE")
    @js.native
    val STROKE: String = js.native
  }
  
  @JSImport("pdfjs-dist/types/src/display/pattern_helper", "TilingPattern")
  @js.native
  open class TilingPattern protected () extends StObject {
    def this(IR: Any, color: Any, ctx: Any, canvasGraphicsFactory: Any, baseTransform: Any) = this()
    
    var baseTransform: Any = js.native
    
    var bbox: Any = js.native
    
    var canvasGraphicsFactory: Any = js.native
    
    def clipBbox(graphics: Any, x0: Any, y0: Any, x1: Any, y1: Any): Unit = js.native
    
    var color: Any = js.native
    
    def createPatternCanvas(owner: Any): ScaleX = js.native
    
    var ctx: Any = js.native
    
    def getPattern(ctx: Any, owner: Any, inverse: Any, pathType: Any): Any = js.native
    
    def getSizeAndScale(step: Any, realOutputSize: Any, scale: Any): Scale = js.native
    
    var matrix: Any = js.native
    
    var operatorList: Any = js.native
    
    var paintType: Any = js.native
    
    def setFillAndStrokeStyleToContext(graphics: Any, paintType: Any, color: Any): Unit = js.native
    
    var tilingType: Any = js.native
    
    var xstep: Any = js.native
    
    var ystep: Any = js.native
  }
  
  inline def getShadingPattern(IR: Any): RadialAxialShadingPattern | MeshShadingPattern | DummyShadingPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("getShadingPattern")(IR.asInstanceOf[js.Any]).asInstanceOf[RadialAxialShadingPattern | MeshShadingPattern | DummyShadingPattern]
  
  trait BaseShadingPattern extends StObject {
    
    def getPattern(): Unit
  }
  object BaseShadingPattern {
    
    inline def apply(getPattern: () => Unit): BaseShadingPattern = {
      val __obj = js.Dynamic.literal(getPattern = js.Any.fromFunction0(getPattern))
      __obj.asInstanceOf[BaseShadingPattern]
    }
    
    extension [Self <: BaseShadingPattern](x: Self) {
      
      inline def setGetPattern(value: () => Unit): Self = StObject.set(x, "getPattern", js.Any.fromFunction0(value))
    }
  }
  
  trait DummyShadingPattern
    extends StObject
       with BaseShadingPattern
  object DummyShadingPattern {
    
    inline def apply(getPattern: () => Unit): DummyShadingPattern = {
      val __obj = js.Dynamic.literal(getPattern = js.Any.fromFunction0(getPattern))
      __obj.asInstanceOf[DummyShadingPattern]
    }
  }
  
  trait MeshShadingPattern
    extends StObject
       with BaseShadingPattern {
    
    var _background: Any
    
    var _bbox: Any
    
    var _bounds: Any
    
    var _colors: Any
    
    var _coords: Any
    
    def _createMeshCanvas(combinedScale: Any, backgroundColor: Any, cachedCanvases: Any): OffsetY
    
    var _figures: Any
    
    def getPattern(ctx: Any, owner: Any, inverse: Any, pathType: Any): Any
    
    var matrix: Any
  }
  object MeshShadingPattern {
    
    inline def apply(
      _background: Any,
      _bbox: Any,
      _bounds: Any,
      _colors: Any,
      _coords: Any,
      _createMeshCanvas: (Any, Any, Any) => OffsetY,
      _figures: Any,
      getPattern: (Any, Any, Any, Any) => Any,
      matrix: Any
    ): MeshShadingPattern = {
      val __obj = js.Dynamic.literal(_background = _background.asInstanceOf[js.Any], _bbox = _bbox.asInstanceOf[js.Any], _bounds = _bounds.asInstanceOf[js.Any], _colors = _colors.asInstanceOf[js.Any], _coords = _coords.asInstanceOf[js.Any], _createMeshCanvas = js.Any.fromFunction3(_createMeshCanvas), _figures = _figures.asInstanceOf[js.Any], getPattern = js.Any.fromFunction4(getPattern), matrix = matrix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeshShadingPattern]
    }
    
    extension [Self <: MeshShadingPattern](x: Self) {
      
      inline def setGetPattern(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "getPattern", js.Any.fromFunction4(value))
      
      inline def setMatrix(value: Any): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def set_background(value: Any): Self = StObject.set(x, "_background", value.asInstanceOf[js.Any])
      
      inline def set_bbox(value: Any): Self = StObject.set(x, "_bbox", value.asInstanceOf[js.Any])
      
      inline def set_bounds(value: Any): Self = StObject.set(x, "_bounds", value.asInstanceOf[js.Any])
      
      inline def set_colors(value: Any): Self = StObject.set(x, "_colors", value.asInstanceOf[js.Any])
      
      inline def set_coords(value: Any): Self = StObject.set(x, "_coords", value.asInstanceOf[js.Any])
      
      inline def set_createMeshCanvas(value: (Any, Any, Any) => OffsetY): Self = StObject.set(x, "_createMeshCanvas", js.Any.fromFunction3(value))
      
      inline def set_figures(value: Any): Self = StObject.set(x, "_figures", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadialAxialShadingPattern
    extends StObject
       with BaseShadingPattern {
    
    var _bbox: Any
    
    var _colorStops: Any
    
    def _createGradient(ctx: Any): Any
    
    var _p0: Any
    
    var _p1: Any
    
    var _r0: Any
    
    var _r1: Any
    
    var _type: Any
    
    def getPattern(ctx: Any, owner: Any, inverse: Any, pathType: Any): Any
    
    var matrix: Any
  }
  object RadialAxialShadingPattern {
    
    inline def apply(
      _bbox: Any,
      _colorStops: Any,
      _createGradient: Any => Any,
      _p0: Any,
      _p1: Any,
      _r0: Any,
      _r1: Any,
      _type: Any,
      getPattern: (Any, Any, Any, Any) => Any,
      matrix: Any
    ): RadialAxialShadingPattern = {
      val __obj = js.Dynamic.literal(_bbox = _bbox.asInstanceOf[js.Any], _colorStops = _colorStops.asInstanceOf[js.Any], _createGradient = js.Any.fromFunction1(_createGradient), _p0 = _p0.asInstanceOf[js.Any], _p1 = _p1.asInstanceOf[js.Any], _r0 = _r0.asInstanceOf[js.Any], _r1 = _r1.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], getPattern = js.Any.fromFunction4(getPattern), matrix = matrix.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialAxialShadingPattern]
    }
    
    extension [Self <: RadialAxialShadingPattern](x: Self) {
      
      inline def setGetPattern(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "getPattern", js.Any.fromFunction4(value))
      
      inline def setMatrix(value: Any): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def set_bbox(value: Any): Self = StObject.set(x, "_bbox", value.asInstanceOf[js.Any])
      
      inline def set_colorStops(value: Any): Self = StObject.set(x, "_colorStops", value.asInstanceOf[js.Any])
      
      inline def set_createGradient(value: Any => Any): Self = StObject.set(x, "_createGradient", js.Any.fromFunction1(value))
      
      inline def set_p0(value: Any): Self = StObject.set(x, "_p0", value.asInstanceOf[js.Any])
      
      inline def set_p1(value: Any): Self = StObject.set(x, "_p1", value.asInstanceOf[js.Any])
      
      inline def set_r0(value: Any): Self = StObject.set(x, "_r0", value.asInstanceOf[js.Any])
      
      inline def set_r1(value: Any): Self = StObject.set(x, "_r1", value.asInstanceOf[js.Any])
      
      inline def set_type(value: Any): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    }
  }
}
