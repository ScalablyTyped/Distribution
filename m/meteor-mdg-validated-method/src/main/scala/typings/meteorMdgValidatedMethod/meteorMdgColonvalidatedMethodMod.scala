package typings.meteorMdgValidatedMethod

import typings.meteor.Meteor.Connection
import typings.meteorMdgValidatedMethod.anon.Dictkey
import typings.meteorMdgValidatedMethod.anon.Name
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object meteorMdgColonvalidatedMethodMod {
  
  @JSImport("meteor/mdg:validated-method", "ValidatedMethod")
  @js.native
  open class ValidatedMethod[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */] protected () extends StObject {
    def this(options: (ValidatedMethodOptionsWithMixins[TName, TRun]) & (ThisType[ValidatedMethodThisBase & Name[TName]])) = this()
    
    var _execute: /* import warning: importer.ImportType#apply Failed type conversion: meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> extends meteor-mdg-validated-method.meteor/mdg:validated-method.NoArguments ? (context : {[key: string] : any}): meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun> : (context : {[key: string] : any}, args : meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun>): meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun> */ js.Any = js.native
    
    var call: /* import warning: importer.ImportType#apply Failed type conversion: meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> extends meteor-mdg-validated-method.meteor/mdg:validated-method.NoArguments ? (unusedArg : any, callback : (error : meteor.Meteor.Error, result : meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun>): void): void & (callback : (error : meteor.Meteor.Error | undefined, result : meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun>): void): void & (): meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun> : (arg : meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun>, callback : (error : meteor.Meteor.Error | undefined, result : meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun>): void): void & (arg : meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun>): meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun> */ js.Any = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TFunc extends (args : infer TArgs): any ? TArgs extends [infer TArg] ? TArg : meteor-mdg-validated-method.meteor/mdg:validated-method.NoArguments : never
    }}}
    */
  type Argument[TFunc] = NoArguments
  
  type GenericMixin = js.Function1[
    /* options */ ValidatedMethodOptions[String, js.Function1[/* repeated */ Any, Any]], 
    ValidatedMethodOptions[String, js.Function1[/* repeated */ Any, Any]]
  ]
  
  type Mixin[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */] = js.Function1[
    /* options */ ValidatedMethodOptions[TName, TRun], 
    ValidatedMethodOptions[TName, TRun]
  ]
  
  type NoArguments = Unit
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TFunc extends (args : ...any): infer TReturn ? TReturn : never
    }}}
    */
  @js.native
  trait Return[TFunc] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends meteor-mdg-validated-method.meteor/mdg:validated-method.ValidatedMethod<string, infer TRun> ? meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> : never
    }}}
    */
  type ValidatedMethodArg[T] = NoArguments
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends meteor-mdg-validated-method.meteor/mdg:validated-method.ValidatedMethod<infer TName, any> ? TName : never
    }}}
    */
  @js.native
  trait ValidatedMethodName[T] extends StObject
  
  trait ValidatedMethodOptions[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */]
    extends StObject
       with ValidatedMethodOptionsMixinFields[Argument[TRun], Return[TRun]] {
    
    var applyOptions: js.UndefOr[Dictkey] = js.undefined
    
    // Force the name to be a string literal
    var name: TName & String
    
    var run: TRun
    
    var validate: (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> extends meteor-mdg-validated-method.meteor/mdg:validated-method.NoArguments ? any : meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> */ /* arg */ js.Any, 
        Any
      ]) | Null
  }
  object ValidatedMethodOptions {
    
    inline def apply[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */](name: TName & String, run: TRun): ValidatedMethodOptions[TName, TRun] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], validate = null)
      __obj.asInstanceOf[ValidatedMethodOptions[TName, TRun]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatedMethodOptions[?, ?], TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */] (val x: Self & (ValidatedMethodOptions[TName, TRun])) extends AnyVal {
      
      inline def setApplyOptions(value: Dictkey): Self = StObject.set(x, "applyOptions", value.asInstanceOf[js.Any])
      
      inline def setApplyOptionsUndefined: Self = StObject.set(x, "applyOptions", js.undefined)
      
      inline def setName(value: TName & String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRun(value: TRun): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setValidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> extends meteor-mdg-validated-method.meteor/mdg:validated-method.NoArguments ? any : meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> */ /* arg */ js.Any => Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateNull: Self = StObject.set(x, "validate", null)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TOptions extends meteor-mdg-validated-method.meteor/mdg:validated-method.ValidatedMethodOptions<any, infer TRun> ? meteor-mdg-validated-method.meteor/mdg:validated-method.Argument<TRun> : never
    }}}
    */
  type ValidatedMethodOptionsArgument[TOptions /* <: ValidatedMethodOptions[Any, Any] */] = NoArguments
  
  trait ValidatedMethodOptionsMixinFields[TRunArg, TRunReturn] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TOptions extends meteor-mdg-validated-method.meteor/mdg:validated-method.ValidatedMethodOptions<any, infer TRun> ? meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun> : never
    }}}
    */
  @js.native
  trait ValidatedMethodOptionsReturn[TOptions /* <: ValidatedMethodOptions[Any, Any] */] extends StObject
  
  trait ValidatedMethodOptionsWithMixins[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */]
    extends StObject
       with ValidatedMethodOptions[TName, TRun] {
    
    // Force TRun to be inferred from run itself rather than from the elements of mixins
    var mixins: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TRun extends infer TRunAlias ? TRunAlias extends TRun ? std.ReadonlyArray<meteor-mdg-validated-method.meteor/mdg:validated-method.Mixin<TName, TRunAlias>> : never : never | undefined */ js.Any
      ] = js.undefined
  }
  object ValidatedMethodOptionsWithMixins {
    
    inline def apply[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */](name: TName & String, run: TRun): ValidatedMethodOptionsWithMixins[TName, TRun] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], validate = null)
      __obj.asInstanceOf[ValidatedMethodOptionsWithMixins[TName, TRun]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatedMethodOptionsWithMixins[?, ?], TName /* <: String */, TRun /* <: js.Function1[/* repeated */ Any, Any] */] (val x: Self & (ValidatedMethodOptionsWithMixins[TName, TRun])) extends AnyVal {
      
      inline def setMixins(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TRun extends infer TRunAlias ? TRunAlias extends TRun ? std.ReadonlyArray<meteor-mdg-validated-method.meteor/mdg:validated-method.Mixin<TName, TRunAlias>> : never : never | undefined */ js.Any
      ): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends meteor-mdg-validated-method.meteor/mdg:validated-method.ValidatedMethod<string, infer TRun> ? meteor-mdg-validated-method.meteor/mdg:validated-method.Return<TRun> : never
    }}}
    */
  @js.native
  trait ValidatedMethodReturn[T] extends StObject
  
  @js.native
  trait ValidatedMethodThisBase extends StObject {
    
    /**
      * @summary Access inside a method invocation. The [connection](#meteor_onconnection) that this method was received on. `null` if the method is not associated with a connection, eg. a server
      * initiated method call. Calls to methods made from a server method which was in turn initiated from the client share the same `connection`.
      * @locus Server
      */
    var connection: Connection = js.native
    
    /**
      * @summary Access inside a method invocation.  Boolean value, true if this invocation is a stub.
      * @locus Anywhere
      */
    var isSimulation: Boolean = js.native
    
    /**
      * @summary The seed for randomStream value generation
      */
    def randomSeed(): String = js.native
    
    /**
      * @summary Set the logged in user.
      * @locus Server
      * @param userId The value that should be returned by `userId` on this connection.
      */
    def setUserId(): Unit = js.native
    def setUserId(userId: String): Unit = js.native
    
    /**
      * @summary Call inside a method invocation.  Allow subsequent method from this client to begin running in a new fiber.
      * @locus Server
      */
    def unblock(): Unit = js.native
    
    /**
      * @summary The id of the user that made this method call, or `null` if no user was logged in.
      * @locus Anywhere
      */
    var userId: String | Null = js.native
  }
}
