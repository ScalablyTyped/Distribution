package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/text-document/
@js.native
trait TextDocument extends js.Object {
  
  val eol: String = js.native
  
  def getLineRangeForRange(range: Range): Range = js.native
  
  def getTextInRange(range: Range): String = js.native
  
  val isClosed: Boolean = js.native
  
  val isDirty: Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  val isRemote: Boolean = js.native
  
  val isUntitled: Boolean = js.native
  
  val length: Double = js.native
  
  def onDidChangePath(callback: js.Function2[/* document */ this.type, /* path */ String | Null, Unit]): Disposable = js.native
  
  def onDidChangeSyntax(callback: js.Function2[/* document */ this.type, /* syntax */ String | Null, Unit]): Disposable = js.native
  
  val path: String | Null = js.native
  
  val syntax: String | Null = js.native
  
  val uri: String = js.native
}
object TextDocument {
  
  @scala.inline
  def apply(
    eol: String,
    getLineRangeForRange: Range => Range,
    getTextInRange: Range => String,
    isClosed: Boolean,
    isDirty: Boolean,
    isEmpty: Boolean,
    isRemote: Boolean,
    isUntitled: Boolean,
    length: Double,
    onDidChangePath: js.Function2[TextDocument, /* path */ String | Null, Unit] => Disposable,
    onDidChangeSyntax: js.Function2[TextDocument, /* syntax */ String | Null, Unit] => Disposable,
    uri: String
  ): TextDocument = {
    val __obj = js.Dynamic.literal(eol = eol.asInstanceOf[js.Any], getLineRangeForRange = js.Any.fromFunction1(getLineRangeForRange), getTextInRange = js.Any.fromFunction1(getTextInRange), isClosed = isClosed.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isRemote = isRemote.asInstanceOf[js.Any], isUntitled = isUntitled.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onDidChangePath = js.Any.fromFunction1(onDidChangePath), onDidChangeSyntax = js.Any.fromFunction1(onDidChangeSyntax), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocument]
  }
  
  @scala.inline
  implicit class TextDocumentOps[Self <: TextDocument] (val x: Self) extends AnyVal {
    
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
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineRangeForRange(value: Range => Range): Self = this.set("getLineRangeForRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTextInRange(value: Range => String): Self = this.set("getTextInRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = this.set("isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemote(value: Boolean): Self = this.set("isRemote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUntitled(value: Boolean): Self = this.set("isUntitled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDidChangePath(value: js.Function2[TextDocument, /* path */ String | Null, Unit] => Disposable): Self = this.set("onDidChangePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangeSyntax(value: js.Function2[TextDocument, /* syntax */ String | Null, Unit] => Disposable): Self = this.set("onDidChangeSyntax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxNull: Self = this.set("syntax", null)
  }
}
