package typings.pinyin4js

import typings.pinyin4js.mod.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pinyin4js {
    
    @JSGlobal("pinyin4js")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("pinyin4js.FIRST_LETTER")
    @js.native
    val FIRST_LETTER: typings.pinyin4js.mod.FIRST_LETTER = js.native
    
    @JSGlobal("pinyin4js.WITHOUT_TONE")
    @js.native
    val WITHOUT_TONE: typings.pinyin4js.mod.WITHOUT_TONE = js.native
    
    @JSGlobal("pinyin4js.WITH_TONE_MARK")
    @js.native
    val WITH_TONE_MARK: typings.pinyin4js.mod.WITH_TONE_MARK = js.native
    
    @JSGlobal("pinyin4js.WITH_TONE_NUMBER")
    @js.native
    val WITH_TONE_NUMBER: typings.pinyin4js.mod.WITH_TONE_NUMBER = js.native
    
    inline def convertToPinyinString(str: String, separator: String, format: format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPinyinString")(str.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def convertToSimplifiedChinese(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToSimplifiedChinese")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def convertToTraditionalChinese(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToTraditionalChinese")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getShortPinyin(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortPinyin")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
