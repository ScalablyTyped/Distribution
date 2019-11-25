package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAnimationFrame extends js.Object {
  /**
    * Additional time (in ms) that this frame should appear for during playback.
    */
  var duration: Double
  /**
    * The key of the Frame within the Texture that this AnimationFrame uses.
    */
  var frame: String | integer
  /**
    * The key of the Texture this AnimationFrame uses.
    */
  var key: String
}

object JSONAnimationFrame {
  @scala.inline
  def apply(duration: Double, frame: String | integer, key: String): JSONAnimationFrame = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONAnimationFrame]
  }
}

