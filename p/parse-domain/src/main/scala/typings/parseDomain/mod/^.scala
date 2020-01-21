package typings.parseDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-domain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String): ParsedDomain | Null = js.native
  def apply(url: String, options: ParseOptions): ParsedDomain | Null = js.native
}

