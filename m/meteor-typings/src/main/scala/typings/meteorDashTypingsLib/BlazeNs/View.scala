package typings
package meteorDashTypingsLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var isCreated: scala.Boolean
  var isDestroyed: scala.Boolean
  var isRendered: scala.Boolean
  var name: java.lang.String
  var parentView: View
  var renderCount: scala.Double
  var template: Template
  def autorun(runFunc: js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit]): meteorDashTypingsLib.TrackerNs.Computation
  def firstNode(): stdLib.Node
  def lastNode(): stdLib.Node
  def onViewCreated(func: js.Function): scala.Unit
  def onViewDestroyed(func: js.Function): scala.Unit
  def onViewReady(func: js.Function): scala.Unit
  def templateInstance(): TemplateInstance
}

