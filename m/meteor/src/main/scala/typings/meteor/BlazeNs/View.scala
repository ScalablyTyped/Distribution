package typings.meteor.BlazeNs

import typings.meteor.TrackerNs.Computation
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
  var template: typings.meteor.BlazeNs.Template
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
  def firstNode(): Node
  def lastNode(): Node
  def onViewCreated(func: js.Function): Unit
  def onViewDestroyed(func: js.Function): Unit
  def onViewReady(func: js.Function): Unit
  def templateInstance(): TemplateInstance
}

@JSGlobal("Blaze.View")
@js.native
class ViewCls () extends View {
  def this(name: String) = this()
  def this(name: String, renderFunction: js.Function) = this()
  /* CompleteClass */
  override var isCreated: Boolean = js.native
  /* CompleteClass */
  override var isDestroyed: Boolean = js.native
  /* CompleteClass */
  override var isRendered: Boolean = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var parentView: View = js.native
  /* CompleteClass */
  override var renderCount: Double = js.native
  /* CompleteClass */
  override var template: typings.meteor.BlazeNs.Template = js.native
  /* CompleteClass */
  override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  /* CompleteClass */
  override def firstNode(): Node = js.native
  /* CompleteClass */
  override def lastNode(): Node = js.native
  /* CompleteClass */
  override def onViewCreated(func: js.Function): Unit = js.native
  /* CompleteClass */
  override def onViewDestroyed(func: js.Function): Unit = js.native
  /* CompleteClass */
  override def onViewReady(func: js.Function): Unit = js.native
  /* CompleteClass */
  override def templateInstance(): TemplateInstance = js.native
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
    template: typings.meteor.BlazeNs.Template,
    templateInstance: () => TemplateInstance
  ): View = {
    val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated, isDestroyed = isDestroyed, isRendered = isRendered, lastNode = js.Any.fromFunction0(lastNode), name = name, onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView, renderCount = renderCount, template = template, templateInstance = js.Any.fromFunction0(templateInstance))
  
    __obj.asInstanceOf[View]
  }
}

