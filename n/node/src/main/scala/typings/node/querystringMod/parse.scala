package typings.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystring", "parse")
@js.native
object parse extends js.Object {
  def apply(str: String): ParsedUrlQuery = js.native
  def apply(str: String, sep: String): ParsedUrlQuery = js.native
  def apply(str: String, sep: String, eq: String): ParsedUrlQuery = js.native
  def apply(str: String, sep: String, eq: String, options: ParseOptions): ParsedUrlQuery = js.native
}

