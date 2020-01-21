package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrillPOSTagger extends js.Object {
  var lexicon: Lexicon
  var ruleSet: RuleSet
  def tag(sentence: js.Array[String]): js.Array[js.Array[String]]
}

object BrillPOSTagger {
  @scala.inline
  def apply(lexicon: Lexicon, ruleSet: RuleSet, tag: js.Array[String] => js.Array[js.Array[String]]): BrillPOSTagger = {
    val __obj = js.Dynamic.literal(lexicon = lexicon.asInstanceOf[js.Any], ruleSet = ruleSet.asInstanceOf[js.Any], tag = js.Any.fromFunction1(tag))
  
    __obj.asInstanceOf[BrillPOSTagger]
  }
}

