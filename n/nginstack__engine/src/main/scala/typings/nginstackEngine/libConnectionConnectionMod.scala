package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionConnectionMod {
  
  inline def apply(host: String): Unit = ^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(host: String, opt_dbName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], opt_dbName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(host: Database): Unit = ^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(host: Database, opt_dbName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], opt_dbName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/connection/Connection", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Connection {
    def this(host: String) = this()
    def this(host: Database) = this()
    def this(host: String, opt_dbName: String) = this()
    def this(host: Database, opt_dbName: String) = this()
  }
  @JSImport("@nginstack/engine/lib/connection/Connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromConfig(key: Double): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(key.asInstanceOf[js.Any]).asInstanceOf[Connection]
  inline def fromConfig(key: typings.nginstackEngine.libDbkeyDbkeyMod.^): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(key.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  @js.native
  trait Connection extends StObject {
    
    /* private */ var _tables: Any = js.native
    
    def addKeyRange(keyRangeStream: String, password: String): Unit = js.native
    
    def addLicense(licenseStream: String, administratorPassword: String): Unit = js.native
    
    def applyUpdates(ArrayOfDataSets: js.Array[typings.nginstackEngine.libDatasetDataSetMod.^]): Double = js.native
    def applyUpdates(
      ArrayOfDataSets: js.Array[typings.nginstackEngine.libDatasetDataSetMod.^],
      insertIntoLogTable: Boolean
    ): Double = js.native
    def applyUpdates(ArrayOfDataSets: typings.nginstackEngine.libDatasetDataSetMod.^): Double = js.native
    def applyUpdates(ArrayOfDataSets: typings.nginstackEngine.libDatasetDataSetMod.^, insertIntoLogTable: Boolean): Double = js.native
    
    def authenticateUser(userName: String, password: String): Double = js.native
    def authenticateUser(userName: String, password: String, useLocalCache: Boolean): Double = js.native
    
    def changeLicensePassword(key: Double, password: String, newPassword: String): Unit = js.native
    
    /* private */ var classDefManager_ : Any = js.native
    
    def classHierarchicalProperty(classNameOrKey: String, propertyName: String): Any = js.native
    def classHierarchicalProperty(classNameOrKey: Double, propertyName: String): Any = js.native
    
    def cloneLocalCache(tableName: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def cloneLocalCacheByClass(classKey: Double): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def cloneLocalCacheByClass(classKey: Double, userKeyPermissionViewFilter: Double): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def cloneLocalCacheByClass(classKey: Double, userKeyPermissionViewFilter: Double, securityExtraFilter: js.Array[Any]): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def cloneLocalCacheByClass(classKey: Double, userKeyPermissionViewFilter: Unit, securityExtraFilter: js.Array[Any]): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def cloneVfsByClass(classKey: Any, userKeyPermissionViewFilter: Any, securityExtraFilter: Any): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def copyStructureLocalCache(tableName: String): Unit = js.native
    
    def createKey(): Double = js.native
    def createKey(keysQuantity: Double): Double = js.native
    def createKey(keysQuantity: Double, getHighKeys: Double): Double = js.native
    def createKey(keysQuantity: Unit, getHighKeys: Double): Double = js.native
    
    def createKeyRange(
      keyRangeName: String,
      quantity: Double,
      keyList: js.UndefOr[String],
      requiredLicenses: js.UndefOr[String],
      key: js.UndefOr[Double],
      base: js.UndefOr[Double],
      userName: js.UndefOr[String],
      password: js.UndefOr[String]
    ): Unit = js.native
    
    def createLicense(
      keyRangeKey: Double,
      licenserKey: Double,
      licenseType: String,
      quantity: Double,
      expiration: js.Date,
      licenseeName: String,
      licenseeId: String,
      userName: String,
      password: String
    ): Unit = js.native
    
    var dbName: String = js.native
    
    var dbServerHost: String = js.native
    
    var dbServerPort: String = js.native
    
    var dbType: String = js.native
    
    def discardEndpointInfoCache(): Unit = js.native
    
    var enabled: Boolean = js.native
    
    def executeScript(scriptReference: String): Unit = js.native
    def executeScript(scriptReference: String, parametersNames: Any): Unit = js.native
    def executeScript(scriptReference: String, parametersNames: Any, parametersValues: js.Array[Any]): Unit = js.native
    def executeScript(scriptReference: String, parametersNames: Unit, parametersValues: js.Array[Any]): Unit = js.native
    def executeScript(scriptReference: Double): Unit = js.native
    def executeScript(scriptReference: Double, parametersNames: Any): Unit = js.native
    def executeScript(scriptReference: Double, parametersNames: Any, parametersValues: js.Array[Any]): Unit = js.native
    def executeScript(scriptReference: Double, parametersNames: Unit, parametersValues: js.Array[Any]): Unit = js.native
    
    def executeSql(sqlExpression: String): Unit = js.native
    def executeSql(sqlExpression: js.Array[String]): Unit = js.native
    
    def get(className: String, codeOrKey: String, fieldName: String): Any = js.native
    
    def getChangeableLicenses(userKey: Double): js.Array[Double] = js.native
    
    def getChildren(classKey: String): String = js.native
    def getChildren(classKey: String, userKey: Double): String = js.native
    def getChildren(classKey: String, userKey: Double, permissionFieldName: String): String = js.native
    def getChildren(classKey: String, userKey: Unit, permissionFieldName: String): String = js.native
    def getChildren(classKey: Double): String = js.native
    def getChildren(classKey: Double, userKey: Double): String = js.native
    def getChildren(classKey: Double, userKey: Double, permissionFieldName: String): String = js.native
    def getChildren(classKey: Double, userKey: Unit, permissionFieldName: String): String = js.native
    
    def getClassDefinitionSource(classKey: Double, vfs: Null, classes: Null, ignoredClassKeys: js.Array[Double]): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      vfs: Null,
      classes: typings.nginstackEngine.libDatasetDataSetMod.^,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      vfs: typings.nginstackEngine.libDatasetDataSetMod.^,
      classes: Null,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      vfs: typings.nginstackEngine.libDatasetDataSetMod.^,
      classes: typings.nginstackEngine.libDatasetDataSetMod.^,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      vfs: Null,
      classes: Null,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      vfs: Null,
      classes: typings.nginstackEngine.libDatasetDataSetMod.^,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      vfs: typings.nginstackEngine.libDatasetDataSetMod.^,
      classes: Null,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      vfs: typings.nginstackEngine.libDatasetDataSetMod.^,
      classes: typings.nginstackEngine.libDatasetDataSetMod.^,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    
    def getDataSet(sqlOrArrayOfSql: String): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    def getDataSet(sqlOrArrayOfSql: String, options: Any): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    def getDataSet(sqlOrArrayOfSql: js.Array[String]): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    def getDataSet(sqlOrArrayOfSql: js.Array[String], options: Any): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    
    def getDatabaseNames(): String = js.native
    
    def getExecutionPlan(sqlExpression: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def getHierarchicalClass(startClass: Double, endClass: Double): String = js.native
    def getHierarchicalClass(startClass: Double, endClass: Double, level: Double): String = js.native
    def getHierarchicalClass(startClass: Double, endClass: Double, level: Double, opt_separator: String): String = js.native
    def getHierarchicalClass(
      startClass: Double,
      endClass: Double,
      level: Double,
      opt_separator: String,
      opt_bringClassesKeys: Boolean
    ): String = js.native
    def getHierarchicalClass(
      startClass: Double,
      endClass: Double,
      level: Double,
      opt_separator: Unit,
      opt_bringClassesKeys: Boolean
    ): String = js.native
    def getHierarchicalClass(startClass: Double, endClass: Double, level: Unit, opt_separator: String): String = js.native
    def getHierarchicalClass(
      startClass: Double,
      endClass: Double,
      level: Unit,
      opt_separator: String,
      opt_bringClassesKeys: Boolean
    ): String = js.native
    def getHierarchicalClass(
      startClass: Double,
      endClass: Double,
      level: Unit,
      opt_separator: Unit,
      opt_bringClassesKeys: Boolean
    ): String = js.native
    
    def getIssuableLicenses(userKey: Double): js.Array[Double] = js.native
    
    def getKeyOfClass(className: String): Double = js.native
    
    def getLicenseFromNegativeRecord(key: Double): Double = js.native
    
    def getPermission(classKeyOrVfsKey: Double, permissionFieldName: String): Any = js.native
    def getPermission(classKeyOrVfsKey: Double, permissionFieldName: String, userKey: Double): Any = js.native
    def getPermission(classKeyOrVfsKey: Double, permissionFieldName: String, userKey: Double, getMode: String): Any = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Double,
      getMode: String,
      extraFilter: String
    ): Any = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Double,
      getMode: Null,
      extraFilter: String
    ): Any = js.native
    def getPermission(classKeyOrVfsKey: Double, permissionFieldName: String, userKey: Null, getMode: String): Any = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Null,
      getMode: String,
      extraFilter: String
    ): Any = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Null,
      getMode: Null,
      extraFilter: String
    ): Any = js.native
    
    def getReferences(key: Double, tableName: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getReferences(key: Double, tableName: String, maxReturnCount: Double): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getReferences(key: Double, tableName: String, maxReturnCount: Double, ignoredTables: js.Array[String]): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getReferences(key: Double, tableName: String, maxReturnCount: Null, ignoredTables: js.Array[String]): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def getTimezoneOffset(): Double = js.native
    
    def getUserGroups(userKey: Double): js.Array[Double] = js.native
    
    def getVfsContent(vfsScriptKey: Double): String = js.native
    
    def insertLog(logType: Double): Unit = js.native
    def insertLog(logType: Double, opt_content: String): Unit = js.native
    def insertLog(logType: Double, opt_content: String, opt_key: Double): Unit = js.native
    def insertLog(logType: Double, opt_content: String, opt_key: Double, opt_classKey: Double): Unit = js.native
    def insertLog(logType: Double, opt_content: String, opt_key: Null, opt_classKey: Double): Unit = js.native
    def insertLog(logType: Double, opt_content: Null, opt_key: Double): Unit = js.native
    def insertLog(logType: Double, opt_content: Null, opt_key: Double, opt_classKey: Double): Unit = js.native
    def insertLog(logType: Double, opt_content: Null, opt_key: Null, opt_classKey: Double): Unit = js.native
    
    def instanceClassDefinition(classKeyOrSource: String): ModelDef = js.native
    def instanceClassDefinition(classKeyOrSource: String, iVfsOrParentKey: Double): ModelDef = js.native
    def instanceClassDefinition(
      classKeyOrSource: String,
      iVfsOrParentKey: Double,
      iClass: typings.nginstackEngine.libDatasetDataSetMod.^
    ): ModelDef = js.native
    def instanceClassDefinition(
      classKeyOrSource: String,
      iVfsOrParentKey: Unit,
      iClass: typings.nginstackEngine.libDatasetDataSetMod.^
    ): ModelDef = js.native
    def instanceClassDefinition(classKeyOrSource: String, iVfsOrParentKey: typings.nginstackEngine.libDatasetDataSetMod.^): ModelDef = js.native
    def instanceClassDefinition(
      classKeyOrSource: String,
      iVfsOrParentKey: typings.nginstackEngine.libDatasetDataSetMod.^,
      iClass: typings.nginstackEngine.libDatasetDataSetMod.^
    ): ModelDef = js.native
    def instanceClassDefinition(classKeyOrSource: Double): ModelDef = js.native
    def instanceClassDefinition(classKeyOrSource: Double, iVfsOrParentKey: Double): ModelDef = js.native
    def instanceClassDefinition(
      classKeyOrSource: Double,
      iVfsOrParentKey: Double,
      iClass: typings.nginstackEngine.libDatasetDataSetMod.^
    ): ModelDef = js.native
    def instanceClassDefinition(
      classKeyOrSource: Double,
      iVfsOrParentKey: Unit,
      iClass: typings.nginstackEngine.libDatasetDataSetMod.^
    ): ModelDef = js.native
    def instanceClassDefinition(classKeyOrSource: Double, iVfsOrParentKey: typings.nginstackEngine.libDatasetDataSetMod.^): ModelDef = js.native
    def instanceClassDefinition(
      classKeyOrSource: Double,
      iVfsOrParentKey: typings.nginstackEngine.libDatasetDataSetMod.^,
      iClass: typings.nginstackEngine.libDatasetDataSetMod.^
    ): ModelDef = js.native
    
    def isCachedData(classKey: Double, tableName: String): Boolean = js.native
    
    def isChildOf(key: Double, parent: Double): Boolean = js.native
    
    var isOnline: Boolean = js.native
    
    def isUserInGroup(userKey: Double, groupKey: Double): Boolean = js.native
    
    def login(userName: String, password: String): Boolean = js.native
    
    def logout(): Unit = js.native
    
    def newTask(task: Task): Unit = js.native
    def newTask(task: Task, userName: String): Unit = js.native
    def newTask(task: Task, userName: String, password: String): Unit = js.native
    def newTask(task: Task, userName: Null, password: String): Unit = js.native
    
    var protocol: String = js.native
    
    var readTimeout: Double = js.native
    
    var referrer: String = js.native
    
    def refreshLocalCache(): Unit = js.native
    def refreshLocalCache(waitDataRefreshing: Boolean): Unit = js.native
    
    var remainingHighKeys: Double = js.native
    
    var remainingKeys: Double = js.native
    
    var remoteInstanceId: String = js.native
    
    def scheduledSendMail(mail: Mail): Unit = js.native
    def scheduledSendMail(mail: Mail, maxSize: Double): Unit = js.native
    
    def sendMail(mail: Mail): Unit = js.native
    
    var serverDate: js.Date = js.native
    
    var serverVersion: String = js.native
    
    def setChangeableLicenses(userKey: Double, licenseKeys: js.Array[Double], passwords: js.Array[String]): Unit = js.native
    
    def setIssuableLicenses(userKey: Double, licenseKeys: js.Array[Any], passwords: js.Array[Any]): Unit = js.native
    
    def setPassword(userKey: Double, password: String): Unit = js.native
    def setPassword(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^, password: String): Unit = js.native
    
    def skipSatSunHoliday(dt: js.Date): js.Date = js.native
    def skipSatSunHoliday(dt: js.Date, uf: Double): js.Date = js.native
    def skipSatSunHoliday(dt: js.Date, uf: Double, localidade: Double): js.Date = js.native
    def skipSatSunHoliday(dt: js.Date, uf: Null, localidade: Double): js.Date = js.native
    
    var trackingId: String = js.native
    
    def userCanChangeNegativeRecord(key: Double): Boolean = js.native
    def userCanChangeNegativeRecord(key: Double, opt_userKey: Double): Boolean = js.native
    
    var userKey: Double = js.native
    
    var userName: Double = js.native
    
    var workloadType: String = js.native
    
    var writeTimeout: Double = js.native
  }
  
  type Database = typings.nginstackEngine.libDatabaseDatabaseMod.^
  
  type Mail = typings.nginstackEngine.libMailMailMod.^
  
  type ModelDef = typings.nginstackEngine.libClassdefModelDefMod.^
  
  type Task = typings.nginstackEngine.libSchedulerTaskMod.^
}
