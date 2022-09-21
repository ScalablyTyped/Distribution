package typings.nlcst.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphContentMap extends StObject {
  
  var sentence: Sentence
  
  var source: Source
  
  var whiteSpace: WhiteSpace
}
object ParagraphContentMap {
  
  inline def apply(sentence: Sentence, source: Source, whiteSpace: WhiteSpace): ParagraphContentMap = {
    val __obj = js.Dynamic.literal(sentence = sentence.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphContentMap]
  }
  
  extension [Self <: ParagraphContentMap](x: Self) {
    
    inline def setSentence(value: Sentence): Self = StObject.set(x, "sentence", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setWhiteSpace(value: WhiteSpace): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
  }
}
