package typings.peberminta

import typings.peberminta.mod.Data
import typings.peberminta.mod.Matcher
import typings.peberminta.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object charMod {
  
  @JSImport("peberminta/lib/char", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def anyOf[TOptions](chars: String): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(chars.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  inline def anyOf[TOptions](chars: js.Array[String]): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(chars.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def char[TOptions](char: String): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("char")(char.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def charTest[TOptions](regex: js.RegExp): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("charTest")(regex.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def concat[TOptions](ps: (Parser[String, TOptions, String | js.Array[String]])*): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def `match`[TOptions, TValue](matcher: Matcher[String, TOptions, TValue], str: String, options: TOptions): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(matcher.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TValue]
  inline def `match`[TOptions, TValue](matcher: Matcher[String, TOptions, TValue], str: js.Array[String], options: TOptions): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(matcher.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  inline def noneOf[TOptions](chars: String): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noneOf")(chars.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  inline def noneOf[TOptions](chars: js.Array[String]): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noneOf")(chars.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def oneOf[TOptions](chars: String): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chars.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  inline def oneOf[TOptions](chars: js.Array[String]): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chars.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def parse[TOptions, TValue](parser: Parser[String, TOptions, TValue], str: String, options: TOptions): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TValue]
  inline def parse[TOptions, TValue](parser: Parser[String, TOptions, TValue], str: js.Array[String], options: TOptions): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  inline def parserPosition(data: Data[String, Any], i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parserPosition")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parserPosition(data: Data[String, Any], i: Double, contextTokens: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parserPosition")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any], contextTokens.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def str[TOptions](str: String): Parser[String, TOptions, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(str.asInstanceOf[js.Any]).asInstanceOf[Parser[String, TOptions, String]]
  
  inline def tryParse[TOptions, TValue](parser: Parser[String, TOptions, TValue], str: String, options: TOptions): js.UndefOr[TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(parser.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TValue]]
  inline def tryParse[TOptions, TValue](parser: Parser[String, TOptions, TValue], str: js.Array[String], options: TOptions): js.UndefOr[TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(parser.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TValue]]
}
