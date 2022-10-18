package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToastPlacement extends StObject
@JSImport("sap/ui/webc/main/library", "ToastPlacement")
@js.native
object ToastPlacement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToastPlacement & String] = js.native
  
  /**
    * `ui5-toast` is placed at the `BottomCenter` position of its container. Default placement (no selection)
    */
  @js.native
  sealed trait BottomCenter
    extends StObject
       with ToastPlacement
  /* "BottomCenter" */ val BottomCenter: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.BottomCenter & String = js.native
  
  /**
    * `ui5-toast` is placed at the `BottomEnd` position of its container.
    */
  @js.native
  sealed trait BottomEnd
    extends StObject
       with ToastPlacement
  /* "BottomEnd" */ val BottomEnd: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.BottomEnd & String = js.native
  
  /**
    * `ui5-toast` is placed at the `BottomStart` position of its container.
    */
  @js.native
  sealed trait BottomStart
    extends StObject
       with ToastPlacement
  /* "BottomStart" */ val BottomStart: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.BottomStart & String = js.native
  
  /**
    * `ui5-toast` is placed at the `MiddleCenter` position of its container.
    */
  @js.native
  sealed trait MiddleCenter
    extends StObject
       with ToastPlacement
  /* "MiddleCenter" */ val MiddleCenter: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.MiddleCenter & String = js.native
  
  /**
    * `ui5-toast` is placed at the `MiddleEnd` position of its container.
    */
  @js.native
  sealed trait MiddleEnd
    extends StObject
       with ToastPlacement
  /* "MiddleEnd" */ val MiddleEnd: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.MiddleEnd & String = js.native
  
  /**
    * `ui5-toast` is placed at the `MiddleStart` position of its container.
    */
  @js.native
  sealed trait MiddleStart
    extends StObject
       with ToastPlacement
  /* "MiddleStart" */ val MiddleStart: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.MiddleStart & String = js.native
  
  /**
    * `ui5-toast` is placed at the `TopCenter` position of its container.
    */
  @js.native
  sealed trait TopCenter
    extends StObject
       with ToastPlacement
  /* "TopCenter" */ val TopCenter: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.TopCenter & String = js.native
  
  /**
    * `ui5-toast` is placed at the `TopEnd` position of its container.
    */
  @js.native
  sealed trait TopEnd
    extends StObject
       with ToastPlacement
  /* "TopEnd" */ val TopEnd: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.TopEnd & String = js.native
  
  /**
    * `ui5-toast` is placed at the `TopStart` position of its container.
    */
  @js.native
  sealed trait TopStart
    extends StObject
       with ToastPlacement
  /* "TopStart" */ val TopStart: typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement.TopStart & String = js.native
}
