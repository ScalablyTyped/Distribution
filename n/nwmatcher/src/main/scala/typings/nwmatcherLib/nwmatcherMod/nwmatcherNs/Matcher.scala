package typings
package nwmatcherLib.nwmatcherMod.nwmatcherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  def byClass(className: java.lang.String): js.Array[stdLib.Element] = js.native
  def byClass(className: java.lang.String, from: stdLib.Element): js.Array[stdLib.Element] = js.native
  // DOM Helpers
  def byId(id: java.lang.String): stdLib.Element | scala.Null = js.native
  // DOM Helpers
  def byId(id: java.lang.String, from: stdLib.Element): stdLib.Element | scala.Null = js.native
  def byName(name: java.lang.String): js.Array[stdLib.Element] = js.native
  def byName(name: java.lang.String, from: stdLib.Element): js.Array[stdLib.Element] = js.native
  def byTag(tag: java.lang.String): js.Array[stdLib.Element] = js.native
  def byTag(tag: java.lang.String, from: stdLib.Element): js.Array[stdLib.Element] = js.native
  // DOM Selection
  def first(selector: java.lang.String): stdLib.Element | scala.Null = js.native
  // DOM Selection
  def first(selector: java.lang.String, context: stdLib.Element): stdLib.Element | scala.Null = js.native
  def getAttribute(element: stdLib.Element, attribute: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def hasAttribute(element: stdLib.Element, attribute: java.lang.String): scala.Boolean = js.native
  def `match`(element: stdLib.Element, selector: java.lang.String): scala.Boolean = js.native
  def `match`(element: stdLib.Element, selector: java.lang.String, context: stdLib.Element): scala.Boolean = js.native
  def select(selector: java.lang.String): js.Array[stdLib.Element] = js.native
  def select(selector: java.lang.String, context: stdLib.Element): js.Array[stdLib.Element] = js.native
  def select(
    selector: java.lang.String,
    context: stdLib.Element,
    callback: js.Function1[/* element */ stdLib.Element, scala.Unit]
  ): js.Array[stdLib.Element] = js.native
}

