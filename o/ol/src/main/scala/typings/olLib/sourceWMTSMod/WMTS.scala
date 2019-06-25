package typings
package olLib.sourceWMTSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTS
  extends olLib.sourceTileImageMod.default {
  def getDimensions(): js.Any = js.native
  def getFormat(): java.lang.String = js.native
  def getLayer(): java.lang.String = js.native
  def getMatrixSet(): java.lang.String = js.native
  def getRequestEncoding(): olLib.sourceWMTSRequestEncodingMod.WMTSRequestEncoding = js.native
  def getStyle(): java.lang.String = js.native
  def getVersion(): java.lang.String = js.native
  def updateDimensions(dimensions: js.Any): scala.Unit = js.native
}

