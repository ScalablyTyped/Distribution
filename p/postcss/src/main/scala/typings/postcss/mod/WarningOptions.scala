package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarningOptions
  extends StObject
     with ResultOptions {
  
  /**
    * The index inside a node's string that should be highlighted as
    * source of warning.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * A word inside a node's string that should be highlighted as source
    * of warning.
    */
  var word: js.UndefOr[String] = js.undefined
}
object WarningOptions {
  
  inline def apply(): WarningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningOptions]
  }
  
  extension [Self <: WarningOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
