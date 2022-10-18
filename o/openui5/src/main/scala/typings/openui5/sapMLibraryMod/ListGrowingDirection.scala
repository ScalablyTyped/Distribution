package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListGrowingDirection extends StObject
@JSImport("sap/m/library", "ListGrowingDirection")
@js.native
object ListGrowingDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListGrowingDirection & String] = js.native
  
  /**
    * User has to scroll down to load more items or the growing button is displayed at the bottom.
    */
  @js.native
  sealed trait Downwards
    extends StObject
       with ListGrowingDirection
  /* "Downwards" */ val Downwards: typings.openui5.sapMLibraryMod.ListGrowingDirection.Downwards & String = js.native
  
  /**
    * User has to scroll up to load more items or the growing button is displayed at the top.
    *
    * **Note:** If this option is active, there should not be any other control than `sap.m.List` inside its
    * `ScollContainer`.
    */
  @js.native
  sealed trait Upwards
    extends StObject
       with ListGrowingDirection
  /* "Upwards" */ val Upwards: typings.openui5.sapMLibraryMod.ListGrowingDirection.Upwards & String = js.native
}
