package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridFieldPermissionValidatorManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/FieldPermissionValidatorManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FieldPermissionValidatorManager {
    
    /* CompleteClass */
    override def fieldPermissionValidator(permissionFieldName: Any, classKey: Any, userKey: Any): Any = js.native
    
    /* CompleteClass */
    var iPermission: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/FieldPermissionValidatorManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldPermissionValidatorManager extends StObject {
    
    def fieldPermissionValidator(permissionFieldName: Any, classKey: Any, userKey: Any): Any
    
    var iPermission: typings.nginstackEngine.libDatasetDataSetMod.^
  }
  object FieldPermissionValidatorManager {
    
    inline def apply(
      fieldPermissionValidator: (Any, Any, Any) => Any,
      iPermission: typings.nginstackEngine.libDatasetDataSetMod.^
    ): FieldPermissionValidatorManager = {
      val __obj = js.Dynamic.literal(fieldPermissionValidator = js.Any.fromFunction3(fieldPermissionValidator), iPermission = iPermission.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPermissionValidatorManager]
    }
    
    extension [Self <: FieldPermissionValidatorManager](x: Self) {
      
      inline def setFieldPermissionValidator(value: (Any, Any, Any) => Any): Self = StObject.set(x, "fieldPermissionValidator", js.Any.fromFunction3(value))
      
      inline def setIPermission(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "iPermission", value.asInstanceOf[js.Any])
    }
  }
}
