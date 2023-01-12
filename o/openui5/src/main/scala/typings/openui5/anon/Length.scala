package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  /**
    * Number of entries to return; counting begins at the given start index
    */
  var length: js.UndefOr[int] = js.undefined
  
  /**
    * Level number for oContext, because it might occur at multiple levels; context with group ID `"/"` has
    * level 0
    */
  var level: int
  
  /**
    * Number of child levels that shall be fetched automatically
    */
  var numberOfExpandedLevels: js.UndefOr[int] = js.undefined
  
  /**
    * Index of first child entry to return from the parent context (zero-based)
    */
  var startIndex: js.UndefOr[int] = js.undefined
  
  /**
    * Number of additional entries that shall be locally available in the binding for subsequent accesses to
    * child entries of the given parent context
    */
  var threshold: js.UndefOr[int] = js.undefined
}
object Length {
  
  inline def apply(level: int): Length = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    inline def setLength(value: int): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLevel(value: int): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setNumberOfExpandedLevels(value: int): Self = StObject.set(x, "numberOfExpandedLevels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfExpandedLevelsUndefined: Self = StObject.set(x, "numberOfExpandedLevels", js.undefined)
    
    inline def setStartIndex(value: int): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setThreshold(value: int): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
