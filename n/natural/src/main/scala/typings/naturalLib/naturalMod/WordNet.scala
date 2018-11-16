package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "WordNet")
@js.native
class WordNet () extends js.Object {
  def this(filename: java.lang.String) = this()
  def get(synsetOffset: scala.Double, pos: java.lang.String, callback: WordNetGetCallback): scala.Unit = js.native
  def lookup(word: java.lang.String, callback: WordNetLookupCallback): scala.Unit = js.native
}

