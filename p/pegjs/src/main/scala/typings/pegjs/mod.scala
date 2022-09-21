package typings.pegjs

import org.scalablytyped.runtime.StringDictionary
import typings.pegjs.pegjsStrings.amd
import typings.pegjs.pegjsStrings.bare
import typings.pegjs.pegjsStrings.commonjs
import typings.pegjs.pegjsStrings.globals
import typings.pegjs.pegjsStrings.parser
import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.source
import typings.pegjs.pegjsStrings.speed
import typings.pegjs.pegjsStrings.umd
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pegjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pegjs", "GrammarError")
  @js.native
  def GrammarError: Any = js.native
  type GrammarError = PegjsError
  inline def GrammarError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GrammarError")(x.asInstanceOf[js.Any])
  
  inline def generate(grammar: String): Parser_ = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any]).asInstanceOf[Parser_]
  inline def generate(grammar: String, options: OutputFormatAmdCommonjs): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(grammar: String, options: OutputFormatBare): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(grammar: String, options: OutputFormatGlobals): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(grammar: String, options: OutputFormatUmd): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(grammar: String, options: ParserBuildOptions): Parser_ = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser_]
  
  object parser {
    
    @JSImport("pegjs", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pegjs", "parser.SyntaxError")
    @js.native
    def SyntaxError: Any = js.native
    type SyntaxError = PegjsError
    inline def SyntaxError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
  }
  
  trait BuildOptionsBase extends StObject {
    
    /** rules the parser will be allowed to start parsing from (default: the first rule in the grammar) */
    var allowedStartRules: js.UndefOr[js.Array[String]] = js.undefined
    
    /** if `true`, makes the parser cache results, avoiding exponential parsing time in pathological cases but making the parser slower (default: `false`) */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** selects between optimizing the generated parser for parsing speed (`"speed"`) or code size (`"size"`) (default: `"speed"`) */
    var optimize: js.UndefOr[speed | size] = js.undefined
    
    /** plugins to use */
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** makes the parser trace its progress (default: `false`) */
    var trace: js.UndefOr[Boolean] = js.undefined
  }
  object BuildOptionsBase {
    
    inline def apply(): BuildOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptionsBase]
    }
    
    extension [Self <: BuildOptionsBase](x: Self) {
      
      inline def setAllowedStartRules(value: js.Array[String]): Self = StObject.set(x, "allowedStartRules", value.asInstanceOf[js.Any])
      
      inline def setAllowedStartRulesUndefined: Self = StObject.set(x, "allowedStartRules", js.undefined)
      
      inline def setAllowedStartRulesVarargs(value: String*): Self = StObject.set(x, "allowedStartRules", js.Array(value*))
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setOptimize(value: speed | size): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  trait ExpectedItem extends StObject {
    
    var description: String
    
    var `type`: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ExpectedItem {
    
    inline def apply(description: String, `type`: String): ExpectedItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedItem]
    }
    
    extension [Self <: ExpectedItem](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Location = typings.pegjs.mod.PEG.Location
  
  type LocationRange = typings.pegjs.mod.PEG.LocationRange
  
  trait OutputFormatAmdCommonjs
    extends StObject
       with BuildOptionsBase {
    
    /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
    var dependencies: js.UndefOr[Any] = js.undefined
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: amd | commonjs
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source
  }
  object OutputFormatAmdCommonjs {
    
    inline def apply(format: amd | commonjs): OutputFormatAmdCommonjs = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = "source")
      __obj.asInstanceOf[OutputFormatAmdCommonjs]
    }
    
    extension [Self <: OutputFormatAmdCommonjs](x: Self) {
      
      inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setFormat(value: amd | commonjs): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputFormatBare
    extends StObject
       with BuildOptionsBase {
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: js.UndefOr[bare] = js.undefined
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source
  }
  object OutputFormatBare {
    
    inline def apply(): OutputFormatBare = {
      val __obj = js.Dynamic.literal(output = "source")
      __obj.asInstanceOf[OutputFormatBare]
    }
    
    extension [Self <: OutputFormatBare](x: Self) {
      
      inline def setFormat(value: bare): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputFormatGlobals
    extends StObject
       with BuildOptionsBase {
    
    /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
    var exportVar: js.UndefOr[Any] = js.undefined
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: globals
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source
  }
  object OutputFormatGlobals {
    
    inline def apply(): OutputFormatGlobals = {
      val __obj = js.Dynamic.literal(format = "globals", output = "source")
      __obj.asInstanceOf[OutputFormatGlobals]
    }
    
    extension [Self <: OutputFormatGlobals](x: Self) {
      
      inline def setExportVar(value: Any): Self = StObject.set(x, "exportVar", value.asInstanceOf[js.Any])
      
      inline def setExportVarUndefined: Self = StObject.set(x, "exportVar", js.undefined)
      
      inline def setFormat(value: globals): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputFormatUmd
    extends StObject
       with BuildOptionsBase {
    
    /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
    var dependencies: js.UndefOr[Any] = js.undefined
    
    /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
    var exportVar: js.UndefOr[Any] = js.undefined
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: umd
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source
  }
  object OutputFormatUmd {
    
    inline def apply(): OutputFormatUmd = {
      val __obj = js.Dynamic.literal(format = "umd", output = "source")
      __obj.asInstanceOf[OutputFormatUmd]
    }
    
    extension [Self <: OutputFormatUmd](x: Self) {
      
      inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setExportVar(value: Any): Self = StObject.set(x, "exportVar", value.asInstanceOf[js.Any])
      
      inline def setExportVarUndefined: Self = StObject.set(x, "exportVar", js.undefined)
      
      inline def setFormat(value: umd): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  object PEG {
    
    trait Location extends StObject {
      
      var column: Double
      
      var line: Double
      
      var offset: Double
    }
    object Location {
      
      inline def apply(column: Double, line: Double, offset: Double): typings.pegjs.mod.PEG.Location = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.pegjs.mod.PEG.Location]
      }
      
      extension [Self <: typings.pegjs.mod.PEG.Location](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      }
    }
    
    trait LocationRange extends StObject {
      
      var end: typings.pegjs.mod.PEG.Location
      
      var start: typings.pegjs.mod.PEG.Location
    }
    object LocationRange {
      
      inline def apply(end: typings.pegjs.mod.PEG.Location, start: typings.pegjs.mod.PEG.Location): typings.pegjs.mod.PEG.LocationRange = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.pegjs.mod.PEG.LocationRange]
      }
      
      extension [Self <: typings.pegjs.mod.PEG.LocationRange](x: Self) {
        
        inline def setEnd(value: typings.pegjs.mod.PEG.Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setStart(value: typings.pegjs.mod.PEG.Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    trait SyntaxError extends StObject {
      
      var column: Double
      
      var expected: js.Array[Any]
      
      var found: Any
      
      var line: Double
      
      var location: typings.pegjs.mod.PEG.LocationRange
      
      var message: String
      
      var name: String
      
      var offset: Double
    }
    object SyntaxError {
      
      inline def apply(
        column: Double,
        expected: js.Array[Any],
        found: Any,
        line: Double,
        location: typings.pegjs.mod.PEG.LocationRange,
        message: String,
        name: String,
        offset: Double
      ): SyntaxError = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[SyntaxError]
      }
      
      extension [Self <: SyntaxError](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setExpected(value: js.Array[Any]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
        
        inline def setExpectedVarargs(value: Any*): Self = StObject.set(x, "expected", js.Array(value*))
        
        inline def setFound(value: Any): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
        
        inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: typings.pegjs.mod.PEG.LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait ParserBuildOptions
    extends StObject
       with BuildOptionsBase {
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: js.UndefOr[parser] = js.undefined
  }
  object ParserBuildOptions {
    
    inline def apply(): ParserBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserBuildOptions]
    }
    
    extension [Self <: ParserBuildOptions](x: Self) {
      
      inline def setOutput(value: parser): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait ParserOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var startRule: js.UndefOr[String] = js.undefined
    
    var tracer: js.UndefOr[Any] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
      
      inline def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
      
      inline def setTracer(value: Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
      
      inline def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    }
  }
  
  @js.native
  trait Parser_ extends StObject {
    
    var SyntaxError: Any = js.native
    
    def parse(input: String): Any = js.native
    def parse(input: String, options: ParserOptions): Any = js.native
  }
  
  trait PegjsError
    extends StObject
       with Error {
    
    var expected: js.UndefOr[js.Array[ExpectedItem]] = js.undefined
    
    var found: js.UndefOr[Any] = js.undefined
    
    var location: LocationRange
    
    @JSName("stack")
    var stack_PegjsError: js.UndefOr[Any] = js.undefined
  }
  object PegjsError {
    
    inline def apply(location: LocationRange, message: String, name: String): PegjsError = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PegjsError]
    }
    
    extension [Self <: PegjsError](x: Self) {
      
      inline def setExpected(value: js.Array[ExpectedItem]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setExpectedVarargs(value: ExpectedItem*): Self = StObject.set(x, "expected", js.Array(value*))
      
      inline def setFound(value: Any): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
      
      inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setStack(value: Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
