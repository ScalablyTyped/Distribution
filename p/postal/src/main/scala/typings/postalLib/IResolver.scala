package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolver extends js.Object {
  def compare(binding: java.lang.String, topic: java.lang.String, headerOptions: js.Object): scala.Boolean = js.native
  def purge(): scala.Unit = js.native
  def purge(options: Anon_Binding): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

