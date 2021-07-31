package typings.pdf2image

import org.scalablytyped.runtime.Instantiable1
import typings.node.vmMod.CompileFunctionOptions
import typings.node.vmMod.Context
import typings.node.vmMod.CreateContextOptions
import typings.node.vmMod.MeasureMemoryOptions
import typings.node.vmMod.MemoryMeasurement
import typings.node.vmMod.RunningScriptOptions
import typings.pdf2image.mod.OutputFormat
import typings.pdf2image.pdf2imageStrings.Asterisk
import typings.pdf2image.pdf2imageStrings.Dotjpg
import typings.pdf2image.pdf2imageStrings.Dotpng
import typings.pdf2image.pdf2imageStrings.jpg
import typings.pdf2image.pdf2imageStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<pdf2image.pdf2image.Options> */
  trait PartialOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var density: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var outputFormat: js.UndefOr[OutputFormat] = js.undefined
    
    var outputType: js.UndefOr[jpg | png | Dotjpg | Dotpng] = js.undefined
    
    var pages: js.UndefOr[Asterisk | String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var singleProcess: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatFunction7(
        value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
      ): Self = StObject.set(x, "outputFormat", js.Any.fromFunction7(value))
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      @scala.inline
      def setOutputType(value: jpg | png | Dotjpg | Dotpng): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      @scala.inline
      def setPages(value: Asterisk | String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSingleProcess(value: Boolean): Self = StObject.set(x, "singleProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleProcessUndefined: Self = StObject.set(x, "singleProcess", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TypeofimportedVm extends StObject {
    
    var Script: Instantiable1[/* code */ String, typings.node.vmMod.Script] = js.native
    
    def compileFunction(code: String): js.Function = js.native
    def compileFunction(code: String, params: js.Array[String]): js.Function = js.native
    def compileFunction(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
    def compileFunction(code: String, params: Unit, options: CompileFunctionOptions): js.Function = js.native
    
    def createContext(): Context = js.native
    def createContext(sandbox: Unit, options: CreateContextOptions): Context = js.native
    def createContext(sandbox: Context): Context = js.native
    def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
    
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
    def measureMemory(): js.Promise[MemoryMeasurement] = js.native
    def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = js.native
    
    def runInContext(code: String, contextifiedSandbox: Context): js.Any = js.native
    def runInContext(code: String, contextifiedSandbox: Context, options: String): js.Any = js.native
    def runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
    
    def runInNewContext(code: String): js.Any = js.native
    def runInNewContext(code: String, sandbox: Unit, options: String): js.Any = js.native
    def runInNewContext(code: String, sandbox: Unit, options: RunningScriptOptions): js.Any = js.native
    def runInNewContext(code: String, sandbox: Context): js.Any = js.native
    def runInNewContext(code: String, sandbox: Context, options: String): js.Any = js.native
    def runInNewContext(code: String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
    
    def runInThisContext(code: String): js.Any = js.native
    def runInThisContext(code: String, options: String): js.Any = js.native
    def runInThisContext(code: String, options: RunningScriptOptions): js.Any = js.native
  }
}
