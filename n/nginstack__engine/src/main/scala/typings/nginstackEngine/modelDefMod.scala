package typings.nginstackEngine

import typings.nginstackEngine.anon.ALWAYS
import typings.nginstackEngine.anon.CONFIG
import typings.nginstackEngine.anon.Display
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/ModelDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ModelDef
  @JSImport("@nginstack/engine/lib/classdef/ModelDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def declareArray(obj: ModelDef, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("declareArray")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def declareCloneableObject(obj: ModelDef, propertyName: String, initialValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("declareCloneableObject")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def declareEvent(obj: ModelDef, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("declareEvent")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def declareGetterOfObjectProperty(obj: ModelDef, propertyName: String, objectClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("declareGetterOfObjectProperty")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], objectClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def declareObject(obj: ModelDef, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("declareObject")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AdapterDescriptor = typings.nginstackEngine.adapterDescriptorMod.^
  
  type CachedDataOptions = Record[Any, Any]
  
  type Event = typings.nginstackEngine.eventMod.^
  
  @js.native
  trait ModelDef extends StObject {
    
    /* private */ var _getArrayFromList: Any = js.native
    
    /* private */ var _getFieldByName: Any = js.native
    
    /* private */ var _translateFieldNamesToFieldObjectsArray: Any = js.native
    
    /* protected */ def adaptEvent_(name: String, descriptor: AdapterDescriptor): Unit = js.native
    /* protected */ def adaptEvent_(name: String, descriptor: Record[Any, Any]): Unit = js.native
    
    var cache: typings.nginstackEngine.classDefCacheMod.^ = js.native
    
    var cacheStrategy: ALWAYS = js.native
    
    var cachedData: Boolean | CachedDataOptions = js.native
    
    var cachedFields: js.Array[String] = js.native
    
    var cachedVfsContent: Boolean = js.native
    
    def canAddAdaptedListeners(): Boolean = js.native
    
    var classChangePolicy: Double = js.native
    
    var classDefManager: Any = js.native
    
    var classFieldName: String = js.native
    
    var dataDictionary: String = js.native
    
    var dbIndexSpace: String = js.native
    
    var dbPrimaryKey: String = js.native
    
    var dbTableSpace: String = js.native
    
    def declareArray(name: String): Unit = js.native
    
    def declareCloneableObject(propertyName: String, initialValue: Any): Unit = js.native
    
    def declareEvent(name: String): Unit = js.native
    
    def declareGetterOfObjectProperty(propertyName: String, objectClassName: String): Unit = js.native
    
    def declareObject(name: String): Unit = js.native
    
    /* protected */ var defaultAdapterDescriptor_ : Any = js.native
    
    var displayName: String = js.native
    
    var displayOrder: Double = js.native
    
    /* private */ var extraFilterExpressionCache_ : Any = js.native
    
    /* private */ var extraFilterFieldsCache_ : Any = js.native
    
    def field(name: String): typings.nginstackEngine.fieldMod.^ = js.native
    def field(name: String, `type`: String): typings.nginstackEngine.fieldMod.^ = js.native
    def field(name: String, `type`: String, size: Double): typings.nginstackEngine.fieldMod.^ = js.native
    def field(name: String, `type`: Unit, size: Double): typings.nginstackEngine.fieldMod.^ = js.native
    
    def fieldClass(args: Any*): Any = js.native
    
    var fields: typings.nginstackEngine.fieldListMod.^ = js.native
    
    /* private */ var fields_ : Any = js.native
    
    def fileAttributes(vfsKey: Double): Display = js.native
    
    /* private */ var findChildField_ : Any = js.native
    
    def findField(name: String): typings.nginstackEngine.fieldMod.^ = js.native
    
    var findOrder: Double = js.native
    
    def getClassDef(classKey: Any): Any = js.native
    
    def getClassDefWithEvent(eventName: String): Any = js.native
    def getClassDefWithEvent(eventName: String, skipCurrentClass: Boolean): Any = js.native
    
    def getClassDefWithObjectProperty(propertyName: String): Any = js.native
    def getClassDefWithObjectProperty(propertyName: String, skipCurrentClass: Boolean): Any = js.native
    
    def getExtraFilterExpression(): String = js.native
    
    def getExtraFilterFields(): js.Array[typings.nginstackEngine.fieldMod.^] = js.native
    
    def getFieldsAsStringList(): typings.nginstackEngine.stringListMod.^ = js.native
    
    def getFieldsByProperty(args: Any*): js.Array[typings.nginstackEngine.fieldMod.^] = js.native
    
    def getKeySchema(): String = js.native
    
    def getLookupDisplay(sender: Any, value: Any): String = js.native
    def getLookupDisplay(sender: Any, value: Any, event: Event): String = js.native
    
    def getNormalizedDef(classKey: Double): ModelDef = js.native
    
    def hasEvent(eventName: String): Boolean = js.native
    
    def hasObjectProperty(propertyName: String): Boolean = js.native
    
    def hasObjectPropertyDeclaredInThisClass(propertyName: String): Boolean = js.native
    
    def hasOwnFields(): Boolean = js.native
    
    def hasOwnFileAttributes(fileKey: Any): Boolean = js.native
    
    var hasOwnJustToGroup: Boolean = js.native
    
    var help: String = js.native
    
    def hideFiles(files: js.Array[Double]): Unit = js.native
    
    def init(opt_parentDef: Unit, args: Any*): Unit = js.native
    def init(opt_parentDef: typings.nginstackEngine.classDefMod.^, args: Any*): Unit = js.native
    
    var integerDatabaseType: String = js.native
    
    /* private */ var integerDatabaseType_ : Any = js.native
    
    var justToGroup: Boolean = js.native
    
    /* private */ var justToGroup_ : Any = js.native
    
    var keyFieldName: String = js.native
    
    /* private */ var localDeclaredProperty_ : Any = js.native
    
    /* protected */ var logger_ : typings.nginstackEngine.loggerMod.^ = js.native
    
    var lookupDisplayFieldName: String = js.native
    
    var managedDatabaseSchema: Boolean = js.native
    
    var memoDbType: String = js.native
    
    var metaClass: Double = js.native
    
    /* private */ var nextParentDefWithFieldsCache_ : Any = js.native
    
    /* private */ var nextParentDefWithFields_ : Any = js.native
    
    /* private */ var nextParentWithFields_ : Any = js.native
    
    /* private */ var notifyFieldUsage_ : Any = js.native
    
    var occurrenceLimit: Double = js.native
    
    var ownFields: js.Array[typings.nginstackEngine.fieldMod.^] = js.native
    
    /* private */ var ownFieldsArray_ : Any = js.native
    
    /* private */ var ownFieldsSet_ : Any = js.native
    
    var realm: String = js.native
    
    def resetJustToGroup(): Unit = js.native
    
    var session: Any = js.native
    
    def setFieldsProperties(args: Any*): Unit = js.native
    
    var sourceType: CONFIG = js.native
    
    var tableName: String = js.native
    
    def toJSONSchema(): String = js.native
    
    var transactionLogMaxDays: Double = js.native
    
    var upgradeChangesTableStructure: Boolean = js.native
    
    var upgradeMustSyncRecords: Boolean = js.native
    
    var versionFieldName: String = js.native
  }
}
