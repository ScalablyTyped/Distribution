package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class to contain data useful for Graphics objects
  *
  * @class
  * @memberof PIXI
  */
trait GraphicsData extends StObject {
  
  /**
    * Destroys the Graphics data.
    *
    */
  def destroy(): Unit
  
  /**
    * The style of the fill.
    * @member {PIXI.FillStyle} PIXI.GraphicsData#fillStyle
    */
  var fillStyle: FillStyle
  
  /**
    * The collection of holes.
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsData#holes
    */
  var holes: js.Array[GraphicsData]
  
  /**
    * The style of the line.
    * @member {PIXI.LineStyle} PIXI.GraphicsData#lineStyle
    */
  var lineStyle: LineStyle
  
  /**
    * The transform matrix.
    * @member {PIXI.Matrix} PIXI.GraphicsData#matrix
    */
  var matrix: Matrix
  
  /**
    * The collection of points.
    * @member {number[]} PIXI.GraphicsData#points
    */
  var points: js.Array[Double]
  
  /**
    * The shape object to draw.
    * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} PIXI.GraphicsData#shape
    */
  var shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle
  
  /**
    * The type of the shape, see the Const.Shapes file for all the existing types,
    * @member {number} PIXI.GraphicsData#type
    */
  var `type`: Double
}
object GraphicsData {
  
  inline def apply(
    destroy: () => Unit,
    fillStyle: FillStyle,
    holes: js.Array[GraphicsData],
    lineStyle: LineStyle,
    matrix: Matrix,
    points: js.Array[Double],
    shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle,
    `type`: Double
  ): GraphicsData = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), fillStyle = fillStyle.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsData]
  }
  
  extension [Self <: GraphicsData](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFillStyle(value: FillStyle): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setHoles(value: js.Array[GraphicsData]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    inline def setHolesVarargs(value: GraphicsData*): Self = StObject.set(x, "holes", js.Array(value :_*))
    
    inline def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def setShape(value: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
