package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.OmitCompileContextsliceSe
import typings.micromarkUtilTypes.anon.OmitPartialTokentype
import typings.micromarkUtilTypes.anon.OmitPointbufferIndexindex
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.enter
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.exit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Attempt = js.Function3[
/* construct */ js.Array[Construct] | Construct | ConstructRecord, 
/* ok */ State, 
/* nok */ js.UndefOr[State], 
State]

type Chunk = Code | String

type Code = Double | Null

type Compile = js.Function1[/* events */ js.Array[Event], String]

type ConstructRecord = Record[String, js.UndefOr[js.Array[Construct] | Construct]]

type Consume = js.Function1[/* code */ Code, Unit]

type Create = js.Function1[/* from */ js.UndefOr[OmitPointbufferIndexindex], TokenizeContext]

type DocumentHandle = js.ThisFunction0[/* this */ OmitCompileContextsliceSe, Unit]

type Enter = js.Function2[/* type */ TokenType, /* fields */ js.UndefOr[OmitPartialTokentype], Token]

type Event = js.Tuple3[enter | exit, Token, TokenizeContext]

type Exit = js.Function1[/* type */ TokenType, Token]

type Exiter = js.ThisFunction1[/* this */ TokenizeContext, /* effects */ Effects, Unit]

type Handle = js.ThisFunction1[/* this */ CompileContext, /* token */ Token, Unit]

type Initializer = js.ThisFunction1[/* this */ TokenizeContext, /* effects */ Effects, State]

type Previous = js.ThisFunction1[/* this */ TokenizeContext, /* code */ Code, Boolean]

type Resolver = js.Function2[/* events */ js.Array[Event], /* context */ TokenizeContext, js.Array[Event]]

type Tokenizer = js.ThisFunction3[
/* this */ TokenizeContext, 
/* effects */ Effects, 
/* ok */ State, 
/* nok */ State, 
State]

type Value = js.typedarray.Uint8Array | String
