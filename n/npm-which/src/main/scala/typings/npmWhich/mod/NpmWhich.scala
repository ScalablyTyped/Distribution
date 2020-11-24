package typings.npmWhich.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def sync(cmd: String): String = js.native
  def sync(cmd: String, options: StaticWhichOptions): String = js.native
}
