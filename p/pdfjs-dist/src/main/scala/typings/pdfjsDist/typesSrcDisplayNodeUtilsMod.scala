package typings.pdfjsDist

import typings.pdfjsDist.anon.BaseUrl
import typings.pdfjsDist.anon.`0`
import typings.pdfjsDist.typesSrcDisplayBaseFactoryMod.BaseCMapReaderFactory
import typings.pdfjsDist.typesSrcDisplayBaseFactoryMod.BaseCanvasFactory
import typings.pdfjsDist.typesSrcDisplayBaseFactoryMod.BaseStandardFontDataFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNodeUtilsMod {
  
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
