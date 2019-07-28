package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "BrillPOSTagger")
@js.native
class BrillPOSTagger protected () extends js.Object {
  def this(lexicon: Lexicon, ruleSet: RuleSet) = this()
  var lexicon: Lexicon = js.native
  var ruleSet: RuleSet = js.native
  def tag(sentence: js.Array[String]): js.Array[js.Array[String]] = js.native
}

