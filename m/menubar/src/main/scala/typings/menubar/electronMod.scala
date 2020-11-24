package typings.menubar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("menubar/lib/@/mocks/electron", JSImport.Namespace)
@js.native
object electronMod extends js.Object {
  
  val MOCK_APP_GETAPPPATH: /* "mock.app.getAppPath" */ String = js.native
  
  @js.native
  class BrowserWindow () extends js.Object {
    
    def loadURL(): Unit = js.native
    
    def on(): Unit = js.native
    
    def setVisibleOnAllWorkspaces(): Unit = js.native
  }
  
  @js.native
  class Tray () extends js.Object {
    
    def on(): Unit = js.native
    
    def setToolTip(): Unit = js.native
  }
  
  @js.native
  object app extends js.Object {
    
    var getAppPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<string, []> */ js.Any = js.native
    
    def isReady(): js.Promise[Unit] = js.native
    
    def on(): Unit = js.native
  }
}
