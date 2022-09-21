package typings.officeUiFabricReact

import typings.officeUiFabricReact.popupTypesMod.IPopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Popup", "Popup")
  @js.native
  open class Popup protected ()
    extends typings.officeUiFabricReact.popupPopupMod.Popup {
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
