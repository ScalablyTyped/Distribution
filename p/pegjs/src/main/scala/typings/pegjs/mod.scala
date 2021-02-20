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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pegjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pegjs", "GrammarError")
  @js.native
  def GrammarError: js.Any = js.native
  type GrammarError = PegjsError
  @scala.inline
  def GrammarError_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GrammarError")(x.asInstanceOf[js.Any])
  
  @JSImport("pegjs", "generate")
  @js.native
  def generate(grammar: String): Parser_ = js.native
  @JSImport("pegjs", "generate")
  @js.native
  def generate(grammar: String, options: OutputFormatAmdCommonjs): String = js.native
  @JSImport("pegjs", "generate")
  @js.native
  def generate(grammar: String, options: OutputFormatBare): String = js.native
  @JSImport("pegjs", "generate")
  @js.native
  def generate(grammar: String, options: OutputFormatGlobals): String = js.native
  @JSImport("pegjs", "generate")
  @js.native
  def generate(grammar: String, options: OutputFormatUmd): String = js.native
  @JSImport("pegjs", "generate")
  @js.native
  def generate(grammar: String, options: ParserBuildOptions): Parser_ = js.native
  
  object parser {
    
    @JSImport("pegjs", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pegjs", "parser.SyntaxError")
    @js.native
    def SyntaxError: js.Any = js.native
    type SyntaxError = PegjsError
    @scala.inline
    def SyntaxError_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BuildOptionsBase extends StObject {
    
    /** rules the parser will be allowed to start parsing from (default: the first rule in the grammar) */
    var allowedStartRules: js.UndefOr[js.Array[String]] = js.native
    
    /** if `true`, makes the parser cache results, avoiding exponential parsing time in pathological cases but making the parser slower (default: `false`) */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** selects between optimizing the generated parser for parsing speed (`"speed"`) or code size (`"size"`) (default: `"speed"`) */
    var optimize: js.UndefOr[speed | size] = js.native
    
    /** plugins to use */
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    /** makes the parser trace its progress (default: `false`) */
    var trace: js.UndefOr[Boolean] = js.native
  }
  object BuildOptionsBase {
    
    @scala.inline
    def apply(): BuildOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptionsBase]
    }
    
    @scala.inline
    implicit class BuildOptionsBaseMutableBuilder[Self <: BuildOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedStartRules(value: js.Array[String]): Self = StObject.set(x, "allowedStartRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedStartRulesUndefined: Self = StObject.set(x, "allowedStartRules", js.undefined)
      
      @scala.inline
      def setAllowedStartRulesVarargs(value: String*): Self = StObject.set(x, "allowedStartRules", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setOptimize(value: speed | size): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  @js.native
  trait ExpectedItem extends StObject {
    
    var description: String = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object ExpectedItem {
    
    @scala.inline
    def apply(description: String, `type`: String): ExpectedItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedItem]
    }
    
    @scala.inline
    implicit class ExpectedItemMutableBuilder[Self <: ExpectedItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Location = typings.pegjs.mod.PEG.Location
  
  type LocationRange = typings.pegjs.mod.PEG.LocationRange
  
  @js.native
  trait OutputFormatAmdCommonjs extends BuildOptionsBase {
    
    /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
    var dependencies: js.UndefOr[js.Any] = js.native
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: amd | commonjs = js.native
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source = js.native
  }
  object OutputFormatAmdCommonjs {
    
    @scala.inline
    def apply(format: amd | commonjs, output: source): OutputFormatAmdCommonjs = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormatAmdCommonjs]
    }
    
    @scala.inline
    implicit class OutputFormatAmdCommonjsMutableBuilder[Self <: OutputFormatAmdCommonjs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setFormat(value: amd | commonjs): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutputFormatBare extends BuildOptionsBase {
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: js.UndefOr[bare] = js.native
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source = js.native
  }
  object OutputFormatBare {
    
    @scala.inline
    def apply(output: source): OutputFormatBare = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormatBare]
    }
    
    @scala.inline
    implicit class OutputFormatBareMutableBuilder[Self <: OutputFormatBare] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: bare): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutputFormatGlobals extends BuildOptionsBase {
    
    /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
    var exportVar: js.UndefOr[js.Any] = js.native
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: globals = js.native
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source = js.native
  }
  object OutputFormatGlobals {
    
    @scala.inline
    def apply(format: globals, output: source): OutputFormatGlobals = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormatGlobals]
    }
    
    @scala.inline
    implicit class OutputFormatGlobalsMutableBuilder[Self <: OutputFormatGlobals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportVar(value: js.Any): Self = StObject.set(x, "exportVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportVarUndefined: Self = StObject.set(x, "exportVar", js.undefined)
      
      @scala.inline
      def setFormat(value: globals): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutputFormatUmd extends BuildOptionsBase {
    
    /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
    var dependencies: js.UndefOr[js.Any] = js.native
    
    /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
    var exportVar: js.UndefOr[js.Any] = js.native
    
    /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
    var format: umd = js.native
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: source = js.native
  }
  object OutputFormatUmd {
    
    @scala.inline
    def apply(format: umd, output: source): OutputFormatUmd = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormatUmd]
    }
    
    @scala.inline
    implicit class OutputFormatUmdMutableBuilder[Self <: OutputFormatUmd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setExportVar(value: js.Any): Self = StObject.set(x, "exportVar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportVarUndefined: Self = StObject.set(x, "exportVar", js.undefined)
      
      @scala.inline
      def setFormat(value: umd): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: source): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  object PEG {
    
    @js.native
    trait Location extends StObject {
      
      var column: Double = js.native
      
      var line: Double = js.native
      
      var offset: Double = js.native
    }
    object Location {
      
      @scala.inline
      def apply(column: Double, line: Double, offset: Double): typings.pegjs.mod.PEG.Location = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.pegjs.mod.PEG.Location]
      }
      
      @scala.inline
      implicit class LocationMutableBuilder[Self <: typings.pegjs.mod.PEG.Location] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait LocationRange extends StObject {
      
      var end: typings.pegjs.mod.PEG.Location = js.native
      
      var start: typings.pegjs.mod.PEG.Location = js.native
    }
    object LocationRange {
      
      @scala.inline
      def apply(end: typings.pegjs.mod.PEG.Location, start: typings.pegjs.mod.PEG.Location): typings.pegjs.mod.PEG.LocationRange = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.pegjs.mod.PEG.LocationRange]
      }
      
      @scala.inline
      implicit class LocationRangeMutableBuilder[Self <: typings.pegjs.mod.PEG.LocationRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: typings.pegjs.mod.PEG.Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: typings.pegjs.mod.PEG.Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SyntaxError extends StObject {
      
      var column: Double = js.native
      
      var expected: js.Array[_] = js.native
      
      var found: js.Any = js.native
      
      var line: Double = js.native
      
      var location: typings.pegjs.mod.PEG.LocationRange = js.native
      
      var message: String = js.native
      
      var name: String = js.native
      
      var offset: Double = js.native
    }
    object SyntaxError {
      
      @scala.inline
      def apply(
        column: Double,
        expected: js.Array[_],
        found: js.Any,
        line: Double,
        location: typings.pegjs.mod.PEG.LocationRange,
        message: String,
        name: String,
        offset: Double
      ): SyntaxError = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[SyntaxError]
      }
      
      @scala.inline
      implicit class SyntaxErrorMutableBuilder[Self <: SyntaxError] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpected(value: js.Array[_]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpectedVarargs(value: js.Any*): Self = StObject.set(x, "expected", js.Array(value :_*))
        
        @scala.inline
        def setFound(value: js.Any): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocation(value: typings.pegjs.mod.PEG.LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ParserBuildOptions extends BuildOptionsBase {
    
    /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
    var output: js.UndefOr[parser] = js.native
  }
  object ParserBuildOptions {
    
    @scala.inline
    def apply(): ParserBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserBuildOptions]
    }
    
    @scala.inline
    implicit class ParserBuildOptionsMutableBuilder[Self <: ParserBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutput(value: parser): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  @js.native
  trait ParserOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var startRule: js.UndefOr[String] = js.native
    
    var tracer: js.UndefOr[js.Any] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
      
      @scala.inline
      def setTracer(value: js.Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    }
  }
  
  @js.native
  trait Parser_ extends StObject {
    
    var SyntaxError: js.Any = js.native
    
    def parse(input: String): js.Any = js.native
    def parse(input: String, options: ParserOptions): js.Any = js.native
  }
  
  @js.native
  trait PegjsError extends Error {
    
    var expected: js.UndefOr[js.Array[ExpectedItem]] = js.native
    
    var found: js.UndefOr[js.Any] = js.native
    
    var location: LocationRange = js.native
    
    @JSName("stack")
    var stack_PegjsError: js.UndefOr[js.Any] = js.native
  }
  object PegjsError {
    
    @scala.inline
    def apply(location: LocationRange, message: String, name: String): PegjsError = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PegjsError]
    }
    
    @scala.inline
    implicit class PegjsErrorMutableBuilder[Self <: PegjsError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpected(value: js.Array[ExpectedItem]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      @scala.inline
      def setExpectedVarargs(value: ExpectedItem*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      @scala.inline
      def setFound(value: js.Any): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
      
      @scala.inline
      def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
