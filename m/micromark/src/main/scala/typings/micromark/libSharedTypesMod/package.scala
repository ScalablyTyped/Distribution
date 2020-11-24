package typings.micromark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libSharedTypesMod {
  
  type Chunk = typings.std.NonNullable[typings.micromark.characterCodesMod.Code] | java.lang.String
  
  type CodeAsKey = typings.std.NonNullable[typings.micromark.characterCodesMod.Code] | typings.micromark.micromarkStrings.`null`
  
  type CodeCheck = js.Function1[/* code */ typings.micromark.characterCodesMod.Code, scala.Boolean]
  
  type Compile = js.Function1[/* slice */ js.Array[typings.micromark.libSharedTypesMod.Event], java.lang.String]
  
  type Event = js.Tuple3[
    java.lang.String, 
    typings.micromark.libSharedTypesMod.Token, 
    typings.micromark.libSharedTypesMod.Tokenizer
  ]
  
  type NotOkay = typings.micromark.libSharedTypesMod.State
  
  type Okay = typings.micromark.libSharedTypesMod.State
  
  type Options = typings.micromark.libSharedTypesMod.ParseOptions with typings.micromark.libSharedTypesMod.CompileOptions
  
  type Resolve = js.Function2[
    /* events */ js.Array[typings.micromark.libSharedTypesMod.Event], 
    /* context */ typings.micromark.libSharedTypesMod.Tokenizer, 
    js.Array[typings.micromark.libSharedTypesMod.Event]
  ]
  
  type State = js.Function1[
    /* code */ scala.Double, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias micromark.micromark/lib/shared-types.State */ js.Object) | scala.Unit
  ]
  
  type Tokenize = js.Function2[
    /* context */ typings.micromark.libSharedTypesMod.Tokenizer, 
    /* effects */ typings.micromark.libSharedTypesMod.Effects, 
    typings.micromark.libSharedTypesMod.State
  ]
}
