package typings.openfin

import typings.node.eventsMod.EventEmitter
import typings.openfin.identityMod.Identity
import typings.openfin.utilEntityTypeMod.EntityTypeHelpers
import typings.openfin.v2MainMod.Frame
import typings.openfin.viewViewMod.View
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finMod {
  
  @JSImport("openfin/_v2/api/fin", JSImport.Default)
  @js.native
  open class default protected () extends Fin {
    def this(wire: typings.openfin.transportMod.default) = this()
  }
  
  @js.native
  trait Fin extends EventEmitter {
    
    var Application: typings.openfin.applicationMod.default = js.native
    
    var Clipboard: typings.openfin.clipboardMod.default = js.native
    
    var ExternalApplication: typings.openfin.externalApplicationExternalApplicationMod.default = js.native
    
    var ExternalWindow: typings.openfin.externalWindowExternalWindowMod.default = js.native
    
    var Frame: typings.openfin.frameFrameMod.default = js.native
    
    var GlobalHotkey: typings.openfin.apiGlobalHotkeyMod.default = js.native
    
    var InterApplicationBus: typings.openfin.interappbusMod.default = js.native
    
    var Notification: typings.openfin.notificationMod.default = js.native
    
    var Platform: typings.openfin.platformPlatformMod.default = js.native
    
    var System: typings.openfin.systemSystemMod.default = js.native
    
    var View: typings.openfin.viewViewMod.default = js.native
    
    var Window: typings.openfin.windowWindowMod.default = js.native
    
    val me: (View & Identity & EntityTypeHelpers) | (Window & Identity & EntityTypeHelpers) | (Frame & Identity & EntityTypeHelpers) | (js.Object & Identity & EntityTypeHelpers) = js.native
    
    /* private */ var wire: Any = js.native
  }
}
