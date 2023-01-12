package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentName extends StObject {
  
  /**
    * Name of the fragment. When no fragment has been defined with that name, the name will be converted to
    * a path by replacing dots with slashes and appending '.fragment.js'. The corresponding resource will be
    * loaded and is expected to define a fragment with the `fragmentName`
    */
  var fragmentName: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the newly created fragment; will be used as a prefix to all contained control IDs
    */
  var id: js.UndefOr[String] = js.undefined
}
object FragmentName {
  
  inline def apply(): FragmentName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentName] (val x: Self) extends AnyVal {
    
    inline def setFragmentName(value: String): Self = StObject.set(x, "fragmentName", value.asInstanceOf[js.Any])
    
    inline def setFragmentNameUndefined: Self = StObject.set(x, "fragmentName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
