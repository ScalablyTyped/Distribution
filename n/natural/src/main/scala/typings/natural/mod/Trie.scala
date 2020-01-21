package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trie extends js.Object {
  def addString(text: String): Boolean
  def addStrings(strings: js.Array[String]): Unit
  def contains(token: String): Boolean
  def findMatchesOnPath(text: String): js.Array[String]
  def findPrefix(text: String): js.Array[String]
  def keysWithPrefix(text: String): js.Array[String]
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
}

