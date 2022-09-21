package typings.pico8parse.mod

import typings.pico8parse.anon.PartialOptions
import typings.pico8parse.anon.PartialOptionswaittrue
import typings.pico8parse.mod.ast.Chunk_
import typings.pico8parse.mod.ast.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends StObject {
  
  /** Send an EOF and begin parsing. */
  def end(): Chunk_ = js.native
  def end(segment: String): Chunk_ = js.native
  
  /**
    * The lexer, or the tokenizer reads the input string character by character
    * and derives a token left-right. To be as efficient as possible the lexer
    * prioritizes the common cases such as identifiers. It also works with
    * character codes instead of characters as string comparisons was the
    * biggest bottleneck of the parser.
    *
    * If `options.comments` is enabled, all comments encountered will be stored
    * in an array which later will be appended to the chunk object. If disabled,
    * they will simply be disregarded.
    *
    * When the lexer has derived a valid token, it will be returned as an object
    * containing its value and as well as its position in the input string (this
    * is always enabled to provide proper debug messages).
    *
    * `lex()` starts lexing and returns the following token in the stream.
    */
  def lex(): Token = js.native
  
  def parse(): Parser = js.native
  def parse(code: String): Chunk_ = js.native
  def parse(code: String, options: PartialOptions): Chunk_ = js.native
  /**
    * The main parser.
    * @example
    * var parser = require('pico8parse');
    * parser.parse('i = 0');
    */
  def parse(code: String, options: PartialOptionswaittrue): Parser = js.native
  def parse(options: PartialOptions): Parser = js.native
  
  /** Write to the source code buffer without beginning the parse. */
  def write(segment: String): Parser = js.native
}
