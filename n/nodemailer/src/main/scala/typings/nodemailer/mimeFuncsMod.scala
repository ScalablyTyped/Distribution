package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodemailer.nodemailerStrings.B
import typings.nodemailer.nodemailerStrings.Q
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeFuncsMod {
  
  @JSImport("nodemailer/lib/mime-funcs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildHeaderParam(key: String, data: String): js.Array[ParsedHeaderParam] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedHeaderParam]]
  inline def buildHeaderParam(key: String, data: String, maxLength: Double): js.Array[ParsedHeaderParam] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedHeaderParam]]
  inline def buildHeaderParam(key: String, data: Buffer): js.Array[ParsedHeaderParam] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedHeaderParam]]
  inline def buildHeaderParam(key: String, data: Buffer, maxLength: Double): js.Array[ParsedHeaderParam] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedHeaderParam]]
  
  inline def buildHeaderValue(structured: HeaderValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderValue")(structured.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectExtension(mimeType: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectExtension")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectMimeType(`extension`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectMimeType")(`extension`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeURICharComponent(chr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURICharComponent")(chr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeWord(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWord(data: String, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord(data: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWord(data: Buffer, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWord_B(data: String, mimeWordEncoding: B): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord_B(data: String, mimeWordEncoding: B, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord_B(data: Buffer, mimeWordEncoding: B): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord_B(data: Buffer, mimeWordEncoding: B, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWord_Q(data: String, mimeWordEncoding: Q): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord_Q(data: String, mimeWordEncoding: Q, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord_Q(data: Buffer, mimeWordEncoding: Q): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord_Q(data: Buffer, mimeWordEncoding: Q, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWords(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWords(value: String, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(value.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWords_B(value: String, mimeWordEncoding: B): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(value.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords_B(value: String, mimeWordEncoding: B, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(value.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWords_Q(value: String, mimeWordEncoding: Q): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(value.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords_Q(value: String, mimeWordEncoding: Q, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(value.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def foldLines(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def foldLines(str: String, lineLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLines(str: String, lineLength: Double, afterSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], afterSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLines(str: String, lineLength: Unit, afterSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], afterSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasLongerLines(str: String, lineLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLongerLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPlainText(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainText")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseHeaderValue(str: String): ParsedHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaderValue")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedHeaderValue]
  
  inline def safeEncodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeEncodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitMimeEncodedString(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitMimeEncodedString")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def splitMimeEncodedString(str: String, maxlen: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitMimeEncodedString")(str.asInstanceOf[js.Any], maxlen.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait HeaderValue extends StObject {
    
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var value: String
  }
  object HeaderValue {
    
    inline def apply(value: String): HeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderValue]
    }
    
    extension [Self <: HeaderValue](x: Self) {
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedHeaderParam extends StObject {
    
    var key: String
    
    var value: String
  }
  object ParsedHeaderParam {
    
    inline def apply(key: String, value: String): ParsedHeaderParam = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHeaderParam]
    }
    
    extension [Self <: ParsedHeaderParam](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedHeaderValue
    extends StObject
       with HeaderValue {
    
    @JSName("params")
    var params_ParsedHeaderValue: StringDictionary[String]
  }
  object ParsedHeaderValue {
    
    inline def apply(params: StringDictionary[String], value: String): ParsedHeaderValue = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHeaderValue]
    }
    
    extension [Self <: ParsedHeaderValue](x: Self) {
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
