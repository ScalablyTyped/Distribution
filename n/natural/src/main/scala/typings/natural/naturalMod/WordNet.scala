package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "WordNet")
@js.native
class WordNet () extends js.Object {
  def this(filename: String) = this()
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit = js.native
  def lookup(word: String, callback: WordNetLookupCallback): Unit = js.native
}

