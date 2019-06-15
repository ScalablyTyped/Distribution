package typings
package npmDashWhichLib.npmDashWhichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to search for a command.
  */
@js.native
trait NpmWhich extends WhichBase[NpmWhichOptions] {
  /**
    * Searches for the specified command.
    *
    * @param cmd
    * The command to look for.
    *
    * @param options
    * The options for searching the command.
    */
  def sync(cmd: java.lang.String): java.lang.String = js.native
  def sync(cmd: java.lang.String, options: StaticWhichOptions): java.lang.String = js.native
}

