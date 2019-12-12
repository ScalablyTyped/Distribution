package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Page class.
  *
  * [Api set:  1.1]
  */
@js.native
trait PageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  var index: js.UndefOr[Boolean] = js.native
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  var isBackground: js.UndefOr[Boolean] = js.native
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the view of the page.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewLoadOptions] = js.native
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var width: js.UndefOr[Boolean] = js.native
}

