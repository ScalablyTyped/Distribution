package typings.nginstackEngine

import typings.nginstackEngine.anon.HideNotVisibleClasses
import typings.nginstackEngine.anon.IncludeNonDatabaseFields
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionSchemaMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/PermissionSchema", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionSchema
  @JSImport("@nginstack/engine/lib/security/PermissionSchema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/security/PermissionSchema", "INHERITANCE_FIELDS")
  @js.native
  val INHERITANCE_FIELDS: js.Array[String] = js.native
  
  @JSImport("@nginstack/engine/lib/security/PermissionSchema", "PERIOD_FIELDS")
  @js.native
  val PERIOD_FIELDS: js.Array[String] = js.native
  
  @JSImport("@nginstack/engine/lib/security/PermissionSchema", "TARGET_FIELDS")
  @js.native
  val TARGET_FIELDS: js.Array[String] = js.native
  
  inline def getInstance(): PermissionSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[PermissionSchema]
  
  @js.native
  trait PermissionSchema extends StObject {
    
    /* private */ var NON_PERMISSION_FIELDS_ : Any = js.native
    
    /* private */ var classDefManager_ : Any = js.native
    
    /* private */ var databaseFieldNames_ : Any = js.native
    
    /* private */ var declaredFieldsByClass_ : Any = js.native
    
    /* private */ var fieldsByClass_ : Any = js.native
    
    /* private */ var fieldsByMimeType_ : Any = js.native
    
    def getChildrenReplicatedFieldNames(): js.Array[String] = js.native
    
    def getDeclaredFieldsByClass(rootClass: Double): Any = js.native
    def getDeclaredFieldsByClass(rootClass: Double, opt_options: IncludeNonDatabaseFields): Any = js.native
    def getDeclaredFieldsByClass(rootClass: Double, opt_options: Record[Any, Any]): Any = js.native
    
    def getDeclaredFieldsInClass(classKey: Double): js.Array[String] = js.native
    def getDeclaredFieldsInClass(classKey: Double, opt_options: IncludeNonDatabaseFields): js.Array[String] = js.native
    def getDeclaredFieldsInClass(classKey: Double, opt_options: Record[Any, Any]): js.Array[String] = js.native
    
    def getExtraFiltersForClass(classKey: Double): js.Array[String] = js.native
    
    def getFieldsByClass(rootClass: Double): Any = js.native
    def getFieldsByClass(rootClass: Double, opt_options: IncludeNonDatabaseFields): Any = js.native
    def getFieldsByClass(rootClass: Double, opt_options: Record[Any, Any]): Any = js.native
    
    /* private */ var getFieldsByClass_ : Any = js.native
    
    def getFieldsForClass(classKey: Double): js.Array[String] = js.native
    def getFieldsForClass(classKey: Double, opt_options: IncludeNonDatabaseFields): js.Array[String] = js.native
    def getFieldsForClass(classKey: Double, opt_options: Record[Any, Any]): js.Array[String] = js.native
    
    /* private */ var getFieldsForClass_ : Any = js.native
    
    def getFieldsForFile(fileKey: Double): js.Array[String] = js.native
    def getFieldsForFile(fileKey: Double, opt_options: IncludeNonDatabaseFields): js.Array[String] = js.native
    def getFieldsForFile(fileKey: Double, opt_options: Record[Any, Any]): js.Array[String] = js.native
    
    def getParentReplicatedFieldNames(): js.Array[String] = js.native
    
    /* private */ var initializeCaches_ : Any = js.native
    
    /* private */ var isPermissionField_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def mountTabularMap(permissionFields: js.Array[String], classKey: Double, userKey: Double): typings.nginstackEngine.dataSetMod.^ = js.native
    def mountTabularMap(
      permissionFields: js.Array[String],
      classKey: Double,
      userKey: Double,
      opt_filters: HideNotVisibleClasses
    ): typings.nginstackEngine.dataSetMod.^ = js.native
    
    /* private */ var tableCacheForGetFieldValue_ : Any = js.native
  }
}
