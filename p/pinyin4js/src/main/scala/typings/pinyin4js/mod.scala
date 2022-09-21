package typings.pinyin4js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pinyin4js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pinyin4js", "FIRST_LETTER")
  @js.native
  val FIRST_LETTER: typings.pinyin4js.mod.FIRST_LETTER = js.native
  type FIRST_LETTER = String
  
  @JSImport("pinyin4js", "WITHOUT_TONE")
  @js.native
  val WITHOUT_TONE: typings.pinyin4js.mod.WITHOUT_TONE = js.native
  type WITHOUT_TONE = String
  
  @JSImport("pinyin4js", "WITH_TONE_MARK")
  @js.native
  val WITH_TONE_MARK: typings.pinyin4js.mod.WITH_TONE_MARK = js.native
  type WITH_TONE_MARK = String
  
  @JSImport("pinyin4js", "WITH_TONE_NUMBER")
  @js.native
  val WITH_TONE_NUMBER: typings.pinyin4js.mod.WITH_TONE_NUMBER = js.native
  type WITH_TONE_NUMBER = String
  
  inline def convertToPinyinString(str: String, separator: String, format: format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPinyinString")(str.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertToSimplifiedChinese(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToSimplifiedChinese")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertToTraditionalChinese(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToTraditionalChinese")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getShortPinyin(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortPinyin")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type format = typings.pinyin4js.mod.WITH_TONE_NUMBER | typings.pinyin4js.mod.WITHOUT_TONE | typings.pinyin4js.mod.WITH_TONE_MARK | typings.pinyin4js.mod.FIRST_LETTER
}
