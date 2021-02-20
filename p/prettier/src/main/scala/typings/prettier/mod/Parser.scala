package typings.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser[T] extends StObject {
  
  var astFormat: String = js.native
  
  var hasPragma: js.UndefOr[js.Function1[/* text */ String, Boolean]] = js.native
  
  def locEnd(node: T): Double = js.native
  
  def locStart(node: T): Double = js.native
  
  def parse(text: String, parsers: StringDictionary[Parser[_]], options: ParserOptions[T]): T = js.native
  
  var preprocess: js.UndefOr[js.Function2[/* text */ String, /* options */ ParserOptions[T], String]] = js.native
}
object Parser {
  
  @scala.inline
  def apply[T](
    astFormat: String,
    locEnd: T => Double,
    locStart: T => Double,
    parse: (String, StringDictionary[Parser[_]], ParserOptions[T]) => T
  ): Parser[T] = {
    val __obj = js.Dynamic.literal(astFormat = astFormat.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), parse = js.Any.fromFunction3(parse))
    __obj.asInstanceOf[Parser[T]]
  }
  
  @scala.inline
  implicit class ParserMutableBuilder[Self <: Parser[_], T] (val x: Self with Parser[T]) extends AnyVal {
    
    @scala.inline
    def setAstFormat(value: String): Self = StObject.set(x, "astFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPragma(value: /* text */ String => Boolean): Self = StObject.set(x, "hasPragma", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPragmaUndefined: Self = StObject.set(x, "hasPragma", js.undefined)
    
    @scala.inline
    def setLocEnd(value: T => Double): Self = StObject.set(x, "locEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocStart(value: T => Double): Self = StObject.set(x, "locStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: (String, StringDictionary[Parser[_]], ParserOptions[T]) => T): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreprocess(value: (/* text */ String, /* options */ ParserOptions[T]) => String): Self = StObject.set(x, "preprocess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
  }
}
