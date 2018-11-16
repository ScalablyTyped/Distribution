package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedValues extends js.Object {
  var Modified: scala.Boolean = js.native
  val Names: IStrings = js.native
  def Clone(): INamedValues = js.native
  def Contains(Name: java.lang.String): scala.Boolean = js.native
  def Value(ValueName: java.lang.String): js.Any = js.native
  def Value(ValueName: java.lang.String, value: js.Any): scala.Unit = js.native
}

