package typings.pixiGraphics

import typings.pixiCore.mod.Matrix
import typings.pixiGraphics.libStylesFillStyleMod.FillStyle
import typings.pixiGraphics.libStylesLineStyleMod.LineStyle
import typings.pixiMath.libConstMod.SHAPES
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphicsDataMod {
  
  @JSImport("@pixi/graphics/lib/GraphicsData", "GraphicsData")
  @js.native
  open class GraphicsData protected () extends StObject {
    /**
      * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
      * @param fillStyle - the width of the line to draw
      * @param lineStyle - the color of the line to draw
      * @param matrix - Transform matrix
      */
    def this(shape: IShape) = this()
    def this(shape: IShape, fillStyle: FillStyle) = this()
    def this(shape: IShape, fillStyle: Unit, lineStyle: LineStyle) = this()
    def this(shape: IShape, fillStyle: FillStyle, lineStyle: LineStyle) = this()
    def this(shape: IShape, fillStyle: Unit, lineStyle: Unit, matrix: Matrix) = this()
    def this(shape: IShape, fillStyle: Unit, lineStyle: LineStyle, matrix: Matrix) = this()
    def this(shape: IShape, fillStyle: FillStyle, lineStyle: Unit, matrix: Matrix) = this()
    def this(shape: IShape, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix) = this()
    
    /** Destroys the Graphics data. */
    def destroy(): Unit = js.native
    
    /** The style of the fill. */
    var fillStyle: FillStyle = js.native
    
    /** The collection of holes. */
    var holes: js.Array[GraphicsData] = js.native
    
    /** The style of the line. */
    var lineStyle: LineStyle = js.native
    
    /** The transform matrix. */
    var matrix: Matrix = js.native
    
    /** The collection of points. */
    var points: js.Array[Double] = js.native
    
    /**
      * The shape object to draw.
      * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle}
      */
    var shape: IShape = js.native
    
    /** The type of the shape, see the Const.Shapes file for all the existing types, */
    var `type`: SHAPES = js.native
  }
}
