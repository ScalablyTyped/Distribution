package typings.n3.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Lexer")
@js.native
open class Lexer () extends StObject {
  def this(options: LexerOptions) = this()
  
  def tokenize(input: String): js.Array[Token] = js.native
  def tokenize(input: String, callback: TokenCallback): Unit = js.native
  def tokenize(input: EventEmitter, callback: TokenCallback): Unit = js.native
}
