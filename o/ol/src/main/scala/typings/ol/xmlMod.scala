package typings.ol

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("ol/format/XML", JSImport.Default)
  @js.native
  abstract class default () extends XML
  
  @js.native
  trait XML extends StObject {
    
    def read(source: String): js.Any = js.native
    /**
      * Read the source document.
      */
    def read(source: Document): js.Any = js.native
    def read(source: Element): js.Any = js.native
    
    def readFromDocument(doc: Document): js.Any = js.native
    
    def readFromNode(node: Element): js.Any = js.native
  }
}
