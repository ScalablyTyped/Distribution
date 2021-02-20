package typings.phaser.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Triangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * The Triangle consists of 3 lines, joining up to form a triangular shape. You can control the
  * position of each point of these lines. The triangle is always closed and cannot have an open
  * face. If you require that, consider using a Polygon instead.
  */
@js.native
trait Triangle extends Shape {
  
  /**
    * Sets the data for the lines that make up this Triangle shape.
    * @param x1 The horizontal position of the first point in the triangle. Default 0.
    * @param y1 The vertical position of the first point in the triangle. Default 0.
    * @param x2 The horizontal position of the second point in the triangle. Default 0.
    * @param y2 The vertical position of the second point in the triangle. Default 0.
    * @param x3 The horizontal position of the third point in the triangle. Default 0.
    * @param y3 The vertical position of the third point in the triangle. Default 0.
    */
  def setTo(
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x2: js.UndefOr[Double],
    y2: js.UndefOr[Double],
    x3: js.UndefOr[Double],
    y3: js.UndefOr[Double]
  ): this.type = js.native
}
