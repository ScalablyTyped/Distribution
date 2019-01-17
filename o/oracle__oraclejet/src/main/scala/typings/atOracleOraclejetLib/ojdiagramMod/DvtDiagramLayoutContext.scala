package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvtDiagramLayoutContext extends js.Object {
  def getCommonContainer(nodeId1: js.Any, nodeId2: js.Any): js.Any
  def getComponentSize(): atOracleOraclejetLib.Anon_H
  def getCurrentViewport(): atOracleOraclejetLib.Anon_H
  def getEventData(): js.Object
  def getLinkById(id: js.Any): DvtDiagramLayoutContextLink
  def getLinkByIndex(index: scala.Double): DvtDiagramLayoutContextLink
  def getLinkCount(): scala.Double
  def getNodeById(id: js.Any): DvtDiagramLayoutContextNode
  def getNodeByIndex(index: scala.Double): DvtDiagramLayoutContextNode
  def getNodeCount(): scala.Double
  def getViewport(): atOracleOraclejetLib.Anon_H
  def isLocaleR2L(): scala.Boolean
  def setViewport(viewport: atOracleOraclejetLib.Anon_H): scala.Unit
}

