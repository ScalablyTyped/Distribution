package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddToDependents extends StObject {
  
  /**
    * Whether the fragment content should be added to the `dependents` aggregation of the view
    */
  var addToDependents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the IDs of the fragment content will be prefixed by the view ID
    */
  var autoPrefixId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the ID of the Fragment
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The Fragment name, which must correspond to a Fragment which can be loaded via the module system (fragmentName
    * + suffix ".fragment.[typeextension]") and which contains the Fragment definition.
    */
  var name: String
  
  /**
    * the Fragment type, e.g. "XML", "JS", or "HTML" (see above). Default is "XML"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AddToDependents {
  
  inline def apply(name: String): AddToDependents = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToDependents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddToDependents] (val x: Self) extends AnyVal {
    
    inline def setAddToDependents(value: Boolean): Self = StObject.set(x, "addToDependents", value.asInstanceOf[js.Any])
    
    inline def setAddToDependentsUndefined: Self = StObject.set(x, "addToDependents", js.undefined)
    
    inline def setAutoPrefixId(value: Boolean): Self = StObject.set(x, "autoPrefixId", value.asInstanceOf[js.Any])
    
    inline def setAutoPrefixIdUndefined: Self = StObject.set(x, "autoPrefixId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
