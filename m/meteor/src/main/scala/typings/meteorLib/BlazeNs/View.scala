package typings
package meteorLib.BlazeNs

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
  def autorun(runFunc: js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit]): meteorLib.TrackerNs.Computation
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
    autorun: js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit] => meteorLib.TrackerNs.Computation,
    firstNode: () => stdLib.Node,
    isCreated: scala.Boolean,
    isDestroyed: scala.Boolean,
    isRendered: scala.Boolean,
    lastNode: () => stdLib.Node,
    name: java.lang.String,
    onViewCreated: js.Function => scala.Unit,
    onViewDestroyed: js.Function => scala.Unit,
    onViewReady: js.Function => scala.Unit,
    parentView: View,
    renderCount: scala.Double,
    template: Template,
    templateInstance: () => TemplateInstance
  ): View = {
    val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated, isDestroyed = isDestroyed, isRendered = isRendered, lastNode = js.Any.fromFunction0(lastNode), name = name, onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView, renderCount = renderCount, template = template, templateInstance = js.Any.fromFunction0(templateInstance))
  
    __obj.asInstanceOf[View]
  }
}

