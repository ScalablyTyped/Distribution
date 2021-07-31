package typings.pokerEvaluator

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("poker-evaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("poker-evaluator", "CARDS")
  @js.native
  val CARDS: Deck = js.native
  
  @JSImport("poker-evaluator", "HANDTYPES")
  @js.native
  val HANDTYPES: js.Array[HandName] = js.native
  
  @scala.inline
  def evalHand(cards: js.Array[Double | String]): EvaluatedHand = ^.asInstanceOf[js.Dynamic].applyDynamic("evalHand")(cards.asInstanceOf[js.Any]).asInstanceOf[EvaluatedHand]
  
  @JSImport("poker-evaluator", "ranks")
  @js.native
  val ranks: Buffer = js.native
  
  type Deck = StringDictionary[Double]
  
  trait EvaluatedHand extends StObject {
    
    var handName: HandName
    
    // Index of HANDTYPES array
    var handRank: Double
    
    var handType: Double
    
    var value: Double
  }
  object EvaluatedHand {
    
    @scala.inline
    def apply(handName: HandName, handRank: Double, handType: Double, value: Double): EvaluatedHand = {
      val __obj = js.Dynamic.literal(handName = handName.asInstanceOf[js.Any], handRank = handRank.asInstanceOf[js.Any], handType = handType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluatedHand]
    }
    
    @scala.inline
    implicit class EvaluatedHandMutableBuilder[Self <: EvaluatedHand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandName(value: HandName): Self = StObject.set(x, "handName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandRank(value: Double): Self = StObject.set(x, "handRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandType(value: Double): Self = StObject.set(x, "handType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pokerEvaluator.pokerEvaluatorStrings.`invalid hand`
    - typings.pokerEvaluator.pokerEvaluatorStrings.`high card`
    - typings.pokerEvaluator.pokerEvaluatorStrings.`one pair`
    - typings.pokerEvaluator.pokerEvaluatorStrings.`two pairs`
    - typings.pokerEvaluator.pokerEvaluatorStrings.`three of a kind`
    - typings.pokerEvaluator.pokerEvaluatorStrings.straight
    - typings.pokerEvaluator.pokerEvaluatorStrings.flush
    - typings.pokerEvaluator.pokerEvaluatorStrings.`full house`
    - typings.pokerEvaluator.pokerEvaluatorStrings.`four of a kind`
    - typings.pokerEvaluator.pokerEvaluatorStrings.`straight flush`
  */
  trait HandName extends StObject
  object HandName {
    
    @scala.inline
    def flush: typings.pokerEvaluator.pokerEvaluatorStrings.flush = "flush".asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.flush]
    
    @scala.inline
    def `four of a kind`: typings.pokerEvaluator.pokerEvaluatorStrings.`four of a kind` = ("four of a kind").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`four of a kind`]
    
    @scala.inline
    def `full house`: typings.pokerEvaluator.pokerEvaluatorStrings.`full house` = ("full house").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`full house`]
    
    @scala.inline
    def `high card`: typings.pokerEvaluator.pokerEvaluatorStrings.`high card` = ("high card").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`high card`]
    
    @scala.inline
    def `invalid hand`: typings.pokerEvaluator.pokerEvaluatorStrings.`invalid hand` = ("invalid hand").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`invalid hand`]
    
    @scala.inline
    def `one pair`: typings.pokerEvaluator.pokerEvaluatorStrings.`one pair` = ("one pair").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`one pair`]
    
    @scala.inline
    def straight: typings.pokerEvaluator.pokerEvaluatorStrings.straight = "straight".asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.straight]
    
    @scala.inline
    def `straight flush`: typings.pokerEvaluator.pokerEvaluatorStrings.`straight flush` = ("straight flush").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`straight flush`]
    
    @scala.inline
    def `three of a kind`: typings.pokerEvaluator.pokerEvaluatorStrings.`three of a kind` = ("three of a kind").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`three of a kind`]
    
    @scala.inline
    def `two pairs`: typings.pokerEvaluator.pokerEvaluatorStrings.`two pairs` = ("two pairs").asInstanceOf[typings.pokerEvaluator.pokerEvaluatorStrings.`two pairs`]
  }
}
