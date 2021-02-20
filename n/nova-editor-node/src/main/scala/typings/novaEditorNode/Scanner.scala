package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/scanner/
@js.native
trait Scanner extends StObject {
  
  val atEnd: Boolean = js.native
  
  var caseSensitive: Boolean = js.native
  
  var location: Double = js.native
  
  def scanChars(charset: Charset): String | Null = js.native
  
  def scanFloat(): Double | Null = js.native
  
  def scanHexFloat(): Double | Null = js.native
  
  def scanHexInt(): Double | Null = js.native
  
  def scanInt(): Double | Null = js.native
  
  def scanString(string: String): String | Null = js.native
  
  def scanUpToChars(charset: Charset): String | Null = js.native
  
  def scanUpToString(string: String): String | Null = js.native
  
  var skipChars: Charset = js.native
  
  val string: String = js.native
}
object Scanner {
  
  @scala.inline
  def apply(
    atEnd: Boolean,
    caseSensitive: Boolean,
    location: Double,
    scanChars: Charset => String | Null,
    scanFloat: () => Double | Null,
    scanHexFloat: () => Double | Null,
    scanHexInt: () => Double | Null,
    scanInt: () => Double | Null,
    scanString: String => String | Null,
    scanUpToChars: Charset => String | Null,
    scanUpToString: String => String | Null,
    skipChars: Charset,
    string: String
  ): Scanner = {
    val __obj = js.Dynamic.literal(atEnd = atEnd.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], scanChars = js.Any.fromFunction1(scanChars), scanFloat = js.Any.fromFunction0(scanFloat), scanHexFloat = js.Any.fromFunction0(scanHexFloat), scanHexInt = js.Any.fromFunction0(scanHexInt), scanInt = js.Any.fromFunction0(scanInt), scanString = js.Any.fromFunction1(scanString), scanUpToChars = js.Any.fromFunction1(scanUpToChars), scanUpToString = js.Any.fromFunction1(scanUpToString), skipChars = skipChars.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanner]
  }
  
  @scala.inline
  implicit class ScannerMutableBuilder[Self <: Scanner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtEnd(value: Boolean): Self = StObject.set(x, "atEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanChars(value: Charset => String | Null): Self = StObject.set(x, "scanChars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanFloat(value: () => Double | Null): Self = StObject.set(x, "scanFloat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanHexFloat(value: () => Double | Null): Self = StObject.set(x, "scanHexFloat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanHexInt(value: () => Double | Null): Self = StObject.set(x, "scanHexInt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanInt(value: () => Double | Null): Self = StObject.set(x, "scanInt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanString(value: String => String | Null): Self = StObject.set(x, "scanString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanUpToChars(value: Charset => String | Null): Self = StObject.set(x, "scanUpToChars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanUpToString(value: String => String | Null): Self = StObject.set(x, "scanUpToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipChars(value: Charset): Self = StObject.set(x, "skipChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
