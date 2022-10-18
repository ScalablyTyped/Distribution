package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationBarStatus extends StObject
@JSImport("sap/ui/ux3/library", "NotificationBarStatus")
@js.native
object NotificationBarStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NotificationBarStatus & String] = js.native
  
  /**
    * Default height for the bar
    */
  @js.native
  sealed trait Default
    extends StObject
       with NotificationBarStatus
  /* "Default" */ val Default: typings.openui5.sapUiUx3LibraryMod.NotificationBarStatus.Default & String = js.native
  
  /**
    * Bar should be maximized
    */
  @js.native
  sealed trait Max
    extends StObject
       with NotificationBarStatus
  /* "Max" */ val Max: typings.openui5.sapUiUx3LibraryMod.NotificationBarStatus.Max & String = js.native
  
  /**
    * Bar should be minimized
    */
  @js.native
  sealed trait Min
    extends StObject
       with NotificationBarStatus
  /* "Min" */ val Min: typings.openui5.sapUiUx3LibraryMod.NotificationBarStatus.Min & String = js.native
  
  /**
    * Bar should not be visible
    */
  @js.native
  sealed trait None
    extends StObject
       with NotificationBarStatus
  /* "None" */ val None: typings.openui5.sapUiUx3LibraryMod.NotificationBarStatus.None & String = js.native
}
