package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.RequiredDryMongoBinaryOpt
import typings.mongodbMemoryServerCore.getosMod.AnyOS
import typings.std.Map
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dryMongoBinaryMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/DryMongoBinary", "DryMongoBinary")
  @js.native
  open class DryMongoBinary () extends StObject
  /* static members */
  object DryMongoBinary {
    
    @JSImport("mongodb-memory-server-core/lib/util/DryMongoBinary", "DryMongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binaries already found, values are: [Version, Path]
      */
    @JSImport("mongodb-memory-server-core/lib/util/DryMongoBinary", "DryMongoBinary.binaryCache")
    @js.native
    def binaryCache: Map[String, String] = js.native
    inline def binaryCache_=(x: Map[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binaryCache")(x.asInstanceOf[js.Any])
    
    /**
      * Combine basePath with binaryName
      */
    inline def combineBinaryName(basePath: String, binaryName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("combineBinaryName")(basePath.asInstanceOf[js.Any], binaryName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Generate the Path where an Binary will be located
      * @returns "boolean" indicating if the binary exists at the provided path, and "string" the path to use for the binary
      */
    inline def generateDownloadPath(opts: DryMongoBinaryOptions & DryMongoBinaryNameOptions): js.Promise[js.Tuple2[Boolean, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDownloadPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[Boolean, String]]]
    
    /**
      * Generate All required options for the binary name / path generation
      */
    inline def generateOptions(): js.Promise[RequiredDryMongoBinaryOpt] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateOptions")().asInstanceOf[js.Promise[RequiredDryMongoBinaryOpt]]
    inline def generateOptions(opts: DryMongoBinaryOptions): js.Promise[RequiredDryMongoBinaryOpt] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RequiredDryMongoBinaryOpt]]
    
    /**
      * Generate an "MongoBinaryPaths" object
      *
      * This Function should not hit the FileSystem
      * @returns an finished "MongoBinaryPaths" object
      */
    inline def generatePaths(opts: DryMongoBinaryOptions & DryMongoBinaryNameOptions): js.Promise[DryMongoBinaryPaths] = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePaths")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DryMongoBinaryPaths]]
    
    /**
      * Get the full path with filename
      * @returns Absoulte Path with FileName
      */
    inline def getBinaryName(opts: DryMongoBinaryNameOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinaryName")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe if the provided "systemBinary" is an existing path
      * @param systemBinary The Path to probe for an System-Binary
      * @returns System Binary path or undefined
      */
    inline def getSystemPath(systemBinary: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(systemBinary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    /**
      * This function is used, because jest just dosnt want "os.homedir" to be mocked
      * if someone can find an way to actually mock this in an test, please change it
      */
    @JSImport("mongodb-memory-server-core/lib/util/DryMongoBinary", "DryMongoBinary.homedir")
    @js.native
    def homedir: Any = js.native
    inline def homedir_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homedir")(x.asInstanceOf[js.Any])
    
    /**
      * Try to locate an existing binary
      * @returns The Path to an Binary Found, or undefined
      */
    inline def locateBinary(opts: DryMongoBinaryOptions): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("locateBinary")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    /**
      * Parse "input" into DryMongoBinaryOptions
      * @param input The Input to be parsed with the regex
      * @param opts The Options which will be augmented with "input"
      * @returns The Augmented options
      */
    inline def parseArchiveNameRegex(input: String, opts: RequiredDryMongoBinaryOpt): RequiredDryMongoBinaryOpt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArchiveNameRegex")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RequiredDryMongoBinaryOpt]
  }
  
  trait BaseDryMongoBinaryOptions extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var downloadDir: js.UndefOr[String] = js.undefined
    
    var os: js.UndefOr[AnyOS] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var systemBinary: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object BaseDryMongoBinaryOptions {
    
    inline def apply(): BaseDryMongoBinaryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseDryMongoBinaryOptions]
    }
    
    extension [Self <: BaseDryMongoBinaryOptions](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
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
  
  trait DryMongoBinaryArchiveRegexGroups extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var dist: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object DryMongoBinaryArchiveRegexGroups {
    
    inline def apply(): DryMongoBinaryArchiveRegexGroups = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DryMongoBinaryArchiveRegexGroups]
    }
    
    extension [Self <: DryMongoBinaryArchiveRegexGroups](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait DryMongoBinaryNameOptions extends StObject {
    
    var arch: NonNullable[js.UndefOr[String]]
    
    var os: NonNullable[js.UndefOr[AnyOS]]
    
    var platform: NonNullable[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.BaseDryMongoBinaryOptions['version'] */ js.Any
        ]
      ]
    
    var version: NonNullable[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.BaseDryMongoBinaryOptions['version'] */ js.Any
        ]
      ]
  }
  object DryMongoBinaryNameOptions {
    
    inline def apply(
      arch: NonNullable[js.UndefOr[String]],
      os: NonNullable[js.UndefOr[AnyOS]],
      platform: NonNullable[
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.BaseDryMongoBinaryOptions['version'] */ js.Any
          ]
        ],
      version: NonNullable[
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.BaseDryMongoBinaryOptions['version'] */ js.Any
          ]
        ]
    ): DryMongoBinaryNameOptions = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryMongoBinaryNameOptions]
    }
    
    extension [Self <: DryMongoBinaryNameOptions](x: Self) {
      
      inline def setArch(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setOs(value: NonNullable[js.UndefOr[AnyOS]]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPlatform(
        value: NonNullable[
              NonNullable[
                /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.BaseDryMongoBinaryOptions['version'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setVersion(
        value: NonNullable[
              NonNullable[
                /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/DryMongoBinary.BaseDryMongoBinaryOptions['version'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryMongoBinaryOptions
    extends StObject
       with BaseDryMongoBinaryOptions {
    
    @JSName("version")
    var version_DryMongoBinaryOptions: NonNullable[js.UndefOr[String]]
  }
  object DryMongoBinaryOptions {
    
    inline def apply(version: NonNullable[js.UndefOr[String]]): DryMongoBinaryOptions = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryMongoBinaryOptions]
    }
    
    extension [Self <: DryMongoBinaryOptions](x: Self) {
      
      inline def setVersion(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryMongoBinaryPaths extends StObject {
    
    /** Path for "~/.config/" (user home) */
    var legacyHomeCache: String
    
    /** Path for "PROJECT/node_modules/.cache/" (project local cache) */
    var modulesCache: String
    
    /** Path for relative to CWD "CWD/" (relative CWD path) */
    var relative: String
    
    /** Path from `DOWNLOAD_DIR` config option */
    var resolveConfig: String
  }
  object DryMongoBinaryPaths {
    
    inline def apply(legacyHomeCache: String, modulesCache: String, relative: String, resolveConfig: String): DryMongoBinaryPaths = {
      val __obj = js.Dynamic.literal(legacyHomeCache = legacyHomeCache.asInstanceOf[js.Any], modulesCache = modulesCache.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], resolveConfig = resolveConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryMongoBinaryPaths]
    }
    
    extension [Self <: DryMongoBinaryPaths](x: Self) {
      
      inline def setLegacyHomeCache(value: String): Self = StObject.set(x, "legacyHomeCache", value.asInstanceOf[js.Any])
      
      inline def setModulesCache(value: String): Self = StObject.set(x, "modulesCache", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setResolveConfig(value: String): Self = StObject.set(x, "resolveConfig", value.asInstanceOf[js.Any])
    }
  }
}
