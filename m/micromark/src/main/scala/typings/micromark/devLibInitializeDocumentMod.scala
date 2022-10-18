package typings.micromark

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibInitializeDocumentMod {
  
  @JSImport("micromark/dev/lib/initialize/document", "document")
  @js.native
  val document: InitialConstruct = js.native
  
  type Construct = typings.micromarkUtilTypes.mod.Construct
  
  type InitialConstruct = typings.micromarkUtilTypes.mod.InitialConstruct
  
  type Initializer = typings.micromarkUtilTypes.mod.Initializer
  
  type Point = typings.micromarkUtilTypes.mod.Point
  
  type StackItem = js.Tuple2[Construct, StackState]
  
  type StackState = Record[String, Any]
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type Token = typings.micromarkUtilTypes.mod.Token
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
