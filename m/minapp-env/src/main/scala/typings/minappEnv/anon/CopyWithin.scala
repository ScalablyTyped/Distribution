package typings.minappEnv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyWithin extends StObject {
  
  var copyWithin: Boolean
  
  var entries: Boolean
  
  var fill: Boolean
  
  var find: Boolean
  
  var findIndex: Boolean
  
  var keys: Boolean
  
  var values: Boolean
}
object CopyWithin {
  
  inline def apply(
    copyWithin: Boolean,
    entries: Boolean,
    fill: Boolean,
    find: Boolean,
    findIndex: Boolean,
    keys: Boolean,
    values: Boolean
  ): CopyWithin = {
    val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWithin]
  }
  
  extension [Self <: CopyWithin](x: Self) {
    
    inline def setCopyWithin(value: Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFind(value: Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFindIndex(value: Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
