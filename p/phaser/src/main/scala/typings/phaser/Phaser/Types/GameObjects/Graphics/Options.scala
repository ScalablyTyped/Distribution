package typings.phaser.Phaser.Types.GameObjects.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Graphics game Object.
  */
/* Inlined phaser.Phaser.Types.GameObjects.Graphics.Styles & {  x ? :number,   y ? :number} */
trait Options extends js.Object {
  /**
    * The style applied to shape areas.
    */
  var fillStyle: js.UndefOr[FillStyle] = js.undefined
  /**
    * The style applied to shape outlines.
    */
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  /**
    * The x coordinate of the Graphics.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the Graphics.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fillStyle: FillStyle = null,
    lineStyle: LineStyle = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

