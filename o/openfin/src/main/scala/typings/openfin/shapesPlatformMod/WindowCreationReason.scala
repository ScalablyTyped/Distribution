package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WindowCreationReason extends js.Object

@JSImport("openfin/_v2/shapes/Platform", "WindowCreationReason")
@js.native
object WindowCreationReason extends js.Object {
  @js.native
  sealed trait APICall extends WindowCreationReason
  
  @js.native
  sealed trait AppCreation extends WindowCreationReason
  
  @js.native
  sealed trait CreateViewWithoutTarget extends WindowCreationReason
  
  @js.native
  sealed trait Restore extends WindowCreationReason
  
  @js.native
  sealed trait Tearout extends WindowCreationReason
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WindowCreationReason with String] = js.native
  /* "api-call" */ @js.native
  object APICall extends TopLevel[APICall with String]
  
  /* "app-creation" */ @js.native
  object AppCreation extends TopLevel[AppCreation with String]
  
  /* "create-view-without-target" */ @js.native
  object CreateViewWithoutTarget extends TopLevel[CreateViewWithoutTarget with String]
  
  /* "restore" */ @js.native
  object Restore extends TopLevel[Restore with String]
  
  /* "tearout" */ @js.native
  object Tearout extends TopLevel[Tearout with String]
  
}

