package typings.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.TopLevel
import typings.meteor.Tracker.Computation
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  
  def firstNode(): Node = js.native
  
  var isCreated: Boolean = js.native
  
  var isDestroyed: Boolean = js.native
  
  var isRendered: Boolean = js.native
  
  def lastNode(): Node = js.native
  
  var name: String = js.native
  
  def onViewCreated(func: js.Function): Unit = js.native
  
  def onViewDestroyed(func: js.Function): Unit = js.native
  
  def onViewReady(func: js.Function): Unit = js.native
  
  var parentView: View = js.native
  
  var renderCount: Double = js.native
  
  var template: Template = js.native
  
  def templateInstance(): TemplateInstance = js.native
}
@JSImport("meteor/blaze", "Blaze.View")
@js.native
object View extends TopLevel[ViewStatic]
