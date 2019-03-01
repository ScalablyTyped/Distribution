package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultLight extends js.Object {
  /**
    * Background is transparent
    */
  var Default: js.Any
  /**
    * Background is with predefined light colors
    */
  var Light: js.Any
}

object Anon_DefaultLight {
  @scala.inline
  def apply(Default: js.Any, Light: js.Any): Anon_DefaultLight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Default")(Default)
    __obj.updateDynamic("Light")(Light)
    __obj.asInstanceOf[Anon_DefaultLight]
  }
}

