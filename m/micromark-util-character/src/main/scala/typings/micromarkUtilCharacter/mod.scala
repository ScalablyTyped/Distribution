package typings.micromarkUtilCharacter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-character", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asciiAlpha(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiAlpha")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asciiAlphanumeric(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiAlphanumeric")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asciiAtext(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiAtext")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asciiControl(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiControl")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asciiDigit(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiDigit")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asciiHexDigit(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiHexDigit")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asciiPunctuation(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiPunctuation")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def markdownLineEnding(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownLineEnding")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def markdownLineEndingOrSpace(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownLineEndingOrSpace")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def markdownSpace(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownSpace")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unicodePunctuation(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodePunctuation")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unicodeWhitespace(code: Code): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodeWhitespace")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Code = typings.micromarkUtilTypes.mod.Code
}
