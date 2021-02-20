package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/text-document/
@js.native
trait TextDocument extends StObject {
  
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
  implicit class TextDocumentMutableBuilder[Self <: TextDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineRangeForRange(value: Range => Range): Self = StObject.set(x, "getLineRangeForRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTextInRange(value: Range => String): Self = StObject.set(x, "getTextInRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemote(value: Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUntitled(value: Boolean): Self = StObject.set(x, "isUntitled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDidChangePath(value: js.Function2[TextDocument, /* path */ String | Null, Unit] => Disposable): Self = StObject.set(x, "onDidChangePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangeSyntax(value: js.Function2[TextDocument, /* syntax */ String | Null, Unit] => Disposable): Self = StObject.set(x, "onDidChangeSyntax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNull: Self = StObject.set(x, "path", null)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
