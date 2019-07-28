package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedValues extends js.Object {
  var Modified: Boolean = js.native
  val Names: IStrings = js.native
  def Clone(): INamedValues = js.native
  def Contains(Name: String): Boolean = js.native
  def Value(ValueName: String): js.Any = js.native
  def Value(ValueName: String, value: js.Any): Unit = js.native
}

