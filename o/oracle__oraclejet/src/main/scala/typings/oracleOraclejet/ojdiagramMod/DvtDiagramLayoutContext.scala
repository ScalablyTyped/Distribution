package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvtDiagramLayoutContext extends StObject {
  
  def getCommonContainer(nodeId1: Any, nodeId2: Any): Any
  
  def getComponentSize(): H
  
  def getCurrentViewport(): H
  
  def getEventData(): js.Object
  
  def getLinkById(id: Any): DvtDiagramLayoutContextLink
  
  def getLinkByIndex(index: Double): DvtDiagramLayoutContextLink
  
  def getLinkCount(): Double
  
  def getNodeById(id: Any): DvtDiagramLayoutContextNode
  
  def getNodeByIndex(index: Double): DvtDiagramLayoutContextNode
  
  def getNodeCount(): Double
  
  def getViewport(): H
  
  def isLocaleR2L(): Boolean
  
  def setViewport(viewport: H): Unit
}
object DvtDiagramLayoutContext {
  
  inline def apply(
    getCommonContainer: (Any, Any) => Any,
    getComponentSize: () => H,
    getCurrentViewport: () => H,
    getEventData: () => js.Object,
    getLinkById: Any => DvtDiagramLayoutContextLink,
    getLinkByIndex: Double => DvtDiagramLayoutContextLink,
    getLinkCount: () => Double,
    getNodeById: Any => DvtDiagramLayoutContextNode,
    getNodeByIndex: Double => DvtDiagramLayoutContextNode,
    getNodeCount: () => Double,
    getViewport: () => H,
    isLocaleR2L: () => Boolean,
    setViewport: H => Unit
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = js.Any.fromFunction2(getCommonContainer), getComponentSize = js.Any.fromFunction0(getComponentSize), getCurrentViewport = js.Any.fromFunction0(getCurrentViewport), getEventData = js.Any.fromFunction0(getEventData), getLinkById = js.Any.fromFunction1(getLinkById), getLinkByIndex = js.Any.fromFunction1(getLinkByIndex), getLinkCount = js.Any.fromFunction0(getLinkCount), getNodeById = js.Any.fromFunction1(getNodeById), getNodeByIndex = js.Any.fromFunction1(getNodeByIndex), getNodeCount = js.Any.fromFunction0(getNodeCount), getViewport = js.Any.fromFunction0(getViewport), isLocaleR2L = js.Any.fromFunction0(isLocaleR2L), setViewport = js.Any.fromFunction1(setViewport))
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DvtDiagramLayoutContext] (val x: Self) extends AnyVal {
    
    inline def setGetCommonContainer(value: (Any, Any) => Any): Self = StObject.set(x, "getCommonContainer", js.Any.fromFunction2(value))
    
    inline def setGetComponentSize(value: () => H): Self = StObject.set(x, "getComponentSize", js.Any.fromFunction0(value))
    
    inline def setGetCurrentViewport(value: () => H): Self = StObject.set(x, "getCurrentViewport", js.Any.fromFunction0(value))
    
    inline def setGetEventData(value: () => js.Object): Self = StObject.set(x, "getEventData", js.Any.fromFunction0(value))
    
    inline def setGetLinkById(value: Any => DvtDiagramLayoutContextLink): Self = StObject.set(x, "getLinkById", js.Any.fromFunction1(value))
    
    inline def setGetLinkByIndex(value: Double => DvtDiagramLayoutContextLink): Self = StObject.set(x, "getLinkByIndex", js.Any.fromFunction1(value))
    
    inline def setGetLinkCount(value: () => Double): Self = StObject.set(x, "getLinkCount", js.Any.fromFunction0(value))
    
    inline def setGetNodeById(value: Any => DvtDiagramLayoutContextNode): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    inline def setGetNodeByIndex(value: Double => DvtDiagramLayoutContextNode): Self = StObject.set(x, "getNodeByIndex", js.Any.fromFunction1(value))
    
    inline def setGetNodeCount(value: () => Double): Self = StObject.set(x, "getNodeCount", js.Any.fromFunction0(value))
    
    inline def setGetViewport(value: () => H): Self = StObject.set(x, "getViewport", js.Any.fromFunction0(value))
    
    inline def setIsLocaleR2L(value: () => Boolean): Self = StObject.set(x, "isLocaleR2L", js.Any.fromFunction0(value))
    
    inline def setSetViewport(value: H => Unit): Self = StObject.set(x, "setViewport", js.Any.fromFunction1(value))
  }
}
