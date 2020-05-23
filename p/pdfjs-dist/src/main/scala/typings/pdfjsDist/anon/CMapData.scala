package typings.pdfjsDist.anon

import typings.pdfjsDist.mod.CMapCompressionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMapData extends js.Object {
  var cMapData: js.Any
  var compressionType: CMapCompressionType
}

object CMapData {
  @scala.inline
  def apply(cMapData: js.Any, compressionType: CMapCompressionType): CMapData = {
    val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMapData]
  }
}

