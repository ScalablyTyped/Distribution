package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/text-document/
trait TextDocument extends StObject {
  
  val eol: String
  
  def getLineRangeForRange(range: Range): Range
  
  def getTextInRange(range: Range): String
  
  val isClosed: Boolean
  
  val isDirty: Boolean
  
  val isEmpty: Boolean
  
  val isRemote: Boolean
  
  val isUntitled: Boolean
  
  val length: Double
  
  def onDidChangePath(callback: js.Function2[/* document */ this.type, /* path */ String | Null, Unit]): Disposable
  
  def onDidChangeSyntax(callback: js.Function2[/* document */ this.type, /* syntax */ String | Null, Unit]): Disposable
  
  val path: String | Null
  
  val syntax: String | Null
  
  val uri: String
}
object TextDocument {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(eol = eol.asInstanceOf[js.Any], getLineRangeForRange = js.Any.fromFunction1(getLineRangeForRange), getTextInRange = js.Any.fromFunction1(getTextInRange), isClosed = isClosed.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isRemote = isRemote.asInstanceOf[js.Any], isUntitled = isUntitled.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onDidChangePath = js.Any.fromFunction1(onDidChangePath), onDidChangeSyntax = js.Any.fromFunction1(onDidChangeSyntax), uri = uri.asInstanceOf[js.Any], path = null, syntax = null)
    __obj.asInstanceOf[TextDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDocument] (val x: Self) extends AnyVal {
    
    inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setGetLineRangeForRange(value: Range => Range): Self = StObject.set(x, "getLineRangeForRange", js.Any.fromFunction1(value))
    
    inline def setGetTextInRange(value: Range => String): Self = StObject.set(x, "getTextInRange", js.Any.fromFunction1(value))
    
    inline def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsRemote(value: Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    
    inline def setIsUntitled(value: Boolean): Self = StObject.set(x, "isUntitled", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOnDidChangePath(value: js.Function2[TextDocument, /* path */ String | Null, Unit] => Disposable): Self = StObject.set(x, "onDidChangePath", js.Any.fromFunction1(value))
    
    inline def setOnDidChangeSyntax(value: js.Function2[TextDocument, /* syntax */ String | Null, Unit] => Disposable): Self = StObject.set(x, "onDidChangeSyntax", js.Any.fromFunction1(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
