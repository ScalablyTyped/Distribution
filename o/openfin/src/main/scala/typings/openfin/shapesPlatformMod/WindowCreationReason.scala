package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindowCreationReason extends js.Object
@JSImport("openfin/_v2/shapes/Platform", "WindowCreationReason")
@js.native
object WindowCreationReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WindowCreationReason with String] = js.native
  
  @js.native
  sealed trait APICall extends WindowCreationReason
  /* "api-call" */ @js.native
  object APICall extends TopLevel[APICall with String]
  
  @js.native
  sealed trait AppCreation extends WindowCreationReason
  /* "app-creation" */ @js.native
  object AppCreation extends TopLevel[AppCreation with String]
  
  @js.native
  sealed trait CreateViewWithoutTarget extends WindowCreationReason
  /* "create-view-without-target" */ @js.native
  object CreateViewWithoutTarget extends TopLevel[CreateViewWithoutTarget with String]
  
  @js.native
  sealed trait Restore extends WindowCreationReason
  /* "restore" */ @js.native
  object Restore extends TopLevel[Restore with String]
  
  @js.native
  sealed trait Tearout extends WindowCreationReason
  /* "tearout" */ @js.native
  object Tearout extends TopLevel[Tearout with String]
}
