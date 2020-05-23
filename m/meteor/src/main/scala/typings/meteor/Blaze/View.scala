package typings.meteor.Blaze

import typings.meteor.Tracker.Computation
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var isCreated: Boolean
  var isDestroyed: Boolean
  var isRendered: Boolean
  var name: String
  var parentView: View
  var renderCount: Double
  var template: Template
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
  def firstNode(): Node
  def lastNode(): Node
  def onViewCreated(func: js.Function): Unit
  def onViewDestroyed(func: js.Function): Unit
  def onViewReady(func: js.Function): Unit
  def templateInstance(): TemplateInstance
}

object View {
  @scala.inline
  def apply(
    autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
    firstNode: () => Node,
    isCreated: Boolean,
    isDestroyed: Boolean,
    isRendered: Boolean,
    lastNode: () => Node,
    name: String,
    onViewCreated: js.Function => Unit,
    onViewDestroyed: js.Function => Unit,
    onViewReady: js.Function => Unit,
    parentView: View,
    renderCount: Double,
    template: Template,
    templateInstance: () => TemplateInstance
  ): View = {
    val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], lastNode = js.Any.fromFunction0(lastNode), name = name.asInstanceOf[js.Any], onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView.asInstanceOf[js.Any], renderCount = renderCount.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateInstance = js.Any.fromFunction0(templateInstance))
    __obj.asInstanceOf[View]
  }
}

