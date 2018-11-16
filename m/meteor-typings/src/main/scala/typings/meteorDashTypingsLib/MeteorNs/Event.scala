package typings
package meteorDashTypingsLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/

/** Event **/

trait Event extends js.Object {
  var currentTarget: stdLib.HTMLElement
  var target: stdLib.HTMLElement
  var `type`: java.lang.String
  var which: scala.Double
  def isDefaultPrevented(): scala.Boolean
  def isImmediatePropagationStopped(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def preventDefault(): scala.Unit
  def stopImmediatePropagation(): scala.Unit
  def stopPropagation(): scala.Unit
}

