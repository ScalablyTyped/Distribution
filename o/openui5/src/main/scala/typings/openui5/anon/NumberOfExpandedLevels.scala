package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfExpandedLevels extends StObject {
  
  /**
    * Number of entries to return at and after the given start index; defaults to the model's size limit, see
    * {@link sap.ui.model.Model#setSizeLimit}
    */
  var length: int
  
  /**
    * Number of child levels that shall be fetched automatically
    */
  var numberOfExpandedLevels: int
  
  /**
    * Index of first entry to return from parent group ID `"/"` (zero-based)
    */
  var startIndex: int
  
  /**
    * Number of additional entries that shall be locally available in the binding for subsequent accesses to
    * contexts of parent group ID `"/"` or below, if auto-expanding is selected
    */
  var threshold: int
}
object NumberOfExpandedLevels {
  
  inline def apply(length: int, numberOfExpandedLevels: int, startIndex: int, threshold: int): NumberOfExpandedLevels = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], numberOfExpandedLevels = numberOfExpandedLevels.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfExpandedLevels]
  }
  
  extension [Self <: NumberOfExpandedLevels](x: Self) {
    
    inline def setLength(value: int): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNumberOfExpandedLevels(value: int): Self = StObject.set(x, "numberOfExpandedLevels", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: int): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: int): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
