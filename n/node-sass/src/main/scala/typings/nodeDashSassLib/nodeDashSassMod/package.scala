package typings
package nodeDashSassLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashSassMod {
  type AsyncImporter = js.ThisFunction3[
    /* this */ AsyncContext, 
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ ImporterReturnType, scala.Unit], 
    scala.Unit
  ]
  type AsyncSassFn0 = js.ThisFunction1[/* this */ AsyncContext, /* cb */ SassFunctionCallback, scala.Unit]
  type AsyncSassFn1 = js.ThisFunction2[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn2 = js.ThisFunction3[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn3 = js.ThisFunction4[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn4 = js.ThisFunction5[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn5 = js.ThisFunction6[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg5 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFn6 = js.ThisFunction7[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg5 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg6 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassFunction = AsyncSassFn0 | AsyncSassFn1 | AsyncSassFn2 | AsyncSassFn3 | AsyncSassFn4 | AsyncSassFn5 | AsyncSassFn6 | AsyncSassVarArgFn1 | AsyncSassVarArgFn2 | AsyncSassVarArgFn3 | AsyncSassVarArgFn4 | AsyncSassVarArgFn5 | AsyncSassVarArgFn6
  type AsyncSassVarArgFn1 = js.ThisFunction2[
    /* this */ AsyncContext, 
    /* $arg1 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn2 = js.ThisFunction3[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn3 = js.ThisFunction4[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn4 = js.ThisFunction5[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn5 = js.ThisFunction6[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg5 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type AsyncSassVarArgFn6 = js.ThisFunction7[
    /* this */ AsyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg5 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg6 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    /* cb */ SassFunctionCallback, 
    scala.Unit
  ]
  type FunctionDeclarations[FunctionType /* <: SassFunction */] = stdLib.Record[java.lang.String, FunctionType]
  type Importer = AsyncImporter | SyncImporter
  type ImporterReturnType = _ImporterReturnType | stdLib.Error | scala.Null
  type SassFunction = SyncSassFunction | AsyncSassFunction
  type SassFunctionCallback = js.Function1[/* $result */ nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue, scala.Unit]
  type SassRenderCallback = js.Function2[/* err */ SassError, /* result */ Result, js.Any]
  type SyncImporter = js.ThisFunction2[
    /* this */ SyncContext, 
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    ImporterReturnType
  ]
  type SyncSassFn = js.ThisFunction1[
    /* this */ SyncContext, 
    /* repeated */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
  type SyncSassFunction = SyncSassFn | SyncSassVarArgFn1 | SyncSassVarArgFn2 | SyncSassVarArgFn3 | SyncSassVarArgFn4 | SyncSassVarArgFn5 | SyncSassVarArgFn6
  type SyncSassVarArgFn1 = js.ThisFunction1[
    /* this */ SyncContext, 
    /* $arg1 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
  type SyncSassVarArgFn2 = js.ThisFunction2[
    /* this */ SyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
  type SyncSassVarArgFn3 = js.ThisFunction3[
    /* this */ SyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
  type SyncSassVarArgFn4 = js.ThisFunction4[
    /* this */ SyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
  type SyncSassVarArgFn5 = js.ThisFunction5[
    /* this */ SyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg5 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
  type SyncSassVarArgFn6 = js.ThisFunction6[
    /* this */ SyncContext, 
    /* $arg1 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg2 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg3 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg4 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg5 */ nodeDashSassLib.nodeDashSassMod.typesNs.Value, 
    /* $arg6 */ js.Array[nodeDashSassLib.nodeDashSassMod.typesNs.Value], 
    nodeDashSassLib.nodeDashSassMod.typesNs.ReturnValue
  ]
}
