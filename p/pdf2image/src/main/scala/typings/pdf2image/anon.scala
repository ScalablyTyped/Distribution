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
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatFunction7(
        value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
      ): Self = StObject.set(x, "outputFormat", js.Any.fromFunction7(value))
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      inline def setOutputType(value: jpg | png | Dotjpg | Dotpng): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      inline def setPages(value: Asterisk | String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSingleProcess(value: Boolean): Self = StObject.set(x, "singleProcess", value.asInstanceOf[js.Any])
      
      inline def setSingleProcessUndefined: Self = StObject.set(x, "singleProcess", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TypeofimportedVm extends StObject {
    
    /**
      * Instances of the `vm.Script` class contain precompiled scripts that can be
      * executed in specific contexts.
      * @since v0.3.1
      */
    var Script: Instantiable1[/* code */ String, typings.node.vmMod.Script] = js.native
    
    /**
      * Compiles the given code into the provided context (if no context is
      * supplied, the current context is used), and returns it wrapped inside a
      * function with the given `params`.
      * @since v10.10.0
      * @param code The body of the function to compile.
      * @param params An array of strings containing all parameters for the function.
      */
    def compileFunction(code: String): js.Function = js.native
    def compileFunction(code: String, params: js.Array[String]): js.Function = js.native
    def compileFunction(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
    def compileFunction(code: String, params: Unit, options: CompileFunctionOptions): js.Function = js.native
    
    /**
      * If given a `contextObject`, the `vm.createContext()` method will `prepare
      * that object` so that it can be used in calls to {@link runInContext} or `script.runInContext()`. Inside such scripts,
      * the `contextObject` will be the global object, retaining all of its existing
      * properties but also having the built-in objects and functions any standard [global object](https://es5.github.io/#x15.1) has. Outside of scripts run by the vm module, global variables
      * will remain unchanged.
      *
      * ```js
      * const vm = require('vm');
      *
      * global.globalVar = 3;
      *
      * const context = { globalVar: 1 };
      * vm.createContext(context);
      *
      * vm.runInContext('globalVar *= 2;', context);
      *
      * console.log(context);
      * // Prints: { globalVar: 2 }
      *
      * console.log(global.globalVar);
      * // Prints: 3
      * ```
      *
      * If `contextObject` is omitted (or passed explicitly as `undefined`), a new,
      * empty `contextified` object will be returned.
      *
      * The `vm.createContext()` method is primarily useful for creating a single
      * context that can be used to run multiple scripts. For instance, if emulating a
      * web browser, the method can be used to create a single context representing a
      * window's global object, then run all `<script>` tags together within that
      * context.
      *
      * The provided `name` and `origin` of the context are made visible through the
      * Inspector API.
      * @since v0.3.1
      * @return contextified object.
      */
    def createContext(): Context = js.native
    def createContext(sandbox: Unit, options: CreateContextOptions): Context = js.native
    def createContext(sandbox: Context): Context = js.native
    def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
    
    /**
      * Returns `true` if the given `object` object has been `contextified` using {@link createContext}.
      * @since v0.11.7
      */
    def isContext(sandbox: Context): Boolean = js.native
    
    /**
      * Measure the memory known to V8 and used by all contexts known to the
      * current V8 isolate, or the main context.
      *
      * The format of the object that the returned Promise may resolve with is
      * specific to the V8 engine and may change from one version of V8 to the next.
      *
      * The returned result is different from the statistics returned by`v8.getHeapSpaceStatistics()` in that `vm.measureMemory()` measure the
      * memory reachable by each V8 specific contexts in the current instance of
      * the V8 engine, while the result of `v8.getHeapSpaceStatistics()` measure
      * the memory occupied by each heap space in the current V8 instance.
      *
      * ```js
      * const vm = require('vm');
      * // Measure the memory used by the main context.
      * vm.measureMemory({ mode: 'summary' })
      *   // This is the same as vm.measureMemory()
      *   .then((result) => {
      *     // The current format is:
      *     // {
      *     //   total: {
      *     //      jsMemoryEstimate: 2418479, jsMemoryRange: [ 2418479, 2745799 ]
      *     //    }
      *     // }
      *     console.log(result);
      *   });
      *
      * const context = vm.createContext({ a: 1 });
      * vm.measureMemory({ mode: 'detailed', execution: 'eager' })
      *   .then((result) => {
      *     // Reference the context here so that it won't be GC'ed
      *     // until the measurement is complete.
      *     console.log(context.a);
      *     // {
      *     //   total: {
      *     //     jsMemoryEstimate: 2574732,
      *     //     jsMemoryRange: [ 2574732, 2904372 ]
      *     //   },
      *     //   current: {
      *     //     jsMemoryEstimate: 2438996,
      *     //     jsMemoryRange: [ 2438996, 2768636 ]
      *     //   },
      *     //   other: [
      *     //     {
      *     //       jsMemoryEstimate: 135736,
      *     //       jsMemoryRange: [ 135736, 465376 ]
      *     //     }
      *     //   ]
      *     // }
      *     console.log(result);
      *   });
      * ```
      * @since v13.10.0
      * @experimental
      */
    def measureMemory(): js.Promise[MemoryMeasurement] = js.native
    def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = js.native
    
    /**
      * The `vm.runInContext()` method compiles `code`, runs it within the context of
      * the `contextifiedObject`, then returns the result. Running code does not have
      * access to the local scope. The `contextifiedObject` object _must_ have been
      * previously `contextified` using the {@link createContext} method.
      *
      * If `options` is a string, then it specifies the filename.
      *
      * The following example compiles and executes different scripts using a single `contextified` object:
      *
      * ```js
      * const vm = require('vm');
      *
      * const contextObject = { globalVar: 1 };
      * vm.createContext(contextObject);
      *
      * for (let i = 0; i < 10; ++i) {
      *   vm.runInContext('globalVar *= 2;', contextObject);
      * }
      * console.log(contextObject);
      * // Prints: { globalVar: 1024 }
      * ```
      * @since v0.3.1
      * @param code The JavaScript code to compile and run.
      * @param contextifiedObject The `contextified` object that will be used as the `global` when the `code` is compiled and run.
      * @return the result of the very last statement executed in the script.
      */
    def runInContext(code: String, contextifiedObject: Context): Any = js.native
    def runInContext(code: String, contextifiedObject: Context, options: String): Any = js.native
    def runInContext(code: String, contextifiedObject: Context, options: RunningScriptOptions): Any = js.native
    
    /**
      * The `vm.runInNewContext()` first contextifies the given `contextObject` (or
      * creates a new `contextObject` if passed as `undefined`), compiles the `code`,
      * runs it within the created context, then returns the result. Running code
      * does not have access to the local scope.
      *
      * If `options` is a string, then it specifies the filename.
      *
      * The following example compiles and executes code that increments a global
      * variable and sets a new one. These globals are contained in the `contextObject`.
      *
      * ```js
      * const vm = require('vm');
      *
      * const contextObject = {
      *   animal: 'cat',
      *   count: 2
      * };
      *
      * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
      * console.log(contextObject);
      * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
      * ```
      * @since v0.3.1
      * @param code The JavaScript code to compile and run.
      * @param contextObject An object that will be `contextified`. If `undefined`, a new object will be created.
      * @return the result of the very last statement executed in the script.
      */
    def runInNewContext(code: String): Any = js.native
    def runInNewContext(code: String, contextObject: Unit, options: String): Any = js.native
    def runInNewContext(code: String, contextObject: Unit, options: RunningScriptOptions): Any = js.native
    def runInNewContext(code: String, contextObject: Context): Any = js.native
    def runInNewContext(code: String, contextObject: Context, options: String): Any = js.native
    def runInNewContext(code: String, contextObject: Context, options: RunningScriptOptions): Any = js.native
    
    /**
      * `vm.runInThisContext()` compiles `code`, runs it within the context of the
      * current `global` and returns the result. Running code does not have access to
      * local scope, but does have access to the current `global` object.
      *
      * If `options` is a string, then it specifies the filename.
      *
      * The following example illustrates using both `vm.runInThisContext()` and
      * the JavaScript [`eval()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval) function to run the same code:
      *
      * ```js
      * const vm = require('vm');
      * let localVar = 'initial value';
      *
      * const vmResult = vm.runInThisContext('localVar = "vm";');
      * console.log(`vmResult: '${vmResult}', localVar: '${localVar}'`);
      * // Prints: vmResult: 'vm', localVar: 'initial value'
      *
      * const evalResult = eval('localVar = "eval";');
      * console.log(`evalResult: '${evalResult}', localVar: '${localVar}'`);
      * // Prints: evalResult: 'eval', localVar: 'eval'
      * ```
      *
      * Because `vm.runInThisContext()` does not have access to the local scope,`localVar` is unchanged. In contrast,
      * [`eval()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval) _does_ have access to the
      * local scope, so the value `localVar` is changed. In this way`vm.runInThisContext()` is much like an [indirect `eval()` call](https://es5.github.io/#x10.4.2), e.g.`(0,eval)('code')`.
      *
      * ## Example: Running an HTTP server within a VM
      *
      * When using either `script.runInThisContext()` or {@link runInThisContext}, the code is executed within the current V8 global
      * context. The code passed to this VM context will have its own isolated scope.
      *
      * In order to run a simple web server using the `http` module the code passed to
      * the context must either call `require('http')` on its own, or have a reference
      * to the `http` module passed to it. For instance:
      *
      * ```js
      * 'use strict';
      * const vm = require('vm');
      *
      * const code = `
      * ((require) => {
      *   const http = require('http');
      *
      *   http.createServer((request, response) => {
      *     response.writeHead(200, { 'Content-Type': 'text/plain' });
      *     response.end('Hello World\\n');
      *   }).listen(8124);
      *
      *   console.log('Server running at http://127.0.0.1:8124/');
      * })`;
      *
      * vm.runInThisContext(code)(require);
      * ```
      *
      * The `require()` in the above case shares the state with the context it is
      * passed from. This may introduce risks when untrusted code is executed, e.g.
      * altering objects in the context in unwanted ways.
      * @since v0.3.1
      * @param code The JavaScript code to compile and run.
      * @return the result of the very last statement executed in the script.
      */
    def runInThisContext(code: String): Any = js.native
    def runInThisContext(code: String, options: String): Any = js.native
    def runInThisContext(code: String, options: RunningScriptOptions): Any = js.native
  }
}
