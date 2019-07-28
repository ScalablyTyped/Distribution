package typings.onsenui.onsenuiMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Switch component
  */
@js.native
trait OnsSwitchElement extends HTMLElement {
  /**
    * @description The underlying checkbox element.
    */
  var checkbox: HTMLElement = js.native
  /**
    * @description If true the switch will be set to on.
    */
  var checked: Boolean = js.native
  /**
    * @description Whether the element is disabled or not.
    */
  var disabled: Boolean = js.native
  var value: js.Any = js.native
}

