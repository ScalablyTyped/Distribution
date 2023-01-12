package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewCategoricalColumn extends StObject {
  
  /** The data repetition objects. */
  var objects: js.UndefOr[js.Array[DataViewObjects]] = js.undefined
  
  var source: DataViewMetadataColumn
}
object DataViewCategoricalColumn {
  
  inline def apply(source: DataViewMetadataColumn): DataViewCategoricalColumn = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewCategoricalColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewCategoricalColumn] (val x: Self) extends AnyVal {
    
    inline def setObjects(value: js.Array[DataViewObjects]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setObjectsVarargs(value: DataViewObjects*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setSource(value: DataViewMetadataColumn): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
