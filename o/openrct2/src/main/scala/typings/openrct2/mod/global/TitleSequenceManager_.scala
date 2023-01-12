package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleSequenceManager_ extends StObject {
  
  /**
    * Creates a new blank title sequence.
    * @param name The name of the title sequence.
    */
  def create(name: String): TitleSequence
  
  /**
    * Gets all the available title sequences.
    */
  val titleSequences: js.Array[TitleSequence]
}
object TitleSequenceManager_ {
  
  inline def apply(create: String => TitleSequence, titleSequences: js.Array[TitleSequence]): TitleSequenceManager_ = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), titleSequences = titleSequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleSequenceManager_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleSequenceManager_] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: String => TitleSequence): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setTitleSequences(value: js.Array[TitleSequence]): Self = StObject.set(x, "titleSequences", value.asInstanceOf[js.Any])
    
    inline def setTitleSequencesVarargs(value: TitleSequence*): Self = StObject.set(x, "titleSequences", js.Array(value*))
  }
}
