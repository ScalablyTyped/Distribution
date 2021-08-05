package typings.meteorMdgValidatedMethod

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.Error
import typings.meteorMdgValidatedMethod.anon.Dictkey
import typings.meteorMdgValidatedMethod.anon.Name
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  @JSImport("meteor/mdg:validated-method", "ValidatedMethod")
  @js.native
  class ValidatedMethod[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */] protected () extends StObject {
    def this(options: (ValidatedMethodOptionsWithMixins[TName, TRun]) & (ThisType[ValidatedMethodThisBase & Name[TName]])) = this()
    
    var _execute: (js.Function2[/* context */ StringDictionary[js.Any], /* args */ Argument[TRun], Return[TRun]]) | (js.Function1[/* context */ StringDictionary[js.Any], Return[TRun]]) = js.native
    
    var call: ((js.Function2[
        /* arg */ Argument[TRun], 
        /* callback */ js.Function2[/* error */ Error, /* result */ Return[TRun], Unit], 
        Unit
      ]) & (js.Function1[/* arg */ Argument[TRun], Return[TRun]])) | ((js.Function2[
        /* unusedArg */ js.Any, 
        /* callback */ js.Function2[/* error */ Error, /* result */ Return[TRun], Unit], 
        Unit
      ]) & (js.Function1[
        /* callback */ js.Function2[/* error */ Error, /* result */ Return[TRun], Unit], 
        Unit
      ]) & js.Function0[Return[TRun]]) = js.native
  }
  
  type Argument[TFunc] = NoArguments
  
  type GenericMixin = js.Function1[
    /* options */ ValidatedMethodOptions[String, js.Function1[/* repeated */ js.Any, js.Any]], 
    ValidatedMethodOptions[String, js.Function1[/* repeated */ js.Any, js.Any]]
  ]
  
  type Mixin[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = js.Function1[
    /* options */ ValidatedMethodOptions[TName, TRun], 
    ValidatedMethodOptions[TName, TRun]
  ]
  
  type NoArguments = Unit
  
  type Return[TFunc] = js.Any
  
  type ValidatedMethodArg[T] = Argument[js.Any]
  
  type ValidatedMethodName[T] = js.Any
  
  trait ValidatedMethodOptions[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */]
    extends StObject
       with ValidatedMethodOptionsMixinFields[Argument[TRun], Return[TRun]] {
    
    var applyOptions: js.UndefOr[Dictkey] = js.undefined
    
    // Force the name to be a string literal
    var name: TName & String
    
    var run: TRun
    
    var validate: (js.Function1[/* arg */ Argument[TRun], js.Any]) | Null
  }
  object ValidatedMethodOptions {
    
    inline def apply[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */](name: TName & String, run: TRun): ValidatedMethodOptions[TName, TRun] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], validate = null)
      __obj.asInstanceOf[ValidatedMethodOptions[TName, TRun]]
    }
    
    extension [Self <: ValidatedMethodOptions[?, ?], TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */](x: Self & (ValidatedMethodOptions[TName, TRun])) {
      
      inline def setApplyOptions(value: Dictkey): Self = StObject.set(x, "applyOptions", value.asInstanceOf[js.Any])
      
      inline def setApplyOptionsUndefined: Self = StObject.set(x, "applyOptions", js.undefined)
      
      inline def setName(value: TName & String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRun(value: TRun): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: /* arg */ Argument[TRun] => js.Any): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateNull: Self = StObject.set(x, "validate", null)
    }
  }
  
  type ValidatedMethodOptionsArgument[TOptions /* <: ValidatedMethodOptions[js.Any, js.Any] */] = Argument[js.Any]
  
  trait ValidatedMethodOptionsMixinFields[TRunArg, TRunReturn] extends StObject
  
  type ValidatedMethodOptionsReturn[TOptions /* <: ValidatedMethodOptions[js.Any, js.Any] */] = Return[js.Any]
  
  trait ValidatedMethodOptionsWithMixins[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */]
    extends StObject
       with ValidatedMethodOptions[TName, TRun] {
    
    // Force TRun to be inferred from run itself rather than from the elements of mixins
    var mixins: js.UndefOr[js.Array[Mixin[TName, js.Any]]] = js.undefined
  }
  object ValidatedMethodOptionsWithMixins {
    
    inline def apply[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */](name: TName & String, run: TRun): ValidatedMethodOptionsWithMixins[TName, TRun] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], validate = null)
      __obj.asInstanceOf[ValidatedMethodOptionsWithMixins[TName, TRun]]
    }
    
    extension [Self <: ValidatedMethodOptionsWithMixins[?, ?], TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, js.Any] */](x: Self & (ValidatedMethodOptionsWithMixins[TName, TRun])) {
      
      inline def setMixins(value: js.Array[Mixin[TName, js.Any]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: (Mixin[TName, js.Any])*): Self = StObject.set(x, "mixins", js.Array(value :_*))
    }
  }
  
  type ValidatedMethodReturn[T] = Return[js.Any]
  
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
