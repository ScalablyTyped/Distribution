package typings
package phaserLib

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
  var placementID: java.lang.String
  /**
    * Has this ad already been shown in-game?
    */
  var shown: scala.Boolean
  /**
    * Is this a video ad?
    */
  var video: scala.Boolean
}

object AdInstance {
  @scala.inline
  def apply(instance: js.Any, placementID: java.lang.String, shown: scala.Boolean, video: scala.Boolean): AdInstance = {
    val __obj = js.Dynamic.literal(instance = instance, placementID = placementID, shown = shown, video = video)
  
    __obj.asInstanceOf[AdInstance]
  }
}

