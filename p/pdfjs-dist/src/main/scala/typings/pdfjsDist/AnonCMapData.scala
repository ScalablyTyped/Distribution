package typings.pdfjsDist

import typings.pdfjsDist.mod.CMapCompressionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCMapData extends js.Object {
  var cMapData: js.Any
  var compressionType: CMapCompressionType
}

object AnonCMapData {
  @scala.inline
  def apply(cMapData: js.Any, compressionType: CMapCompressionType): AnonCMapData = {
    val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCMapData]
  }
}

