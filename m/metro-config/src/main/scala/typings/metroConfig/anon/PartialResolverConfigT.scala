package typings.metroConfig.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<metro-config.metro-config/src/configTypes.ResolverConfigT> */
trait PartialResolverConfigT extends StObject {
  
  var assetExts: js.UndefOr[js.Array[String]] = js.undefined
  
  var assetResolutions: js.UndefOr[js.Array[String]] = js.undefined
  
  var blacklistRE: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
  
  var blockList: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
  
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  
  var disableHierarchicalLookup: js.UndefOr[Boolean] = js.undefined
  
  var emptyModulePath: js.UndefOr[String] = js.undefined
  
  var extraNodeModules: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  
  var nodeModulesPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  
  var requireCycleIgnorePatterns: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  
  var resolveRequest: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolver */ Any
  ] = js.undefined
  
  var resolverMainFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var sourceExts: js.UndefOr[js.Array[String]] = js.undefined
  
  var unstable_conditionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var unstable_conditionsByPlatform: js.UndefOr[js.Object] = js.undefined
  
  var unstable_enablePackageExports: js.UndefOr[Boolean] = js.undefined
  
  var unstable_enableSymlinks: js.UndefOr[Boolean] = js.undefined
  
  var useWatchman: js.UndefOr[Boolean] = js.undefined
}
object PartialResolverConfigT {
  
  inline def apply(): PartialResolverConfigT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResolverConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialResolverConfigT] (val x: Self) extends AnyVal {
    
    inline def setAssetExts(value: js.Array[String]): Self = StObject.set(x, "assetExts", value.asInstanceOf[js.Any])
    
    inline def setAssetExtsUndefined: Self = StObject.set(x, "assetExts", js.undefined)
    
    inline def setAssetExtsVarargs(value: String*): Self = StObject.set(x, "assetExts", js.Array(value*))
    
    inline def setAssetResolutions(value: js.Array[String]): Self = StObject.set(x, "assetResolutions", value.asInstanceOf[js.Any])
    
    inline def setAssetResolutionsUndefined: Self = StObject.set(x, "assetResolutions", js.undefined)
    
    inline def setAssetResolutionsVarargs(value: String*): Self = StObject.set(x, "assetResolutions", js.Array(value*))
    
    inline def setBlacklistRE(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "blacklistRE", value.asInstanceOf[js.Any])
    
    inline def setBlacklistREUndefined: Self = StObject.set(x, "blacklistRE", js.undefined)
    
    inline def setBlacklistREVarargs(value: js.RegExp*): Self = StObject.set(x, "blacklistRE", js.Array(value*))
    
    inline def setBlockList(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "blockList", value.asInstanceOf[js.Any])
    
    inline def setBlockListUndefined: Self = StObject.set(x, "blockList", js.undefined)
    
    inline def setBlockListVarargs(value: js.RegExp*): Self = StObject.set(x, "blockList", js.Array(value*))
    
    inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
    
    inline def setDisableHierarchicalLookup(value: Boolean): Self = StObject.set(x, "disableHierarchicalLookup", value.asInstanceOf[js.Any])
    
    inline def setDisableHierarchicalLookupUndefined: Self = StObject.set(x, "disableHierarchicalLookup", js.undefined)
    
    inline def setEmptyModulePath(value: String): Self = StObject.set(x, "emptyModulePath", value.asInstanceOf[js.Any])
    
    inline def setEmptyModulePathUndefined: Self = StObject.set(x, "emptyModulePath", js.undefined)
    
    inline def setExtraNodeModules(value: StringDictionary[String]): Self = StObject.set(x, "extraNodeModules", value.asInstanceOf[js.Any])
    
    inline def setExtraNodeModulesUndefined: Self = StObject.set(x, "extraNodeModules", js.undefined)
    
    inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
    
    inline def setNodeModulesPaths(value: js.Array[String]): Self = StObject.set(x, "nodeModulesPaths", value.asInstanceOf[js.Any])
    
    inline def setNodeModulesPathsUndefined: Self = StObject.set(x, "nodeModulesPaths", js.undefined)
    
    inline def setNodeModulesPathsVarargs(value: String*): Self = StObject.set(x, "nodeModulesPaths", js.Array(value*))
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setRequireCycleIgnorePatterns(value: js.Array[js.RegExp]): Self = StObject.set(x, "requireCycleIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setRequireCycleIgnorePatternsUndefined: Self = StObject.set(x, "requireCycleIgnorePatterns", js.undefined)
    
    inline def setRequireCycleIgnorePatternsVarargs(value: js.RegExp*): Self = StObject.set(x, "requireCycleIgnorePatterns", js.Array(value*))
    
    inline def setResolveRequest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolver */ Any
    ): Self = StObject.set(x, "resolveRequest", value.asInstanceOf[js.Any])
    
    inline def setResolveRequestUndefined: Self = StObject.set(x, "resolveRequest", js.undefined)
    
    inline def setResolverMainFields(value: js.Array[String]): Self = StObject.set(x, "resolverMainFields", value.asInstanceOf[js.Any])
    
    inline def setResolverMainFieldsUndefined: Self = StObject.set(x, "resolverMainFields", js.undefined)
    
    inline def setResolverMainFieldsVarargs(value: String*): Self = StObject.set(x, "resolverMainFields", js.Array(value*))
    
    inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
    
    inline def setSourceExtsUndefined: Self = StObject.set(x, "sourceExts", js.undefined)
    
    inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
    
    inline def setUnstable_conditionNames(value: js.Array[String]): Self = StObject.set(x, "unstable_conditionNames", value.asInstanceOf[js.Any])
    
    inline def setUnstable_conditionNamesUndefined: Self = StObject.set(x, "unstable_conditionNames", js.undefined)
    
    inline def setUnstable_conditionNamesVarargs(value: String*): Self = StObject.set(x, "unstable_conditionNames", js.Array(value*))
    
    inline def setUnstable_conditionsByPlatform(value: js.Object): Self = StObject.set(x, "unstable_conditionsByPlatform", value.asInstanceOf[js.Any])
    
    inline def setUnstable_conditionsByPlatformUndefined: Self = StObject.set(x, "unstable_conditionsByPlatform", js.undefined)
    
    inline def setUnstable_enablePackageExports(value: Boolean): Self = StObject.set(x, "unstable_enablePackageExports", value.asInstanceOf[js.Any])
    
    inline def setUnstable_enablePackageExportsUndefined: Self = StObject.set(x, "unstable_enablePackageExports", js.undefined)
    
    inline def setUnstable_enableSymlinks(value: Boolean): Self = StObject.set(x, "unstable_enableSymlinks", value.asInstanceOf[js.Any])
    
    inline def setUnstable_enableSymlinksUndefined: Self = StObject.set(x, "unstable_enableSymlinks", js.undefined)
    
    inline def setUseWatchman(value: Boolean): Self = StObject.set(x, "useWatchman", value.asInstanceOf[js.Any])
    
    inline def setUseWatchmanUndefined: Self = StObject.set(x, "useWatchman", js.undefined)
  }
}
