package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordNet extends js.Object {
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit
  def lookup(word: String, callback: WordNetLookupCallback): Unit
}

object WordNet {
  @scala.inline
  def apply(get: (Double, String, WordNetGetCallback) => Unit, lookup: (String, WordNetLookupCallback) => Unit): WordNet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), lookup = js.Any.fromFunction2(lookup))
  
    __obj.asInstanceOf[WordNet]
  }
}

