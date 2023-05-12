package typings.metroResolver

import org.scalablytyped.runtime.StringDictionary
import typings.metroResolver.metroResolverBooleans.`false`
import typings.metroResolver.metroResolverStrings.assetFiles
import typings.metroResolver.metroResolverStrings.sourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  type AssetFileResolution = js.Array[String]
  
  /* Inlined std.Readonly<{  type :'assetFiles',   filePaths :metro-resolver.metro-resolver/src/types.AssetFileResolution}> */
  trait AssetResolution
    extends StObject
       with FileResolution {
    
    val filePaths: AssetFileResolution
    
    val `type`: assetFiles
  }
  object AssetResolution {
    
    inline def apply(filePaths: AssetFileResolution): AssetResolution = {
      val __obj = js.Dynamic.literal(filePaths = filePaths.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("assetFiles")
      __obj.asInstanceOf[AssetResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssetResolution] (val x: Self) extends AnyVal {
      
      inline def setFilePaths(value: AssetFileResolution): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
      
      inline def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value*))
      
      inline def setType(value: assetFiles): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomResolutionContext
    extends StObject
       with ResolutionContext {
    
    @JSName("resolveRequest")
    def resolveRequest_MCustomResolutionContext(context: CustomResolutionContext, moduleName: String): Resolution = js.native
    @JSName("resolveRequest")
    def resolveRequest_MCustomResolutionContext(context: CustomResolutionContext, moduleName: String, platform: String): Resolution = js.native
  }
  
  type CustomResolver = js.Function3[
    /* context */ CustomResolutionContext, 
    /* moduleName */ String, 
    /* platform */ String | Null, 
    Resolution
  ]
  
  /* Inlined std.Readonly<{[option: string] : unknown}> */
  trait CustomResolverOptions extends StObject
  
  type DoesFileExist = js.Function1[/* filePath */ String, Boolean]
  
  /* Inlined std.Readonly<{[subpathOrCondition: string] : metro-resolver.metro-resolver/src/types.ExportMap | string | null}> */
  trait ExportMap extends StObject
  
  trait FileAndDirCandidates extends StObject {
    
    val dir: FileCandidates
    
    val file: FileCandidates
  }
  object FileAndDirCandidates {
    
    inline def apply(dir: FileCandidates, file: FileCandidates): FileAndDirCandidates = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileAndDirCandidates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileAndDirCandidates] (val x: Self) extends AnyVal {
      
      inline def setDir(value: FileCandidates): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setFile(value: FileCandidates): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroResolver.anon.Name
    - typings.metroResolver.anon.CandidateExts
  */
  trait FileCandidates extends StObject
  object FileCandidates {
    
    inline def CandidateExts(candidateExts: js.Array[String], filePathPrefix: String): typings.metroResolver.anon.CandidateExts = {
      val __obj = js.Dynamic.literal(candidateExts = candidateExts.asInstanceOf[js.Any], filePathPrefix = filePathPrefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[typings.metroResolver.anon.CandidateExts]
    }
    
    inline def Name(name: String): typings.metroResolver.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("asset")
      __obj.asInstanceOf[typings.metroResolver.anon.Name]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroResolver.srcTypesMod.AssetResolution
    - typings.metroResolver.srcTypesMod.SourceFileResolution
  */
  trait FileResolution
    extends StObject
       with Resolution
  object FileResolution {
    
    inline def AssetResolution(filePaths: AssetFileResolution): typings.metroResolver.srcTypesMod.AssetResolution = {
      val __obj = js.Dynamic.literal(filePaths = filePaths.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("assetFiles")
      __obj.asInstanceOf[typings.metroResolver.srcTypesMod.AssetResolution]
    }
    
    inline def SourceFileResolution(filePath: String): typings.metroResolver.srcTypesMod.SourceFileResolution = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[typings.metroResolver.srcTypesMod.SourceFileResolution]
    }
  }
  
  type GetRealPath = js.Function1[/* path */ String, String | Null]
  
  type IsAssetFile = js.Function1[/* fileName */ String, Boolean]
  
  trait PackageInfo extends StObject {
    
    val packageJson: PackageJson
    
    val rootPath: String
  }
  object PackageInfo {
    
    inline def apply(packageJson: PackageJson, rootPath: String): PackageInfo = {
      val __obj = js.Dynamic.literal(packageJson = packageJson.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageInfo] (val x: Self) extends AnyVal {
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageJson extends StObject {
    
    val exports: js.UndefOr[String | ExportMap] = js.undefined
    
    val main: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object PackageJson {
    
    inline def apply(): PackageJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
      
      inline def setExports(value: String | ExportMap): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroResolver.srcTypesMod.FileResolution
    - typings.metroResolver.anon.Readonlytypeempty
  */
  trait Resolution extends StObject
  object Resolution {
    
    inline def AssetResolution(filePaths: AssetFileResolution): typings.metroResolver.srcTypesMod.AssetResolution = {
      val __obj = js.Dynamic.literal(filePaths = filePaths.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("assetFiles")
      __obj.asInstanceOf[typings.metroResolver.srcTypesMod.AssetResolution]
    }
    
    inline def Readonlytypeempty(): typings.metroResolver.anon.Readonlytypeempty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("empty")
      __obj.asInstanceOf[typings.metroResolver.anon.Readonlytypeempty]
    }
    
    inline def SourceFileResolution(filePath: String): typings.metroResolver.srcTypesMod.SourceFileResolution = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[typings.metroResolver.srcTypesMod.SourceFileResolution]
    }
  }
  
  trait ResolutionContext extends StObject {
    
    val allowHaste: Boolean
    
    val assetExts: js.Array[String]
    
    val customResolverOptions: CustomResolverOptions
    
    val disableHierarchicalLookup: Boolean
    
    def doesFileExist(filePath: String): Boolean
    
    val extraNodeModules: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Get the parsed contents of the specified `package.json` file.
      */
    def getPackage(packageJsonPath: String): PackageJson | Null
    
    /**
      * Get the package information and parsed `package.json` file for for a given
      * module path, if it is contained within an npm package.
      *
      * @deprecated
      */
    def getPackageForModule(modulePath: String): PackageInfo | Null
    
    /**
      * The ordered list of fields to read in `package.json` to resolve a main
      * entry point based on the "browser" field spec.
      */
    val mainFields: js.Array[String]
    
    val nodeModulesPaths: js.Array[String]
    
    /**
      * Full path of the module that is requiring or importing the module to be
      * resolved.
      */
    val originModulePath: String
    
    val preferNativePlatform: Boolean
    
    def redirectModulePath(modulePath: String): String | `false`
    
    def resolveAsset(dirPath: String, assetName: String, `extension`: String): js.UndefOr[js.Array[String]]
    
    /**
      * Given a name, this should return the full path to the file that provides
      * a Haste module of that name. Ex. for `Foo` it may return `/smth/Foo.js`.
      */
    def resolveHasteModule(name: String): js.UndefOr[String]
    
    /**
      * Given a name, this should return the full path to the package manifest that
      * provides a Haste package of that name. Ex. for `Foo` it may return
      * `/smth/Foo/package.json`.
      */
    def resolveHastePackage(name: String): js.UndefOr[String]
    
    val resolveRequest: js.UndefOr[CustomResolver] = js.undefined
    
    val sourceExts: js.Array[String]
    
    var unstable_conditionNames: js.Array[String]
    
    var unstable_enablePackageExports: Boolean
    
    var unstable_getRealPath: js.UndefOr[GetRealPath | Null] = js.undefined
    
    def unstable_logWarning(message: String): Unit
  }
  object ResolutionContext {
    
    inline def apply(
      allowHaste: Boolean,
      assetExts: js.Array[String],
      customResolverOptions: CustomResolverOptions,
      disableHierarchicalLookup: Boolean,
      doesFileExist: String => Boolean,
      getPackage: String => PackageJson | Null,
      getPackageForModule: String => PackageInfo | Null,
      mainFields: js.Array[String],
      nodeModulesPaths: js.Array[String],
      originModulePath: String,
      preferNativePlatform: Boolean,
      redirectModulePath: String => String | `false`,
      resolveAsset: (String, String, String) => js.UndefOr[js.Array[String]],
      resolveHasteModule: String => js.UndefOr[String],
      resolveHastePackage: String => js.UndefOr[String],
      sourceExts: js.Array[String],
      unstable_conditionNames: js.Array[String],
      unstable_enablePackageExports: Boolean,
      unstable_logWarning: String => Unit
    ): ResolutionContext = {
      val __obj = js.Dynamic.literal(allowHaste = allowHaste.asInstanceOf[js.Any], assetExts = assetExts.asInstanceOf[js.Any], customResolverOptions = customResolverOptions.asInstanceOf[js.Any], disableHierarchicalLookup = disableHierarchicalLookup.asInstanceOf[js.Any], doesFileExist = js.Any.fromFunction1(doesFileExist), getPackage = js.Any.fromFunction1(getPackage), getPackageForModule = js.Any.fromFunction1(getPackageForModule), mainFields = mainFields.asInstanceOf[js.Any], nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], originModulePath = originModulePath.asInstanceOf[js.Any], preferNativePlatform = preferNativePlatform.asInstanceOf[js.Any], redirectModulePath = js.Any.fromFunction1(redirectModulePath), resolveAsset = js.Any.fromFunction3(resolveAsset), resolveHasteModule = js.Any.fromFunction1(resolveHasteModule), resolveHastePackage = js.Any.fromFunction1(resolveHastePackage), sourceExts = sourceExts.asInstanceOf[js.Any], unstable_conditionNames = unstable_conditionNames.asInstanceOf[js.Any], unstable_enablePackageExports = unstable_enablePackageExports.asInstanceOf[js.Any], unstable_logWarning = js.Any.fromFunction1(unstable_logWarning))
      __obj.asInstanceOf[ResolutionContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolutionContext] (val x: Self) extends AnyVal {
      
      inline def setAllowHaste(value: Boolean): Self = StObject.set(x, "allowHaste", value.asInstanceOf[js.Any])
      
      inline def setAssetExts(value: js.Array[String]): Self = StObject.set(x, "assetExts", value.asInstanceOf[js.Any])
      
      inline def setAssetExtsVarargs(value: String*): Self = StObject.set(x, "assetExts", js.Array(value*))
      
      inline def setCustomResolverOptions(value: CustomResolverOptions): Self = StObject.set(x, "customResolverOptions", value.asInstanceOf[js.Any])
      
      inline def setDisableHierarchicalLookup(value: Boolean): Self = StObject.set(x, "disableHierarchicalLookup", value.asInstanceOf[js.Any])
      
      inline def setDoesFileExist(value: String => Boolean): Self = StObject.set(x, "doesFileExist", js.Any.fromFunction1(value))
      
      inline def setExtraNodeModules(value: StringDictionary[String]): Self = StObject.set(x, "extraNodeModules", value.asInstanceOf[js.Any])
      
      inline def setExtraNodeModulesUndefined: Self = StObject.set(x, "extraNodeModules", js.undefined)
      
      inline def setGetPackage(value: String => PackageJson | Null): Self = StObject.set(x, "getPackage", js.Any.fromFunction1(value))
      
      inline def setGetPackageForModule(value: String => PackageInfo | Null): Self = StObject.set(x, "getPackageForModule", js.Any.fromFunction1(value))
      
      inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setNodeModulesPaths(value: js.Array[String]): Self = StObject.set(x, "nodeModulesPaths", value.asInstanceOf[js.Any])
      
      inline def setNodeModulesPathsVarargs(value: String*): Self = StObject.set(x, "nodeModulesPaths", js.Array(value*))
      
      inline def setOriginModulePath(value: String): Self = StObject.set(x, "originModulePath", value.asInstanceOf[js.Any])
      
      inline def setPreferNativePlatform(value: Boolean): Self = StObject.set(x, "preferNativePlatform", value.asInstanceOf[js.Any])
      
      inline def setRedirectModulePath(value: String => String | `false`): Self = StObject.set(x, "redirectModulePath", js.Any.fromFunction1(value))
      
      inline def setResolveAsset(value: (String, String, String) => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "resolveAsset", js.Any.fromFunction3(value))
      
      inline def setResolveHasteModule(value: String => js.UndefOr[String]): Self = StObject.set(x, "resolveHasteModule", js.Any.fromFunction1(value))
      
      inline def setResolveHastePackage(value: String => js.UndefOr[String]): Self = StObject.set(x, "resolveHastePackage", js.Any.fromFunction1(value))
      
      inline def setResolveRequest(
        value: (/* context */ CustomResolutionContext, /* moduleName */ String, /* platform */ String | Null) => Resolution
      ): Self = StObject.set(x, "resolveRequest", js.Any.fromFunction3(value))
      
      inline def setResolveRequestUndefined: Self = StObject.set(x, "resolveRequest", js.undefined)
      
      inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
      
      inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
      
      inline def setUnstable_conditionNames(value: js.Array[String]): Self = StObject.set(x, "unstable_conditionNames", value.asInstanceOf[js.Any])
      
      inline def setUnstable_conditionNamesVarargs(value: String*): Self = StObject.set(x, "unstable_conditionNames", js.Array(value*))
      
      inline def setUnstable_enablePackageExports(value: Boolean): Self = StObject.set(x, "unstable_enablePackageExports", value.asInstanceOf[js.Any])
      
      inline def setUnstable_getRealPath(value: /* path */ String => String | Null): Self = StObject.set(x, "unstable_getRealPath", js.Any.fromFunction1(value))
      
      inline def setUnstable_getRealPathNull: Self = StObject.set(x, "unstable_getRealPath", null)
      
      inline def setUnstable_getRealPathUndefined: Self = StObject.set(x, "unstable_getRealPath", js.undefined)
      
      inline def setUnstable_logWarning(value: String => Unit): Self = StObject.set(x, "unstable_logWarning", js.Any.fromFunction1(value))
    }
  }
  
  type ResolveAsset = js.Function3[
    /* dirPath */ String, 
    /* assetName */ String, 
    /* extension */ String, 
    js.UndefOr[js.Array[String]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroResolver.anon.Resolution[TResolution]
    - typings.metroResolver.anon.Candidates[TCandidates]
  */
  trait Result[TResolution, TCandidates] extends StObject
  object Result {
    
    inline def Candidates[TCandidates](candidates: TCandidates): typings.metroResolver.anon.Candidates[TCandidates] = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("failed")
      __obj.asInstanceOf[typings.metroResolver.anon.Candidates[TCandidates]]
    }
    
    inline def Resolution[TResolution](resolution: TResolution): typings.metroResolver.anon.Resolution[TResolution] = {
      val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resolved")
      __obj.asInstanceOf[typings.metroResolver.anon.Resolution[TResolution]]
    }
  }
  
  /* Inlined std.Readonly<{  type :'sourceFile',   filePath :string}> */
  trait SourceFileResolution
    extends StObject
       with FileResolution {
    
    val filePath: String
    
    val `type`: sourceFile
  }
  object SourceFileResolution {
    
    inline def apply(filePath: String): SourceFileResolution = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[SourceFileResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceFileResolution] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setType(value: sourceFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
