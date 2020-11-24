package typings.micromark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sharedTypesMod {
  
  type Chunk = typings.std.NonNullable[typings.micromark.codesMod.Code] | java.lang.String
  
  type CodeAsKey = typings.std.NonNullable[typings.micromark.codesMod.Code] | typings.micromark.micromarkStrings.`null`
  
  type CodeCheck = js.Function1[/* code */ typings.micromark.codesMod.Code, scala.Boolean]
  
  type Compile = js.Function1[/* slice */ js.Array[typings.micromark.sharedTypesMod.Event], java.lang.String]
  
  type Event = js.Tuple3[
    java.lang.String, 
    typings.micromark.sharedTypesMod.Token, 
    typings.micromark.sharedTypesMod.Tokenizer
  ]
  
  type NotOkay = typings.micromark.sharedTypesMod.State
  
  type Okay = typings.micromark.sharedTypesMod.State
  
  type Options = typings.micromark.sharedTypesMod.ParseOptions with typings.micromark.sharedTypesMod.CompileOptions
  
  type Resolve = js.Function2[
    /* events */ js.Array[typings.micromark.sharedTypesMod.Event], 
    /* context */ typings.micromark.sharedTypesMod.Tokenizer, 
    js.Array[typings.micromark.sharedTypesMod.Event]
  ]
  
  type State = js.Function1[
    /* code */ scala.Double, 
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias micromark.micromark/dist/shared-types.State */ js.Object) | scala.Unit
  ]
  
  type Tokenize = js.Function2[
    /* context */ typings.micromark.sharedTypesMod.Tokenizer, 
    /* effects */ typings.micromark.sharedTypesMod.Effects, 
    typings.micromark.sharedTypesMod.State
  ]
}
