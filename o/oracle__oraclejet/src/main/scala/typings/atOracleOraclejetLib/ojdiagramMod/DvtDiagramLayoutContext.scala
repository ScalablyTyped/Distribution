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

object DvtDiagramLayoutContext {
  @scala.inline
  def apply(
    getCommonContainer: (js.Any, js.Any) => js.Any,
    getComponentSize: () => atOracleOraclejetLib.Anon_H,
    getCurrentViewport: () => atOracleOraclejetLib.Anon_H,
    getEventData: () => js.Object,
    getLinkById: js.Any => DvtDiagramLayoutContextLink,
    getLinkByIndex: scala.Double => DvtDiagramLayoutContextLink,
    getLinkCount: () => scala.Double,
    getNodeById: js.Any => DvtDiagramLayoutContextNode,
    getNodeByIndex: scala.Double => DvtDiagramLayoutContextNode,
    getNodeCount: () => scala.Double,
    getViewport: () => atOracleOraclejetLib.Anon_H,
    isLocaleR2L: () => scala.Boolean,
    setViewport: atOracleOraclejetLib.Anon_H => scala.Unit
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = js.Any.fromFunction2(getCommonContainer), getComponentSize = js.Any.fromFunction0(getComponentSize), getCurrentViewport = js.Any.fromFunction0(getCurrentViewport), getEventData = js.Any.fromFunction0(getEventData), getLinkById = js.Any.fromFunction1(getLinkById), getLinkByIndex = js.Any.fromFunction1(getLinkByIndex), getLinkCount = js.Any.fromFunction0(getLinkCount), getNodeById = js.Any.fromFunction1(getNodeById), getNodeByIndex = js.Any.fromFunction1(getNodeByIndex), getNodeCount = js.Any.fromFunction0(getNodeCount), getViewport = js.Any.fromFunction0(getViewport), isLocaleR2L = js.Any.fromFunction0(isLocaleR2L), setViewport = js.Any.fromFunction1(setViewport))
  
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
}

