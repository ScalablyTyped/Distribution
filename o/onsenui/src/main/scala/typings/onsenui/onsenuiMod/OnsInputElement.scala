package typings.onsenui.onsenuiMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsInputElement extends HTMLElement {
  /**
    * @description This boolean specifies whether the input is checked or not. Only works for `radio` and `checkbox` type inputs.
    */
  var checked: Boolean = js.native
  /**
    * @description A boolean value that specifies whether the input is disabled or not.
    */
  var disabled: Boolean = js.native
  /**
    * @description The current value of the input.
    */
  var value: String = js.native
}

