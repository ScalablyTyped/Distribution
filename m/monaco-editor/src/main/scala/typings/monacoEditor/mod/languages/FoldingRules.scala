package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRules extends StObject {
  
  /**
    * Region markers used by the language.
    */
  var markers: js.UndefOr[FoldingMarkers] = js.undefined
  
  /**
    * Used by the indentation based strategy to decide whether empty lines belong to the previous or the next block.
    * A language adheres to the off-side rule if blocks in that language are expressed by their indentation.
    * See [wikipedia](https://en.wikipedia.org/wiki/Off-side_rule) for more information.
    * If not set, `false` is used and empty lines belong to the previous block.
    */
  var offSide: js.UndefOr[Boolean] = js.undefined
}
object FoldingRules {
  
  inline def apply(): FoldingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldingRules] (val x: Self) extends AnyVal {
    
    inline def setMarkers(value: FoldingMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setOffSide(value: Boolean): Self = StObject.set(x, "offSide", value.asInstanceOf[js.Any])
    
    inline def setOffSideUndefined: Self = StObject.set(x, "offSide", js.undefined)
  }
}
