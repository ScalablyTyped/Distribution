package typings.npmWhich.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the static instance of `npm-which`.
  */
@js.native
trait StaticWhich extends WhichBase[StaticWhichOptions] {
  
  /**
    * Initializes an `NpmWhich`-instance for the specified working-directory.
    *
    * @param cwd
    * The working-directory to browse.
    */
  def apply(): NpmWhich = js.native
  
  /**
    * Searches for the specified command.
    *
    * @param cmd
    * The command to look for.
    *
    * @param options
    * The options for searching the command.
    */
  def sync(cmd: String, options: StaticWhichOptions): String = js.native
}
