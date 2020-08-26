package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trie extends js.Object {
  def addString(text: String): Boolean = js.native
  def addStrings(strings: js.Array[String]): Unit = js.native
  def contains(token: String): Boolean = js.native
  def findMatchesOnPath(text: String): js.Array[String] = js.native
  def findPrefix(text: String): js.Array[String] = js.native
  def keysWithPrefix(text: String): js.Array[String] = js.native
}

object Trie {
  @scala.inline
  def apply(
    addString: String => Boolean,
    addStrings: js.Array[String] => Unit,
    contains: String => Boolean,
    findMatchesOnPath: String => js.Array[String],
    findPrefix: String => js.Array[String],
    keysWithPrefix: String => js.Array[String]
  ): Trie = {
    val __obj = js.Dynamic.literal(addString = js.Any.fromFunction1(addString), addStrings = js.Any.fromFunction1(addStrings), contains = js.Any.fromFunction1(contains), findMatchesOnPath = js.Any.fromFunction1(findMatchesOnPath), findPrefix = js.Any.fromFunction1(findPrefix), keysWithPrefix = js.Any.fromFunction1(keysWithPrefix))
    __obj.asInstanceOf[Trie]
  }
  @scala.inline
  implicit class TrieOps[Self <: Trie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddString(value: String => Boolean): Self = this.set("addString", js.Any.fromFunction1(value))
    @scala.inline
    def setAddStrings(value: js.Array[String] => Unit): Self = this.set("addStrings", js.Any.fromFunction1(value))
    @scala.inline
    def setContains(value: String => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setFindMatchesOnPath(value: String => js.Array[String]): Self = this.set("findMatchesOnPath", js.Any.fromFunction1(value))
    @scala.inline
    def setFindPrefix(value: String => js.Array[String]): Self = this.set("findPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def setKeysWithPrefix(value: String => js.Array[String]): Self = this.set("keysWithPrefix", js.Any.fromFunction1(value))
  }
  
}

