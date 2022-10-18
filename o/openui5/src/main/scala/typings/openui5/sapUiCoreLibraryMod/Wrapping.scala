package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Wrapping extends StObject
@JSImport("sap/ui/core/library", "Wrapping")
@js.native
object Wrapping extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Wrapping & String] = js.native
  
  /**
    * Inserts actual line breaks in the text at the wrap point.
    */
  @js.native
  sealed trait Hard
    extends StObject
       with Wrapping
  /* "Hard" */ val Hard: typings.openui5.sapUiCoreLibraryMod.Wrapping.Hard & String = js.native
  
  /**
    * The standard browser behavior is considered for wrapping.
    */
  @js.native
  sealed trait None
    extends StObject
       with Wrapping
  /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.Wrapping.None & String = js.native
  
  /**
    * Wrapping shall not be allowed.
    */
  @js.native
  sealed trait Off
    extends StObject
       with Wrapping
  /* "Off" */ val Off: typings.openui5.sapUiCoreLibraryMod.Wrapping.Off & String = js.native
  
  /**
    * The text is actually on the same line but displayed within several lines.
    */
  @js.native
  sealed trait Soft
    extends StObject
       with Wrapping
  /* "Soft" */ val Soft: typings.openui5.sapUiCoreLibraryMod.Wrapping.Soft & String = js.native
}
