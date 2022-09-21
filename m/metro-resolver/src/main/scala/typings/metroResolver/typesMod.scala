package typings.metroResolver

import org.scalablytyped.runtime.StringDictionary
import typings.metroResolver.metroResolverBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AssetFileResolution = js.Array[String]
  
  type CustomResolver = js.Function4[
    /* context */ ResolutionContext, 
    /* realModuleName */ String, 
    /* platform */ String | Null, 
    /* moduleName */ String | Null, 
    Resolution
  ]
  
  type DoesFileExist = js.Function1[/* filePath */ String, Boolean]
  
  trait FileAndDirCandidates extends StObject {
    
    val dir: FileCandidates
    
    val file: FileCandidates
  }
  object FileAndDirCandidates {
    
    inline def apply(dir: FileCandidates, file: FileCandidates): FileAndDirCandidates = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileAndDirCandidates]
    }
    
    extension [Self <: FileAndDirCandidates](x: Self) {
      
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
  
  trait FileContext extends StObject {
    
    def doesFileExist(filePath: String): Boolean
    
    def isAssetFile(fileName: String): Boolean
    
    val nodeModulesPaths: js.Array[String]
    
    val preferNativePlatform: Boolean
    
    def redirectModulePath(modulePath: String): String | `false`
    
    def resolveAsset(dirPath: String, assetName: String, `extension`: String): js.UndefOr[js.Array[String]]
    
    val sourceExts: js.Array[String]
  }
  object FileContext {
    
    inline def apply(
      doesFileExist: String => Boolean,
      isAssetFile: String => Boolean,
      nodeModulesPaths: js.Array[String],
      preferNativePlatform: Boolean,
      redirectModulePath: String => String | `false`,
      resolveAsset: (String, String, String) => js.UndefOr[js.Array[String]],
      sourceExts: js.Array[String]
    ): FileContext = {
      val __obj = js.Dynamic.literal(doesFileExist = js.Any.fromFunction1(doesFileExist), isAssetFile = js.Any.fromFunction1(isAssetFile), nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], preferNativePlatform = preferNativePlatform.asInstanceOf[js.Any], redirectModulePath = js.Any.fromFunction1(redirectModulePath), resolveAsset = js.Any.fromFunction3(resolveAsset), sourceExts = sourceExts.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileContext]
    }
    
    extension [Self <: FileContext](x: Self) {
      
      inline def setDoesFileExist(value: String => Boolean): Self = StObject.set(x, "doesFileExist", js.Any.fromFunction1(value))
      
      inline def setIsAssetFile(value: String => Boolean): Self = StObject.set(x, "isAssetFile", js.Any.fromFunction1(value))
      
      inline def setNodeModulesPaths(value: js.Array[String]): Self = StObject.set(x, "nodeModulesPaths", value.asInstanceOf[js.Any])
      
      inline def setNodeModulesPathsVarargs(value: String*): Self = StObject.set(x, "nodeModulesPaths", js.Array(value*))
      
      inline def setPreferNativePlatform(value: Boolean): Self = StObject.set(x, "preferNativePlatform", value.asInstanceOf[js.Any])
      
      inline def setRedirectModulePath(value: String => String | `false`): Self = StObject.set(x, "redirectModulePath", js.Any.fromFunction1(value))
      
      inline def setResolveAsset(value: (String, String, String) => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "resolveAsset", js.Any.fromFunction3(value))
      
      inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
      
      inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
    }
  }
  
  trait FileOrDirContext
    extends StObject
       with FileContext {
    
    /**
      * This should return the path of the "main" module of the specified
      * `package.json` file, after post-processing: for example, applying the
      * 'browser' field if necessary.
      *
      * FIXME: move the post-processing here. Right now it is
      * located in `node-haste/Package.js`, and fully duplicated in
      * `ModuleGraph/node-haste/Package.js` (!)
      */
    def getPackageMainPath(packageJsonPath: String): String
  }
  object FileOrDirContext {
    
    inline def apply(
      doesFileExist: String => Boolean,
      getPackageMainPath: String => String,
      isAssetFile: String => Boolean,
      nodeModulesPaths: js.Array[String],
      preferNativePlatform: Boolean,
      redirectModulePath: String => String | `false`,
      resolveAsset: (String, String, String) => js.UndefOr[js.Array[String]],
      sourceExts: js.Array[String]
    ): FileOrDirContext = {
      val __obj = js.Dynamic.literal(doesFileExist = js.Any.fromFunction1(doesFileExist), getPackageMainPath = js.Any.fromFunction1(getPackageMainPath), isAssetFile = js.Any.fromFunction1(isAssetFile), nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], preferNativePlatform = preferNativePlatform.asInstanceOf[js.Any], redirectModulePath = js.Any.fromFunction1(redirectModulePath), resolveAsset = js.Any.fromFunction3(resolveAsset), sourceExts = sourceExts.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileOrDirContext]
    }
    
    extension [Self <: FileOrDirContext](x: Self) {
      
      inline def setGetPackageMainPath(value: String => String): Self = StObject.set(x, "getPackageMainPath", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroResolver.anon.FilePath
    - typings.metroResolver.anon.FilePaths
  */
  trait FileResolution
    extends StObject
       with Resolution
  object FileResolution {
    
    inline def FilePath(filePath: String): typings.metroResolver.anon.FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[typings.metroResolver.anon.FilePath]
    }
    
    inline def FilePaths(filePaths: AssetFileResolution): typings.metroResolver.anon.FilePaths = {
      val __obj = js.Dynamic.literal(filePaths = filePaths.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("assetFiles")
      __obj.asInstanceOf[typings.metroResolver.anon.FilePaths]
    }
  }
  
  trait HasteContext
    extends StObject
       with FileOrDirContext {
    
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
  }
  object HasteContext {
    
    inline def apply(
      doesFileExist: String => Boolean,
      getPackageMainPath: String => String,
      isAssetFile: String => Boolean,
      nodeModulesPaths: js.Array[String],
      preferNativePlatform: Boolean,
      redirectModulePath: String => String | `false`,
      resolveAsset: (String, String, String) => js.UndefOr[js.Array[String]],
      resolveHasteModule: String => js.UndefOr[String],
      resolveHastePackage: String => js.UndefOr[String],
      sourceExts: js.Array[String]
    ): HasteContext = {
      val __obj = js.Dynamic.literal(doesFileExist = js.Any.fromFunction1(doesFileExist), getPackageMainPath = js.Any.fromFunction1(getPackageMainPath), isAssetFile = js.Any.fromFunction1(isAssetFile), nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], preferNativePlatform = preferNativePlatform.asInstanceOf[js.Any], redirectModulePath = js.Any.fromFunction1(redirectModulePath), resolveAsset = js.Any.fromFunction3(resolveAsset), resolveHasteModule = js.Any.fromFunction1(resolveHasteModule), resolveHastePackage = js.Any.fromFunction1(resolveHastePackage), sourceExts = sourceExts.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasteContext]
    }
    
    extension [Self <: HasteContext](x: Self) {
      
      inline def setResolveHasteModule(value: String => js.UndefOr[String]): Self = StObject.set(x, "resolveHasteModule", js.Any.fromFunction1(value))
      
      inline def setResolveHastePackage(value: String => js.UndefOr[String]): Self = StObject.set(x, "resolveHastePackage", js.Any.fromFunction1(value))
    }
  }
  
  type IsAssetFile = js.Function1[/* fileName */ String, Boolean]
  
  trait ModulePathContext
    extends StObject
       with FileOrDirContext {
    
    /**
      * Full path of the module that is requiring or importing the module to be
      * resolved.
      */
    val originModulePath: String
  }
  object ModulePathContext {
    
    inline def apply(
      doesFileExist: String => Boolean,
      getPackageMainPath: String => String,
      isAssetFile: String => Boolean,
      nodeModulesPaths: js.Array[String],
      originModulePath: String,
      preferNativePlatform: Boolean,
      redirectModulePath: String => String | `false`,
      resolveAsset: (String, String, String) => js.UndefOr[js.Array[String]],
      sourceExts: js.Array[String]
    ): ModulePathContext = {
      val __obj = js.Dynamic.literal(doesFileExist = js.Any.fromFunction1(doesFileExist), getPackageMainPath = js.Any.fromFunction1(getPackageMainPath), isAssetFile = js.Any.fromFunction1(isAssetFile), nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], originModulePath = originModulePath.asInstanceOf[js.Any], preferNativePlatform = preferNativePlatform.asInstanceOf[js.Any], redirectModulePath = js.Any.fromFunction1(redirectModulePath), resolveAsset = js.Any.fromFunction3(resolveAsset), sourceExts = sourceExts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModulePathContext]
    }
    
    extension [Self <: ModulePathContext](x: Self) {
      
      inline def setOriginModulePath(value: String): Self = StObject.set(x, "originModulePath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroResolver.typesMod.FileResolution
    - typings.metroResolver.anon.Type
  */
  trait Resolution extends StObject
  object Resolution {
    
    inline def FilePath(filePath: String): typings.metroResolver.anon.FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[typings.metroResolver.anon.FilePath]
    }
    
    inline def FilePaths(filePaths: AssetFileResolution): typings.metroResolver.anon.FilePaths = {
      val __obj = js.Dynamic.literal(filePaths = filePaths.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("assetFiles")
      __obj.asInstanceOf[typings.metroResolver.anon.FilePaths]
    }
    
    inline def Type(): typings.metroResolver.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("empty")
      __obj.asInstanceOf[typings.metroResolver.anon.Type]
    }
  }
  
  trait ResolutionContext
    extends StObject
       with ModulePathContext
       with HasteContext {
    
    var allowHaste: Boolean
    
    var extraNodeModules: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var resolveRequest: js.UndefOr[CustomResolver] = js.undefined
  }
  object ResolutionContext {
    
    inline def apply(
      allowHaste: Boolean,
      doesFileExist: String => Boolean,
      getPackageMainPath: String => String,
      isAssetFile: String => Boolean,
      nodeModulesPaths: js.Array[String],
      originModulePath: String,
      preferNativePlatform: Boolean,
      redirectModulePath: String => String | `false`,
      resolveAsset: (String, String, String) => js.UndefOr[js.Array[String]],
      resolveHasteModule: String => js.UndefOr[String],
      resolveHastePackage: String => js.UndefOr[String],
      sourceExts: js.Array[String]
    ): ResolutionContext = {
      val __obj = js.Dynamic.literal(allowHaste = allowHaste.asInstanceOf[js.Any], doesFileExist = js.Any.fromFunction1(doesFileExist), getPackageMainPath = js.Any.fromFunction1(getPackageMainPath), isAssetFile = js.Any.fromFunction1(isAssetFile), nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], originModulePath = originModulePath.asInstanceOf[js.Any], preferNativePlatform = preferNativePlatform.asInstanceOf[js.Any], redirectModulePath = js.Any.fromFunction1(redirectModulePath), resolveAsset = js.Any.fromFunction3(resolveAsset), resolveHasteModule = js.Any.fromFunction1(resolveHasteModule), resolveHastePackage = js.Any.fromFunction1(resolveHastePackage), sourceExts = sourceExts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolutionContext]
    }
    
    extension [Self <: ResolutionContext](x: Self) {
      
      inline def setAllowHaste(value: Boolean): Self = StObject.set(x, "allowHaste", value.asInstanceOf[js.Any])
      
      inline def setExtraNodeModules(value: StringDictionary[String]): Self = StObject.set(x, "extraNodeModules", value.asInstanceOf[js.Any])
      
      inline def setExtraNodeModulesUndefined: Self = StObject.set(x, "extraNodeModules", js.undefined)
      
      inline def setResolveRequest(
        value: (/* context */ ResolutionContext, /* realModuleName */ String, /* platform */ String | Null, /* moduleName */ String | Null) => Resolution
      ): Self = StObject.set(x, "resolveRequest", js.Any.fromFunction4(value))
      
      inline def setResolveRequestUndefined: Self = StObject.set(x, "resolveRequest", js.undefined)
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
}
