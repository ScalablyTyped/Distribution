package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.AnonH
import typings.oracleOraclejet.AnonXY
import typings.oracleOraclejet.oracleOraclejetStrings.baseline
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.right
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvtDiagramLayoutContextLink extends js.Object {
  def getCoordinateSpace(): js.Any = js.native
  def getData(): js.Object | js.Array[_] = js.native
  def getEndConnectorOffset(): Double = js.native
  def getEndId(): js.Any = js.native
  def getId(): js.Any = js.native
  def getLabelBounds(): AnonH = js.native
  def getLabelHalign(): left | center | right = js.native
  def getLabelPosition(): AnonXY = js.native
  def getLabelRotationAngle(): Double = js.native
  def getLabelRotationPoint(): AnonXY = js.native
  def getLabelValign(): top | middle | bottom | baseline = js.native
  def getLinkWidth(): Double = js.native
  def getPoints(): js.Array[_] = js.native
  def getSelected(): Boolean = js.native
  def getStartConnectorOffset(): Double = js.native
  def getStartId(): js.Any = js.native
  def isPromoted(): Boolean = js.native
  def setCoordinateSpace(containerId: js.Any): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_center(halign: center): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_left(halign: left): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_right(halign: right): Unit = js.native
  def setLabelPosition(pos: AnonXY): Unit = js.native
  def setLabelRotationAngle(angle: Double): Unit = js.native
  def setLabelRotationPoint(point: AnonXY): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_baseline(valign: baseline): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_bottom(valign: bottom): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_middle(valign: middle): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_top(valign: top): Unit = js.native
  def setPoints(points: js.Array[_]): Unit = js.native
}

