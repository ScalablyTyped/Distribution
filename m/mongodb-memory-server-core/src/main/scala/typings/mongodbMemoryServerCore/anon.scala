package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSetConfigSettings
import typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.ReplSetOpts
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.AutomaticAuth
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.CreateUser
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.UserRoles
import typings.mongodbMemoryServerCore.libUtilGetosMod.AnyOS
import typings.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoMemoryInstanceOpts
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoMemoryInstanceOptsBase
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.StorageEngine
import typings.node.AbortSignal
import typings.node.childProcessMod.IOType
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeColonurlMod.URL
import typings.node.nodeStrings.ipc
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientSource extends StObject {
    
    var clientSource: js.UndefOr[String] = js.undefined
    
    var serverAddress: js.UndefOr[String] = js.undefined
  }
  object ClientSource {
    
    inline def apply(): ClientSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientSource]
    }
    
    extension [Self <: ClientSource](x: Self) {
      
      inline def setClientSource(value: String): Self = StObject.set(x, "clientSource", value.asInstanceOf[js.Any])
      
      inline def setClientSourceUndefined: Self = StObject.set(x, "clientSource", js.undefined)
      
      inline def setServerAddress(value: String): Self = StObject.set(x, "serverAddress", value.asInstanceOf[js.Any])
      
      inline def setServerAddressUndefined: Self = StObject.set(x, "serverAddress", js.undefined)
    }
  }
  
  trait Db extends StObject {
    
    var db: String
    
    var role: UserRoles
  }
  object Db {
    
    inline def apply(db: String, role: UserRoles): Db = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[Db]
    }
    
    extension [Self <: Db](x: Self) {
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setRole(value: UserRoles): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    inline def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryReplSet.MongoMemoryReplSetOpts> */
  trait PartialMongoMemoryReplSet extends StObject {
    
    var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
    
    var instanceOpts: js.UndefOr[js.Array[MongoMemoryInstanceOptsBase]] = js.undefined
    
    var replSet: js.UndefOr[ReplSetOpts] = js.undefined
  }
  object PartialMongoMemoryReplSet {
    
    inline def apply(): PartialMongoMemoryReplSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMongoMemoryReplSet]
    }
    
    extension [Self <: PartialMongoMemoryReplSet](x: Self) {
      
      inline def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setInstanceOpts(value: js.Array[MongoMemoryInstanceOptsBase]): Self = StObject.set(x, "instanceOpts", value.asInstanceOf[js.Any])
      
      inline def setInstanceOptsUndefined: Self = StObject.set(x, "instanceOpts", js.undefined)
      
      inline def setInstanceOptsVarargs(value: MongoMemoryInstanceOptsBase*): Self = StObject.set(x, "instanceOpts", js.Array(value*))
      
      inline def setReplSet(value: ReplSetOpts): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      inline def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoInstance.MongodOpts> */
  trait PartialMongodOpts extends StObject {
    
    var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
    
    var instance: js.UndefOr[MongoMemoryInstanceOpts] = js.undefined
    
    var spawn: js.UndefOr[SpawnOptions] = js.undefined
  }
  object PartialMongodOpts {
    
    inline def apply(): PartialMongodOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMongodOpts]
    }
    
    extension [Self <: PartialMongodOpts](x: Self) {
      
      inline def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setInstance(value: MongoMemoryInstanceOpts): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoBinary.MongoBinaryOpts> */
  trait ReadonlyMongoBinaryOpts extends StObject {
    
    val arch: js.UndefOr[String] = js.undefined
    
    val checkMD5: js.UndefOr[Boolean] = js.undefined
    
    val downloadDir: js.UndefOr[String] = js.undefined
    
    val os: js.UndefOr[AnyOS] = js.undefined
    
    val platform: js.UndefOr[String] = js.undefined
    
    val systemBinary: js.UndefOr[String] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object ReadonlyMongoBinaryOpts {
    
    inline def apply(): ReadonlyMongoBinaryOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyMongoBinaryOpts]
    }
    
    extension [Self <: ReadonlyMongoBinaryOpts](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      inline def setCheckMD5Undefined: Self = StObject.set(x, "checkMD5", js.undefined)
      
      inline def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      inline def setDownloadDirUndefined: Self = StObject.set(x, "downloadDir", js.undefined)
      
      inline def setOs(value: AnyOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSystemBinary(value: String): Self = StObject.set(x, "systemBinary", value.asInstanceOf[js.Any])
      
      inline def setSystemBinaryUndefined: Self = StObject.set(x, "systemBinary", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<node.child_process.SpawnOptions> */
  trait ReadonlySpawnOptions extends StObject {
    
    val argv0: js.UndefOr[String] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val detached: js.UndefOr[Boolean] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val serialization: js.UndefOr[SerializationType] = js.undefined
    
    val shell: js.UndefOr[Boolean | String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val stdio: js.UndefOr[StdioOptions] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlySpawnOptions {
    
    inline def apply(): ReadonlySpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySpawnOptions]
    }
    
    extension [Self <: ReadonlySpawnOptions](x: Self) {
      
      inline def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      inline def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryServer.AutomaticAuth> */
  trait RequiredAutomaticAuth extends StObject {
    
    var customRootName: String
    
    var customRootPwd: String
    
    var disable: Boolean
    
    var extraUsers: js.Array[CreateUser]
    
    var force: Boolean
    
    var keyfileContent: String
  }
  object RequiredAutomaticAuth {
    
    inline def apply(
      customRootName: String,
      customRootPwd: String,
      disable: Boolean,
      extraUsers: js.Array[CreateUser],
      force: Boolean,
      keyfileContent: String
    ): RequiredAutomaticAuth = {
      val __obj = js.Dynamic.literal(customRootName = customRootName.asInstanceOf[js.Any], customRootPwd = customRootPwd.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], extraUsers = extraUsers.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], keyfileContent = keyfileContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredAutomaticAuth]
    }
    
    extension [Self <: RequiredAutomaticAuth](x: Self) {
      
      inline def setCustomRootName(value: String): Self = StObject.set(x, "customRootName", value.asInstanceOf[js.Any])
      
      inline def setCustomRootPwd(value: String): Self = StObject.set(x, "customRootPwd", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setExtraUsers(value: js.Array[CreateUser]): Self = StObject.set(x, "extraUsers", value.asInstanceOf[js.Any])
      
      inline def setExtraUsersVarargs(value: CreateUser*): Self = StObject.set(x, "extraUsers", js.Array(value*))
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setKeyfileContent(value: String): Self = StObject.set(x, "keyfileContent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.DryMongoBinaryOptions> */
  trait RequiredDryMongoBinaryOpt extends StObject {
    
    var arch: String
    
    var downloadDir: String
    
    var os: AnyOS
    
    var platform: String
    
    var systemBinary: String
    
    var version: NonNullable[js.UndefOr[String]]
  }
  object RequiredDryMongoBinaryOpt {
    
    inline def apply(arch: String, downloadDir: String, os: AnyOS, platform: String, systemBinary: String): RequiredDryMongoBinaryOpt = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], downloadDir = downloadDir.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], systemBinary = systemBinary.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredDryMongoBinaryOpt]
    }
    
    extension [Self <: RequiredDryMongoBinaryOpt](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      inline def setOs(value: AnyOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSystemBinary(value: String): Self = StObject.set(x, "systemBinary", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoBinary.MongoBinaryOpts> */
  trait RequiredMongoBinaryOpts extends StObject {
    
    var arch: String
    
    var checkMD5: Boolean
    
    var downloadDir: String
    
    var os: AnyOS
    
    var platform: String
    
    var systemBinary: String
    
    var version: String
  }
  object RequiredMongoBinaryOpts {
    
    inline def apply(
      arch: String,
      checkMD5: Boolean,
      downloadDir: String,
      os: AnyOS,
      platform: String,
      systemBinary: String,
      version: String
    ): RequiredMongoBinaryOpts = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], checkMD5 = checkMD5.asInstanceOf[js.Any], downloadDir = downloadDir.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], systemBinary = systemBinary.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredMongoBinaryOpts]
    }
    
    extension [Self <: RequiredMongoBinaryOpts](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      inline def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      inline def setOs(value: AnyOS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSystemBinary(value: String): Self = StObject.set(x, "systemBinary", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryReplSet.ReplSetOpts> */
  trait RequiredReplSetOpts extends StObject {
    
    var args: js.Array[String]
    
    var auth: Boolean | AutomaticAuth
    
    var configSettings: MongoMemoryReplSetConfigSettings
    
    var count: Double
    
    var dbName: String
    
    var ip: String
    
    var name: String
    
    var spawn: SpawnOptions
    
    var storageEngine: StorageEngine
  }
  object RequiredReplSetOpts {
    
    inline def apply(
      args: js.Array[String],
      auth: Boolean | AutomaticAuth,
      configSettings: MongoMemoryReplSetConfigSettings,
      count: Double,
      dbName: String,
      ip: String,
      name: String,
      spawn: SpawnOptions,
      storageEngine: StorageEngine
    ): RequiredReplSetOpts = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], configSettings = configSettings.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredReplSetOpts]
    }
    
    extension [Self <: RequiredReplSetOpts](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setAuth(value: Boolean | AutomaticAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setConfigSettings(value: MongoMemoryReplSetConfigSettings): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setStorageEngine(value: StorageEngine): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    }
  }
}
