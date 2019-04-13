package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsInputElement
  extends stdLib.HTMLElement {
  /**
    * @description This boolean specifies whether the input is checked or not. Only works for `radio` and `checkbox` type inputs.
    */
  var checked: scala.Boolean = js.native
  /**
    * @description A boolean value that specifies whether the input is disabled or not.
    */
  var disabled: scala.Boolean = js.native
  /**
    * @description The current value of the input.
    */
  var value: java.lang.String = js.native
}

