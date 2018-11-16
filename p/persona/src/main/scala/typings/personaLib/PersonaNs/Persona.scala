package typings
package personaLib.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persona extends js.Object {
  def get(gotAssertion: js.Function1[/* s */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(gotAssertion: js.Function1[/* s */ java.lang.String, scala.Unit], options: GetOptions): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def request(): scala.Unit = js.native
  def request(options: RequestOptions): scala.Unit = js.native
  def watch(options: WatchOptions): scala.Unit = js.native
}

