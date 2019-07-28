package typings.mdurl.mdurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdurl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(input: String): String = js.native
  def decode(input: String, exclude: String): String = js.native
  def encode(str: String): String = js.native
  def encode(str: String, exclude: String): String = js.native
  def encode(str: String, exclude: String, keepEscaped: Boolean): String = js.native
  def format(url: Url): String = js.native
  def parse(input: String): Url = js.native
  def parse(input: String, slashesDenoteHost: Boolean): Url = js.native
}

