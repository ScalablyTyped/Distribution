package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroup extends StObject {
  
  /** True indicates that this is a choice group, meaning that only one of its segments can exist in a given message. */
  var choice: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum number of times this group can be repeated. 0 or -1 means unbounded. */
  var maxOccurs: js.UndefOr[Double] = js.undefined
  
  /** Nested groups and/or segments. */
  var members: js.UndefOr[js.Array[GroupOrSegment]] = js.undefined
  
  /** The minimum number of times this group must be present/repeated. */
  var minOccurs: js.UndefOr[Double] = js.undefined
  
  /** The name of this group. For example, "ORDER_DETAIL". */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGroup {
  
  inline def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    
    inline def setChoice(value: Boolean): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceUndefined: Self = StObject.set(x, "choice", js.undefined)
    
    inline def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
    
    inline def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
    
    inline def setMembers(value: js.Array[GroupOrSegment]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: GroupOrSegment*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
    
    inline def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
