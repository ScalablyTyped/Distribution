package typings.nginstackEngine

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionAssignmentMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/PermissionAssignment", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionAssignment
  @JSImport("@nginstack/engine/lib/security/PermissionAssignment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDataSet(data: typings.nginstackEngine.dataSetMod.^): PermissionAssignment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDataSet")(data.asInstanceOf[js.Any]).asInstanceOf[PermissionAssignment]
  
  inline def fromKey(key: Double): PermissionAssignment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(key.asInstanceOf[js.Any]).asInstanceOf[PermissionAssignment]
  
  @js.native
  trait PermissionAssignment extends StObject {
    
    var applyMode: Double = js.native
    
    def assign(assignment: PermissionAssignment): Unit = js.native
    def assign(assignment: Record[Any, Any]): Unit = js.native
    
    var assignee: Double = js.native
    
    /* private */ var checkAssignee_ : Any = js.native
    
    /* private */ var checkResource_ : Any = js.native
    
    /* private */ var extraFilterFieldNames_ : Any = js.native
    
    var extraFilters: Any = js.native
    
    def get(name: String): Any = js.native
    
    /* private */ var loadingFromDataSet_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var permissionFieldNames_ : Any = js.native
    
    var resource: Double = js.native
    
    def saveToDataSet(data: typings.nginstackEngine.dataSetMod.^): Unit = js.native
    
    /* private */ var schema_ : Any = js.native
    
    def set(name: String, value: Any): Unit = js.native
    
    var values: Any = js.native
  }
}
