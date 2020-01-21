package typings.nodeSass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncImporter = js.ThisFunction3[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ typings.nodeSass.mod.ImporterReturnType, scala.Unit], 
    scala.Unit
  ]
  type AsyncSassFn0 = js.ThisFunction1[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn1 = js.ThisFunction2[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn2 = js.ThisFunction3[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn3 = js.ThisFunction4[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn4 = js.ThisFunction5[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn5 = js.ThisFunction6[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* $arg5 */ typings.nodeSass.mod.types.Value, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn6 = js.ThisFunction7[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* $arg5 */ typings.nodeSass.mod.types.Value, 
    /* $arg6 */ typings.nodeSass.mod.types.Value, 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFunction = typings.nodeSass.mod.AsyncSassFn0 | typings.nodeSass.mod.AsyncSassFn1 | typings.nodeSass.mod.AsyncSassFn2 | typings.nodeSass.mod.AsyncSassFn3 | typings.nodeSass.mod.AsyncSassFn4 | typings.nodeSass.mod.AsyncSassFn5 | typings.nodeSass.mod.AsyncSassFn6 | typings.nodeSass.mod.AsyncSassVarArgFn1 | typings.nodeSass.mod.AsyncSassVarArgFn2 | typings.nodeSass.mod.AsyncSassVarArgFn3 | typings.nodeSass.mod.AsyncSassVarArgFn4 | typings.nodeSass.mod.AsyncSassVarArgFn5 | typings.nodeSass.mod.AsyncSassVarArgFn6
  type AsyncSassVarArgFn1 = js.ThisFunction2[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ js.Array[typings.nodeSass.mod.types.Value], 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn2 = js.ThisFunction3[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ js.Array[typings.nodeSass.mod.types.Value], 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn3 = js.ThisFunction4[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ js.Array[typings.nodeSass.mod.types.Value], 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn4 = js.ThisFunction5[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ js.Array[typings.nodeSass.mod.types.Value], 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn5 = js.ThisFunction6[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* $arg5 */ js.Array[typings.nodeSass.mod.types.Value], 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn6 = js.ThisFunction7[
    /* this */ typings.nodeSass.mod.AsyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* $arg5 */ typings.nodeSass.mod.types.Value, 
    /* $arg6 */ js.Array[typings.nodeSass.mod.types.Value], 
    /* cb */ typings.nodeSass.mod.SassFunctionCallback, 
    scala.Unit
  ]
  type FunctionDeclarations[FunctionType /* <: typings.nodeSass.mod.SassFunction */] = typings.std.Record[java.lang.String, FunctionType]
  type Importer = typings.nodeSass.mod.AsyncImporter | typings.nodeSass.mod.SyncImporter
  /* Rewritten from type alias, can be one of: 
    - typings.nodeSass.AnonFile
    - typings.nodeSass.AnonContents
    - typings.std.Error
    - scala.Null
    - typings.nodeSass.mod.types.Null
    - typings.nodeSass.mod.types.Error
  */
  type ImporterReturnType = typings.nodeSass.mod._ImporterReturnType | typings.std.Error | scala.Null
  type SassFunction = typings.nodeSass.mod.SyncSassFunction | typings.nodeSass.mod.AsyncSassFunction
  type SassFunctionCallback = js.Function1[/* $result */ typings.nodeSass.mod.types.ReturnValue, scala.Unit]
  type SassRenderCallback = js.Function2[
    /* err */ typings.nodeSass.mod.SassError, 
    /* result */ typings.nodeSass.mod.Result, 
    js.Any
  ]
  type SyncImporter = js.ThisFunction2[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    typings.nodeSass.mod.ImporterReturnType
  ]
  type SyncSassFn = js.ThisFunction1[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* repeated */ typings.nodeSass.mod.types.Value, 
    typings.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassFunction = typings.nodeSass.mod.SyncSassFn | typings.nodeSass.mod.SyncSassVarArgFn1 | typings.nodeSass.mod.SyncSassVarArgFn2 | typings.nodeSass.mod.SyncSassVarArgFn3 | typings.nodeSass.mod.SyncSassVarArgFn4 | typings.nodeSass.mod.SyncSassVarArgFn5 | typings.nodeSass.mod.SyncSassVarArgFn6
  type SyncSassVarArgFn1 = js.ThisFunction1[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* $arg1 */ js.Array[typings.nodeSass.mod.types.Value], 
    typings.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn2 = js.ThisFunction2[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ js.Array[typings.nodeSass.mod.types.Value], 
    typings.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn3 = js.ThisFunction3[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ js.Array[typings.nodeSass.mod.types.Value], 
    typings.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn4 = js.ThisFunction4[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ js.Array[typings.nodeSass.mod.types.Value], 
    typings.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn5 = js.ThisFunction5[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* $arg5 */ js.Array[typings.nodeSass.mod.types.Value], 
    typings.nodeSass.mod.types.ReturnValue
  ]
  type SyncSassVarArgFn6 = js.ThisFunction6[
    /* this */ typings.nodeSass.mod.SyncContext, 
    /* $arg1 */ typings.nodeSass.mod.types.Value, 
    /* $arg2 */ typings.nodeSass.mod.types.Value, 
    /* $arg3 */ typings.nodeSass.mod.types.Value, 
    /* $arg4 */ typings.nodeSass.mod.types.Value, 
    /* $arg5 */ typings.nodeSass.mod.types.Value, 
    /* $arg6 */ js.Array[typings.nodeSass.mod.types.Value], 
    typings.nodeSass.mod.types.ReturnValue
  ]
}
