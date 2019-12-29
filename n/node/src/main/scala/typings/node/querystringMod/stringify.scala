package typings.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystring", "stringify")
@js.native
object stringify extends js.Object {
  def apply(): String = js.native
  def apply(obj: ParsedUrlQueryInput): String = js.native
  def apply(obj: ParsedUrlQueryInput, sep: String): String = js.native
  def apply(obj: ParsedUrlQueryInput, sep: String, eq: String): String = js.native
  def apply(obj: ParsedUrlQueryInput, sep: String, eq: String, options: StringifyOptions): String = js.native
}

