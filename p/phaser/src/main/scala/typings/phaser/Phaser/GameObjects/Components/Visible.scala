package typings.phaser.Phaser.GameObjects.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the visibility of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
trait Visible extends js.Object {
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  var visible: Boolean
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  def setVisible(value: Boolean): this.type
}

object Visible {
  @scala.inline
  def apply(setVisible: Boolean => Visible, visible: Boolean): Visible = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
}

