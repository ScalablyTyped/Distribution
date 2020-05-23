package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResolveError extends js.Object

@JSImport("openfin/_v2/fdc3/errors", "ResolveError")
@js.native
object ResolveError extends js.Object {
  /**
    * Indicates that a provided application does not handle the provided intent and context.
    */
  @js.native
  sealed trait AppDoesNotHandleIntent extends ResolveError
  
  /**
    * Indicates that no application could be found to handle the provided intent and context.
    */
  @js.native
  sealed trait NoAppsFound extends ResolveError
  
  /**
    * Indicates that intent resolution has been cancelled because the user dismissed the intent resolver UI.
    */
  @js.native
  sealed trait ResolverClosedOrCancelled extends ResolveError
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResolveError with String] = js.native
  /* "ResolveError:AppDoesNotHandleIntent" */ @js.native
  object AppDoesNotHandleIntent extends TopLevel[AppDoesNotHandleIntent with String]
  
  /* "ResolveError:NoAppsFound" */ @js.native
  object NoAppsFound extends TopLevel[NoAppsFound with String]
  
  /* "ResolveError:ResolverClosedOrCancelled" */ @js.native
  object ResolverClosedOrCancelled extends TopLevel[ResolverClosedOrCancelled with String]
  
}

