package typings.menubar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronMod {
  
  @JSImport("menubar/lib/@/mocks/electron", "BrowserWindow")
  @js.native
  class BrowserWindow () extends StObject {
    
    def loadURL(): Unit = js.native
    
    def on(): Unit = js.native
    
    def setVisibleOnAllWorkspaces(): Unit = js.native
  }
  
  @JSImport("menubar/lib/@/mocks/electron", "MOCK_APP_GETAPPPATH")
  @js.native
  val MOCK_APP_GETAPPPATH: /* "mock.app.getAppPath" */ String = js.native
  
  @JSImport("menubar/lib/@/mocks/electron", "Tray")
  @js.native
  class Tray () extends StObject {
    
    def on(): Unit = js.native
    
    def setToolTip(): Unit = js.native
  }
  
  object app {
    
    @JSImport("menubar/lib/@/mocks/electron", "app")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("menubar/lib/@/mocks/electron", "app.getAppPath")
    @js.native
    def getAppPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<string, []> */ js.Any = js.native
    @scala.inline
    def getAppPath_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<string, []> */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAppPath")(x.asInstanceOf[js.Any])
    
    @JSImport("menubar/lib/@/mocks/electron", "app.isReady")
    @js.native
    def isReady(): js.Promise[Unit] = js.native
    
    @JSImport("menubar/lib/@/mocks/electron", "app.on")
    @js.native
    def on(): Unit = js.native
  }
}
