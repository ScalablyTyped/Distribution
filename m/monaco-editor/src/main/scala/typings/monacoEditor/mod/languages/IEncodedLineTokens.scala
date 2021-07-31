package typings.monacoEditor.mod.languages

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEncodedLineTokens extends StObject {
  
  /**
    * The tokenization end state.
    * A pointer will be held to this and the object should not be modified by the tokenizer after the pointer is returned.
    */
  var endState: IState
  
  /**
    * The tokens on the line in a binary, encoded format. Each token occupies two array indices. For token i:
    *  - at offset 2*i => startIndex
    *  - at offset 2*i + 1 => metadata
    * Meta data is in binary format:
    * - -------------------------------------------
    *     3322 2222 2222 1111 1111 1100 0000 0000
    *     1098 7654 3210 9876 5432 1098 7654 3210
    * - -------------------------------------------
    *     bbbb bbbb bfff ffff ffFF FTTT LLLL LLLL
    * - -------------------------------------------
    *  - L = EncodedLanguageId (8 bits): Use `getEncodedLanguageId` to get the encoded ID of a language.
    *  - T = StandardTokenType (3 bits): Other = 0, Comment = 1, String = 2, RegEx = 4.
    *  - F = FontStyle (3 bits): None = 0, Italic = 1, Bold = 2, Underline = 4.
    *  - f = foreground ColorId (9 bits)
    *  - b = background ColorId (9 bits)
    *  - The color value for each colorId is defined in IStandaloneThemeData.customTokenColors:
    * e.g. colorId = 1 is stored in IStandaloneThemeData.customTokenColors[1]. Color id = 0 means no color,
    * id = 1 is for the default foreground color, id = 2 for the default background.
    */
  var tokens: Uint32Array
}
object IEncodedLineTokens {
  
  @scala.inline
  def apply(endState: IState, tokens: Uint32Array): IEncodedLineTokens = {
    val __obj = js.Dynamic.literal(endState = endState.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncodedLineTokens]
  }
  
  @scala.inline
  implicit class IEncodedLineTokensMutableBuilder[Self <: IEncodedLineTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndState(value: IState): Self = StObject.set(x, "endState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: Uint32Array): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
