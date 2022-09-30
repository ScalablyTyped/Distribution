package typings.mongodbMemoryServerCore

import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfigMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/resolveConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(variableName: ResolveConfigVariables): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(variableName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @JSImport("mongodb-memory-server-core/lib/util/resolveConfig", "DEFAULT_VERSION")
  @js.native
  val DEFAULT_VERSION: /* "5.0.8" */ String = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/resolveConfig", "ENV_CONFIG_PREFIX")
  @js.native
  val ENV_CONFIG_PREFIX: /* "MONGOMS_" */ String = js.native
  
  @js.native
  sealed trait ResolveConfigVariables extends StObject
  @JSImport("mongodb-memory-server-core/lib/util/resolveConfig", "ResolveConfigVariables")
  @js.native
  object ResolveConfigVariables extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResolveConfigVariables & String] = js.native
    
    @js.native
    sealed trait ARCH
      extends StObject
         with ResolveConfigVariables
    /* "ARCH" */ val ARCH: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.ARCH & String = js.native
    
    @js.native
    sealed trait ARCHIVE_NAME
      extends StObject
         with ResolveConfigVariables
    /* "ARCHIVE_NAME" */ val ARCHIVE_NAME: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.ARCHIVE_NAME & String = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with ResolveConfigVariables
    /* "DEBUG" */ val DEBUG: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.DEBUG & String = js.native
    
    @js.native
    sealed trait DISABLE_POSTINSTALL
      extends StObject
         with ResolveConfigVariables
    /* "DISABLE_POSTINSTALL" */ val DISABLE_POSTINSTALL: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.DISABLE_POSTINSTALL & String = js.native
    
    @js.native
    sealed trait DOWNLOAD_DIR
      extends StObject
         with ResolveConfigVariables
    /* "DOWNLOAD_DIR" */ val DOWNLOAD_DIR: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.DOWNLOAD_DIR & String = js.native
    
    @js.native
    sealed trait DOWNLOAD_MIRROR
      extends StObject
         with ResolveConfigVariables
    /* "DOWNLOAD_MIRROR" */ val DOWNLOAD_MIRROR: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.DOWNLOAD_MIRROR & String = js.native
    
    @js.native
    sealed trait DOWNLOAD_URL
      extends StObject
         with ResolveConfigVariables
    /* "DOWNLOAD_URL" */ val DOWNLOAD_URL: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.DOWNLOAD_URL & String = js.native
    
    @js.native
    sealed trait MD5_CHECK
      extends StObject
         with ResolveConfigVariables
    /* "MD5_CHECK" */ val MD5_CHECK: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.MD5_CHECK & String = js.native
    
    @js.native
    sealed trait PLATFORM
      extends StObject
         with ResolveConfigVariables
    /* "PLATFORM" */ val PLATFORM: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.PLATFORM & String = js.native
    
    @js.native
    sealed trait PREFER_GLOBAL_PATH
      extends StObject
         with ResolveConfigVariables
    /* "PREFER_GLOBAL_PATH" */ val PREFER_GLOBAL_PATH: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.PREFER_GLOBAL_PATH & String = js.native
    
    @js.native
    sealed trait RUNTIME_DOWNLOAD
      extends StObject
         with ResolveConfigVariables
    /* "RUNTIME_DOWNLOAD" */ val RUNTIME_DOWNLOAD: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.RUNTIME_DOWNLOAD & String = js.native
    
    @js.native
    sealed trait SYSTEM_BINARY
      extends StObject
         with ResolveConfigVariables
    /* "SYSTEM_BINARY" */ val SYSTEM_BINARY: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.SYSTEM_BINARY & String = js.native
    
    @js.native
    sealed trait SYSTEM_BINARY_VERSION_CHECK
      extends StObject
         with ResolveConfigVariables
    /* "SYSTEM_BINARY_VERSION_CHECK" */ val SYSTEM_BINARY_VERSION_CHECK: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.SYSTEM_BINARY_VERSION_CHECK & String = js.native
    
    @js.native
    sealed trait USE_ARCHIVE_NAME_FOR_BINARY_NAME
      extends StObject
         with ResolveConfigVariables
    /* "USE_ARCHIVE_NAME_FOR_BINARY_NAME" */ val USE_ARCHIVE_NAME_FOR_BINARY_NAME: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.USE_ARCHIVE_NAME_FOR_BINARY_NAME & String = js.native
    
    @js.native
    sealed trait USE_HTTP
      extends StObject
         with ResolveConfigVariables
    /* "USE_HTTP" */ val USE_HTTP: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.USE_HTTP & String = js.native
    
    @js.native
    sealed trait VERSION
      extends StObject
         with ResolveConfigVariables
    /* "VERSION" */ val VERSION: typings.mongodbMemoryServerCore.resolveConfigMod.ResolveConfigVariables.VERSION & String = js.native
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/resolveConfig", "defaultValues")
  @js.native
  val defaultValues: Map[ResolveConfigVariables, String] = js.native
  
  inline def envName(variableName: ResolveConfigVariables): String = ^.asInstanceOf[js.Dynamic].applyDynamic("envName")(variableName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def envToBool(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("envToBool")().asInstanceOf[Boolean]
  inline def envToBool(env: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("envToBool")(env.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def findPackageJson(): js.UndefOr[PackageJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageJson")().asInstanceOf[js.UndefOr[PackageJSON]]
  inline def findPackageJson(directory: String): js.UndefOr[PackageJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageJson")(directory.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PackageJSON]]
  
  inline def processConfigOption(input: Any, filepath: String): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processConfigOption")(input.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  inline def resolveConfig(variableName: ResolveConfigVariables): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(variableName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def setDefaultValue(key: ResolveConfigVariables, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Interface for storing information about the found package.json from `findPackageJson` */
  trait PackageJSON extends StObject {
    
    /** The Options that were parsed from the package.json */
    var config: Record[String, String]
    
    /** The Path where the package.json was found (directory, not the file) */
    var filePath: String
  }
  object PackageJSON {
    
    inline def apply(config: Record[String, String], filePath: String): PackageJSON = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJSON]
    }
    
    extension [Self <: PackageJSON](x: Self) {
      
      inline def setConfig(value: Record[String, String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
}
