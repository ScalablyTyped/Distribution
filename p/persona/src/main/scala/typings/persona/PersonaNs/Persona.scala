package typings.persona.PersonaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persona extends js.Object {
  def get(gotAssertion: js.Function1[/* s */ String, Unit]): Unit = js.native
  def get(gotAssertion: js.Function1[/* s */ String, Unit], options: GetOptions): Unit = js.native
  def logout(): Unit = js.native
  def request(): Unit = js.native
  def request(options: RequestOptions): Unit = js.native
  def watch(options: WatchOptions): Unit = js.native
}

