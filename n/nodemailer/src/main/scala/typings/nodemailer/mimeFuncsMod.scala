package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodemailer.nodemailerStrings.B
import typings.nodemailer.nodemailerStrings.Q
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeFuncsMod {
  
  @JSImport("nodemailer/lib/mime-funcs", "buildHeaderParam")
  @js.native
  def buildHeaderParam(key: String, data: String): js.Array[ParsedHeaderParam] = js.native
  @JSImport("nodemailer/lib/mime-funcs", "buildHeaderParam")
  @js.native
  def buildHeaderParam(key: String, data: String, maxLength: Double): js.Array[ParsedHeaderParam] = js.native
  @JSImport("nodemailer/lib/mime-funcs", "buildHeaderParam")
  @js.native
  def buildHeaderParam(key: String, data: Buffer): js.Array[ParsedHeaderParam] = js.native
  @JSImport("nodemailer/lib/mime-funcs", "buildHeaderParam")
  @js.native
  def buildHeaderParam(key: String, data: Buffer, maxLength: Double): js.Array[ParsedHeaderParam] = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "buildHeaderValue")
  @js.native
  def buildHeaderValue(structured: HeaderValue): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "detectExtension")
  @js.native
  def detectExtension(mimeType: String): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "detectMimeType")
  @js.native
  def detectMimeType(extension: String): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "encodeURICharComponent")
  @js.native
  def encodeURICharComponent(chr: String): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord(data: String): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord(data: String, mimeWordEncoding: js.UndefOr[scala.Nothing], maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord(data: Buffer): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord(data: Buffer, mimeWordEncoding: js.UndefOr[scala.Nothing], maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_B(data: String, mimeWordEncoding: B): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_B(data: String, mimeWordEncoding: B, maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_B(data: Buffer, mimeWordEncoding: B): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_B(data: Buffer, mimeWordEncoding: B, maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_Q(data: String, mimeWordEncoding: Q): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_Q(data: String, mimeWordEncoding: Q, maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_Q(data: Buffer, mimeWordEncoding: Q): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWord")
  @js.native
  def encodeWord_Q(data: Buffer, mimeWordEncoding: Q, maxLength: Double): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "encodeWords")
  @js.native
  def encodeWords(value: String): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWords")
  @js.native
  def encodeWords(value: String, mimeWordEncoding: js.UndefOr[scala.Nothing], maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWords")
  @js.native
  def encodeWords_B(value: String, mimeWordEncoding: B): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWords")
  @js.native
  def encodeWords_B(value: String, mimeWordEncoding: B, maxLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWords")
  @js.native
  def encodeWords_Q(value: String, mimeWordEncoding: Q): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "encodeWords")
  @js.native
  def encodeWords_Q(value: String, mimeWordEncoding: Q, maxLength: Double): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "foldLines")
  @js.native
  def foldLines(str: String): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "foldLines")
  @js.native
  def foldLines(str: String, lineLength: js.UndefOr[scala.Nothing], afterSpace: Boolean): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "foldLines")
  @js.native
  def foldLines(str: String, lineLength: Double): String = js.native
  @JSImport("nodemailer/lib/mime-funcs", "foldLines")
  @js.native
  def foldLines(str: String, lineLength: Double, afterSpace: Boolean): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "hasLongerLines")
  @js.native
  def hasLongerLines(str: String, lineLength: Double): Boolean = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "isPlainText")
  @js.native
  def isPlainText(value: String): Boolean = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "parseHeaderValue")
  @js.native
  def parseHeaderValue(str: String): ParsedHeaderValue = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "safeEncodeURIComponent")
  @js.native
  def safeEncodeURIComponent(str: String): String = js.native
  
  @JSImport("nodemailer/lib/mime-funcs", "splitMimeEncodedString")
  @js.native
  def splitMimeEncodedString(str: String): js.Array[String] = js.native
  @JSImport("nodemailer/lib/mime-funcs", "splitMimeEncodedString")
  @js.native
  def splitMimeEncodedString(str: String, maxlen: Double): js.Array[String] = js.native
  
  @js.native
  trait HeaderValue extends StObject {
    
    var params: js.UndefOr[StringDictionary[String]] = js.native
    
    var value: String = js.native
  }
  object HeaderValue {
    
    @scala.inline
    def apply(value: String): HeaderValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderValue]
    }
    
    @scala.inline
    implicit class HeaderValueMutableBuilder[Self <: HeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedHeaderParam extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object ParsedHeaderParam {
    
    @scala.inline
    def apply(key: String, value: String): ParsedHeaderParam = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHeaderParam]
    }
    
    @scala.inline
    implicit class ParsedHeaderParamMutableBuilder[Self <: ParsedHeaderParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedHeaderValue extends HeaderValue {
    
    @JSName("params")
    var params_ParsedHeaderValue: StringDictionary[String] = js.native
  }
  object ParsedHeaderValue {
    
    @scala.inline
    def apply(params: StringDictionary[String], value: String): ParsedHeaderValue = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHeaderValue]
    }
    
    @scala.inline
    implicit class ParsedHeaderValueMutableBuilder[Self <: ParsedHeaderValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
