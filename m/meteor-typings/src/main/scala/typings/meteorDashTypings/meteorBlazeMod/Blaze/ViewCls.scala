package typings.meteorDashTypings.meteorBlazeMod.Blaze

import typings.meteorDashTypings.Tracker.Computation
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/blaze", "Blaze.View")
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
  override var template: typings.meteorDashTypings.meteorBlazeMod.Blaze.Template = js.native
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

