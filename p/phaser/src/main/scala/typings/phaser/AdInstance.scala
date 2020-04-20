package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdInstance extends js.Object {
  /**
    * Represents an instance of an ad.
    */
  var instance: js.Any
  /**
    * The Audience Network placement ID of this ad instance.
    */
  var placementID: String
  /**
    * Has this ad already been shown in-game?
    */
  var shown: Boolean
  /**
    * Is this a video ad?
    */
  var video: Boolean
}

object AdInstance {
  @scala.inline
  def apply(instance: js.Any, placementID: String, shown: Boolean, video: Boolean): AdInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], placementID = placementID.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdInstance]
  }
}

