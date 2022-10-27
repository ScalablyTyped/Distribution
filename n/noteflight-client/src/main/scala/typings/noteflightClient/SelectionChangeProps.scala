package typings.noteflightClient

import typings.noteflightClient.noteflightClientStrings.`object`
import typings.noteflightClient.noteflightClientStrings.measure
import typings.noteflightClient.noteflightClientStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionChangeProps extends StObject {
  
  /**
    * The zero-based index of the measure which includes the end of the selected range.
    * When kind has the value "measure" this will be a exclusive end index analogous to the argument to selectMeasures().
    */
  var endIndex: Double
  
  /**
    * The offset in quarter notes from the beginning of the end measure at which the range ends. This offset may range from zero to the number of quarter notes in the measure.
    */
  var endOffset: Double
  
  /**
    * A deep-linking fragment representing the selection which can be passed to the selectFragment() function if desired.
    */
  var fragment: String
  
  /**
    * If this property is absent, indicates that there is no active selection.
    * Otherwise, has one of the following values:
    * object: one or more individual objects are selected,
    * measure: one or more measures are selected,
    * range: a time range is selected in some set of staves.
    */
  var kind: js.UndefOr[`object` | measure | range] = js.undefined
  
  /**
    * Optional property only present when kind has the value "object" or "range", providing an array of zero-based staff indices, counting down from the topmost staff in the score.
    * If given, only the given staves are included in the selection.
    */
  var staffIndices: js.Array[Double]
  
  /**
    * The zero-based index of the measure at the start of the selected range.
    */
  var startIndex: Double
  
  /**
    * The offset in quarter notes from the beginning of the start measure at which the range begins. This value may range from zero to the number of quarter notes in the measure.
    */
  var startOffset: Double
}
object SelectionChangeProps {
  
  inline def apply(
    endIndex: Double,
    endOffset: Double,
    fragment: String,
    staffIndices: js.Array[Double],
    startIndex: Double,
    startOffset: Double
  ): SelectionChangeProps = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], staffIndices = staffIndices.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangeProps]
  }
  
  extension [Self <: SelectionChangeProps](x: Self) {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `object` | measure | range): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStaffIndices(value: js.Array[Double]): Self = StObject.set(x, "staffIndices", value.asInstanceOf[js.Any])
    
    inline def setStaffIndicesVarargs(value: Double*): Self = StObject.set(x, "staffIndices", js.Array(value*))
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
