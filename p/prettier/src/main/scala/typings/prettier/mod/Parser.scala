package typings.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser[T] extends js.Object {
  
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
  implicit class ParserOps[Self <: Parser[_], T] (val x: Self with Parser[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAstFormat(value: String): Self = this.set("astFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocEnd(value: T => Double): Self = this.set("locEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocStart(value: T => Double): Self = this.set("locStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: (String, StringDictionary[Parser[_]], ParserOptions[T]) => T): Self = this.set("parse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHasPragma(value: /* text */ String => Boolean): Self = this.set("hasPragma", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasPragma: Self = this.set("hasPragma", js.undefined)
    
    @scala.inline
    def setPreprocess(value: (/* text */ String, /* options */ ParserOptions[T]) => String): Self = this.set("preprocess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
  }
}
