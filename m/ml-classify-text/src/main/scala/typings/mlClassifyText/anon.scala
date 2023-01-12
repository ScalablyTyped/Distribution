package typings.mlClassifyText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ml-classify-text.ml-classify-text.ModelOptions> */
  trait PartialModelOptions extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var nGramMax: js.UndefOr[Double] = js.undefined
    
    var nGramMin: js.UndefOr[Double] = js.undefined
    
    var vocabulary: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PartialModelOptions {
    
    inline def apply(): PartialModelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialModelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialModelOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setNGramMax(value: Double): Self = StObject.set(x, "nGramMax", value.asInstanceOf[js.Any])
      
      inline def setNGramMaxUndefined: Self = StObject.set(x, "nGramMax", js.undefined)
      
      inline def setNGramMin(value: Double): Self = StObject.set(x, "nGramMin", value.asInstanceOf[js.Any])
      
      inline def setNGramMinUndefined: Self = StObject.set(x, "nGramMin", js.undefined)
      
      inline def setVocabulary(value: js.Array[String]): Self = StObject.set(x, "vocabulary", value.asInstanceOf[js.Any])
      
      inline def setVocabularyUndefined: Self = StObject.set(x, "vocabulary", js.undefined)
      
      inline def setVocabularyVarargs(value: String*): Self = StObject.set(x, "vocabulary", js.Array(value*))
    }
  }
}
