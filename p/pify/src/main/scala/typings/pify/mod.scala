package typings.pify

import typings.pify.pifyBooleans.`false`
import typings.pify.pifyBooleans.`true`
import typings.std.PromiseConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FirstArgument, Arguments /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */](input: js.Function2[/* argument */ FirstArgument, /* arguments_ */ Arguments, Any]): Promisify[
    /* import warning: importer.ImportType#apply c repeated non-array type: Arguments */ js.Array[Arguments], 
    InternalOptions[js.Array[Any], js.Array[Any], MultiArgs, ErrorFirst]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Promisify[
    /* import warning: importer.ImportType#apply c repeated non-array type: Arguments */ js.Array[Arguments], 
    InternalOptions[js.Array[Any], js.Array[Any], MultiArgs, ErrorFirst]
  ]]
  inline def default[Module /* <: Record[String, Any] */, Includes /* <: js.Array[/* keyof Module */ String] */, Excludes /* <: js.Array[/* keyof Module */ String] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */](// eslint-disable-next-line unicorn/prefer-module
  module: Module): PromisifyModule[Module, MultiArgs, ErrorFirst, Includes, Excludes] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(module.asInstanceOf[js.Any]).asInstanceOf[PromisifyModule[Module, MultiArgs, ErrorFirst, Includes, Excludes]]
  
  inline def default_false[FirstArgument, Arguments /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */](
    input: js.Function2[/* argument */ FirstArgument, /* arguments_ */ Arguments, Any],
    options: Options[js.Array[Any], js.Array[Any], MultiArgs, ErrorFirst, `false`]
  ): Promisify[
    /* import warning: importer.ImportType#apply c repeated non-array type: Arguments */ js.Array[Arguments], 
    InternalOptions[js.Array[Any], js.Array[Any], MultiArgs, ErrorFirst]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promisify[
    /* import warning: importer.ImportType#apply c repeated non-array type: Arguments */ js.Array[Arguments], 
    InternalOptions[js.Array[Any], js.Array[Any], MultiArgs, ErrorFirst]
  ]]
  
  inline def default_true[Module /* <: Record[String, Any] */, Includes /* <: js.Array[/* keyof Module */ String] */, Excludes /* <: js.Array[/* keyof Module */ String] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */](
    // eslint-disable-next-line unicorn/prefer-module
  module: Module,
    options: Options[Includes, Excludes, MultiArgs, ErrorFirst, `true`]
  ): PromisifyModule[Module, MultiArgs, ErrorFirst, Includes, Excludes] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(module.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromisifyModule[Module, MultiArgs, ErrorFirst, Includes, Excludes]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [...infer U, unknown] ? U : []
    }}}
    */
  type DropLastArrayElement[T /* <: js.Array[Any] */] = js.Array[Any]
  
  trait InternalOptions[Includes /* <: js.Array[Any] */, Excludes /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */] extends StObject {
    
    var errorFirst: ErrorFirst
    
    var exclude: Excludes
    
    var include: Includes
    
    var multiArgs: MultiArgs
  }
  object InternalOptions {
    
    inline def apply[Includes /* <: js.Array[Any] */, Excludes /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */](errorFirst: ErrorFirst, exclude: Excludes, include: Includes, multiArgs: MultiArgs): InternalOptions[Includes, Excludes, MultiArgs, ErrorFirst] = {
      val __obj = js.Dynamic.literal(errorFirst = errorFirst.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], multiArgs = multiArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions[Includes, Excludes, MultiArgs, ErrorFirst]]
    }
    
    extension [Self <: InternalOptions[?, ?, ?, ?], Includes /* <: js.Array[Any] */, Excludes /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */](x: Self & (InternalOptions[Includes, Excludes, MultiArgs, ErrorFirst])) {
      
      inline def setErrorFirst(value: ErrorFirst): Self = StObject.set(x, "errorFirst", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: Excludes): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setInclude(value: Includes): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setMultiArgs(value: MultiArgs): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [...any, infer L] ? L : never
    }}}
    */
  @js.native
  trait LastArrayElement[T /* <: js.Array[Any] */] extends StObject
  
  trait Options[Includes /* <: js.Array[Any] */, Excludes /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */, ExcludeMain /* <: Boolean */] extends StObject {
    
    var errorFirst: js.UndefOr[ErrorFirst] = js.undefined
    
    var exclude: js.UndefOr[Excludes] = js.undefined
    
    var excludeMain: js.UndefOr[ExcludeMain] = js.undefined
    
    var include: js.UndefOr[Includes] = js.undefined
    
    var multiArgs: js.UndefOr[MultiArgs] = js.undefined
    
    var promiseModule: js.UndefOr[PromiseConstructor] = js.undefined
  }
  object Options {
    
    inline def apply[Includes /* <: js.Array[Any] */, Excludes /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */, ExcludeMain /* <: Boolean */](): Options[Includes, Excludes, MultiArgs, ErrorFirst, ExcludeMain] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Includes, Excludes, MultiArgs, ErrorFirst, ExcludeMain]]
    }
    
    extension [Self <: Options[?, ?, ?, ?, ?], Includes /* <: js.Array[Any] */, Excludes /* <: js.Array[Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */, ExcludeMain /* <: Boolean */](x: Self & (Options[Includes, Excludes, MultiArgs, ErrorFirst, ExcludeMain])) {
      
      inline def setErrorFirst(value: ErrorFirst): Self = StObject.set(x, "errorFirst", value.asInstanceOf[js.Any])
      
      inline def setErrorFirstUndefined: Self = StObject.set(x, "errorFirst", js.undefined)
      
      inline def setExclude(value: Excludes): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeMain(value: ExcludeMain): Self = StObject.set(x, "excludeMain", value.asInstanceOf[js.Any])
      
      inline def setExcludeMainUndefined: Self = StObject.set(x, "excludeMain", js.undefined)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setInclude(value: Includes): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setMultiArgs(value: MultiArgs): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      inline def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
      
      inline def setPromiseModule(value: PromiseConstructor): Self = StObject.set(x, "promiseModule", value.asInstanceOf[js.Any])
      
      inline def setPromiseModuleUndefined: Self = StObject.set(x, "promiseModule", js.undefined)
    }
  }
  
  type Promisify[Args /* <: js.Array[Any] */, GenericOptions /* <: InternalOptions[js.Array[Any], js.Array[Any], Boolean, Boolean] */] = js.Function1[
    /* args */ DropLastArrayElement[Args], 
    /* import warning: importer.ImportType#apply Failed type conversion: pify.pify.LastArrayElement<Args> extends (arguments_ : any): any ? std.Parameters<pify.pify.LastArrayElement<Args>> extends [infer SingleCallbackArg] ? GenericOptions extends {  errorFirst :true} ? std.Promise<unknown> : std.Promise<SingleCallbackArg> : std.Promise<GenericOptions extends {  multiArgs :false} ? pify.pify.LastArrayElement<std.Parameters<pify.pify.LastArrayElement<Args>>> : std.Parameters<pify.pify.LastArrayElement<Args>>> : std.Promise<unknown> */ js.Any
  ]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof Module ]: Module[K] extends (arguments_ : infer Arguments): any? K extends Includes[number]? pify.pify.Promisify<Arguments, pify.pify.InternalOptions<Includes, Excludes, MultiArgs, true>> : K extends Excludes[number]? Module[K] : pify.pify.StringEndsWith<K, 'Sync' | 'Stream'> extends true? Module[K] : pify.pify.Promisify<Arguments, pify.pify.InternalOptions<Includes, Excludes, MultiArgs, ErrorFirst>> : Module[K]}
    }}}
    */
  @js.native
  trait PromisifyModule[Module /* <: Record[String, Any] */, MultiArgs /* <: Boolean */, ErrorFirst /* <: Boolean */, Includes /* <: js.Array[/* keyof Module */ String] */, Excludes /* <: js.Array[/* keyof Module */ String] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${infer_}${X} * / string ? true : false
    }}}
    */
  type StringEndsWith[S, X /* <: String */] = `true`
}
