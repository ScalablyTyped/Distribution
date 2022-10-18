package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayXfaTextMod {
  
  @JSImport("pdfjs-dist/types/src/display/xfa_text", "XfaText")
  @js.native
  open class XfaText () extends StObject
  /* static members */
  object XfaText {
    
    @JSImport("pdfjs-dist/types/src/display/xfa_text", "XfaText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {string} name - DOM node name. (lower case)
      *
      * @returns {boolean} true if the DOM node should have a corresponding text
      * node.
      */
    inline def shouldBuildText(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldBuildText")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Walk an XFA tree and create an array of text nodes that is compatible
      * with a regular PDFs TextContent. Currently, only TextItem.str is supported,
      * all other fields and styles haven't been implemented.
      *
      * @param {Object} xfa - An XFA fake DOM object.
      *
      * @returns {TextContent}
      */
    inline def textContent(xfa: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(xfa.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
