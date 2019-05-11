package typings
package phaserLib.PhaserNs.TypesNs.AnimationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAnimationFrame extends js.Object {
  /**
    * Additional time (in ms) that this frame should appear for during playback.
    */
  var duration: scala.Double
  /**
    * The key of the Frame within the Texture that this AnimationFrame uses.
    */
  var frame: java.lang.String | phaserLib.integer
  /**
    * The key of the Texture this AnimationFrame uses.
    */
  var key: java.lang.String
}

object JSONAnimationFrame {
  @scala.inline
  def apply(duration: scala.Double, frame: java.lang.String | phaserLib.integer, key: java.lang.String): JSONAnimationFrame = {
    val __obj = js.Dynamic.literal(duration = duration, frame = frame.asInstanceOf[js.Any], key = key)
  
    __obj.asInstanceOf[JSONAnimationFrame]
  }
}

