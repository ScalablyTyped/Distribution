package typings.node.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path", "posix")
@js.native
object posix extends js.Object {
  val delimiter: java.lang.String = js.native
  val sep: java.lang.String = js.native
  def basename(p: java.lang.String): java.lang.String = js.native
  def basename(p: java.lang.String, ext: java.lang.String): java.lang.String = js.native
  def dirname(p: java.lang.String): java.lang.String = js.native
  def extname(p: java.lang.String): java.lang.String = js.native
  def format(pP: FormatInputPathObject): java.lang.String = js.native
  def isAbsolute(p: java.lang.String): Boolean = js.native
  def join(paths: java.lang.String*): java.lang.String = js.native
  def normalize(p: java.lang.String): java.lang.String = js.native
  def parse(p: java.lang.String): ParsedPath = js.native
  def relative(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def resolve(pathSegments: java.lang.String*): java.lang.String = js.native
}

