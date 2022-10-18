package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BadgeState extends StObject
@JSImport("sap/m/library", "BadgeState")
@js.native
object BadgeState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BadgeState & String] = js.native
  
  /**
    * Informing interested parties that the badge has appeared.
    */
  @js.native
  sealed trait Appear
    extends StObject
       with BadgeState
  /* "Appear" */ val Appear: typings.openui5.sapMLibraryMod.BadgeState.Appear & String = js.native
  
  /**
    * Informing interested parties that the badge has disappeared.
    */
  @js.native
  sealed trait Disappear
    extends StObject
       with BadgeState
  /* "Disappear" */ val Disappear: typings.openui5.sapMLibraryMod.BadgeState.Disappear & String = js.native
  
  /**
    * Informing interested parties that the badge has been updated.
    */
  @js.native
  sealed trait Updated
    extends StObject
       with BadgeState
  /* "Updated" */ val Updated: typings.openui5.sapMLibraryMod.BadgeState.Updated & String = js.native
}
