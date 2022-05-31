package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.H
import typings.oracleOraclejet.anon.Y
import typings.oracleOraclejet.oracleOraclejetStrings.baseline
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.right
import typings.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvtDiagramLayoutContextLink extends StObject {
  
  def getCoordinateSpace(): js.Any = js.native
  
  def getData(): js.Object | js.Array[js.Any] = js.native
  
  def getEndConnectorOffset(): Double = js.native
  
  def getEndId(): js.Any = js.native
  
  def getId(): js.Any = js.native
  
  def getLabelBounds(): H = js.native
  
  def getLabelHalign(): left | center | right = js.native
  
  def getLabelPosition(): Y = js.native
  
  def getLabelRotationAngle(): Double = js.native
  
  def getLabelRotationPoint(): Y = js.native
  
  def getLabelValign(): top | middle | bottom | baseline = js.native
  
  def getLinkWidth(): Double = js.native
  
  def getPoints(): js.Array[js.Any] = js.native
  
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
  
  def setLabelPosition(pos: Y): Unit = js.native
  
  def setLabelRotationAngle(angle: Double): Unit = js.native
  
  def setLabelRotationPoint(point: Y): Unit = js.native
  
  @JSName("setLabelValign")
  def setLabelValign_baseline(valign: baseline): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_bottom(valign: bottom): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_middle(valign: middle): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_top(valign: top): Unit = js.native
  
  def setPoints(points: js.Array[js.Any]): Unit = js.native
}
