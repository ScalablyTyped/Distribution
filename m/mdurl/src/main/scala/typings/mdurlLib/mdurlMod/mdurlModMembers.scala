package typings
package mdurlLib.mdurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdurl", JSImport.Namespace)
@js.native
object mdurlModMembers extends js.Object {
  def decode(input: java.lang.String): java.lang.String = js.native
  def decode(input: java.lang.String, exclude: java.lang.String): java.lang.String = js.native
  def encode(str: java.lang.String): java.lang.String = js.native
  def encode(str: java.lang.String, exclude: java.lang.String): java.lang.String = js.native
  def encode(str: java.lang.String, exclude: java.lang.String, keepEscaped: scala.Boolean): java.lang.String = js.native
  def format(url: Url): java.lang.String = js.native
  def parse(input: java.lang.String): Url = js.native
  def parse(input: java.lang.String, slashesDenoteHost: scala.Boolean): Url = js.native
}

