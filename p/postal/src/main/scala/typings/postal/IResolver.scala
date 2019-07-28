package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolver extends js.Object {
  def compare(binding: String, topic: String, headerOptions: js.Object): Boolean = js.native
  def purge(): Unit = js.native
  def purge(options: Anon_Binding): Unit = js.native
  def reset(): Unit = js.native
}

