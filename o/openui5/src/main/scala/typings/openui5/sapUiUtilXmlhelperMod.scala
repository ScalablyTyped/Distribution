package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.openui5Strings.error
import typings.openui5.openui5Strings.warning
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Attr
import typings.std.Node
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUtilXmlhelperMod extends Shortcut {
  
  @JSImport("sap/ui/util/XMLHelper", JSImport.Default)
  @js.native
  val default: XMLHelper = js.native
  
  /**
    * @SINCE 1.58
    *
    * Provides functionality for parsing XML formatted strings and serializing XML documents.
    */
  @js.native
  trait XMLHelper extends StObject {
    
    /**
      * Extracts parse error information from the specified document (if any).
      *
      * If an error was found, the returned object contains a browser-specific subset of the properties described
      * in {@link module:sap/base/util/XMLHelper.XMLParseErrorInfo XMLParseErrorInfo}. Otherwise, it just contains
      * an `errorCode` property with value 0.
      *
      * @returns A browser-specific error info object if errors were found, or an object with an errorCode
      * of 0 only
      */
    def getParseError(/**
      * The parsed XML document
      */
    oDocument: XMLDocument): XMLParseErrorInfo = js.native
    
    /**
      * Parses the specified XML string into an XML document, using the native parsing functionality of the browser.
      * If an error occurs during parsing, a {@link module:sap/base/util/XMLHelper.XMLParseErrorInfo parse error
      * info object} is attached as the `parseError` property of the returned document.
      *
      * @returns the parsed XML document with a `parseError` property as described in {@link #getParseError}.
      * An error occurred if the `errorCode` property of the `parseError` is not 0.
      */
    def parse(/**
      * An XML string
      */
    sXMLText: String): XMLDocument = js.native
    
    def serialize(/**
      * the XML document object to be serialized as string
      */
    oXMLDocument: Attr): String = js.native
    /**
      * Serializes the specified DOM tree into a string representation.
      * See:
      * 	{@link https://developer.mozilla.org/en-US/docs/Web/API/XMLSerializer/serializeToString}
      *
      * @returns the serialized XML string
      */
    def serialize(/**
      * the XML document object to be serialized as string
      */
    oXMLDocument: Node): String = js.native
  }
  
  trait XMLParseErrorInfo extends StObject {
    
    var errorCode: js.UndefOr[int] = js.undefined
    
    var filepos: js.UndefOr[int] = js.undefined
    
    var line: js.UndefOr[int] = js.undefined
    
    var linepos: js.UndefOr[int] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var srcText: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[error | warning] = js.undefined
    
    var url: js.UndefOr[URI] = js.undefined
  }
  object XMLParseErrorInfo {
    
    inline def apply(): XMLParseErrorInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLParseErrorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLParseErrorInfo] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: int): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setFilepos(value: int): Self = StObject.set(x, "filepos", value.asInstanceOf[js.Any])
      
      inline def setFileposUndefined: Self = StObject.set(x, "filepos", js.undefined)
      
      inline def setLine(value: int): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setLinepos(value: int): Self = StObject.set(x, "linepos", value.asInstanceOf[js.Any])
      
      inline def setLineposUndefined: Self = StObject.set(x, "linepos", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSrcText(value: String): Self = StObject.set(x, "srcText", value.asInstanceOf[js.Any])
      
      inline def setSrcTextUndefined: Self = StObject.set(x, "srcText", js.undefined)
      
      inline def setType(value: error | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: URI): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type _To = XMLHelper
  
  /* This means you don't have to write `default`, but can instead just say `sapUiUtilXmlhelperMod.foo` */
  override def _to: XMLHelper = default
}
