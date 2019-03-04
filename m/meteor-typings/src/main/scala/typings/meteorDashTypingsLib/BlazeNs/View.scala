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

object View {
  @scala.inline
  def apply(
    autorun: js.Function1[
      js.Function1[/* computation */ meteorDashTypingsLib.TrackerNs.Computation, scala.Unit], 
      meteorDashTypingsLib.TrackerNs.Computation
    ],
    firstNode: js.Function0[stdLib.Node],
    isCreated: scala.Boolean,
    isDestroyed: scala.Boolean,
    isRendered: scala.Boolean,
    lastNode: js.Function0[stdLib.Node],
    name: java.lang.String,
    onViewCreated: js.Function1[js.Function, scala.Unit],
    onViewDestroyed: js.Function1[js.Function, scala.Unit],
    onViewReady: js.Function1[js.Function, scala.Unit],
    parentView: View,
    renderCount: scala.Double,
    template: Template,
    templateInstance: js.Function0[TemplateInstance]
  ): View = {
    val __obj = js.Dynamic.literal(autorun = autorun, firstNode = firstNode, isCreated = isCreated, isDestroyed = isDestroyed, isRendered = isRendered, lastNode = lastNode, name = name, onViewCreated = onViewCreated, onViewDestroyed = onViewDestroyed, onViewReady = onViewReady, parentView = parentView, renderCount = renderCount, template = template, templateInstance = templateInstance)
  
    __obj.asInstanceOf[View]
  }
}

