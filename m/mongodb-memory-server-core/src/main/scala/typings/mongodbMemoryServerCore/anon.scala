package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetConfigSettingsT
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var auth: js.UndefOr[Boolean] = js.undefined
    
    var dbPath: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var replSet: js.UndefOr[String] = js.undefined
    
    var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
  }
  object Args {
    
    @scala.inline
    def apply(): Args = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReplSet(value: String): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
      
      @scala.inline
      def setStorageEngine(value: StorageEngineT): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    }
  }
  
  trait AutoStart extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var binary: MongoBinaryOpts
    
    var instanceOpts: js.Array[MongoMemoryInstancePropBaseT]
    
    var replSet: RequiredReplSetOpts
  }
  object AutoStart {
    
    @scala.inline
    def apply(
      binary: MongoBinaryOpts,
      instanceOpts: js.Array[MongoMemoryInstancePropBaseT],
      replSet: RequiredReplSetOpts
    ): AutoStart = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], instanceOpts = instanceOpts.asInstanceOf[js.Any], replSet = replSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoStart]
    }
    
    @scala.inline
    implicit class AutoStartMutableBuilder[Self <: AutoStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOpts(value: js.Array[MongoMemoryInstancePropBaseT]): Self = StObject.set(x, "instanceOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOptsVarargs(value: MongoMemoryInstancePropBaseT*): Self = StObject.set(x, "instanceOpts", js.Array(value :_*))
      
      @scala.inline
      def setReplSet(value: RequiredReplSetOpts): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    @scala.inline
    def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoBinary.MongoBinaryOpts> */
  trait RequiredMongoBinaryOpts extends StObject {
    
    var arch: String
    
    var checkMD5: Boolean
    
    var downloadDir: String
    
    var platform: String
    
    var version: String
  }
  object RequiredMongoBinaryOpts {
    
    @scala.inline
    def apply(arch: String, checkMD5: Boolean, downloadDir: String, platform: String, version: String): RequiredMongoBinaryOpts = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], checkMD5 = checkMD5.asInstanceOf[js.Any], downloadDir = downloadDir.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredMongoBinaryOpts]
    }
    
    @scala.inline
    implicit class RequiredMongoBinaryOptsMutableBuilder[Self <: RequiredMongoBinaryOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryReplSet.ReplSetOpts> */
  trait RequiredReplSetOpts extends StObject {
    
    var args: js.Array[String]
    
    var auth: Boolean
    
    var configSettings: MongoMemoryReplSetConfigSettingsT
    
    var count: Double
    
    var dbName: String
    
    var ip: String
    
    var name: String
    
    var oplogSize: Double
    
    var spawn: SpawnOptions
    
    var storageEngine: StorageEngineT
  }
  object RequiredReplSetOpts {
    
    @scala.inline
    def apply(
      args: js.Array[String],
      auth: Boolean,
      configSettings: MongoMemoryReplSetConfigSettingsT,
      count: Double,
      dbName: String,
      ip: String,
      name: String,
      oplogSize: Double,
      spawn: SpawnOptions,
      storageEngine: StorageEngineT
    ): RequiredReplSetOpts = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], configSettings = configSettings.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oplogSize = oplogSize.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredReplSetOpts]
    }
    
    @scala.inline
    implicit class RequiredReplSetOptsMutableBuilder[Self <: RequiredReplSetOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigSettings(value: MongoMemoryReplSetConfigSettingsT): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOplogSize(value: Double): Self = StObject.set(x, "oplogSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEngine(value: StorageEngineT): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    }
  }
}
