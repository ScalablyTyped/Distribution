package typings.openfin.errorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationError extends js.Object

@JSImport("openfin/_v2/fdc3/errors", "ApplicationError")
@js.native
object ApplicationError extends js.Object {
  /**
    * Indicates that an application could not be started from an OpenFin manifest.
    */
  @js.native
  sealed trait LaunchError extends ApplicationError
  
  /**
    * Indicates that a timeout was reached before the application was started.
    */
  @js.native
  sealed trait LaunchTimeout extends ApplicationError
  
  /**
    * Indicates that an application of the provided name could not be found, either running or in the application directory.
    */
  @js.native
  sealed trait NotFound extends ApplicationError
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationError with String] = js.native
  /* "ApplicationError:LaunchError" */ @js.native
  object LaunchError extends TopLevel[LaunchError with String]
  
  /* "ApplicationError:LaunchTimeout" */ @js.native
  object LaunchTimeout extends TopLevel[LaunchTimeout with String]
  
  /* "ApplicationError:NotFound" */ @js.native
  object NotFound extends TopLevel[NotFound with String]
  
}

