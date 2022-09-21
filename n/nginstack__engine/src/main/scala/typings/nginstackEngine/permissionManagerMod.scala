package typings.nginstackEngine

import typings.nginstackEngine.anon.CopyMode
import typings.nginstackEngine.anon.Resources
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/PermissionManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionManager
  @JSImport("@nginstack/engine/lib/security/PermissionManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): PermissionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[PermissionManager]
  
  @js.native
  trait PermissionManager extends StObject {
    
    /* private */ var NON_PERMISSION_FIELDS_LIST_ : Any = js.native
    
    /* private */ var checkDuplicates_ : Any = js.native
    
    /* private */ var checkExtraFiltersUsageOnRolePermissions_ : Any = js.native
    
    /* private */ var checkIfPermissionWasNotInherited_ : Any = js.native
    
    /* private */ var checkIfUserCanManagePermissions_ : Any = js.native
    
    /* private */ var classDefManager_ : Any = js.native
    
    def copyFromParent(keys: js.Array[Double]): typings.nginstackEngine.dataSetMod.^ = js.native
    def copyFromParent(keys: js.Array[Double], opt_groupUsers: js.Array[Double]): typings.nginstackEngine.dataSetMod.^ = js.native
    
    def copyPermissions(source: Double, target: Double): Double = js.native
    def copyPermissions(source: Double, target: Double, opt_options: CopyMode): Double = js.native
    
    /* private */ var findAllPermissions_ : Any = js.native
    
    /* private */ var findPermission_ : Any = js.native
    
    def fixClasses(): Unit = js.native
    
    def fixInheritance(): Double | Null = js.native
    def fixInheritance(opt_options: Resources): Double | Null = js.native
    def fixInheritance(opt_options: Record[Any, Any]): Double | Null = js.native
    
    def getOrphans(): typings.nginstackEngine.dataSetMod.^ = js.native
    
    /* private */ var getPermissionValue_ : Any = js.native
    
    /* private */ var getPermissionsForUpdate_ : Any = js.native
    
    /* protected */ def getTable_(tableName: String): typings.nginstackEngine.dataSetMod.^ = js.native
    
    /* private */ var hardCopyPermissions_ : Any = js.native
    
    def insert(assignment: typings.nginstackEngine.permissionAssignmentMod.^): Double = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var mergePermissions_ : Any = js.native
    
    def remove(key: Double): Double = js.native
    
    /* private */ var removeDependents_ : Any = js.native
    
    /* private */ var removeInheritance_ : Any = js.native
    
    def removeOrphans(): Double = js.native
    
    def replicateToDescendants(key: Double): Double = js.native
    
    /* private */ var replicateValuesToAscendants_ : Any = js.native
    
    /* private */ var replicateValuesToDescendants_ : Any = js.native
    
    /* private */ var schema_ : Any = js.native
    
    /* private */ var smartCopyPermissions_ : Any = js.native
    
    /* private */ var tableCacheForGetFieldValue_ : Any = js.native
    
    def update(key: Double, assignment: typings.nginstackEngine.permissionAssignmentMod.^): Double = js.native
  }
}
