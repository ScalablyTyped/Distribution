package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Trie")
@js.native
class Trie () extends js.Object {
  def this(caseSensitive: Boolean) = this()
  def addString(text: String): Boolean = js.native
  def addStrings(strings: js.Array[String]): Unit = js.native
  def contains(token: String): Boolean = js.native
  def findMatchesOnPath(text: String): js.Array[String] = js.native
  def findPrefix(text: String): js.Array[String] = js.native
  def keysWithPrefix(text: String): js.Array[String] = js.native
}

