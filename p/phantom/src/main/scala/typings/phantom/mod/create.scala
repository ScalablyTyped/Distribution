package typings.phantom.mod

import typings.phantom.AnonLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phantom", "create")
@js.native
object create extends js.Object {
  def apply(): js.Promise[PhantomJS] = js.native
  def apply(args: js.Array[String]): js.Promise[PhantomJS] = js.native
  def apply(args: js.Array[String], config: AnonLogLevel): js.Promise[PhantomJS] = js.native
}

