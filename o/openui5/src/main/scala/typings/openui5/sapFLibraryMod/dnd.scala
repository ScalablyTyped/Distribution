package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnd {
  
  /**
    * @since 1.68
    *
    * Interface that should be implemented by grid controls, if they are working with the `sap.f.dnd.GridDropInfo`.
    *
    * It is highly recommended that those grid controls have optimized `removeItem` and `insertItem` methods
    * (if "items" is target drop aggregation). Meaning to override them in a way that they don't trigger invalidation.
    */
  trait IGridDroppable extends StObject {
    
    var __implements__sap_f_dnd_IGridDroppable: Boolean
  }
  object IGridDroppable {
    
    inline def apply(__implements__sap_f_dnd_IGridDroppable: Boolean): IGridDroppable = {
      val __obj = js.Dynamic.literal(__implements__sap_f_dnd_IGridDroppable = __implements__sap_f_dnd_IGridDroppable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridDroppable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGridDroppable] (val x: Self) extends AnyVal {
      
      inline def set__implements__sap_f_dnd_IGridDroppable(value: Boolean): Self = StObject.set(x, "__implements__sap_f_dnd_IGridDroppable", value.asInstanceOf[js.Any])
    }
  }
}
