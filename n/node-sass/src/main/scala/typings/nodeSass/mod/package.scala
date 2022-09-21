package typings.nodeSass.mod

import typings.nodeSass.mod.^
import typings.nodeSass.mod.types.Boolean
import typings.nodeSass.mod.types.Null
import typings.nodeSass.mod.types.ReturnValue
import typings.nodeSass.mod.types.Value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def FALSE: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("FALSE").asInstanceOf[Boolean]

inline def NULL: Null = ^.asInstanceOf[js.Dynamic].selectDynamic("NULL").asInstanceOf[Null]

inline def TRUE: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("TRUE").asInstanceOf[Boolean]

inline def info: String = ^.asInstanceOf[js.Dynamic].selectDynamic("info").asInstanceOf[String]

inline def render(options: Options, callback: SassRenderCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def renderSync(options: SyncOptions): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSync")(options.asInstanceOf[js.Any]).asInstanceOf[Result]

type AsyncImporter = js.ThisFunction3[
/* this */ AsyncContext, 
/* url */ String, 
/* prev */ String, 
/* done */ js.Function1[/* data */ ImporterReturnType, Unit], 
Unit]

type AsyncSassFn0 = js.ThisFunction1[/* this */ AsyncContext, /* cb */ SassFunctionCallback, Unit]

type AsyncSassFn1 = js.ThisFunction2[/* this */ AsyncContext, /* $arg1 */ Value, /* cb */ SassFunctionCallback, Unit]

type AsyncSassFn2 = js.ThisFunction3[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassFn3 = js.ThisFunction4[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassFn4 = js.ThisFunction5[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassFn5 = js.ThisFunction6[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* $arg5 */ Value, 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassFn6 = js.ThisFunction7[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* $arg5 */ Value, 
/* $arg6 */ Value, 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassFunction = AsyncSassFn0 | AsyncSassFn1 | AsyncSassFn2 | AsyncSassFn3 | AsyncSassFn4 | AsyncSassFn5 | AsyncSassFn6 | AsyncSassVarArgFn1 | AsyncSassVarArgFn2 | AsyncSassVarArgFn3 | AsyncSassVarArgFn4 | AsyncSassVarArgFn5 | AsyncSassVarArgFn6

type AsyncSassVarArgFn1 = js.ThisFunction2[
/* this */ AsyncContext, 
/* $arg1 */ js.Array[Value], 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassVarArgFn2 = js.ThisFunction3[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ js.Array[Value], 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassVarArgFn3 = js.ThisFunction4[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ js.Array[Value], 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassVarArgFn4 = js.ThisFunction5[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ js.Array[Value], 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassVarArgFn5 = js.ThisFunction6[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* $arg5 */ js.Array[Value], 
/* cb */ SassFunctionCallback, 
Unit]

type AsyncSassVarArgFn6 = js.ThisFunction7[
/* this */ AsyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* $arg5 */ Value, 
/* $arg6 */ js.Array[Value], 
/* cb */ SassFunctionCallback, 
Unit]

type FunctionDeclarations[FunctionType /* <: SassFunction */] = Record[String, FunctionType]

type Importer = AsyncImporter | SyncImporter

/* Rewritten from type alias, can be one of: 
  - typings.nodeSass.anon.File
  - typings.nodeSass.anon.Contents
  - js.Error
  - scala.Null
  - typings.nodeSass.mod.types.Null
  - typings.nodeSass.mod.types.Error
*/
type ImporterReturnType = _ImporterReturnType | js.Error | scala.Null

type SassFunction = SyncSassFunction | AsyncSassFunction

type SassFunctionCallback = js.Function1[/* $result */ ReturnValue, Unit]

type SassRenderCallback = js.Function2[/* err */ SassError, /* result */ Result, Any]

type SyncImporter = js.ThisFunction2[/* this */ SyncContext, /* url */ String, /* prev */ String, ImporterReturnType]

type SyncSassFunction = SyncSassFn | SyncSassVarArgFn1 | SyncSassVarArgFn2 | SyncSassVarArgFn3 | SyncSassVarArgFn4 | SyncSassVarArgFn5 | SyncSassVarArgFn6

type SyncSassVarArgFn1 = js.ThisFunction1[/* this */ SyncContext, /* $arg1 */ js.Array[Value], ReturnValue]

type SyncSassVarArgFn2 = js.ThisFunction2[/* this */ SyncContext, /* $arg1 */ Value, /* $arg2 */ js.Array[Value], ReturnValue]

type SyncSassVarArgFn3 = js.ThisFunction3[
/* this */ SyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ js.Array[Value], 
ReturnValue]

type SyncSassVarArgFn4 = js.ThisFunction4[
/* this */ SyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ js.Array[Value], 
ReturnValue]

type SyncSassVarArgFn5 = js.ThisFunction5[
/* this */ SyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* $arg5 */ js.Array[Value], 
ReturnValue]

type SyncSassVarArgFn6 = js.ThisFunction6[
/* this */ SyncContext, 
/* $arg1 */ Value, 
/* $arg2 */ Value, 
/* $arg3 */ Value, 
/* $arg4 */ Value, 
/* $arg5 */ Value, 
/* $arg6 */ js.Array[Value], 
ReturnValue]
