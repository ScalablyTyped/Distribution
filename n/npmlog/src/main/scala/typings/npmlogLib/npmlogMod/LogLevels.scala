package typings
package npmlogLib.npmlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevels extends js.Object

@JSImport("npmlog", "LogLevels")
@js.native
object LogLevels extends js.Object {
  @js.native
  sealed trait error
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait http
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait info
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait silly
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait verbose
    extends npmlogLib.npmlogMod.LogLevels
  
  @js.native
  sealed trait warn
    extends npmlogLib.npmlogMod.LogLevels
  
  /* "error" */ val error: error with java.lang.String = js.native
  /* "http" */ val http: http with java.lang.String = js.native
  /* "info" */ val info: info with java.lang.String = js.native
  /* "silly" */ val silly: silly with java.lang.String = js.native
  /* "verbose" */ val verbose: verbose with java.lang.String = js.native
  /* "warn" */ val warn: warn with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[npmlogLib.npmlogMod.LogLevels with java.lang.String] = js.native
}

