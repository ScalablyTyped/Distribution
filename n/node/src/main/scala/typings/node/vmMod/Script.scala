package typings.node.vmMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances of the `vm.Script` class contain precompiled scripts that can be
  * executed in specific contexts.
  * @since v0.3.1
  */
@JSImport("vm", "Script")
@js.native
open class Script protected () extends StObject {
  def this(code: String) = this()
  def this(code: String, options: String) = this()
  def this(code: String, options: ScriptOptions) = this()
  
  var cachedData: js.UndefOr[Buffer] = js.native
  
  /** @deprecated in favor of `script.createCachedData()` */
  var cachedDataProduced: js.UndefOr[Boolean] = js.native
  
  /**
    * When `cachedData` is supplied to create the `vm.Script`, this value will be set
    * to either `true` or `false` depending on acceptance of the data by V8\.
    * Otherwise the value is `undefined`.
    * @since v5.7.0
    */
  var cachedDataRejected: js.UndefOr[Boolean] = js.native
  
  /**
    * Creates a code cache that can be used with the `Script` constructor's`cachedData` option. Returns a `Buffer`. This method may be called at any
    * time and any number of times.
    *
    * The code cache of the `Script` doesn't contain any JavaScript observable
    * states. The code cache is safe to be saved along side the script source and
    * used to construct new `Script` instances multiple times.
    *
    * Functions in the `Script` source can be marked as lazily compiled and they are
    * not compiled at construction of the `Script`. These functions are going to be
    * compiled when they are invoked the first time. The code cache serializes the
    * metadata that V8 currently knows about the `Script` that it can use to speed up
    * future compilations.
    *
    * ```js
    * const script = new vm.Script(`
    * function add(a, b) {
    *   return a + b;
    * }
    *
    * const x = add(1, 2);
    * `);
    *
    * const cacheWithoutAdd = script.createCachedData();
    * // In `cacheWithoutAdd` the function `add()` is marked for full compilation
    * // upon invocation.
    *
    * script.runInThisContext();
    *
    * const cacheWithAdd = script.createCachedData();
    * // `cacheWithAdd` contains fully compiled function `add()`.
    * ```
    * @since v10.6.0
    */
  def createCachedData(): Buffer = js.native
  
  /**
    * Runs the compiled code contained by the `vm.Script` object within the given`contextifiedObject` and returns the result. Running code does not have access
    * to local scope.
    *
    * The following example compiles code that increments a global variable, sets
    * the value of another global variable, then execute the code multiple times.
    * The globals are contained in the `context` object.
    *
    * ```js
    * const vm = require('node:vm');
    *
    * const context = {
    *   animal: 'cat',
    *   count: 2,
    * };
    *
    * const script = new vm.Script('count += 1; name = "kitty";');
    *
    * vm.createContext(context);
    * for (let i = 0; i < 10; ++i) {
    *   script.runInContext(context);
    * }
    *
    * console.log(context);
    * // Prints: { animal: 'cat', count: 12, name: 'kitty' }
    * ```
    *
    * Using the `timeout` or `breakOnSigint` options will result in new event loops
    * and corresponding threads being started, which have a non-zero performance
    * overhead.
    * @since v0.3.1
    * @param contextifiedObject A `contextified` object as returned by the `vm.createContext()` method.
    * @return the result of the very last statement executed in the script.
    */
  def runInContext(contextifiedObject: Context): Any = js.native
  def runInContext(contextifiedObject: Context, options: RunningScriptOptions): Any = js.native
  
  /**
    * First contextifies the given `contextObject`, runs the compiled code contained
    * by the `vm.Script` object within the created context, and returns the result.
    * Running code does not have access to local scope.
    *
    * The following example compiles code that sets a global variable, then executes
    * the code multiple times in different contexts. The globals are set on and
    * contained within each individual `context`.
    *
    * ```js
    * const vm = require('node:vm');
    *
    * const script = new vm.Script('globalVar = "set"');
    *
    * const contexts = [{}, {}, {}];
    * contexts.forEach((context) => {
    *   script.runInNewContext(context);
    * });
    *
    * console.log(contexts);
    * // Prints: [{ globalVar: 'set' }, { globalVar: 'set' }, { globalVar: 'set' }]
    * ```
    * @since v0.3.1
    * @param contextObject An object that will be `contextified`. If `undefined`, a new object will be created.
    * @return the result of the very last statement executed in the script.
    */
  def runInNewContext(): Any = js.native
  def runInNewContext(contextObject: Unit, options: RunningScriptInNewContextOptions): Any = js.native
  def runInNewContext(contextObject: Context): Any = js.native
  def runInNewContext(contextObject: Context, options: RunningScriptInNewContextOptions): Any = js.native
  
  /**
    * Runs the compiled code contained by the `vm.Script` within the context of the
    * current `global` object. Running code does not have access to local scope, but _does_ have access to the current `global` object.
    *
    * The following example compiles code that increments a `global` variable then
    * executes that code multiple times:
    *
    * ```js
    * const vm = require('node:vm');
    *
    * global.globalVar = 0;
    *
    * const script = new vm.Script('globalVar += 1', { filename: 'myfile.vm' });
    *
    * for (let i = 0; i < 1000; ++i) {
    *   script.runInThisContext();
    * }
    *
    * console.log(globalVar);
    *
    * // 1000
    * ```
    * @since v0.3.1
    * @return the result of the very last statement executed in the script.
    */
  def runInThisContext(): Any = js.native
  def runInThisContext(options: RunningScriptOptions): Any = js.native
  
  /**
    * When the script is compiled from a source that contains a source map magic
    * comment, this property will be set to the URL of the source map.
    *
    * ```js
    * import vm from 'node:vm';
    *
    * const script = new vm.Script(`
    * function myFunc() {}
    * //# sourceMappingURL=sourcemap.json
    * `);
    *
    * console.log(script.sourceMapURL);
    * // Prints: sourcemap.json
    * ```
    * @since v19.1.0, v18.13.0
    */
  var sourceMapURL: js.UndefOr[String] = js.native
}
