package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverConfigT extends StObject {
  
  var assetExts: js.Array[String]
  
  var assetResolutions: js.Array[String]
  
  var blacklistRE: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
  
  var blockList: js.RegExp | js.Array[js.RegExp]
  
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  
  var disableHierarchicalLookup: Boolean
  
  var emptyModulePath: String
  
  var extraNodeModules: StringDictionary[String]
  
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  
  var nodeModulesPaths: js.Array[String]
  
  var platforms: js.Array[String]
  
  var requireCycleIgnorePatterns: js.Array[js.RegExp]
  
  var resolveRequest: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolver */ Any
  ] = js.undefined
  
  var resolverMainFields: js.Array[String]
  
  var sourceExts: js.Array[String]
  
  var unstable_conditionNames: js.Array[String]
  
  var unstable_enablePackageExports: Boolean
  
  var unstable_enableSymlinks: Boolean
  
  var useWatchman: Boolean
}
object ResolverConfigT {
  
  inline def apply(
    assetExts: js.Array[String],
    assetResolutions: js.Array[String],
    blockList: js.RegExp | js.Array[js.RegExp],
    disableHierarchicalLookup: Boolean,
    emptyModulePath: String,
    extraNodeModules: StringDictionary[String],
    nodeModulesPaths: js.Array[String],
    platforms: js.Array[String],
    requireCycleIgnorePatterns: js.Array[js.RegExp],
    resolverMainFields: js.Array[String],
    sourceExts: js.Array[String],
    unstable_conditionNames: js.Array[String],
    unstable_enablePackageExports: Boolean,
    unstable_enableSymlinks: Boolean,
    useWatchman: Boolean
  ): ResolverConfigT = {
    val __obj = js.Dynamic.literal(assetExts = assetExts.asInstanceOf[js.Any], assetResolutions = assetResolutions.asInstanceOf[js.Any], blockList = blockList.asInstanceOf[js.Any], disableHierarchicalLookup = disableHierarchicalLookup.asInstanceOf[js.Any], emptyModulePath = emptyModulePath.asInstanceOf[js.Any], extraNodeModules = extraNodeModules.asInstanceOf[js.Any], nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], requireCycleIgnorePatterns = requireCycleIgnorePatterns.asInstanceOf[js.Any], resolverMainFields = resolverMainFields.asInstanceOf[js.Any], sourceExts = sourceExts.asInstanceOf[js.Any], unstable_conditionNames = unstable_conditionNames.asInstanceOf[js.Any], unstable_enablePackageExports = unstable_enablePackageExports.asInstanceOf[js.Any], unstable_enableSymlinks = unstable_enableSymlinks.asInstanceOf[js.Any], useWatchman = useWatchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolverConfigT] (val x: Self) extends AnyVal {
    
    inline def setAssetExts(value: js.Array[String]): Self = StObject.set(x, "assetExts", value.asInstanceOf[js.Any])
    
    inline def setAssetExtsVarargs(value: String*): Self = StObject.set(x, "assetExts", js.Array(value*))
    
    inline def setAssetResolutions(value: js.Array[String]): Self = StObject.set(x, "assetResolutions", value.asInstanceOf[js.Any])
    
    inline def setAssetResolutionsVarargs(value: String*): Self = StObject.set(x, "assetResolutions", js.Array(value*))
    
    inline def setBlacklistRE(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "blacklistRE", value.asInstanceOf[js.Any])
    
    inline def setBlacklistREUndefined: Self = StObject.set(x, "blacklistRE", js.undefined)
    
    inline def setBlacklistREVarargs(value: js.RegExp*): Self = StObject.set(x, "blacklistRE", js.Array(value*))
    
    inline def setBlockList(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "blockList", value.asInstanceOf[js.Any])
    
    inline def setBlockListVarargs(value: js.RegExp*): Self = StObject.set(x, "blockList", js.Array(value*))
    
    inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
    
    inline def setDisableHierarchicalLookup(value: Boolean): Self = StObject.set(x, "disableHierarchicalLookup", value.asInstanceOf[js.Any])
    
    inline def setEmptyModulePath(value: String): Self = StObject.set(x, "emptyModulePath", value.asInstanceOf[js.Any])
    
    inline def setExtraNodeModules(value: StringDictionary[String]): Self = StObject.set(x, "extraNodeModules", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
    
    inline def setNodeModulesPaths(value: js.Array[String]): Self = StObject.set(x, "nodeModulesPaths", value.asInstanceOf[js.Any])
    
    inline def setNodeModulesPathsVarargs(value: String*): Self = StObject.set(x, "nodeModulesPaths", js.Array(value*))
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setRequireCycleIgnorePatterns(value: js.Array[js.RegExp]): Self = StObject.set(x, "requireCycleIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setRequireCycleIgnorePatternsVarargs(value: js.RegExp*): Self = StObject.set(x, "requireCycleIgnorePatterns", js.Array(value*))
    
    inline def setResolveRequest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolver */ Any
    ): Self = StObject.set(x, "resolveRequest", value.asInstanceOf[js.Any])
    
    inline def setResolveRequestUndefined: Self = StObject.set(x, "resolveRequest", js.undefined)
    
    inline def setResolverMainFields(value: js.Array[String]): Self = StObject.set(x, "resolverMainFields", value.asInstanceOf[js.Any])
    
    inline def setResolverMainFieldsVarargs(value: String*): Self = StObject.set(x, "resolverMainFields", js.Array(value*))
    
    inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
    
    inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
    
    inline def setUnstable_conditionNames(value: js.Array[String]): Self = StObject.set(x, "unstable_conditionNames", value.asInstanceOf[js.Any])
    
    inline def setUnstable_conditionNamesVarargs(value: String*): Self = StObject.set(x, "unstable_conditionNames", js.Array(value*))
    
    inline def setUnstable_enablePackageExports(value: Boolean): Self = StObject.set(x, "unstable_enablePackageExports", value.asInstanceOf[js.Any])
    
    inline def setUnstable_enableSymlinks(value: Boolean): Self = StObject.set(x, "unstable_enableSymlinks", value.asInstanceOf[js.Any])
    
    inline def setUseWatchman(value: Boolean): Self = StObject.set(x, "useWatchman", value.asInstanceOf[js.Any])
  }
}
