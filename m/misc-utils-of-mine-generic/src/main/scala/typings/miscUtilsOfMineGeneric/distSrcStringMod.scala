package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Pos
import typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide
import typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle
import typings.miscUtilsOfMineGeneric.distSrcStringEncryptLettersMod.EncryptLettersConfig
import typings.miscUtilsOfMineGeneric.distSrcStringHtmlMod.HtmlElementConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string", "BorderSide")
  @js.native
  object BorderSide extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide & String] = js.native
    
    /* "bottom" */ val bottom: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.bottom & String = js.native
    
    /* "bottomLeft" */ val bottomLeft: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.bottomLeft & String = js.native
    
    /* "bottomRight" */ val bottomRight: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.bottomRight & String = js.native
    
    /* "left" */ val left: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.left & String = js.native
    
    /* "right" */ val right: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.right & String = js.native
    
    /* "top" */ val top: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.top & String = js.native
    
    /* "topLeft" */ val topLeft: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.topLeft & String = js.native
    
    /* "topRight" */ val topRight: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderSide.topRight & String = js.native
  }
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string", "BorderStyle")
  @js.native
  object BorderStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle & String] = js.native
    
    /* "classic" */ val classic: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.classic & String = js.native
    
    /* "double" */ val double: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.double & String = js.native
    
    /* "doubleLight" */ val doubleLight: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.doubleLight & String = js.native
    
    /* "heavier" */ val heavier: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavier & String = js.native
    
    /* "heavy" */ val heavy: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavy & String = js.native
    
    /* "heavyDoubleDash" */ val heavyDoubleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavyDoubleDash & String = js.native
    
    /* "heavyQuadrupleDash" */ val heavyQuadrupleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavyQuadrupleDash & String = js.native
    
    /* "heavyTripleDash" */ val heavyTripleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.heavyTripleDash & String = js.native
    
    /* "light" */ val light: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.light & String = js.native
    
    /* "lightDouble" */ val lightDouble: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightDouble & String = js.native
    
    /* "lightDoubleDash" */ val lightDoubleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightDoubleDash & String = js.native
    
    /* "lightQuadrupleDash" */ val lightQuadrupleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightQuadrupleDash & String = js.native
    
    /* "lightTripleDash" */ val lightTripleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.lightTripleDash & String = js.native
    
    /* "round" */ val round: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.round & String = js.native
    
    /* "roundDoubleDash" */ val roundDoubleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.roundDoubleDash & String = js.native
    
    /* "roundQuadrupleDash" */ val roundQuadrupleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.roundQuadrupleDash & String = js.native
    
    /* "roundTripleDash" */ val roundTripleDash: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.roundTripleDash & String = js.native
    
    /* "singleRareCorners" */ val singleRareCorners: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.singleRareCorners & String = js.native
    
    /* "triangleCorners" */ val triangleCorners: typings.miscUtilsOfMineGeneric.distSrcStringBoxesMod.BorderStyle.triangleCorners & String = js.native
  }
  
  inline def addUniqueParam(url: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addUniqueParam")(url.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string", "borderStyles")
  @js.native
  val borderStyles: js.Array[String] = js.native
  
  inline def capitalize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def changeText(text: String, toInsert: js.Array[Pos]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeText")(text.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decryptLetters(config: EncryptLettersConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptLetters")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encryptLetters(config: EncryptLettersConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptLetters")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHtmlAttribute(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtmlAttribute")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def evaluate[T](s: String, defaultValue: Unit): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def getBoxChar(s: BorderStyle, si: BorderSide): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoxChar")(s.asInstanceOf[js.Any], si.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPosition(string: String, subString: String, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(string.asInstanceOf[js.Any], subString.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPreviousMatchingPos(text: String, pos: Double, predicate: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMatchingPos")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPreviousMatchingPos(text: String, pos: Double, predicate: js.Function1[/* char */ String, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMatchingPos")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hashCode_(s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashCode")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def htmlElement(config: HtmlElementConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlElement")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def indent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")().asInstanceOf[String]
  inline def indent(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def indent(i: Double, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def indent(i: Unit, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(i.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def quote(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def quote(s: String, quote: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("quote")(s.asInstanceOf[js.Any], quote.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeEmptyLines(c: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyLines")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeEmptyLines(c: String, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyLines")(c.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeWhites(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWhites")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def removeWhites(s: String, replaceWith: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWhites")(s.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def repeat(n: Double, s: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shorter(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shorter")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def shorter(text: String, much: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shorter")(text.asInstanceOf[js.Any], much.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringToObject(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")().asInstanceOf[Any]
  inline def stringToObject(s: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: String, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: String, propSep: Unit, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: String, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def stringToObject(s: Unit, propSep: Unit, nameValueSep: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToObject")(s.asInstanceOf[js.Any], propSep.asInstanceOf[js.Any], nameValueSep.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def strip(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styleObjectToCss(o: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styleObjectToCss")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def styleObjectToCss(o: js.Object, propertiesSeparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("styleObjectToCss")(o.asInstanceOf[js.Any], propertiesSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stylePropertyNameToCssSyntax(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stylePropertyNameToCssSyntax")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def template(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def template(str: String, data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def trimRightLines(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimRightLines")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trimRightLines(s: String, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimRightLines")(s.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unEscapeHtmlAttribute(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unEscapeHtmlAttribute")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unquote(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unquote")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wordWrap(s: String, w: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(s.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def wordWrap(s: String, w: Double, newLine: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(s.asInstanceOf[js.Any], w.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wrapInHtml(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInHtml")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
