package typings.metro

import org.scalablytyped.runtime.StringDictionary
import typings.metro.anon.AsyncType
import typings.metro.anon.Code
import typings.metro.metroStrings.inlinePlatform
import typings.metro.metroStrings.inlineRequires
import typings.metro.metroStrings.sourceFile
import typings.metro.srcLibContextModuleMod.RequireContext
import typings.metro.srcLibCountingSetMod.default
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import typings.std.Omit
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeltaBundlerTypesMod {
  
  @JSImport("metro/src/DeltaBundler/types", "Graph")
  @js.native
  open class Graph[T] protected ()
    extends typings.metro.srcDeltaBundlerGraphMod.Graph[T] {
    def this(options: GraphInputOptions) = this()
  }
  
  type AllowOptionalDependencies = Boolean | AllowOptionalDependenciesWithOptions
  
  trait AllowOptionalDependenciesWithOptions extends StObject {
    
    val exclude: js.Array[String]
  }
  object AllowOptionalDependenciesWithOptions {
    
    inline def apply(exclude: js.Array[String]): AllowOptionalDependenciesWithOptions = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowOptionalDependenciesWithOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowOptionalDependenciesWithOptions] (val x: Self) extends AnyVal {
      
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
  
  trait BundlerResolution extends StObject {
    
    val filePath: String
    
    val `type`: sourceFile
  }
  object BundlerResolution {
    
    inline def apply(filePath: String): BundlerResolution = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[BundlerResolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundlerResolution] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setType(value: sourceFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeltaResult[?], T] (val x: Self & DeltaResult[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setData(value: TransformResultDependency): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  entryPoints :std.ReadonlySet<string>,   transformOptions :metro.metro/src/DeltaBundler/types.TransformInputOptions}> */
  trait GraphInputOptions extends StObject {
    
    val entryPoints: ReadonlySet[String]
    
    val transformOptions: TransformInputOptions
  }
  object GraphInputOptions {
    
    inline def apply(entryPoints: ReadonlySet[String], transformOptions: TransformInputOptions): GraphInputOptions = {
      val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphInputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphInputOptions] (val x: Self) extends AnyVal {
      
      inline def setEntryPoints(value: ReadonlySet[String]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MixedOutput] (val x: Self) extends AnyVal {
      
      inline def setData(value: Code): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module[T] extends StObject {
    
    val dependencies: Map[String, Dependency]
    
    def getSource(): Buffer
    
    val inverseDependencies: default[String]
    
    val output: js.Array[T]
    
    val path: String
  }
  object Module {
    
    inline def apply[T](
      dependencies: Map[String, Dependency],
      getSource: () => Buffer,
      inverseDependencies: default[String],
      output: js.Array[T],
      path: String
    ): Module[T] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], getSource = js.Any.fromFunction0(getSource), inverseDependencies = inverseDependencies.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Module[?], T] (val x: Self & Module[T]) extends AnyVal {
      
      inline def setDependencies(value: Map[String, Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setGetSource(value: () => Buffer): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      inline def setInverseDependencies(value: default[String]): Self = StObject.set(x, "inverseDependencies", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: js.Array[T]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: T*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options[T] extends StObject {
    
    val `lazy`: Boolean = js.native
    
    val onProgress: (js.Function2[/* numProcessed */ Double, /* total */ Double, Any]) | Null = js.native
    
    def resolve(from: String, to: String): String = js.native
    
    val shallow: Boolean = js.native
    
    def transform(modulePath: String): js.Promise[TransformResultWithSource[T]] = js.native
    def transform(modulePath: String, requireContext: RequireContext): js.Promise[TransformResultWithSource[T]] = js.native
    
    val transformOptions: TransformInputOptions = js.native
    
    val unstable_allowRequireContext: Boolean = js.native
  }
  
  type ReadOnlyDependencies[T] = ReadonlyMap[String, Module[T]]
  
  trait ReadOnlyGraph[T] extends StObject {
    
    val dependencies: ReadOnlyDependencies[T]
    
    val entryPoints: ReadonlySet[String]
    
    // Unused in core but useful for custom serializers / experimentalSerializerHook
    val transformOptions: TransformInputOptions
  }
  object ReadOnlyGraph {
    
    inline def apply[T](
      dependencies: ReadOnlyDependencies[T],
      entryPoints: ReadonlySet[String],
      transformOptions: TransformInputOptions
    ): ReadOnlyGraph[T] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], entryPoints = entryPoints.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOnlyGraph[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOnlyGraph[?], T] (val x: Self & ReadOnlyGraph[T]) extends AnyVal {
      
      inline def setDependencies(value: ReadOnlyDependencies[T]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setEntryPoints(value: ReadonlySet[String]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      inline def setTransformOptions(value: TransformInputOptions): Self = StObject.set(x, "transformOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SerializerOptions[T] extends StObject {
    
    val asyncRequireModulePath: String = js.native
    
    def createModuleId(filePath: String): Double = js.native
    
    val dev: Boolean = js.native
    
    def getRunModuleStatement(moduleId: String): String = js.native
    def getRunModuleStatement(moduleId: Double): String = js.native
    
    val includeAsyncPaths: Boolean = js.native
    
    val inlineSourceMap: js.UndefOr[Boolean] = js.native
    
    val modulesOnly: Boolean = js.native
    
    def processModuleFilter(module: Module[T]): Boolean = js.native
    
    val projectRoot: String = js.native
    
    val runBeforeMainModule: js.Array[String] = js.native
    
    val runModule: Boolean = js.native
    
    val serverRoot: String = js.native
    
    def shouldAddToIgnoreList(module: Module[T]): Boolean = js.native
    
    val sourceMapUrl: js.UndefOr[String] = js.native
    
    val sourceUrl: js.UndefOr[String] = js.native
  }
  
  type TransformFn[T] = js.Function2[
    /* modulePath */ String, 
    /* requireContext */ RequireContext | Null, 
    js.Promise[TransformResultWithSource[T]]
  ]
  
  type TransformInputOptions = Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsTransformOptions */ Any, 
    inlinePlatform | inlineRequires
  ]
  
  trait TransformResult[T] extends StObject {
    
    var dependencies: js.Array[TransformResultDependency]
    
    var output: js.Array[T]
  }
  object TransformResult {
    
    inline def apply[T](dependencies: js.Array[TransformResultDependency], output: js.Array[T]): TransformResult[T] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformResult[?], T] (val x: Self & TransformResult[T]) extends AnyVal {
      
      inline def setDependencies(value: js.Array[TransformResultDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: TransformResultDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setOutput(value: js.Array[T]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: T*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  trait TransformResultDependency extends StObject {
    
    /**
      * Extra data returned by the dependency extractor.
      */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformResultDependency] (val x: Self) extends AnyVal {
      
      inline def setData(value: AsyncType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformResultWithSource[T]
    extends StObject
       with TransformResult[T] {
    
    def getSource(): Buffer
  }
  object TransformResultWithSource {
    
    inline def apply[T](dependencies: js.Array[TransformResultDependency], getSource: () => Buffer, output: js.Array[T]): TransformResultWithSource[T] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], getSource = js.Any.fromFunction0(getSource), output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResultWithSource[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformResultWithSource[?], T] (val x: Self & TransformResultWithSource[T]) extends AnyVal {
      
      inline def setGetSource(value: () => Buffer): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    }
  }
}
