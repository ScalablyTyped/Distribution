package typings.ol

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("ol/format/XML", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with XML
  
  @js.native
  trait XML extends StObject {
    
    def read(source: String): Any = js.native
    /**
      * Read the source document.
      */
    def read(source: Document): Any = js.native
    def read(source: Element): Any = js.native
    
    def readFromDocument(doc: Document): Any = js.native
    
    def readFromNode(node: Element): Any = js.native
  }
}
