package typings.nunjucks

import typings.nunjucks.anon.Async
import typings.nunjucks.anon.Autoescape
import typings.nunjucks.anon.BlockEnd
import typings.nunjucks.anon.Name
import typings.nunjucks.mod.lib.TemplateError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nunjucks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nunjucks", "Environment")
  @js.native
  class Environment () extends StObject {
    def this(loader: js.Array[ILoader]) = this()
    def this(loader: ILoader) = this()
    def this(loader: js.Array[ILoader], opts: ConfigureOptions) = this()
    def this(loader: Null, opts: ConfigureOptions) = this()
    def this(loader: Unit, opts: ConfigureOptions) = this()
    def this(loader: ILoader, opts: ConfigureOptions) = this()
    
    def addExtension(name: String, ext: Extension): Environment = js.native
    
    def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, js.Any]): Environment = js.native
    def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, js.Any], async: Boolean): Environment = js.native
    
    def addGlobal(name: String, value: js.Any): Environment = js.native
    
    def express(app: js.Object): Unit = js.native
    
    def getExtension(name: String): Extension = js.native
    
    def getFilter(name: String): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    def getGlobal(name: String): js.Any = js.native
    
    def getTemplate(name: String): Unit = js.native
    def getTemplate(name: String, eagerCompile: Boolean): Unit = js.native
    def getTemplate(name: String, eagerCompile: Boolean, callback: Callback[Error, Template]): Unit = js.native
    def getTemplate(name: String, eagerCompile: Unit, callback: Callback[Error, Template]): Unit = js.native
    @JSName("getTemplate")
    def getTemplate_Template(name: String): Template = js.native
    @JSName("getTemplate")
    def getTemplate_Template(name: String, eagerCompile: Boolean): Template = js.native
    
    def hasExtension(name: String): Boolean = js.native
    
    var options: Autoescape = js.native
    
    def removeExtension(name: String): Unit = js.native
    
    def render(name: String): String = js.native
    def render(name: String, context: js.Object): String = js.native
    def render(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
    def render(name: String, context: Unit, callback: TemplateCallback[String]): Unit = js.native
    
    def renderString(name: String, context: js.Object): String = js.native
    def renderString(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = js.native
    @JSName("renderString")
    def renderString_Unit(name: String, context: js.Object): Unit = js.native
    
    @JSName("render")
    def render_Unit(name: String): Unit = js.native
    @JSName("render")
    def render_Unit(name: String, context: js.Object): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nunjucks.mod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "FileSystemLoader")
  @js.native
  class FileSystemLoader () extends Loader {
    def this(searchPaths: String) = this()
    def this(searchPaths: js.Array[String]) = this()
    def this(searchPaths: String, opts: FileSystemLoaderOptions) = this()
    def this(searchPaths: js.Array[String], opts: FileSystemLoaderOptions) = this()
    def this(searchPaths: Unit, opts: FileSystemLoaderOptions) = this()
    
    var async: js.UndefOr[Boolean] = js.native
    
    def getSource(name: String): LoaderSource = js.native
    def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
    
    def init(searchPaths: js.Array[String], opts: js.Any): Unit = js.native
  }
  
  @JSImport("nunjucks", "Loader")
  @js.native
  class Loader () extends StObject {
    
    def emit(name: String, args: js.Any*): Unit = js.native
    
    def extend(toExtend: ILoader): ILoader = js.native
    
    def isRelative(filename: String): Boolean = js.native
    
    def on(name: String, func: js.Function1[/* repeated */ js.Any, js.Any]): Unit = js.native
    
    def resolve(from: String, to: String): String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nunjucks.mod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "PrecompiledLoader")
  @js.native
  class PrecompiledLoader () extends Loader {
    
    var async: js.UndefOr[Boolean] = js.native
    
    def getSource(name: String): LoaderSource = js.native
    def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
    
    def init(searchPaths: js.Array[String], opts: js.Any): Unit = js.native
  }
  
  @JSImport("nunjucks", "Template")
  @js.native
  class Template protected () extends StObject {
    def this(src: String) = this()
    def this(src: String, env: Environment) = this()
    def this(src: String, env: Unit, eagerCompile: Boolean) = this()
    def this(src: String, env: Environment, eagerCompile: Boolean) = this()
    
    def render(): String = js.native
    def render(context: js.Object): String = js.native
    def render(context: js.Object, callback: TemplateCallback[String]): Unit = js.native
    def render(context: Unit, callback: TemplateCallback[String]): Unit = js.native
    @JSName("render")
    def render_Unit(): Unit = js.native
    @JSName("render")
    def render_Unit(context: js.Object): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nunjucks.mod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "WebLoader")
  @js.native
  class WebLoader protected () extends Loader {
    def this(baseUrl: String) = this()
    def this(baseUrl: String, opts: js.Any) = this()
    
    var async: js.UndefOr[Boolean] = js.native
    
    def getSource(name: String): LoaderSource = js.native
    def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
  }
  
  inline def compile(src: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any]).asInstanceOf[Template]
  inline def compile(src: String, env: Unit, callback: TemplateCallback[Template]): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], env.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Template]
  inline def compile(src: String, env: Environment): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Template]
  inline def compile(src: String, env: Environment, callback: TemplateCallback[Template]): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], env.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Template]
  
  inline def configure(options: ConfigureOptions): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Environment]
  inline def configure(path: String): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(path.asInstanceOf[js.Any]).asInstanceOf[Environment]
  inline def configure(path: String, options: ConfigureOptions): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Environment]
  inline def configure(path: js.Array[String]): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(path.asInstanceOf[js.Any]).asInstanceOf[Environment]
  inline def configure(path: js.Array[String], options: ConfigureOptions): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Environment]
  
  inline def installJinjaCompat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installJinjaCompat")().asInstanceOf[Unit]
  
  object lib {
    
    @JSImport("nunjucks", "lib.TemplateError")
    @js.native
    class TemplateError protected ()
      extends StObject
         with Error {
      def this(message: String, lineno: Double, colno: Double) = this()
      
      var cause: js.UndefOr[Error] = js.native
      
      var colno: Double = js.native
      
      var lineno: Double = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      @JSName("stack")
      var stack_TemplateError: String = js.native
    }
  }
  
  inline def precompile(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def precompile(path: String, opts: PrecompileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def precompileString(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("precompileString")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def precompileString(src: String, opts: PrecompileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("precompileString")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def render(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(name: String, context: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(name: String, context: js.Object, callback: TemplateCallback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(name: String, context: Unit, callback: TemplateCallback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderString(src: String, context: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderString")(src.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def renderString(src: String, context: js.Object, callback: TemplateCallback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderString")(src.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderString_Unit(src: String, context: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderString")(src.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def render_Unit(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def render_Unit(name: String, context: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object runtime {
    
    @JSImport("nunjucks", "runtime.SafeString")
    @js.native
    class SafeString protected () extends StObject {
      def this(`val`: String) = this()
      
      var length: Double = js.native
      
      var `val`: String = js.native
    }
  }
  
  type Callback[E, T] = js.Function2[/* err */ E | Null, /* res */ T | Null, Unit]
  
  trait ConfigureOptions extends StObject {
    
    var autoescape: js.UndefOr[Boolean] = js.undefined
    
    var express: js.UndefOr[js.Object] = js.undefined
    
    var lstripBlocks: js.UndefOr[Boolean] = js.undefined
    
    var noCache: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.UndefOr[BlockEnd] = js.undefined
    
    var throwOnUndefined: js.UndefOr[Boolean] = js.undefined
    
    var trimBlocks: js.UndefOr[Boolean] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
    
    var web: js.UndefOr[Async] = js.undefined
  }
  object ConfigureOptions {
    
    inline def apply(): ConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    extension [Self <: ConfigureOptions](x: Self) {
      
      inline def setAutoescape(value: Boolean): Self = StObject.set(x, "autoescape", value.asInstanceOf[js.Any])
      
      inline def setAutoescapeUndefined: Self = StObject.set(x, "autoescape", js.undefined)
      
      inline def setExpress(value: js.Object): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      inline def setExpressUndefined: Self = StObject.set(x, "express", js.undefined)
      
      inline def setLstripBlocks(value: Boolean): Self = StObject.set(x, "lstripBlocks", value.asInstanceOf[js.Any])
      
      inline def setLstripBlocksUndefined: Self = StObject.set(x, "lstripBlocks", js.undefined)
      
      inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      inline def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      inline def setTags(value: BlockEnd): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setThrowOnUndefined(value: Boolean): Self = StObject.set(x, "throwOnUndefined", value.asInstanceOf[js.Any])
      
      inline def setThrowOnUndefinedUndefined: Self = StObject.set(x, "throwOnUndefined", js.undefined)
      
      inline def setTrimBlocks(value: Boolean): Self = StObject.set(x, "trimBlocks", value.asInstanceOf[js.Any])
      
      inline def setTrimBlocksUndefined: Self = StObject.set(x, "trimBlocks", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWeb(value: Async): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
  
  trait Extension extends StObject {
    
    // Parser API is undocumented it is suggested to check the source: https://github.com/mozilla/nunjucks/blob/master/src/parser.js
    def parse(parser: js.Any, nodes: js.Any, lexer: js.Any): js.Any
    
    var tags: js.Array[String]
  }
  object Extension {
    
    inline def apply(parse: (js.Any, js.Any, js.Any) => js.Any, tags: js.Array[String]): Extension = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3(parse), tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setParse(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait FileSystemLoaderOptions extends StObject {
    
    /**  if true, the system will avoid using a cache and templates will be recompiled every single time */
    var noCache: js.UndefOr[Boolean] = js.undefined
    
    /** if true, the system will automatically update templates when they are changed on the filesystem */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object FileSystemLoaderOptions {
    
    inline def apply(): FileSystemLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemLoaderOptions]
    }
    
    extension [Self <: FileSystemLoaderOptions](x: Self) {
      
      inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      inline def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  @js.native
  trait ILoader extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var extend: js.UndefOr[js.Function1[/* extender */ this.type, this.type]] = js.native
    
    def getSource(name: String): LoaderSource = js.native
    def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
  }
  
  trait LoaderSource extends StObject {
    
    var noCache: Boolean
    
    var path: String
    
    var src: String
  }
  object LoaderSource {
    
    inline def apply(noCache: Boolean, path: String, src: String): LoaderSource = {
      val __obj = js.Dynamic.literal(noCache = noCache.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderSource]
    }
    
    extension [Self <: LoaderSource](x: Self) {
      
      inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrecompileOptions extends StObject {
    
    var asFunction: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Environment] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var wrapper: js.UndefOr[js.Function2[/* templates */ Name, /* opts */ this.type, String]] = js.undefined
  }
  object PrecompileOptions {
    
    inline def apply(): PrecompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrecompileOptions]
    }
    
    extension [Self <: PrecompileOptions](x: Self) {
      
      inline def setAsFunction(value: Boolean): Self = StObject.set(x, "asFunction", value.asInstanceOf[js.Any])
      
      inline def setAsFunctionUndefined: Self = StObject.set(x, "asFunction", js.undefined)
      
      inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWrapper(value: (/* templates */ Name, PrecompileOptions) => String): Self = StObject.set(x, "wrapper", js.Any.fromFunction2(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type TemplateCallback[T] = js.Function2[/* err */ TemplateError | Null, /* res */ T | Null, Unit]
}
