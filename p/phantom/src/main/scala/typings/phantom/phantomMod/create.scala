package typings.phantom.phantomMod

import typings.phantom.Anon_DebugError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phantom", "create")
@js.native
object create extends js.Object {
  def apply(): js.Promise[PhantomJS] = js.native
  def apply(args: js.Array[String]): js.Promise[PhantomJS] = js.native
  def apply(args: js.Array[String], config: Anon_DebugError): js.Promise[PhantomJS] = js.native
}

