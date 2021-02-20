package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trie extends StObject {
  
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
  implicit class TrieMutableBuilder[Self <: Trie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddString(value: String => Boolean): Self = StObject.set(x, "addString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddStrings(value: js.Array[String] => Unit): Self = StObject.set(x, "addStrings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindMatchesOnPath(value: String => js.Array[String]): Self = StObject.set(x, "findMatchesOnPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindPrefix(value: String => js.Array[String]): Self = StObject.set(x, "findPrefix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeysWithPrefix(value: String => js.Array[String]): Self = StObject.set(x, "keysWithPrefix", js.Any.fromFunction1(value))
  }
}
