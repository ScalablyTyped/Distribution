package typings.node

import typings.node.NodeJS.Dict
import typings.node.anon.JsMemoryEstimate
import typings.node.anon.Strings
import typings.node.nodeStrings.afterEvaluate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vmMod {
  
  @JSImport("vm", "Script")
  @js.native
  class Script protected () extends StObject {
    def this(code: java.lang.String) = this()
    def this(code: java.lang.String, options: ScriptOptions) = this()
    
    def createCachedData(): Buffer = js.native
    
    def runInContext(contextifiedSandbox: Context): js.Any = js.native
    def runInContext(contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
    
    def runInNewContext(): js.Any = js.native
    def runInNewContext(sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = js.native
    def runInNewContext(sandbox: Context): js.Any = js.native
    def runInNewContext(sandbox: Context, options: RunningScriptOptions): js.Any = js.native
    
    def runInThisContext(): js.Any = js.native
    def runInThisContext(options: RunningScriptOptions): js.Any = js.native
  }
  
  @JSImport("vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String): js.Function = js.native
  @JSImport("vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String, params: js.UndefOr[scala.Nothing], options: CompileFunctionOptions): js.Function = js.native
  @JSImport("vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String]): js.Function = js.native
  @JSImport("vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String], options: CompileFunctionOptions): js.Function = js.native
  
  @JSImport("vm", "createContext")
  @js.native
  def createContext(): Context = js.native
  @JSImport("vm", "createContext")
  @js.native
  def createContext(sandbox: js.UndefOr[scala.Nothing], options: CreateContextOptions): Context = js.native
  @JSImport("vm", "createContext")
  @js.native
  def createContext(sandbox: Context): Context = js.native
  @JSImport("vm", "createContext")
  @js.native
  def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
  
  @JSImport("vm", "isContext")
  @js.native
  def isContext(sandbox: Context): Boolean = js.native
  
  /**
    * Measure the memory known to V8 and used by the current execution context or a specified context.
    *
    * The format of the object that the returned Promise may resolve with is
    * specific to the V8 engine and may change from one version of V8 to the next.
    *
    * The returned result is different from the statistics returned by
    * `v8.getHeapSpaceStatistics()` in that `vm.measureMemory()` measures
    * the memory reachable by V8 from a specific context, while
    * `v8.getHeapSpaceStatistics()` measures the memory used by an instance
    * of V8 engine, which can switch among multiple contexts that reference
    * objects in the heap of one engine.
    *
    * @experimental
    */
  @JSImport("vm", "measureMemory")
  @js.native
  def measureMemory(): js.Promise[MemoryMeasurement] = js.native
  @JSImport("vm", "measureMemory")
  @js.native
  def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = js.native
  
  @JSImport("vm", "runInContext")
  @js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context): js.Any = js.native
  @JSImport("vm", "runInContext")
  @js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: java.lang.String): js.Any = js.native
  @JSImport("vm", "runInContext")
  @js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String): js.Any = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: js.UndefOr[scala.Nothing], options: java.lang.String): js.Any = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: Context): js.Any = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: java.lang.String): js.Any = js.native
  @JSImport("vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  @JSImport("vm", "runInThisContext")
  @js.native
  def runInThisContext(code: java.lang.String): js.Any = js.native
  @JSImport("vm", "runInThisContext")
  @js.native
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = js.native
  @JSImport("vm", "runInThisContext")
  @js.native
  def runInThisContext(code: java.lang.String, options: RunningScriptOptions): js.Any = js.native
  
  @js.native
  trait BaseOptions extends StObject {
    
    /**
      * Specifies the column number offset that is displayed in stack traces produced by this script.
      * Default: `0`
      */
    var columnOffset: js.UndefOr[Double] = js.native
    
    /**
      * Specifies the filename used in stack traces produced by this script.
      * Default: `''`.
      */
    var filename: js.UndefOr[java.lang.String] = js.native
    
    /**
      * Specifies the line number offset that is displayed in stack traces produced by this script.
      * Default: `0`.
      */
    var lineOffset: js.UndefOr[Double] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnOffsetUndefined: Self = StObject.set(x, "columnOffset", js.undefined)
      
      @scala.inline
      def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    }
  }
  
  @js.native
  trait CompileFunctionOptions extends BaseOptions {
    
    /**
      * Provides an optional data with V8's code cache data for the supplied source.
      */
    var cachedData: js.UndefOr[Buffer] = js.native
    
    /**
      * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
      */
    var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.native
    
    /**
      * The sandbox/context in which the said function should be compiled in.
      */
    var parsingContext: js.UndefOr[Context] = js.native
    
    /**
      * Specifies whether to produce new cache data.
      * Default: `false`,
      */
    var produceCachedData: js.UndefOr[Boolean] = js.native
  }
  object CompileFunctionOptions {
    
    @scala.inline
    def apply(): CompileFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileFunctionOptions]
    }
    
    @scala.inline
    implicit class CompileFunctionOptionsMutableBuilder[Self <: CompileFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachedData(value: Buffer): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
      
      @scala.inline
      def setContextExtensions(value: js.Array[js.Object]): Self = StObject.set(x, "contextExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextExtensionsUndefined: Self = StObject.set(x, "contextExtensions", js.undefined)
      
      @scala.inline
      def setContextExtensionsVarargs(value: js.Object*): Self = StObject.set(x, "contextExtensions", js.Array(value :_*))
      
      @scala.inline
      def setParsingContext(value: Context): Self = StObject.set(x, "parsingContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsingContextUndefined: Self = StObject.set(x, "parsingContext", js.undefined)
      
      @scala.inline
      def setProduceCachedData(value: Boolean): Self = StObject.set(x, "produceCachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduceCachedDataUndefined: Self = StObject.set(x, "produceCachedData", js.undefined)
    }
  }
  
  type Context = Dict[js.Any]
  
  @js.native
  trait CreateContextOptions extends StObject {
    
    var codeGeneration: js.UndefOr[Strings] = js.native
    
    /**
      * Human-readable name of the newly created context.
      * @default 'VM Context i' Where i is an ascending numerical index of the created context.
      */
    var name: js.UndefOr[java.lang.String] = js.native
    
    /**
      * Corresponds to the newly created context for display purposes.
      * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
      * like the value of the `url.origin` property of a URL object.
      * Most notably, this string should omit the trailing slash, as that denotes a path.
      * @default ''
      */
    var origin: js.UndefOr[java.lang.String] = js.native
  }
  object CreateContextOptions {
    
    @scala.inline
    def apply(): CreateContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateContextOptions]
    }
    
    @scala.inline
    implicit class CreateContextOptionsMutableBuilder[Self <: CreateContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeGeneration(value: Strings): Self = StObject.set(x, "codeGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeGenerationUndefined: Self = StObject.set(x, "codeGeneration", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.summary
    - typings.node.nodeStrings.detailed
  */
  trait MeasureMemoryMode extends StObject
  object MeasureMemoryMode {
    
    @scala.inline
    def detailed: typings.node.nodeStrings.detailed = "detailed".asInstanceOf[typings.node.nodeStrings.detailed]
    
    @scala.inline
    def summary: typings.node.nodeStrings.summary = "summary".asInstanceOf[typings.node.nodeStrings.summary]
  }
  
  @js.native
  trait MeasureMemoryOptions extends StObject {
    
    var context: js.UndefOr[Context] = js.native
    
    /**
      * @default 'summary'
      */
    var mode: js.UndefOr[MeasureMemoryMode] = js.native
  }
  object MeasureMemoryOptions {
    
    @scala.inline
    def apply(): MeasureMemoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeasureMemoryOptions]
    }
    
    @scala.inline
    implicit class MeasureMemoryOptionsMutableBuilder[Self <: MeasureMemoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setMode(value: MeasureMemoryMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait MemoryMeasurement extends StObject {
    
    var total: JsMemoryEstimate = js.native
  }
  object MemoryMeasurement {
    
    @scala.inline
    def apply(total: JsMemoryEstimate): MemoryMeasurement = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryMeasurement]
    }
    
    @scala.inline
    implicit class MemoryMeasurementMutableBuilder[Self <: MemoryMeasurement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotal(value: JsMemoryEstimate): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunningScriptOptions extends BaseOptions {
    
    /**
      * If `true`, the execution will be terminated when `SIGINT` (Ctrl+C) is received.
      * Existing handlers for the event that have been attached via `process.on('SIGINT')` will be disabled during script execution, but will continue to work after that.
      * If execution is terminated, an `Error` will be thrown.
      * Default: `false`.
      */
    var breakOnSigint: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true`, if an `Error` occurs while compiling the `code`, the line of code causing the error is attached to the stack trace.
      * Default: `true`.
      */
    var displayErrors: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `afterEvaluate`, microtasks will be run immediately after the script has run.
      */
    var microtaskMode: js.UndefOr[afterEvaluate] = js.native
    
    /**
      * Specifies the number of milliseconds to execute code before terminating execution.
      * If execution is terminated, an `Error` will be thrown. This value must be a strictly positive integer.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object RunningScriptOptions {
    
    @scala.inline
    def apply(): RunningScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunningScriptOptions]
    }
    
    @scala.inline
    implicit class RunningScriptOptionsMutableBuilder[Self <: RunningScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakOnSigint(value: Boolean): Self = StObject.set(x, "breakOnSigint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakOnSigintUndefined: Self = StObject.set(x, "breakOnSigint", js.undefined)
      
      @scala.inline
      def setDisplayErrors(value: Boolean): Self = StObject.set(x, "displayErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayErrorsUndefined: Self = StObject.set(x, "displayErrors", js.undefined)
      
      @scala.inline
      def setMicrotaskMode(value: afterEvaluate): Self = StObject.set(x, "microtaskMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicrotaskModeUndefined: Self = StObject.set(x, "microtaskMode", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ScriptOptions extends BaseOptions {
    
    var cachedData: js.UndefOr[Buffer] = js.native
    
    var displayErrors: js.UndefOr[Boolean] = js.native
    
    var produceCachedData: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ScriptOptions {
    
    @scala.inline
    def apply(): ScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScriptOptions]
    }
    
    @scala.inline
    implicit class ScriptOptionsMutableBuilder[Self <: ScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachedData(value: Buffer): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
      
      @scala.inline
      def setDisplayErrors(value: Boolean): Self = StObject.set(x, "displayErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayErrorsUndefined: Self = StObject.set(x, "displayErrors", js.undefined)
      
      @scala.inline
      def setProduceCachedData(value: Boolean): Self = StObject.set(x, "produceCachedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduceCachedDataUndefined: Self = StObject.set(x, "produceCachedData", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
