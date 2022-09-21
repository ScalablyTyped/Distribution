package typings.micromarkUtilCharacter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-character", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asciiAlpha(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiAlpha")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def asciiAlphanumeric(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiAlphanumeric")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def asciiAtext(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiAtext")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def asciiControl(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiControl")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def asciiDigit(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiDigit")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def asciiHexDigit(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiHexDigit")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def asciiPunctuation(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiPunctuation")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def markdownLineEnding(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownLineEnding")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def markdownLineEndingOrSpace(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownLineEndingOrSpace")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def markdownSpace(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("markdownSpace")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def unicodePunctuation(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodePunctuation")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def unicodeWhitespace(code: Code): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unicodeWhitespace")(code.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  type Code = typings.micromarkUtilTypes.mod.Code
}
