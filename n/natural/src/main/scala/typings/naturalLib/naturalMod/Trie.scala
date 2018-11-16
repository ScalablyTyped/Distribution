package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Trie")
@js.native
class Trie () extends js.Object {
  def this(caseSensitive: scala.Boolean) = this()
  def addString(text: java.lang.String): scala.Boolean = js.native
  def addStrings(strings: js.Array[java.lang.String]): scala.Unit = js.native
  def contains(token: java.lang.String): scala.Boolean = js.native
  def findMatchesOnPath(text: java.lang.String): js.Array[java.lang.String] = js.native
  def findPrefix(text: java.lang.String): js.Array[java.lang.String] = js.native
  def keysWithPrefix(text: java.lang.String): js.Array[java.lang.String] = js.native
}

