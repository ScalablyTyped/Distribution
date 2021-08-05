package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait CallbackFn extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait DebugFn extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  type DebugPropT = Boolean
  
  trait DownloadProgressT extends StObject {
    
    var current: Double
    
    var lastPrintedAt: Double
    
    var length: Double
    
    var totalMb: Double
  }
  object DownloadProgressT {
    
    inline def apply(current: Double, lastPrintedAt: Double, length: Double, totalMb: Double): DownloadProgressT = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], lastPrintedAt = lastPrintedAt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], totalMb = totalMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadProgressT]
    }
    
    extension [Self <: DownloadProgressT](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setLastPrintedAt(value: Double): Self = StObject.set(x, "lastPrintedAt", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setTotalMb(value: Double): Self = StObject.set(x, "totalMb", value.asInstanceOf[js.Any])
    }
  }
  
  type EmptyVoidCallback = js.Function0[Unit]
  
  type ErrorVoidCallback = js.Function1[/* err */ js.Any, Unit]
  
  trait MongoMemoryInstancePropBaseT extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var dbPath: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double | Null] = js.undefined
    
    var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
  }
  object MongoMemoryInstancePropBaseT {
    
    inline def apply(): MongoMemoryInstancePropBaseT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryInstancePropBaseT]
    }
    
    extension [Self <: MongoMemoryInstancePropBaseT](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      inline def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setStorageEngine(value: StorageEngineT): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    }
  }
  
  trait MongoMemoryInstancePropT
    extends StObject
       with MongoMemoryInstancePropBaseT {
    
    var auth: js.UndefOr[Boolean] = js.undefined
    
    var dbName: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var replSet: js.UndefOr[String] = js.undefined
  }
  object MongoMemoryInstancePropT {
    
    inline def apply(): MongoMemoryInstancePropT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryInstancePropT]
    }
    
    extension [Self <: MongoMemoryInstancePropT](x: Self) {
      
      inline def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setReplSet(value: String): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      inline def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    }
  }
  
  trait ReplStatusReplT extends StObject {
    
    var ismaster: Boolean
  }
  object ReplStatusReplT {
    
    inline def apply(ismaster: Boolean): ReplStatusReplT = {
      val __obj = js.Dynamic.literal(ismaster = ismaster.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplStatusReplT]
    }
    
    extension [Self <: ReplStatusReplT](x: Self) {
      
      inline def setIsmaster(value: Boolean): Self = StObject.set(x, "ismaster", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplStatusResultT extends StObject {
    
    var repl: ReplStatusReplT
  }
  object ReplStatusResultT {
    
    inline def apply(repl: ReplStatusReplT): ReplStatusResultT = {
      val __obj = js.Dynamic.literal(repl = repl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplStatusResultT]
    }
    
    extension [Self <: ReplStatusResultT](x: Self) {
      
      inline def setRepl(value: ReplStatusReplT): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger
  */
  trait StorageEngineT extends StObject
  object StorageEngineT {
    
    inline def devnull: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull = "devnull".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull]
    
    inline def ephemeralForTest: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest = "ephemeralForTest".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest]
    
    inline def mmapv1: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1 = "mmapv1".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1]
    
    inline def wiredTiger: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger = "wiredTiger".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger]
  }
}
