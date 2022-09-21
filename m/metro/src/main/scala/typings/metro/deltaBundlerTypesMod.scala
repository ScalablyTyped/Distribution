package typings.metro

import org.scalablytyped.runtime.StringDictionary
import typings.metro.anon.AsyncType
import typings.metro.anon.Code
import typings.metroBabelTransformer.mod.CustomTransformOptions
import typings.metroBabelTransformer.mod.TransformProfile
import typings.metroTransformWorker.mod.Type
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaBundlerTypesMod {
  
  type AllowOptionalDependencies = Boolean | AllowOptionalDependenciesWithOptions
  
  trait AllowOptionalDependenciesWithOptions extends StObject {
    
    val exclude: js.Array[String]
  }
  object AllowOptionalDependenciesWithOptions {
    
    inline def apply(exclude: js.Array[String]): AllowOptionalDependenciesWithOptions = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowOptionalDependenciesWithOptions]
    }
    
    extension [Self <: AllowOptionalDependenciesWithOptions](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.metroStrings.async
    - typings.metro.metroStrings.prefetch
  */
  trait AsyncDependencyType extends StObject
  object AsyncDependencyType {
    
    inline def async: typings.metro.metroStrings.async = "async".asInstanceOf[typings.metro.metroStrings.async]
    
    inline def prefetch: typings.metro.metroStrings.prefetch = "prefetch".asInstanceOf[typings.metro.metroStrings.prefetch]
  }
  
  trait DeltaResult[T] extends StObject {
    
    val added: Map[String, Module[T]]
    
    val deleted: Set[String]
    
    val modified: Map[String, Module[T]]
    
    val reset: Boolean
  }
  object DeltaResult {
    
    inline def apply[T](
      added: Map[String, Module[T]],
      deleted: Set[String],
      modified: Map[String, Module[T]],
      reset: Boolean
    ): DeltaResult[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeltaResult[T]]
    }
    
    extension [Self <: DeltaResult[?], T](x: Self & DeltaResult[T]) {
      
      inline def setAdded(value: Map[String, Module[T]]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setDeleted(value: Set[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setModified(value: Map[String, Module[T]]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    }
  }
  
  type Dependencies[T] = Map[String, Module[T]]
  
  trait Dependency
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val absolutePath: String
    
    val data: TransformResultDependency
  }
  object Dependency {
    
    inline def apply(absolutePath: String, data: TransformResultDependency): Dependency = {
      val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency]
    }
    
    extension [Self <: Dependency](x: Self) {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setData(value: TransformResultDependency): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Graph[T] extends StObject {
    
    var dependencies: Dependencies[T]
    
    val entryPoints: js.Array[String]
    
    var importBundleNames: Set[String]
    
    val transformOptions: TransformInputOptions
  }
  object Graph {
    
    inline def apply[T](
      dependencies: Dependencies[T],
      entryPoints: js.Array[String],
      importBundleNames: Set[String],
      transformOptions: TransformInputOptions
    ): Graph[T] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], entryPoints = entryPoints.asInstanceOf[js.Any], importBundleNames = importBundleNames.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph[T]]
    }
    
    extension [Self <: Graph[?], T](x: Self & Graph[T]) {
      
      inline def setDependencies(value: Dependencies[T]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setEntryPoints(value: js.Array[String]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      inline def setEntryPointsVarargs(value: String*): Self = StObject.set(x, "entryPoints", js.Array(value*))
      
      inline def setImportBundleNames(value: Set[String]): Self = StObject.set(x, "importBundleNames", value.asInstanceOf[js.Any])
      
      inline def setTransformOptions(value: TransformInputOptions): Self = StObject.set(x, "transformOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait MixedOutput extends StObject {
    
    val data: Code
    
    val `type`: String
  }
  object MixedOutput {
    
    inline def apply(data: Code, `type`: String): MixedOutput = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MixedOutput]
    }
    
    extension [Self <: MixedOutput](x: Self) {
      
      inline def setData(value: Code): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module[T] extends StObject {
    
    val dependencies: Map[String, Dependency]
    
    def getSource(): Buffer
    
    val inverseDependencies: Set[String]
    
    val output: js.Array[T]
    
    val path: String
  }
  object Module {
    
    inline def apply[T](
      dependencies: Map[String, Dependency],
      getSource: () => Buffer,
      inverseDependencies: Set[String],
      output: js.Array[T],
      path: String
    ): Module[T] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], getSource = js.Any.fromFunction0(getSource), inverseDependencies = inverseDependencies.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module[T]]
    }
    
    extension [Self <: Module[?], T](x: Self & Module[T]) {
      
      inline def setDependencies(value: Map[String, Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setGetSource(value: () => Buffer): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      inline def setInverseDependencies(value: Set[String]): Self = StObject.set(x, "inverseDependencies", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: js.Array[T]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: T*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SerializerOptions[T] extends StObject {
    
    val asyncRequireModulePath: String = js.native
    
    def createModuleId(filePath: String): Double = js.native
    
    val dev: Boolean = js.native
    
    def getRunModuleStatement(moduleId: String): String = js.native
    def getRunModuleStatement(moduleId: Double): String = js.native
    
    val inlineSourceMap: js.UndefOr[Boolean] = js.native
    
    val modulesOnly: Boolean = js.native
    
    def processModuleFilter(module: Module[T]): Boolean = js.native
    
    val projectRoot: String = js.native
    
    val runBeforeMainModule: js.Array[String] = js.native
    
    val runModule: Boolean = js.native
    
    val sourceMapUrl: js.UndefOr[String] = js.native
    
    val sourceUrl: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Omit<metro-transform-worker.metro-transform-worker.JsTransformOptions, 'inlinePlatform' | 'inlineRequires'> */
  trait TransformInputOptions extends StObject {
    
    var customTransformOptions: js.UndefOr[CustomTransformOptions] = js.undefined
    
    var dev: Boolean
    
    var experimentalImportSupport: js.UndefOr[Boolean] = js.undefined
    
    var hot: Boolean
    
    var minify: Boolean
    
    var nonInlinedRequires: js.UndefOr[js.Array[String]] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
    
    var `type`: Type
    
    var unstable_disableES6Transforms: js.UndefOr[Boolean] = js.undefined
    
    var unstable_transformProfile: TransformProfile
  }
  object TransformInputOptions {
    
    inline def apply(
      dev: Boolean,
      hot: Boolean,
      minify: Boolean,
      `type`: Type,
      unstable_transformProfile: TransformProfile
    ): TransformInputOptions = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformInputOptions]
    }
    
    extension [Self <: TransformInputOptions](x: Self) {
      
      inline def setCustomTransformOptions(value: CustomTransformOptions): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformOptionsUndefined: Self = StObject.set(x, "customTransformOptions", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportSupport(value: Boolean): Self = StObject.set(x, "experimentalImportSupport", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportSupportUndefined: Self = StObject.set(x, "experimentalImportSupport", js.undefined)
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequires(value: js.Array[String]): Self = StObject.set(x, "nonInlinedRequires", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequiresUndefined: Self = StObject.set(x, "nonInlinedRequires", js.undefined)
      
      inline def setNonInlinedRequiresVarargs(value: String*): Self = StObject.set(x, "nonInlinedRequires", js.Array(value*))
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6Transforms(value: Boolean): Self = StObject.set(x, "unstable_disableES6Transforms", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6TransformsUndefined: Self = StObject.set(x, "unstable_disableES6Transforms", js.undefined)
      
      inline def setUnstable_transformProfile(value: TransformProfile): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformResultDependency extends StObject {
    
    val data: AsyncType
    
    /**
      * The literal name provided to a require or import call. For example 'foo' in
      * case of `require('foo')`.
      */
    val name: String
  }
  object TransformResultDependency {
    
    inline def apply(data: AsyncType, name: String): TransformResultDependency = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResultDependency]
    }
    
    extension [Self <: TransformResultDependency](x: Self) {
      
      inline def setData(value: AsyncType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
