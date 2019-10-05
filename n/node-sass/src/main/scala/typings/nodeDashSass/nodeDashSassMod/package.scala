package typings.nodeDashSass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashSassMod {
  import typings.nodeDashSass.nodeDashSassMod.types.ReturnValue
  import typings.nodeDashSass.nodeDashSassMod.types.Value
  import typings.std.Error
  import typings.std.Record

  type AsyncImporter = js.ThisFunction3[
    /* this */ AsyncContext, 
    /* url */ String, 
    /* prev */ String, 
    /* done */ js.Function1[/* data */ ImporterReturnType, Unit], 
    Unit
  ]
  type AsyncSassFn0 = js.ThisFunction1[/* this */ AsyncContext, /* cb */ SassFunctionCallback, Unit]
  type AsyncSassFn1 = js.ThisFunction2[/* this */ AsyncContext, /* $arg1 */ Value, /* cb */ SassFunctionCallback, Unit]
  type AsyncSassFn2 = js.ThisFunction3[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassFn3 = js.ThisFunction4[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassFn4 = js.ThisFunction5[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassFn5 = js.ThisFunction6[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* $arg5 */ Value, 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassFn6 = js.ThisFunction7[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* $arg5 */ Value, 
    /* $arg6 */ Value, 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassFunction = AsyncSassFn0 | AsyncSassFn1 | AsyncSassFn2 | AsyncSassFn3 | AsyncSassFn4 | AsyncSassFn5 | AsyncSassFn6 | AsyncSassVarArgFn1 | AsyncSassVarArgFn2 | AsyncSassVarArgFn3 | AsyncSassVarArgFn4 | AsyncSassVarArgFn5 | AsyncSassVarArgFn6
  type AsyncSassVarArgFn1 = js.ThisFunction2[
    /* this */ AsyncContext, 
    /* $arg1 */ js.Array[Value], 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassVarArgFn2 = js.ThisFunction3[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ js.Array[Value], 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassVarArgFn3 = js.ThisFunction4[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ js.Array[Value], 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassVarArgFn4 = js.ThisFunction5[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ js.Array[Value], 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassVarArgFn5 = js.ThisFunction6[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* $arg5 */ js.Array[Value], 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type AsyncSassVarArgFn6 = js.ThisFunction7[
    /* this */ AsyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* $arg5 */ Value, 
    /* $arg6 */ js.Array[Value], 
    /* cb */ SassFunctionCallback, 
    Unit
  ]
  type FunctionDeclarations[FunctionType /* <: SassFunction */] = Record[String, FunctionType]
  type Importer = AsyncImporter | SyncImporter
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashSass.Anon_File
    - typings.nodeDashSass.Anon_Contents
    - typings.std.Error
    - scala.Null
    - typings.nodeDashSass.nodeDashSassMod.types.Null
    - typings.nodeDashSass.nodeDashSassMod.types.Error
  */
  type ImporterReturnType = _ImporterReturnType | Error | Null
  type SassFunction = SyncSassFunction | AsyncSassFunction
  type SassFunctionCallback = js.Function1[/* $result */ ReturnValue, Unit]
  type SassRenderCallback = js.Function2[/* err */ SassError, /* result */ Result, js.Any]
  type SyncImporter = js.ThisFunction2[/* this */ SyncContext, /* url */ String, /* prev */ String, ImporterReturnType]
  type SyncSassFn = js.ThisFunction1[/* this */ SyncContext, /* repeated */ Value, ReturnValue]
  type SyncSassFunction = SyncSassFn | SyncSassVarArgFn1 | SyncSassVarArgFn2 | SyncSassVarArgFn3 | SyncSassVarArgFn4 | SyncSassVarArgFn5 | SyncSassVarArgFn6
  type SyncSassVarArgFn1 = js.ThisFunction1[/* this */ SyncContext, /* $arg1 */ js.Array[Value], ReturnValue]
  type SyncSassVarArgFn2 = js.ThisFunction2[/* this */ SyncContext, /* $arg1 */ Value, /* $arg2 */ js.Array[Value], ReturnValue]
  type SyncSassVarArgFn3 = js.ThisFunction3[
    /* this */ SyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ js.Array[Value], 
    ReturnValue
  ]
  type SyncSassVarArgFn4 = js.ThisFunction4[
    /* this */ SyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ js.Array[Value], 
    ReturnValue
  ]
  type SyncSassVarArgFn5 = js.ThisFunction5[
    /* this */ SyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* $arg5 */ js.Array[Value], 
    ReturnValue
  ]
  type SyncSassVarArgFn6 = js.ThisFunction6[
    /* this */ SyncContext, 
    /* $arg1 */ Value, 
    /* $arg2 */ Value, 
    /* $arg3 */ Value, 
    /* $arg4 */ Value, 
    /* $arg5 */ Value, 
    /* $arg6 */ js.Array[Value], 
    ReturnValue
  ]
}
