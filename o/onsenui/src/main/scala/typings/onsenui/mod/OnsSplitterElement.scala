package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsSplitterElement extends HTMLElement {
  /**
    * @description The `<ons-splitter-content>` element.
    */
  var content: HTMLElement = js.native
  /**
    * @description Left `<ons-splitter-side>` element.
    */
  var left: HTMLElement = js.native
  /**
    * @description Retrieve the back button handler.
    */
  var onDeviceBackButton: js.Function = js.native
  /**
    * @description Right `<ons-splitter-side>` element.
    */
  var right: HTMLElement = js.native
  var side: js.Any = js.native
}

