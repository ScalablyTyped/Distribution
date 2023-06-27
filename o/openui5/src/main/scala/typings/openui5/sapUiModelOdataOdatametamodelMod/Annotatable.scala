package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotatable extends StObject {
  
  /**
    * The array of extension elements, see {@link sap.ui.model.odata.ODataMetaModel.Extension Extension}
    */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
}
object Annotatable {
  
  inline def apply(): Annotatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotatable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotatable] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
  }
}
