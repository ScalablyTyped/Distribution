package typings
package odataLib.odataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OHandlerStatic extends js.Object {
  def apply(): OHandlerStatic = js.native
  def apply(options: java.lang.String): OHandler[js.Object] = js.native
  def apply(options: Options): OHandler[js.Object] = js.native
  def config(config: Options): OHandlerStatic = js.native
  def isEndpoint(): scala.Boolean = js.native
}

