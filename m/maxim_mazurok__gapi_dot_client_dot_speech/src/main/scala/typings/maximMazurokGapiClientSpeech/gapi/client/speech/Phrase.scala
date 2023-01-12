package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phrase extends StObject {
  
  /**
    * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding
    * phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost will simply be ignored. Though `boost` can accept a wide range of positive
    * values, most use cases are best served with values between 0 and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition
    * will skip PhraseSets with a boost value of 0.
    */
  var boost: js.UndefOr[Double] = js.undefined
  
  /** The phrase itself. */
  var value: js.UndefOr[String] = js.undefined
}
object Phrase {
  
  inline def apply(): Phrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phrase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phrase] (val x: Self) extends AnyVal {
    
    inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
