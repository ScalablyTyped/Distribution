package typings.meteorMdgValidatedMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Argument[TFunc] = typings.meteorMdgValidatedMethod.mod.NoArguments
  
  type GenericMixin = js.Function1[
    /* options */ typings.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]], 
    typings.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  ]
  
  type Mixin[TName /* <: java.lang.String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[
    /* options */ typings.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[TName, TRun], 
    typings.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[TName, TRun]
  ]
  
  type NoArguments = js.UndefOr[scala.Nothing]
  
  type Return[TFunc] = js.Any
  
  type ValidatedMethodArg[T] = typings.meteorMdgValidatedMethod.mod.Argument[js.Any]
  
  type ValidatedMethodName[T] = js.Any
  
  type ValidatedMethodOptionsArgument[TOptions /* <: typings.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[_, _] */] = typings.meteorMdgValidatedMethod.mod.Argument[js.Any]
  
  type ValidatedMethodOptionsReturn[TOptions /* <: typings.meteorMdgValidatedMethod.mod.ValidatedMethodOptions[_, _] */] = typings.meteorMdgValidatedMethod.mod.Return[js.Any]
  
  type ValidatedMethodReturn[T] = typings.meteorMdgValidatedMethod.mod.Return[js.Any]
}
