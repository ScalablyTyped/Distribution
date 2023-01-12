package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrillPOSTagger extends StObject {
  
  var lexicon: Lexicon
  
  var ruleSet: RuleSet
  
  def tag(sentence: js.Array[String]): Sentence
}
object BrillPOSTagger {
  
  inline def apply(lexicon: Lexicon, ruleSet: RuleSet, tag: js.Array[String] => Sentence): BrillPOSTagger = {
    val __obj = js.Dynamic.literal(lexicon = lexicon.asInstanceOf[js.Any], ruleSet = ruleSet.asInstanceOf[js.Any], tag = js.Any.fromFunction1(tag))
    __obj.asInstanceOf[BrillPOSTagger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrillPOSTagger] (val x: Self) extends AnyVal {
    
    inline def setLexicon(value: Lexicon): Self = StObject.set(x, "lexicon", value.asInstanceOf[js.Any])
    
    inline def setRuleSet(value: RuleSet): Self = StObject.set(x, "ruleSet", value.asInstanceOf[js.Any])
    
    inline def setTag(value: js.Array[String] => Sentence): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
  }
}
