package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CMapCompressionType extends js.Object

@JSImport("pdfjs-dist", "CMapCompressionType")
@js.native
object CMapCompressionType extends js.Object {
  @js.native
  sealed trait BINARY extends CMapCompressionType
  
  @js.native
  sealed trait NONE extends CMapCompressionType
  
  @js.native
  sealed trait STREAM extends CMapCompressionType
  
}

