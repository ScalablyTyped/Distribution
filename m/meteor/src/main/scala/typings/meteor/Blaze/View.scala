package typings.meteor.Blaze

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("Blaze.View")
@js.native
object View extends TopLevel[ViewStatic]

