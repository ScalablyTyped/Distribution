package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/scanner/
@js.native
trait Scanner extends js.Object {
  
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
  implicit class ScannerOps[Self <: Scanner] (val x: Self) extends AnyVal {
    
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
    def setAtEnd(value: Boolean): Self = this.set("atEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanChars(value: Charset => String | Null): Self = this.set("scanChars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanFloat(value: () => Double | Null): Self = this.set("scanFloat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanHexFloat(value: () => Double | Null): Self = this.set("scanHexFloat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanHexInt(value: () => Double | Null): Self = this.set("scanHexInt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanInt(value: () => Double | Null): Self = this.set("scanInt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScanString(value: String => String | Null): Self = this.set("scanString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanUpToChars(value: Charset => String | Null): Self = this.set("scanUpToChars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScanUpToString(value: String => String | Null): Self = this.set("scanUpToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipChars(value: Charset): Self = this.set("skipChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
