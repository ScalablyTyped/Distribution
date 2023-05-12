package typings.nginstackEngine

import typings.nginstackEngine.anon.ClassKey
import typings.nginstackEngine.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseDatabaseMod {
  
  inline def apply(host: String, dbName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(host: typings.nginstackEngine.libConnectionConnectionMod.^, dbName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/Database", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Database {
    def this(host: String, dbName: String) = this()
    def this(host: typings.nginstackEngine.libConnectionConnectionMod.^, dbName: String) = this()
  }
  @JSImport("@nginstack/engine/lib/database/Database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromConfig(key: Double): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(key.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def fromConfig(key: typings.nginstackEngine.libDbkeyDbkeyMod.^): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(key.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  @js.native
  trait Database extends StObject {
    
    def applyUpdates(dataSets: js.Array[Any]): Double = js.native
    def applyUpdates(dataSets: js.Array[Any], logChanges: Boolean): Double = js.native
    def applyUpdates(dataSets: typings.nginstackEngine.libDatasetDataSetMod.^): Double = js.native
    def applyUpdates(dataSets: typings.nginstackEngine.libDatasetDataSetMod.^, logChanges: Boolean): Double = js.native
    
    def authenticateUser(userId: String, password: String): Double = js.native
    
    def columnExists(tableOrViewName: String, columnName: String): Boolean = js.native
    
    def createKey(keysQty: Double): Double = js.native
    def createKey(keysQty: Double, useHighKeys: Boolean): Double = js.native
    
    var date: js.Date = js.native
    
    var dbName: String = js.native
    
    var dbType: String = js.native
    
    def discardCaches(): Unit = js.native
    
    def discardEndpointInfoCache(): Unit = js.native
    
    def executeDDL(statement: String): Unit = js.native
    
    def executeSQL(sql: String): Unit = js.native
    def executeSQL(sql: js.Array[String]): Unit = js.native
    
    def getApproximatedVersion(): js.Array[Any] = js.native
    
    def getExecutionPlan(sql: String): Unit = js.native
    
    def getReferences(key: Double, tableName: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getReferences(key: Double, tableName: String, maxReturnCount: Double): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getReferences(key: Double, tableName: String, maxReturnCount: Double, ignoredTables: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getReferences(key: Double, tableName: String, maxReturnCount: Unit, ignoredTables: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def getVersion(): js.Array[Any] = js.native
    
    def getVersionInfo(): DatabaseVersionInfo = js.native
    
    def incVersion(): Double = js.native
    
    def insertLog(logType: Double): Unit = js.native
    def insertLog(logType: Double, options: ClassKey): Unit = js.native
    
    def login(userId: String, password: String): Boolean = js.native
    
    def loginByAuthToken(idToken: String): Unit = js.native
    
    def loginBySession(session: Session): Boolean = js.native
    
    def logout(): Unit = js.native
    
    var protocol: String = js.native
    
    def query(sql: String): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    def query(sql: String, options: Any): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    def query(sql: js.Array[String]): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    def query(sql: js.Array[String], options: Any): typings.nginstackEngine.libDatasetDataSetMod.^ | js.Array[typings.nginstackEngine.libDatasetDataSetMod.^] = js.native
    
    var referrer: String = js.native
    
    def runScript(scriptKeyOrURI: String): Any = js.native
    def runScript(scriptKeyOrURI: String, parameters: Any): Any = js.native
    def runScript(scriptKeyOrURI: String, parameters: Any, options: Timeout): Any = js.native
    def runScript(scriptKeyOrURI: String, parameters: Unit, options: Timeout): Any = js.native
    def runScript(scriptKeyOrURI: Double): Any = js.native
    def runScript(scriptKeyOrURI: Double, parameters: Any): Any = js.native
    def runScript(scriptKeyOrURI: Double, parameters: Any, options: Timeout): Any = js.native
    def runScript(scriptKeyOrURI: Double, parameters: Unit, options: Timeout): Any = js.native
    
    def sendEmail(email: Email): Unit = js.native
    
    def sequenceExists(sequenceName: Any): Boolean = js.native
    
    var serverHost: String = js.native
    
    def tableExists(tableName: String): Boolean = js.native
    
    var trackingId: String = js.native
    
    var uniqueId: String = js.native
    
    def userHasScope(userKey: Double, scope: String): Boolean = js.native
    def userHasScope(userKey: Double, scope: Double): Boolean = js.native
    def userHasScope(userKey: Double, scope: typings.nginstackEngine.libDbkeyDbkeyMod.^): Boolean = js.native
    def userHasScope(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^, scope: String): Boolean = js.native
    def userHasScope(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^, scope: Double): Boolean = js.native
    def userHasScope(
      userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      scope: typings.nginstackEngine.libDbkeyDbkeyMod.^
    ): Boolean = js.native
    
    var userKey: Double = js.native
    
    var userLanguage: Double = js.native
    
    var userName: String = js.native
    
    def viewExists(viewName: String): Boolean = js.native
    
    var workloadType: String = js.native
  }
  
  trait DatabaseVersionInfo extends StObject {
    
    var client: VersionInfo
    
    var server: VersionInfo
  }
  object DatabaseVersionInfo {
    
    inline def apply(client: VersionInfo, server: VersionInfo): DatabaseVersionInfo = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseVersionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseVersionInfo] (val x: Self) extends AnyVal {
      
      inline def setClient(value: VersionInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setServer(value: VersionInfo): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  type Email = typings.nginstackEngine.libEmailEmailMod.^
  
  type Session = typings.nginstackEngine.libSessionSessionMod.^
  
  trait VersionInfo extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var name: String
  }
  object VersionInfo {
    
    inline def apply(major: Double, minor: Double, name: String): VersionInfo = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VersionInfo] (val x: Self) extends AnyVal {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
