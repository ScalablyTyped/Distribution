package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollBarAction extends StObject
@JSImport("sap/ui/core/library", "ScrollBarAction")
@js.native
object ScrollBarAction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScrollBarAction & String] = js.native
  
  /**
    * Scrolling done by dragging the scroll bar's paint thumb
    */
  @js.native
  sealed trait Drag
    extends StObject
       with ScrollBarAction
  /* "Drag" */ val Drag: typings.openui5.sapUiCoreLibraryMod.ScrollBarAction.Drag & String = js.native
  
  /**
    * Scrolling done by mouse wheel
    */
  @js.native
  sealed trait MouseWheel
    extends StObject
       with ScrollBarAction
  /* "MouseWheel" */ val MouseWheel: typings.openui5.sapUiCoreLibraryMod.ScrollBarAction.MouseWheel & String = js.native
  
  /**
    * Range scrolling caused by clicking track area or using page up or page down key.
    */
  @js.native
  sealed trait Page
    extends StObject
       with ScrollBarAction
  /* "Page" */ val Page: typings.openui5.sapUiCoreLibraryMod.ScrollBarAction.Page & String = js.native
  
  /**
    * Single step scrolling caused by clicking an arrow button or arrow key.
    */
  @js.native
  sealed trait Step
    extends StObject
       with ScrollBarAction
  /* "Step" */ val Step: typings.openui5.sapUiCoreLibraryMod.ScrollBarAction.Step & String = js.native
}
