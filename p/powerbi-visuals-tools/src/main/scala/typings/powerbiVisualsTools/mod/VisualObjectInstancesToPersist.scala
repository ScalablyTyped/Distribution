package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualObjectInstancesToPersist extends StObject {
  
  /** Instances which should be merged with existing instances. */
  var merge: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
  
  /** Instances which should be deleted from the existing instances. */
  var remove: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
  
  /** Instances which should be deleted from the existing objects. */
  var removeObject: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
  
  /** Instances which should replace existing instances. */
  var replace: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
}
object VisualObjectInstancesToPersist {
  
  inline def apply(): VisualObjectInstancesToPersist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualObjectInstancesToPersist]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualObjectInstancesToPersist] (val x: Self) extends AnyVal {
    
    inline def setMerge(value: js.Array[VisualObjectInstance]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setMergeVarargs(value: VisualObjectInstance*): Self = StObject.set(x, "merge", js.Array(value*))
    
    inline def setRemove(value: js.Array[VisualObjectInstance]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveObject(value: js.Array[VisualObjectInstance]): Self = StObject.set(x, "removeObject", value.asInstanceOf[js.Any])
    
    inline def setRemoveObjectUndefined: Self = StObject.set(x, "removeObject", js.undefined)
    
    inline def setRemoveObjectVarargs(value: VisualObjectInstance*): Self = StObject.set(x, "removeObject", js.Array(value*))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: VisualObjectInstance*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setReplace(value: js.Array[VisualObjectInstance]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReplaceVarargs(value: VisualObjectInstance*): Self = StObject.set(x, "replace", js.Array(value*))
  }
}
