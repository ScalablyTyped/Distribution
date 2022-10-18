package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalAlign extends StObject
@JSImport("sap/ui/core/library", "VerticalAlign")
@js.native
object VerticalAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VerticalAlign & String] = js.native
  
  /**
    * Content is aligned at the bottom.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with VerticalAlign
  /* "Bottom" */ val Bottom: typings.openui5.sapUiCoreLibraryMod.VerticalAlign.Bottom & String = js.native
  
  /**
    * Content respect the parent's vertical alignment.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with VerticalAlign
  /* "Inherit" */ val Inherit: typings.openui5.sapUiCoreLibraryMod.VerticalAlign.Inherit & String = js.native
  
  /**
    * Content is centered vertically .
    */
  @js.native
  sealed trait Middle
    extends StObject
       with VerticalAlign
  /* "Middle" */ val Middle: typings.openui5.sapUiCoreLibraryMod.VerticalAlign.Middle & String = js.native
  
  /**
    * Content is aligned at the top.
    */
  @js.native
  sealed trait Top
    extends StObject
       with VerticalAlign
  /* "Top" */ val Top: typings.openui5.sapUiCoreLibraryMod.VerticalAlign.Top & String = js.native
}
