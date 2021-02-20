package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindowCreationReason extends StObject
@JSImport("openfin/_v2/shapes/Platform", "WindowCreationReason")
@js.native
object WindowCreationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WindowCreationReason with String] = js.native
  
  @js.native
  sealed trait APICall extends WindowCreationReason
  /* "api-call" */ val APICall: typings.openfin.shapesPlatformMod.WindowCreationReason.APICall with String = js.native
  
  @js.native
  sealed trait AppCreation extends WindowCreationReason
  /* "app-creation" */ val AppCreation: typings.openfin.shapesPlatformMod.WindowCreationReason.AppCreation with String = js.native
  
  @js.native
  sealed trait CreateViewWithoutTarget extends WindowCreationReason
  /* "create-view-without-target" */ val CreateViewWithoutTarget: typings.openfin.shapesPlatformMod.WindowCreationReason.CreateViewWithoutTarget with String = js.native
  
  @js.native
  sealed trait Restore extends WindowCreationReason
  /* "restore" */ val Restore: typings.openfin.shapesPlatformMod.WindowCreationReason.Restore with String = js.native
  
  @js.native
  sealed trait Tearout extends WindowCreationReason
  /* "tearout" */ val Tearout: typings.openfin.shapesPlatformMod.WindowCreationReason.Tearout with String = js.native
}
