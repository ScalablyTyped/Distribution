package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationSet
  extends StObject
     with Annotatable {
  
  /**
    * The qualified name of the association set's association; the value is identical to the corresponding
    * XML attribute value in the service metadata document.
    */
  var association: String
  
  /**
    * The two ends of the association set
    */
  var end: js.Array[AssociationSetEnd]
  
  /**
    * The association set's name
    */
  var name: String
}
object AssociationSet {
  
  inline def apply(association: String, end: js.Array[AssociationSetEnd], name: String): AssociationSet = {
    val __obj = js.Dynamic.literal(association = association.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationSet] (val x: Self) extends AnyVal {
    
    inline def setAssociation(value: String): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: js.Array[AssociationSetEnd]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndVarargs(value: AssociationSetEnd*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
