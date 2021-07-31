package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrillPOSTagger extends StObject {
  
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
  
  @scala.inline
  implicit class BrillPOSTaggerMutableBuilder[Self <: BrillPOSTagger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLexicon(value: Lexicon): Self = StObject.set(x, "lexicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSet(value: RuleSet): Self = StObject.set(x, "ruleSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: js.Array[String] => js.Array[js.Array[String]]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
  }
}
