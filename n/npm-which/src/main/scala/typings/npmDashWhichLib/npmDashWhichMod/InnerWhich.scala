package typings
package npmDashWhichLib.npmDashWhichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InnerWhich extends js.Object {
  /**
    * Creates a searcher for the specified command.
    *
    * @param options
    * The options for searching the command.
    */
  def apply(): InnerWhich = js.native
  /**
    * Searches for the command.
    *
    * @param callback
    * A callback for handling the result.
    */
  def apply(callback: NpmWhichCallback): scala.Unit = js.native
  def apply(options: NpmWhichOptions): InnerWhich = js.native
  /**
    * Searches for the command.
    *
    * @param options
    * The options for searching the command.
    *
    * @param callback
    * A callback for handling the result.
    */
  def apply(options: NpmWhichOptions, callback: NpmWhichCallback): scala.Unit = js.native
  /**
    * Searches for the command.
    *
    * @param options
    * The options for searching the command.
    */
  def sync(): java.lang.String = js.native
  def sync(options: NpmWhichOptions): java.lang.String = js.native
}

