package typings.preSuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pre-suf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def ensureEnding(str: String, suffix: String): String = js.native
  def ensureLeading(str: String, prefix: String): String = js.native
  def removeEnding(str: String, suffix: String): String = js.native
  def removeLeading(str: String, prefix: String): String = js.native
}

