package typings.openfin.resizableViewMod

import typings.openfin.GoldenLayout.Container
import typings.openfin.shapesIdentityMod.Identity
import typings.openfin.utilsMod.ViewComponent
import typings.openfin.v2MainMod.Fin
import typings.openfin.v2MainMod.View
import typings.resizeObserverBrowser.ResizeObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/platform/resizable-view", "ResizableView")
@js.native
class ResizableView protected () extends js.Object {
  def this(fin: Fin, hasContainerComponentState: ViewComponent, viewObserver: ResizeObserver) = this()
  
  var container: Container = js.native
  
  def createOrAttachView(): js.Promise[Unit] = js.native
  
  var fin: js.Any = js.native
  
  var ofView: View = js.native
  
  var options: js.Any = js.native
  
  def renderIntoComponent(): js.Promise[Unit] = js.native
  
  var resizeObserver: ResizeObserver = js.native
  
  var windowIdentity: Identity = js.native
}
