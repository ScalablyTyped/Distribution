package typings.nginstackDevops

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUpdateUpdateScriptMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/devops/lib/update/UpdateScript", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UpdateScript {
    
    /* private */ /* CompleteClass */
    var connection_ : Any = js.native
    
    /* CompleteClass */
    override def copyChildrenViewPermissions(directoryKey: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var createSysEvent_ : Any = js.native
    
    /* CompleteClass */
    override def fail(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def finish(result: String, updateVersion: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var getGlobalObject_ : Any = js.native
    
    /* CompleteClass */
    override def getProductFromKey(key: Double): Double | Null = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var prepare_ : Any = js.native
    
    /* CompleteClass */
    var result: String = js.native
    
    /* private */ /* CompleteClass */
    var result_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var scriptKey: Any = js.native
    
    /* CompleteClass */
    var source: typings.nginstackEngine.libConnectionConnectionMod.^ = js.native
    
    /* CompleteClass */
    var sourceDB: typings.nginstackEngine.libDatabaseDatabaseMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var state_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var sysEvent_ : Any = js.native
    
    /* CompleteClass */
    var target: typings.nginstackEngine.libConnectionConnectionMod.^ = js.native
    
    /* CompleteClass */
    var targetDB: typings.nginstackEngine.libDatabaseDatabaseMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var versions_ : Any = js.native
  }
  @JSImport("@nginstack/devops/lib/update/UpdateScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def execute(params: ExecutionParams): ExecutionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(params.asInstanceOf[js.Any]).asInstanceOf[ExecutionResult]
  
  trait EndPointConfig extends StObject {
    
    var dbName: String
    
    var host: String
    
    var password: String
    
    var userName: String
  }
  object EndPointConfig {
    
    inline def apply(dbName: String, host: String, password: String, userName: String): EndPointConfig = {
      val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndPointConfig]
    }
    
    extension [Self <: EndPointConfig](x: Self) {
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionParams extends StObject {
    
    var scriptKey: Double
    
    var sourceConfig: EndPointConfig
    
    var targetConfig: EndPointConfig
  }
  object ExecutionParams {
    
    inline def apply(scriptKey: Double, sourceConfig: EndPointConfig, targetConfig: EndPointConfig): ExecutionParams = {
      val __obj = js.Dynamic.literal(scriptKey = scriptKey.asInstanceOf[js.Any], sourceConfig = sourceConfig.asInstanceOf[js.Any], targetConfig = targetConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionParams]
    }
    
    extension [Self <: ExecutionParams](x: Self) {
      
      inline def setScriptKey(value: Double): Self = StObject.set(x, "scriptKey", value.asInstanceOf[js.Any])
      
      inline def setSourceConfig(value: EndPointConfig): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
      
      inline def setTargetConfig(value: EndPointConfig): Self = StObject.set(x, "targetConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionResult extends StObject {
    
    var result: String
    
    var state: Double
    
    var versions: js.Array[String]
  }
  object ExecutionResult {
    
    inline def apply(result: String, state: Double, versions: js.Array[String]): ExecutionResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionResult]
    }
    
    extension [Self <: ExecutionResult](x: Self) {
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  trait UpdateScript extends StObject {
    
    /* private */ var connection_ : Any
    
    def copyChildrenViewPermissions(directoryKey: Double): Double
    
    /* private */ var createSysEvent_ : Any
    
    def fail(error: js.Error): Unit
    
    def finish(result: String, updateVersion: Double): Unit
    
    /* private */ var getGlobalObject_ : Any
    
    def getProductFromKey(key: Double): Double | Null
    
    /* private */ var logger_ : Any
    
    /* private */ var prepare_ : Any
    
    var result: String
    
    /* private */ var result_ : Any
    
    /* private */ var scriptKey: Any
    
    var source: typings.nginstackEngine.libConnectionConnectionMod.^
    
    var sourceDB: typings.nginstackEngine.libDatabaseDatabaseMod.^
    
    /* private */ var state_ : Any
    
    /* private */ var sysEvent_ : Any
    
    var target: typings.nginstackEngine.libConnectionConnectionMod.^
    
    var targetDB: typings.nginstackEngine.libDatabaseDatabaseMod.^
    
    /* private */ var versions_ : Any
  }
  object UpdateScript {
    
    inline def apply(
      connection_ : Any,
      copyChildrenViewPermissions: Double => Double,
      createSysEvent_ : Any,
      fail: js.Error => Unit,
      finish: (String, Double) => Unit,
      getGlobalObject_ : Any,
      getProductFromKey: Double => Double | Null,
      logger_ : Any,
      prepare_ : Any,
      result: String,
      result_ : Any,
      scriptKey: Any,
      source: typings.nginstackEngine.libConnectionConnectionMod.^,
      sourceDB: typings.nginstackEngine.libDatabaseDatabaseMod.^,
      state_ : Any,
      sysEvent_ : Any,
      target: typings.nginstackEngine.libConnectionConnectionMod.^,
      targetDB: typings.nginstackEngine.libDatabaseDatabaseMod.^,
      versions_ : Any
    ): UpdateScript = {
      val __obj = js.Dynamic.literal(connection_ = connection_.asInstanceOf[js.Any], copyChildrenViewPermissions = js.Any.fromFunction1(copyChildrenViewPermissions), createSysEvent_ = createSysEvent_.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), finish = js.Any.fromFunction2(finish), getGlobalObject_ = getGlobalObject_.asInstanceOf[js.Any], getProductFromKey = js.Any.fromFunction1(getProductFromKey), logger_ = logger_.asInstanceOf[js.Any], prepare_ = prepare_.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_ = result_.asInstanceOf[js.Any], scriptKey = scriptKey.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceDB = sourceDB.asInstanceOf[js.Any], state_ = state_.asInstanceOf[js.Any], sysEvent_ = sysEvent_.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetDB = targetDB.asInstanceOf[js.Any], versions_ = versions_.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateScript]
    }
    
    extension [Self <: UpdateScript](x: Self) {
      
      inline def setConnection_(value: Any): Self = StObject.set(x, "connection_", value.asInstanceOf[js.Any])
      
      inline def setCopyChildrenViewPermissions(value: Double => Double): Self = StObject.set(x, "copyChildrenViewPermissions", js.Any.fromFunction1(value))
      
      inline def setCreateSysEvent_(value: Any): Self = StObject.set(x, "createSysEvent_", value.asInstanceOf[js.Any])
      
      inline def setFail(value: js.Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setFinish(value: (String, Double) => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction2(value))
      
      inline def setGetGlobalObject_(value: Any): Self = StObject.set(x, "getGlobalObject_", value.asInstanceOf[js.Any])
      
      inline def setGetProductFromKey(value: Double => Double | Null): Self = StObject.set(x, "getProductFromKey", js.Any.fromFunction1(value))
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setPrepare_(value: Any): Self = StObject.set(x, "prepare_", value.asInstanceOf[js.Any])
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResult_(value: Any): Self = StObject.set(x, "result_", value.asInstanceOf[js.Any])
      
      inline def setScriptKey(value: Any): Self = StObject.set(x, "scriptKey", value.asInstanceOf[js.Any])
      
      inline def setSource(value: typings.nginstackEngine.libConnectionConnectionMod.^): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceDB(value: typings.nginstackEngine.libDatabaseDatabaseMod.^): Self = StObject.set(x, "sourceDB", value.asInstanceOf[js.Any])
      
      inline def setState_(value: Any): Self = StObject.set(x, "state_", value.asInstanceOf[js.Any])
      
      inline def setSysEvent_(value: Any): Self = StObject.set(x, "sysEvent_", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: typings.nginstackEngine.libConnectionConnectionMod.^): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetDB(value: typings.nginstackEngine.libDatabaseDatabaseMod.^): Self = StObject.set(x, "targetDB", value.asInstanceOf[js.Any])
      
      inline def setVersions_(value: Any): Self = StObject.set(x, "versions_", value.asInstanceOf[js.Any])
    }
  }
}
