package typings
package ojaLib.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "Action")
@js.native
class Action () extends Flow {
  def activate(): this.type = js.native
  def add(child: AddableToAction*): this.type = js.native
  def execute(): scala.Unit = js.native
}

