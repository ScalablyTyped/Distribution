package typings.pdfjsDist

import typings.pdfjsDist.mod.PDFJSStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdfjs-dist/webpack", JSImport.Namespace)
@js.native
object webpackMod extends js.Object {
  val PDFJS: PDFJSStatic = js.native
  @js.native
  object CMapCompressionType extends js.Object {
    /* 1 */ val BINARY: typings.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
    /* 0 */ val NONE: typings.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
    /* 2 */ val STREAM: typings.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.CMapCompressionType with Double] = js.native
  }
  
  @js.native
  object VerbosityLevel extends js.Object {
    /* 0 */ val ERRORS: typings.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
    /* 5 */ val INFOS: typings.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
    /* 1 */ val WARNINGS: typings.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.VerbosityLevel with Double] = js.native
  }
  
}

