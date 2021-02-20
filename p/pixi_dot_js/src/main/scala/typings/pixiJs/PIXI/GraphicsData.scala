package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class to contain data useful for Graphics objects
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait GraphicsData extends StObject {
  
  /**
    * Destroys the Graphics data.
    *
    */
  def destroy(): Unit = js.native
  
  /**
    * The style of the fill.
    * @member {PIXI.FillStyle} PIXI.GraphicsData#fillStyle
    */
  var fillStyle: FillStyle = js.native
  
  /**
    * The collection of holes.
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsData#holes
    */
  var holes: js.Array[GraphicsData] = js.native
  
  /**
    * The style of the line.
    * @member {PIXI.LineStyle} PIXI.GraphicsData#lineStyle
    */
  var lineStyle: LineStyle = js.native
  
  /**
    * The transform matrix.
    * @member {PIXI.Matrix} PIXI.GraphicsData#matrix
    */
  var matrix: Matrix = js.native
  
  /**
    * The collection of points.
    * @member {number[]} PIXI.GraphicsData#points
    */
  var points: js.Array[Double] = js.native
  
  /**
    * The shape object to draw.
    * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} PIXI.GraphicsData#shape
    */
  var shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle = js.native
  
  /**
    * The type of the shape, see the Const.Shapes file for all the existing types,
    * @member {number} PIXI.GraphicsData#type
    */
  var `type`: Double = js.native
}
object GraphicsData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GraphicsDataMutableBuilder[Self <: GraphicsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFillStyle(value: FillStyle): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoles(value: js.Array[GraphicsData]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolesVarargs(value: GraphicsData*): Self = StObject.set(x, "holes", js.Array(value :_*))
    
    @scala.inline
    def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
