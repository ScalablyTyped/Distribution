package typings.pixiJs.mod

import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "GraphicsData")
@js.native
open class GraphicsData protected ()
  extends typings.pixiGraphics.mod.GraphicsData {
  /**
    * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
    * @param fillStyle - the width of the line to draw
    * @param lineStyle - the color of the line to draw
    * @param matrix - Transform matrix
    */
  def this(shape: IShape) = this()
  def this(shape: IShape, fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle) = this()
  def this(shape: IShape, fillStyle: Unit, lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle) = this()
  def this(
    shape: IShape,
    fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle,
    lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle
  ) = this()
  def this(shape: IShape, fillStyle: Unit, lineStyle: Unit, matrix: typings.pixiCore.mod.Matrix) = this()
  def this(
    shape: IShape,
    fillStyle: Unit,
    lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle,
    matrix: typings.pixiCore.mod.Matrix
  ) = this()
  def this(
    shape: IShape,
    fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle,
    lineStyle: Unit,
    matrix: typings.pixiCore.mod.Matrix
  ) = this()
  def this(
    shape: IShape,
    fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle,
    lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle,
    matrix: typings.pixiCore.mod.Matrix
  ) = this()
}
