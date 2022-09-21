package typings.pdfobject

import typings.pdfobject.mod.Options
import typings.pdfobject.pdfobjectStrings.`2Dot2Dot3`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PDFObject {
    
    @JSGlobal("PDFObject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def embed(url: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def embed(url: String, target: Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def embed(url: String, target: Any, options: Options): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def embed(url: String, target: Unit, options: Options): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    @JSGlobal("PDFObject.pdfobjectversion")
    @js.native
    val pdfobjectversion: `2Dot2Dot3` = js.native
    
    @JSGlobal("PDFObject.supportsPDFs")
    @js.native
    val supportsPDFs: Boolean = js.native
  }
}
