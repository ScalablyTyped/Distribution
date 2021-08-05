package typings.openfin

import typings.openfin.GoldenLayout.Container
import typings.openfin.shapesIdentityMod.Identity
import typings.openfin.utilsMod.ViewComponent
import typings.openfin.v2MainMod.Fin
import typings.openfin.v2MainMod.View
import typings.openfin.viewViewMod.ViewCreationOptions
import typings.resizeObserverBrowser.ResizeObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableViewMod {
  
  @JSImport("openfin/_v2/api/platform/resizable-view", "ResizableView")
  @js.native
  class ResizableView protected () extends StObject {
    def this(fin: Fin, hasContainerComponentState: ViewComponent, viewObserver: ResizeObserver) = this()
    
    var container: Container = js.native
    
    def createOrAttachView(): js.Promise[Unit] = js.native
    
    /* private */ var fin: js.Any = js.native
    
    var ofView: View = js.native
    
    var options: js.Any = js.native
    
    def renderIntoComponent(): js.Promise[Unit] = js.native
    
    var resizeObserver: ResizeObserver = js.native
    
    var windowIdentity: Identity = js.native
  }
  
  trait ViewState
    extends StObject
       with ViewCreationOptions
  object ViewState {
    
    inline def apply(name: String, target: typings.openfin.identityMod.Identity, url: String): ViewState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewState]
    }
  }
}
