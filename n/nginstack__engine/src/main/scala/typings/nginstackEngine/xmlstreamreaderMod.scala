package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlstreamreaderMod {
  
  inline def apply(doc: String): Unit = ^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with XMLStreamReader {
    def this(doc: String) = this()
  }
  @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ReadElementTextBehaviour {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadElementTextBehaviour")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadElementTextBehaviour.ErrorOnUnexpectedElement")
    @js.native
    val ErrorOnUnexpectedElement: Double = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadElementTextBehaviour.IncludeChildElements")
    @js.native
    val IncludeChildElements: Double = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadElementTextBehaviour.SkipChildElements")
    @js.native
    val SkipChildElements: Double = js.native
  }
  
  object ReadError {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadError.CustomError")
    @js.native
    val CustomError: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadError.NoError")
    @js.native
    val NoError: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadError.NotWellFormedError")
    @js.native
    val NotWellFormedError: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadError.PrematureEndOfDocumentError")
    @js.native
    val PrematureEndOfDocumentError: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "ReadError.UnexpectedElementError")
    @js.native
    val UnexpectedElementError: String = js.native
  }
  
  object TokenType {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.Characters")
    @js.native
    val Characters: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.Comment")
    @js.native
    val Comment: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.DTD")
    @js.native
    val DTD: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.EndDocument")
    @js.native
    val EndDocument: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.EndElement")
    @js.native
    val EndElement: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.EntityReference")
    @js.native
    val EntityReference: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.Invalid")
    @js.native
    val Invalid: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.NoToken")
    @js.native
    val NoToken: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.ProcessingInstruction")
    @js.native
    val ProcessingInstruction: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.StartDocument")
    @js.native
    val StartDocument: String = js.native
    
    @JSImport("@nginstack/engine/lib/xml/XMLStreamReader", "TokenType.StartElement")
    @js.native
    val StartElement: String = js.native
  }
  
  inline def parseFile(filePath: String): XMLStreamReader = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[XMLStreamReader]
  
  @js.native
  trait XMLStreamReader extends StObject {
    
    def addData(data: String): Unit = js.native
    
    var atEnd: Boolean = js.native
    
    var attributes: js.Array[XmlStreamAttribute] = js.native
    
    def close(): Unit = js.native
    
    var documentEncoding: String = js.native
    
    var documentVersion: String = js.native
    
    var dtdName: String = js.native
    
    var dtdPublicId: String = js.native
    
    var dtdSystemId: String = js.native
    
    var error: Any = js.native
    
    var errorString: String = js.native
    
    var hasError: Boolean = js.native
    
    var isCDATA: Boolean = js.native
    
    var isCharacters: Boolean = js.native
    
    var isComment: Boolean = js.native
    
    var isDTD: Boolean = js.native
    
    var isEndDocument: Boolean = js.native
    
    var isEndElement: Boolean = js.native
    
    var isEntityReference: Boolean = js.native
    
    var isProcessingInstruction: Boolean = js.native
    
    var isStandaloneDocument: Boolean = js.native
    
    var isStartDocument: Boolean = js.native
    
    var isWhitespace: Boolean = js.native
    
    var lineNumber: Double = js.native
    
    var name: String = js.native
    
    var namespaceDeclarations: js.Array[XmlStreamNamespaceDeclaration] = js.native
    
    var namespaceUri: String = js.native
    
    var prefix: String = js.native
    
    var processingInstructionData: String = js.native
    
    var qualifiedName: String = js.native
    
    def raiseError(msg: String): Unit = js.native
    
    def readElementText(): String = js.native
    def readElementText(behaviour: Any): String = js.native
    
    def readNext(): Any = js.native
    
    def readNextStartElement(): Boolean = js.native
    
    def skipCurrentElement(): Unit = js.native
    
    var tokenString: String = js.native
    
    var tokenType: Any = js.native
  }
  
  trait XmlStreamAttribute extends StObject {
    
    var isDefault: Boolean
    
    var name: String
    
    var namespaceUri: String
    
    var prefix: String
    
    var qualifiedName: String
    
    var value: String
  }
  object XmlStreamAttribute {
    
    inline def apply(
      isDefault: Boolean,
      name: String,
      namespaceUri: String,
      prefix: String,
      qualifiedName: String,
      value: String
    ): XmlStreamAttribute = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], qualifiedName = qualifiedName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlStreamAttribute]
    }
    
    extension [Self <: XmlStreamAttribute](x: Self) {
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setQualifiedName(value: String): Self = StObject.set(x, "qualifiedName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlStreamNamespaceDeclaration extends StObject {
    
    var namespaceUri: String
    
    var prefix: String
  }
  object XmlStreamNamespaceDeclaration {
    
    inline def apply(namespaceUri: String, prefix: String): XmlStreamNamespaceDeclaration = {
      val __obj = js.Dynamic.literal(namespaceUri = namespaceUri.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlStreamNamespaceDeclaration]
    }
    
    extension [Self <: XmlStreamNamespaceDeclaration](x: Self) {
      
      inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
