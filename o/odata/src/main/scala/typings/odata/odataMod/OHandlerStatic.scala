package typings.odata.odataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OHandlerStatic extends js.Object {
  def apply(): OHandlerStatic = js.native
  def apply(options: String): OHandler[js.Object] = js.native
  def apply(options: Options): OHandler[js.Object] = js.native
  def config(config: Options): OHandlerStatic = js.native
  def isEndpoint(): Boolean = js.native
}

