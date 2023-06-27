package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.`false`
import typings.openui5.openui5Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityContainer
  extends StObject
     with Annotatable {
  
  /**
    * The path to the entity container
    */
  @JSName("$path")
  var $path: String
  
  /**
    * The association sets in the entity container
    */
  var associationSet: js.UndefOr[js.Array[AssociationSet]] = js.undefined
  
  /**
    * The entity sets in the entity container
    */
  var entitySet: js.UndefOr[js.Array[EntitySet]] = js.undefined
  
  /**
    * The function imports in the entity container
    */
  var functionImport: js.UndefOr[js.Array[FunctionImport]] = js.undefined
  
  /**
    * Whether this is the default entity container
    */
  var isDefaultEntityContainer: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * The entity container's name
    */
  var name: String
  
  /**
    * The entity container's namespace
    */
  var namespace: String
}
object EntityContainer {
  
  inline def apply($path: String, name: String, namespace: String): EntityContainer = {
    val __obj = js.Dynamic.literal($path = $path.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityContainer] (val x: Self) extends AnyVal {
    
    inline def set$path(value: String): Self = StObject.set(x, "$path", value.asInstanceOf[js.Any])
    
    inline def setAssociationSet(value: js.Array[AssociationSet]): Self = StObject.set(x, "associationSet", value.asInstanceOf[js.Any])
    
    inline def setAssociationSetUndefined: Self = StObject.set(x, "associationSet", js.undefined)
    
    inline def setAssociationSetVarargs(value: AssociationSet*): Self = StObject.set(x, "associationSet", js.Array(value*))
    
    inline def setEntitySet(value: js.Array[EntitySet]): Self = StObject.set(x, "entitySet", value.asInstanceOf[js.Any])
    
    inline def setEntitySetUndefined: Self = StObject.set(x, "entitySet", js.undefined)
    
    inline def setEntitySetVarargs(value: EntitySet*): Self = StObject.set(x, "entitySet", js.Array(value*))
    
    inline def setFunctionImport(value: js.Array[FunctionImport]): Self = StObject.set(x, "functionImport", value.asInstanceOf[js.Any])
    
    inline def setFunctionImportUndefined: Self = StObject.set(x, "functionImport", js.undefined)
    
    inline def setFunctionImportVarargs(value: FunctionImport*): Self = StObject.set(x, "functionImport", js.Array(value*))
    
    inline def setIsDefaultEntityContainer(value: `false` | `true`): Self = StObject.set(x, "isDefaultEntityContainer", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultEntityContainerUndefined: Self = StObject.set(x, "isDefaultEntityContainer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
