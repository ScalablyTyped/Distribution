package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.AnonH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvtDiagramLayoutContext extends js.Object {
  def getCommonContainer(nodeId1: js.Any, nodeId2: js.Any): js.Any
  def getComponentSize(): AnonH
  def getCurrentViewport(): AnonH
  def getEventData(): js.Object
  def getLinkById(id: js.Any): DvtDiagramLayoutContextLink
  def getLinkByIndex(index: Double): DvtDiagramLayoutContextLink
  def getLinkCount(): Double
  def getNodeById(id: js.Any): DvtDiagramLayoutContextNode
  def getNodeByIndex(index: Double): DvtDiagramLayoutContextNode
  def getNodeCount(): Double
  def getViewport(): AnonH
  def isLocaleR2L(): Boolean
  def setViewport(viewport: AnonH): Unit
}

object DvtDiagramLayoutContext {
  @scala.inline
  def apply(
    getCommonContainer: (js.Any, js.Any) => js.Any,
    getComponentSize: () => AnonH,
    getCurrentViewport: () => AnonH,
    getEventData: () => js.Object,
    getLinkById: js.Any => DvtDiagramLayoutContextLink,
    getLinkByIndex: Double => DvtDiagramLayoutContextLink,
    getLinkCount: () => Double,
    getNodeById: js.Any => DvtDiagramLayoutContextNode,
    getNodeByIndex: Double => DvtDiagramLayoutContextNode,
    getNodeCount: () => Double,
    getViewport: () => AnonH,
    isLocaleR2L: () => Boolean,
    setViewport: AnonH => Unit
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = js.Any.fromFunction2(getCommonContainer), getComponentSize = js.Any.fromFunction0(getComponentSize), getCurrentViewport = js.Any.fromFunction0(getCurrentViewport), getEventData = js.Any.fromFunction0(getEventData), getLinkById = js.Any.fromFunction1(getLinkById), getLinkByIndex = js.Any.fromFunction1(getLinkByIndex), getLinkCount = js.Any.fromFunction0(getLinkCount), getNodeById = js.Any.fromFunction1(getNodeById), getNodeByIndex = js.Any.fromFunction1(getNodeByIndex), getNodeCount = js.Any.fromFunction0(getNodeCount), getViewport = js.Any.fromFunction0(getViewport), isLocaleR2L = js.Any.fromFunction0(isLocaleR2L), setViewport = js.Any.fromFunction1(setViewport))
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
}

