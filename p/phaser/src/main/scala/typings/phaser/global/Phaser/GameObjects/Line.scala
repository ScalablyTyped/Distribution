package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Line Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports only stroke colors and cannot be filled.
  * 
  * A Line Shape allows you to draw a line between two points in your game. You can control the
  * stroke color and thickness of the line. In WebGL only you can also specify a different
  * thickness for the start and end of the line, allowing you to render lines that taper-off.
  * 
  * If you need to draw multiple lines in a sequence you may wish to use the Polygon Shape instead.
  * 
  * Be aware that as with all Game Objects the default origin is 0.5. If you need to draw a Line
  * between two points and want the x1/y1 values to match the x/y values, then set the origin to 0.
  */
@JSGlobal("Phaser.GameObjects.Line")
@js.native
class Line protected ()
  extends typings.phaser.Phaser.GameObjects.Line {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param x1 The horizontal position of the start of the line. Default 0.
    * @param y1 The vertical position of the start of the line. Default 0.
    * @param x2 The horizontal position of the end of the line. Default 128.
    * @param y2 The vertical position of the end of the line. Default 0.
    * @param strokeColor The color the line will be drawn in, i.e. 0xff0000 for red.
    * @param strokeAlpha The alpha the line will be drawn in. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x2: js.UndefOr[Double],
    y2: js.UndefOr[Double],
    strokeColor: js.UndefOr[Double],
    strokeAlpha: js.UndefOr[Double]
  ) = this()
}
