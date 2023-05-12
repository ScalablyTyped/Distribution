package typings.ol

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatXmlMod {
  
  /**
    * @classdesc
    * Generic format for reading non-feature XML data
    *
    * @abstract
    */
  @JSImport("ol/format/XML", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with XML
  
  /**
    * @classdesc
    * Generic format for reading non-feature XML data
    *
    * @abstract
    */
  @js.native
  trait XML extends StObject {
    
    def read(source: String): Any = js.native
    /**
      * Read the source document.
      *
      * @param {Document|Element|string} source The XML source.
      * @return {Object} An object representing the source.
      * @api
      */
    def read(source: Document): Any = js.native
    def read(source: Element): Any = js.native
    
    /**
      * @param {Document} doc Document.
      * @return {Object} Object
      */
    def readFromDocument(doc: Document): Any = js.native
    
    /**
      * @abstract
      * @param {Element} node Node.
      * @return {Object} Object
      */
    def readFromNode(node: Element): Any = js.native
  }
}
