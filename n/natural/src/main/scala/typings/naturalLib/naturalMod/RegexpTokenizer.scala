package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "RegexpTokenizer")
@js.native
class RegexpTokenizer protected () extends Tokenizer {
  def this(options: RegexTokenizerOptions) = this()
  /* CompleteClass */
  override def tokenize(text: java.lang.String): js.Array[java.lang.String] = js.native
}

