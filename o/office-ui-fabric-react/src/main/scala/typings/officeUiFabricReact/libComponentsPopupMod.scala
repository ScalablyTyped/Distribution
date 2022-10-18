package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsPopupPopupDottypesMod.IPopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPopupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Popup", "Popup")
  @js.native
  open class Popup protected ()
    extends typings.officeUiFabricReact.libComponentsPopupPopupMod.Popup {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  object Popup {
    
    @JSImport("office-ui-fabric-react/lib/components/Popup", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Popup", "Popup.defaultProps")
    @js.native
    def defaultProps: IPopupProps = js.native
    inline def defaultProps_=(x: IPopupProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
