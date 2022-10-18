package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.OmitCompileContextsliceSe
import typings.micromarkUtilTypes.anon.OmitPointindexbufferIndex
import typings.micromarkUtilTypes.anon.PartialCompileDataFields
import typings.micromarkUtilTypes.anon.PartialExtensionFields
import typings.micromarkUtilTypes.anon.PartialNormalizedExtensio
import typings.micromarkUtilTypes.anon.`2`
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.enter
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.exit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Attempt = js.Function3[
/* construct */ Construct | js.Array[Construct] | ConstructRecord, 
/* returnState */ State, 
/* bogusState */ js.UndefOr[State], 
js.Function1[/* code */ Code, Unit]]

type Chunk = Code | String

type Code = Double | Null

type Compile = js.Function1[/* events */ js.Array[Event], String]

type CompileData = (Record[String, Any]) & PartialCompileDataFields

type ConstructRecord = Record[String, js.UndefOr[Construct | js.Array[Construct]]]

type Consume = js.Function1[/* code */ Code, Unit]

type Create = js.Function1[/* from */ js.UndefOr[OmitPointindexbufferIndex], TokenizeContext]

type DocumentHandle = js.ThisFunction0[/* this */ OmitCompileContextsliceSe, Unit]

type Enter = js.Function2[/* type */ String, /* fields */ js.UndefOr[Record[String, Any]], Token]

type Event = js.Tuple3[enter | exit, Token, TokenizeContext]

type Exit = js.Function1[/* type */ String, Token]

type Exiter = js.ThisFunction1[/* this */ TokenizeContext, /* effects */ Effects, Unit]

type Extension = (Record[String, Record[String, Any]]) & PartialExtensionFields

type FullNormalizedExtension = (Record[String, Record[String, js.Array[Any]]]) & NormalizedExtensionFields

type Handle = js.ThisFunction1[/* this */ CompileContext, /* token */ Token, Unit]

type Handles = (Record[String, Handle]) & `2`

type HtmlExtension = Partial[NormalizedHtmlExtension]

type Initializer = js.ThisFunction1[/* this */ TokenizeContext, /* effects */ Effects, State]

type NormalizedExtension = (Record[String, Record[String, js.UndefOr[js.Array[Any]]]]) & PartialNormalizedExtensio

type NormalizedHtmlExtension = (Record[String, Record[String, Any]]) & typings.micromarkUtilTypes.anon.Enter

type Previous = js.ThisFunction1[/* this */ TokenizeContext, /* code */ Code, Boolean]

type Resolver = js.Function2[/* events */ js.Array[Event], /* context */ TokenizeContext, js.Array[Event]]

type Tokenizer = js.ThisFunction3[
/* this */ TokenizeContext, 
/* effects */ Effects, 
/* ok */ State, 
/* nok */ State, 
State]

type Value = String | js.typedarray.Uint8Array
