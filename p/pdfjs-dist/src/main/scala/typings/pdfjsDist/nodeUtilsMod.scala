package typings.pdfjsDist

import typings.pdfjsDist.anon.BaseUrl
import typings.pdfjsDist.anon.`0`
import typings.pdfjsDist.baseFactoryMod.BaseCMapReaderFactory
import typings.pdfjsDist.baseFactoryMod.BaseCanvasFactory
import typings.pdfjsDist.baseFactoryMod.BaseStandardFontDataFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeCMapReaderFactory")
  @js.native
  open class NodeCMapReaderFactory protected () extends BaseCMapReaderFactory {
    def this(hasBaseUrlIsCompressed: BaseUrl) = this()
  }
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeCanvasFactory")
  @js.native
  open class NodeCanvasFactory () extends BaseCanvasFactory
  
  @JSImport("pdfjs-dist/types/src/display/node_utils", "NodeStandardFontDataFactory")
  @js.native
  open class NodeStandardFontDataFactory protected () extends BaseStandardFontDataFactory {
    def this(hasBaseUrl: `0`) = this()
  }
}
