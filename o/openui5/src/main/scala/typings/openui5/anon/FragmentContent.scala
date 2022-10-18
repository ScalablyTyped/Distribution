package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentContent extends StObject {
  
  /**
    * Definition of the fragment as an XML string
    */
  var fragmentContent: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the fragment; a module name in dot notation without the '.fragment.html' suffix
    */
  var fragmentName: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the newly created fragment; will be used as a prefix to all contained control IDs
    */
  var id: js.UndefOr[String] = js.undefined
}
object FragmentContent {
  
  inline def apply(): FragmentContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentContent]
  }
  
  extension [Self <: FragmentContent](x: Self) {
    
    inline def setFragmentContent(value: String): Self = StObject.set(x, "fragmentContent", value.asInstanceOf[js.Any])
    
    inline def setFragmentContentUndefined: Self = StObject.set(x, "fragmentContent", js.undefined)
    
    inline def setFragmentName(value: String): Self = StObject.set(x, "fragmentName", value.asInstanceOf[js.Any])
    
    inline def setFragmentNameUndefined: Self = StObject.set(x, "fragmentName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
