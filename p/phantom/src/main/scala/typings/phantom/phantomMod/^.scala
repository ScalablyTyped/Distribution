package typings.phantom.phantomMod

import typings.phantom.Anon_DebugError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phantom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(): js.Promise[PhantomJS] = js.native
  def create(args: js.Array[String]): js.Promise[PhantomJS] = js.native
  def create(args: js.Array[String], config: Anon_DebugError): js.Promise[PhantomJS] = js.native
}

