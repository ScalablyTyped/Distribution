package typings
package nodeLib.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def escape(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String): ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): ParsedUrlQuery = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = js.native
  def stringify(): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String): java.lang.String = js.native
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

