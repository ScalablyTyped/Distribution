package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libXmlXmlstreamreaderMod {
  
  inline def apply(doc: String): Unit = ^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(doc: String, options: XMLStreamReaderOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with XMLStreamReader {
    def this(doc: String) = this()
    def this(doc: String, options: XMLStreamReaderOptions) = this()
    
    /* CompleteClass */
    var attributes: Any = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var documentEncoding: String = js.native
    
    /* CompleteClass */
    var documentVersion: String = js.native
    
    /* CompleteClass */
    var done: Boolean = js.native
    
    /* CompleteClass */
    var error: String = js.native
    
    /* CompleteClass */
    override def hasError(): Boolean = js.native
    
    /* CompleteClass */
    override def isCData(): Boolean = js.native
    
    /* CompleteClass */
    override def isCharacters(): Boolean = js.native
    
    /* CompleteClass */
    override def isComment(): Boolean = js.native
    
    /* CompleteClass */
    override def isDTD(): Boolean = js.native
    
    /* CompleteClass */
    override def isDeclaration(): Boolean = js.native
    
    /* CompleteClass */
    override def isEmptyElement(): Boolean = js.native
    
    /* CompleteClass */
    override def isEndElement(): Boolean = js.native
    
    /* CompleteClass */
    override def isProcessingInstruction(): Boolean = js.native
    
    /* CompleteClass */
    override def isStartElement(): Boolean = js.native
    
    /* CompleteClass */
    var localName: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var namespaceUri: String = js.native
    
    /* CompleteClass */
    var prefix: String = js.native
    
    /* CompleteClass */
    override def readNext(): TokenString = js.native
    
    /* CompleteClass */
    override def readNextStartElement(): TokenString = js.native
    
    /* CompleteClass */
    var resolvedAttributes: js.Array[ResolvedAttribute] = js.native
    
    /* CompleteClass */
    override def skipCurrentElement(): TokenString = js.native
    
    /* CompleteClass */
    override def skipToNextStartElement(): TokenString = js.native
    
    /* CompleteClass */
    var standaloneDocument: Boolean = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    var tokenType: TokenString = js.native
  }
  @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFile(filePath: String): XMLStreamReader = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[XMLStreamReader]
  inline def parseFile(filePath: String, options: XMLStreamReaderOptions): XMLStreamReader = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLStreamReader]
  
  trait ResolvedAttribute extends StObject {
    
    var localName: String
    
    var name: String
    
    var namespaceUri: String
    
    var prefix: String
    
    var value: String
  }
  object ResolvedAttribute {
    
    inline def apply(localName: String, name: String, namespaceUri: String, prefix: String, value: String): ResolvedAttribute = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedAttribute] (val x: Self) extends AnyVal {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenString = typings.nginstackEngine.libXmlTokenTypeMod.TokenString
  
  trait XMLStreamReader extends StObject {
    
    var attributes: Any
    
    def close(): Unit
    
    var documentEncoding: String
    
    var documentVersion: String
    
    var done: Boolean
    
    var error: String
    
    def hasError(): Boolean
    
    def isCData(): Boolean
    
    def isCharacters(): Boolean
    
    def isComment(): Boolean
    
    def isDTD(): Boolean
    
    def isDeclaration(): Boolean
    
    def isEmptyElement(): Boolean
    
    def isEndElement(): Boolean
    
    def isProcessingInstruction(): Boolean
    
    def isStartElement(): Boolean
    
    var localName: String
    
    var name: String
    
    var namespaceUri: String
    
    var prefix: String
    
    def readNext(): TokenString
    
    def readNextStartElement(): TokenString
    
    var resolvedAttributes: js.Array[ResolvedAttribute]
    
    def skipCurrentElement(): TokenString
    
    def skipToNextStartElement(): TokenString
    
    var standaloneDocument: Boolean
    
    var text: String
    
    var tokenType: TokenString
  }
  object XMLStreamReader {
    
    inline def apply(
      attributes: Any,
      close: () => Unit,
      documentEncoding: String,
      documentVersion: String,
      done: Boolean,
      error: String,
      hasError: () => Boolean,
      isCData: () => Boolean,
      isCharacters: () => Boolean,
      isComment: () => Boolean,
      isDTD: () => Boolean,
      isDeclaration: () => Boolean,
      isEmptyElement: () => Boolean,
      isEndElement: () => Boolean,
      isProcessingInstruction: () => Boolean,
      isStartElement: () => Boolean,
      localName: String,
      name: String,
      namespaceUri: String,
      prefix: String,
      readNext: () => TokenString,
      readNextStartElement: () => TokenString,
      resolvedAttributes: js.Array[ResolvedAttribute],
      skipCurrentElement: () => TokenString,
      skipToNextStartElement: () => TokenString,
      standaloneDocument: Boolean,
      text: String,
      tokenType: TokenString
    ): XMLStreamReader = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), documentEncoding = documentEncoding.asInstanceOf[js.Any], documentVersion = documentVersion.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hasError = js.Any.fromFunction0(hasError), isCData = js.Any.fromFunction0(isCData), isCharacters = js.Any.fromFunction0(isCharacters), isComment = js.Any.fromFunction0(isComment), isDTD = js.Any.fromFunction0(isDTD), isDeclaration = js.Any.fromFunction0(isDeclaration), isEmptyElement = js.Any.fromFunction0(isEmptyElement), isEndElement = js.Any.fromFunction0(isEndElement), isProcessingInstruction = js.Any.fromFunction0(isProcessingInstruction), isStartElement = js.Any.fromFunction0(isStartElement), localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], readNext = js.Any.fromFunction0(readNext), readNextStartElement = js.Any.fromFunction0(readNextStartElement), resolvedAttributes = resolvedAttributes.asInstanceOf[js.Any], skipCurrentElement = js.Any.fromFunction0(skipCurrentElement), skipToNextStartElement = js.Any.fromFunction0(skipToNextStartElement), standaloneDocument = standaloneDocument.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMLStreamReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLStreamReader] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDocumentEncoding(value: String): Self = StObject.set(x, "documentEncoding", value.asInstanceOf[js.Any])
      
      inline def setDocumentVersion(value: String): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHasError(value: () => Boolean): Self = StObject.set(x, "hasError", js.Any.fromFunction0(value))
      
      inline def setIsCData(value: () => Boolean): Self = StObject.set(x, "isCData", js.Any.fromFunction0(value))
      
      inline def setIsCharacters(value: () => Boolean): Self = StObject.set(x, "isCharacters", js.Any.fromFunction0(value))
      
      inline def setIsComment(value: () => Boolean): Self = StObject.set(x, "isComment", js.Any.fromFunction0(value))
      
      inline def setIsDTD(value: () => Boolean): Self = StObject.set(x, "isDTD", js.Any.fromFunction0(value))
      
      inline def setIsDeclaration(value: () => Boolean): Self = StObject.set(x, "isDeclaration", js.Any.fromFunction0(value))
      
      inline def setIsEmptyElement(value: () => Boolean): Self = StObject.set(x, "isEmptyElement", js.Any.fromFunction0(value))
      
      inline def setIsEndElement(value: () => Boolean): Self = StObject.set(x, "isEndElement", js.Any.fromFunction0(value))
      
      inline def setIsProcessingInstruction(value: () => Boolean): Self = StObject.set(x, "isProcessingInstruction", js.Any.fromFunction0(value))
      
      inline def setIsStartElement(value: () => Boolean): Self = StObject.set(x, "isStartElement", js.Any.fromFunction0(value))
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setReadNext(value: () => TokenString): Self = StObject.set(x, "readNext", js.Any.fromFunction0(value))
      
      inline def setReadNextStartElement(value: () => TokenString): Self = StObject.set(x, "readNextStartElement", js.Any.fromFunction0(value))
      
      inline def setResolvedAttributes(value: js.Array[ResolvedAttribute]): Self = StObject.set(x, "resolvedAttributes", value.asInstanceOf[js.Any])
      
      inline def setResolvedAttributesVarargs(value: ResolvedAttribute*): Self = StObject.set(x, "resolvedAttributes", js.Array(value*))
      
      inline def setSkipCurrentElement(value: () => TokenString): Self = StObject.set(x, "skipCurrentElement", js.Any.fromFunction0(value))
      
      inline def setSkipToNextStartElement(value: () => TokenString): Self = StObject.set(x, "skipToNextStartElement", js.Any.fromFunction0(value))
      
      inline def setStandaloneDocument(value: Boolean): Self = StObject.set(x, "standaloneDocument", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: TokenString): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
  
  trait XMLStreamReaderOptions extends StObject {
    
    var expandEmpty: js.UndefOr[Boolean] = js.undefined
    
    var trimText: js.UndefOr[Boolean] = js.undefined
  }
  object XMLStreamReaderOptions {
    
    inline def apply(): XMLStreamReaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLStreamReaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLStreamReaderOptions] (val x: Self) extends AnyVal {
      
      inline def setExpandEmpty(value: Boolean): Self = StObject.set(x, "expandEmpty", value.asInstanceOf[js.Any])
      
      inline def setExpandEmptyUndefined: Self = StObject.set(x, "expandEmpty", js.undefined)
      
      inline def setTrimText(value: Boolean): Self = StObject.set(x, "trimText", value.asInstanceOf[js.Any])
      
      inline def setTrimTextUndefined: Self = StObject.set(x, "trimText", js.undefined)
    }
  }
}
