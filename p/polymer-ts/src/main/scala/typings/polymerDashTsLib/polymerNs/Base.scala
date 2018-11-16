package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("polymer.Base")
@js.native
class Base ()
  extends PolymerBase
     with Element {
  var is: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("polymer.Base")
@js.native
object Base extends js.Object {
  def create[T /* <: polymerDashTsLib.polymerNs.Base */](args: js.Any*): T = js.native
  def register(): scala.Unit = js.native
}

