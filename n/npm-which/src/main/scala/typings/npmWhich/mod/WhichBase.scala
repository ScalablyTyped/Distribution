package typings.npmWhich.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a basic interface for `npm-which`.
  */
@js.native
trait WhichBase[TOptions] extends js.Object {
  
  /**
    * Creates a searcher for the specified command.
    *
    * @param cmd
    * The command to look for.
    *
    * @param options
    * The default options.
    *
    * @return
    * A searcher for the specified command.
    */
  def apply(cmd: String): InnerWhich = js.native
  /**
    * Searches for the specified command.
    *
    * @param cmd
    * The command to look for.
    *
    * @param callback
    * A callback for handling the result.
    */
  def apply(cmd: String, callback: NpmWhichCallback): Unit = js.native
  def apply(cmd: String, options: TOptions): InnerWhich = js.native
  /**
    * Searches for the specified command.
    *
    * @param cmd
    * The command to look for.
    *
    * @param options
    * The options for searching the command.
    *
    * @param callback
    * A callback for handling the result.
    */
  def apply(cmd: String, options: TOptions, callback: NpmWhichCallback): Unit = js.native
}
