package typings.openui5.anon

import typings.openui5.sapMColumnMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPopin extends StObject {
  
  /**
    * Returns true if there are visible columns in the pop-in area
    */
  var hasPopin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns array of columns that are hidden in the pop-in based on their importance. See {@link sap.m.Column#getImportance}
    */
  var hiddenInPopin: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Returns array of all visible columns in the pop-in area.
    */
  var visibleInPopin: js.UndefOr[js.Array[default]] = js.undefined
}
object HasPopin {
  
  inline def apply(): HasPopin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPopin]
  }
  
  extension [Self <: HasPopin](x: Self) {
    
    inline def setHasPopin(value: Boolean): Self = StObject.set(x, "hasPopin", value.asInstanceOf[js.Any])
    
    inline def setHasPopinUndefined: Self = StObject.set(x, "hasPopin", js.undefined)
    
    inline def setHiddenInPopin(value: js.Array[default]): Self = StObject.set(x, "hiddenInPopin", value.asInstanceOf[js.Any])
    
    inline def setHiddenInPopinUndefined: Self = StObject.set(x, "hiddenInPopin", js.undefined)
    
    inline def setHiddenInPopinVarargs(value: default*): Self = StObject.set(x, "hiddenInPopin", js.Array(value*))
    
    inline def setVisibleInPopin(value: js.Array[default]): Self = StObject.set(x, "visibleInPopin", value.asInstanceOf[js.Any])
    
    inline def setVisibleInPopinUndefined: Self = StObject.set(x, "visibleInPopin", js.undefined)
    
    inline def setVisibleInPopinVarargs(value: default*): Self = StObject.set(x, "visibleInPopin", js.Array(value*))
  }
}
