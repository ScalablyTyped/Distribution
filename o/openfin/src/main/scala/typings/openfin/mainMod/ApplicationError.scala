package typings.openfin.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "ApplicationError")
@js.native
object ApplicationError extends js.Object {
  /* "ApplicationError:LaunchError" */ val LaunchError: typings.openfin.errorsMod.ApplicationError.LaunchError with String = js.native
  /* "ApplicationError:LaunchTimeout" */ val LaunchTimeout: typings.openfin.errorsMod.ApplicationError.LaunchTimeout with String = js.native
  /* "ApplicationError:NotFound" */ val NotFound: typings.openfin.errorsMod.ApplicationError.NotFound with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ApplicationError with String] = js.native
}

