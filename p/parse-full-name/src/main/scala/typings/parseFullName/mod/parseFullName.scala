package typings.parseFullName.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-full-name", "parseFullName")
@js.native
object parseFullName extends js.Object {
  def apply(nameToParse: String): Name = js.native
  def apply(nameToParse: String, partToReturn: partToReturn): Name = js.native
  def apply(nameToParse: String, partToReturn: partToReturn, fixCase: Boolean): Name = js.native
  def apply(nameToParse: String, partToReturn: partToReturn, fixCase: Boolean, stopOnError: Boolean): Name = js.native
  def apply(
    nameToParse: String,
    partToReturn: partToReturn,
    fixCase: Boolean,
    stopOnError: Boolean,
    useLongLists: Boolean
  ): Name = js.native
}

