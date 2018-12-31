package typings
package mcustomscrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Creates a new mCustomScrollbar with the specified or default options
    *
    * @param options Override default options
    */
  def mCustomScrollbar(): JQuery = js.native
  /**
    * Calls specified methods on the scrollbar "update", "stop", "disable", "destroy"
    *
    * @param method Method name to call on scrollbar e.g. "update", "stop"
    */
  def mCustomScrollbar(method: java.lang.String): JQuery = js.native
  def mCustomScrollbar(options: mcustomscrollbarLib.MCustomScrollbarNs.CustomScrollbarOptions): JQuery = js.native
  /**
    * Calls the scrollTo method on the scrollbar
    *
    * @param scrollTo Method name as a string "scrollTo"
    * @param parameter String or pixel integer value to specify where to scroll to e.g. "bottom", "top" or 20
    * @param options Override default options
    */
  def mCustomScrollbar(scrollTo: java.lang.String, parameter: js.Any): JQuery = js.native
  def mCustomScrollbar(
    scrollTo: java.lang.String,
    parameter: js.Any,
    options: mcustomscrollbarLib.MCustomScrollbarNs.ScrollToParameterOptions
  ): JQuery = js.native
}

