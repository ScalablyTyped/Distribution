package typings.openfin.resizableViewMod

import typings.openfin.GoldenLayout.Container
import typings.openfin.anon.ComponentState
import typings.openfin.v2MainMod.Fin
import typings.openfin.v2MainMod.View
import typings.resizeObserverBrowser.ResizeObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/resizable-view", "ResizableView")
@js.native
class ResizableView protected () extends js.Object {
  def this(fin: Fin, options: ViewState) = this()
  var container: Container = js.native
  var fin: js.Any = js.native
  var ofView: View = js.native
  var options: js.Any = js.native
  var resizeObserver: ResizeObserver = js.native
  def createOrAttachView(): js.Promise[Unit] = js.native
  def renderIntoComponent(opts: ComponentState): js.Promise[Unit] = js.native
}

