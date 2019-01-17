package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvtDiagramLayoutContextLink extends js.Object {
  def getCoordinateSpace(): js.Any = js.native
  def getData(): js.Object | js.Array[_] = js.native
  def getEndConnectorOffset(): scala.Double = js.native
  def getEndId(): js.Any = js.native
  def getId(): js.Any = js.native
  def getLabelBounds(): atOracleOraclejetLib.Anon_H = js.native
  def getLabelHalign(): atOracleOraclejetLib.atOracleOraclejetLibStrings.left | atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.right = js.native
  def getLabelPosition(): atOracleOraclejetLib.Anon_XY = js.native
  def getLabelRotationAngle(): scala.Double = js.native
  def getLabelRotationPoint(): atOracleOraclejetLib.Anon_XY = js.native
  def getLabelValign(): atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.middle | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.baseline = js.native
  def getLinkWidth(): scala.Double = js.native
  def getPoints(): js.Array[_] = js.native
  def getSelected(): scala.Boolean = js.native
  def getStartConnectorOffset(): scala.Double = js.native
  def getStartId(): js.Any = js.native
  def isPromoted(): scala.Boolean = js.native
  def setCoordinateSpace(containerId: js.Any): scala.Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_center(halign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center): scala.Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_left(halign: atOracleOraclejetLib.atOracleOraclejetLibStrings.left): scala.Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_right(halign: atOracleOraclejetLib.atOracleOraclejetLibStrings.right): scala.Unit = js.native
  def setLabelPosition(pos: atOracleOraclejetLib.Anon_XY): scala.Unit = js.native
  def setLabelRotationAngle(angle: scala.Double): scala.Unit = js.native
  def setLabelRotationPoint(point: atOracleOraclejetLib.Anon_XY): scala.Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_baseline(valign: atOracleOraclejetLib.atOracleOraclejetLibStrings.baseline): scala.Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_bottom(valign: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom): scala.Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_middle(valign: atOracleOraclejetLib.atOracleOraclejetLibStrings.middle): scala.Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_top(valign: atOracleOraclejetLib.atOracleOraclejetLibStrings.top): scala.Unit = js.native
  def setPoints(points: js.Array[_]): scala.Unit = js.native
}

