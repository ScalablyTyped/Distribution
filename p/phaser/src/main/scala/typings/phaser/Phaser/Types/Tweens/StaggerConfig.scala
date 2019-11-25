package typings.phaser.Phaser.Types.Tweens

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaggerConfig extends js.Object {
  /**
    * An ease to apply across the staggered values. Can either be a string, such as 'sine.inout', or a function.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  /**
    * The index to start the stagger from. Can be the strings `first`, `last` or `center`, or an integer representing the stagger position.
    */
  var from: js.UndefOr[String | integer] = js.undefined
  /**
    * Set the stagger to run across a grid by providing an array where element 0 is the width of the grid and element 1 is the height. Combine with the 'from' property to control direction.
    */
  var grid: js.UndefOr[js.Array[integer]] = js.undefined
  /**
    * The value to start the stagger from. Can be used as a way to offset the stagger while still using a range for the value.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object StaggerConfig {
  @scala.inline
  def apply(
    ease: String | js.Function = null,
    from: String | integer = null,
    grid: js.Array[integer] = null,
    start: Int | Double = null
  ): StaggerConfig = {
    val __obj = js.Dynamic.literal()
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaggerConfig]
  }
}

