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

trait DvtDiagramLayoutContextLink extends StObject {
  
  def getCoordinateSpace(): Any
  
  def getData(): js.Object | js.Array[Any]
  
  def getEndConnectorOffset(): Double
  
  def getEndId(): Any
  
  def getId(): Any
  
  def getLabelBounds(): H
  
  def getLabelHalign(): left | center | right
  
  def getLabelPosition(): Y
  
  def getLabelRotationAngle(): Double
  
  def getLabelRotationPoint(): Y
  
  def getLabelValign(): top | middle | bottom | baseline
  
  def getLinkWidth(): Double
  
  def getPoints(): js.Array[Any]
  
  def getSelected(): Boolean
  
  def getStartConnectorOffset(): Double
  
  def getStartId(): Any
  
  def isPromoted(): Boolean
  
  def setCoordinateSpace(containerId: Any): Unit
  
  def setLabelHalign(halign: left | center | right): Unit
  
  def setLabelPosition(pos: Y): Unit
  
  def setLabelRotationAngle(angle: Double): Unit
  
  def setLabelRotationPoint(point: Y): Unit
  
  def setLabelValign(valign: top | middle | bottom | baseline): Unit
  
  def setPoints(points: js.Array[Any]): Unit
}
object DvtDiagramLayoutContextLink {
  
  inline def apply(
    getCoordinateSpace: () => Any,
    getData: () => js.Object | js.Array[Any],
    getEndConnectorOffset: () => Double,
    getEndId: () => Any,
    getId: () => Any,
    getLabelBounds: () => H,
    getLabelHalign: () => left | center | right,
    getLabelPosition: () => Y,
    getLabelRotationAngle: () => Double,
    getLabelRotationPoint: () => Y,
    getLabelValign: () => top | middle | bottom | baseline,
    getLinkWidth: () => Double,
    getPoints: () => js.Array[Any],
    getSelected: () => Boolean,
    getStartConnectorOffset: () => Double,
    getStartId: () => Any,
    isPromoted: () => Boolean,
    setCoordinateSpace: Any => Unit,
    setLabelHalign: left | center | right => Unit,
    setLabelPosition: Y => Unit,
    setLabelRotationAngle: Double => Unit,
    setLabelRotationPoint: Y => Unit,
    setLabelValign: top | middle | bottom | baseline => Unit,
    setPoints: js.Array[Any] => Unit
  ): DvtDiagramLayoutContextLink = {
    val __obj = js.Dynamic.literal(getCoordinateSpace = js.Any.fromFunction0(getCoordinateSpace), getData = js.Any.fromFunction0(getData), getEndConnectorOffset = js.Any.fromFunction0(getEndConnectorOffset), getEndId = js.Any.fromFunction0(getEndId), getId = js.Any.fromFunction0(getId), getLabelBounds = js.Any.fromFunction0(getLabelBounds), getLabelHalign = js.Any.fromFunction0(getLabelHalign), getLabelPosition = js.Any.fromFunction0(getLabelPosition), getLabelRotationAngle = js.Any.fromFunction0(getLabelRotationAngle), getLabelRotationPoint = js.Any.fromFunction0(getLabelRotationPoint), getLabelValign = js.Any.fromFunction0(getLabelValign), getLinkWidth = js.Any.fromFunction0(getLinkWidth), getPoints = js.Any.fromFunction0(getPoints), getSelected = js.Any.fromFunction0(getSelected), getStartConnectorOffset = js.Any.fromFunction0(getStartConnectorOffset), getStartId = js.Any.fromFunction0(getStartId), isPromoted = js.Any.fromFunction0(isPromoted), setCoordinateSpace = js.Any.fromFunction1(setCoordinateSpace), setLabelHalign = js.Any.fromFunction1(setLabelHalign), setLabelPosition = js.Any.fromFunction1(setLabelPosition), setLabelRotationAngle = js.Any.fromFunction1(setLabelRotationAngle), setLabelRotationPoint = js.Any.fromFunction1(setLabelRotationPoint), setLabelValign = js.Any.fromFunction1(setLabelValign), setPoints = js.Any.fromFunction1(setPoints))
    __obj.asInstanceOf[DvtDiagramLayoutContextLink]
  }
  
  extension [Self <: DvtDiagramLayoutContextLink](x: Self) {
    
    inline def setGetCoordinateSpace(value: () => Any): Self = StObject.set(x, "getCoordinateSpace", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => js.Object | js.Array[Any]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetEndConnectorOffset(value: () => Double): Self = StObject.set(x, "getEndConnectorOffset", js.Any.fromFunction0(value))
    
    inline def setGetEndId(value: () => Any): Self = StObject.set(x, "getEndId", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLabelBounds(value: () => H): Self = StObject.set(x, "getLabelBounds", js.Any.fromFunction0(value))
    
    inline def setGetLabelHalign(value: () => left | center | right): Self = StObject.set(x, "getLabelHalign", js.Any.fromFunction0(value))
    
    inline def setGetLabelPosition(value: () => Y): Self = StObject.set(x, "getLabelPosition", js.Any.fromFunction0(value))
    
    inline def setGetLabelRotationAngle(value: () => Double): Self = StObject.set(x, "getLabelRotationAngle", js.Any.fromFunction0(value))
    
    inline def setGetLabelRotationPoint(value: () => Y): Self = StObject.set(x, "getLabelRotationPoint", js.Any.fromFunction0(value))
    
    inline def setGetLabelValign(value: () => top | middle | bottom | baseline): Self = StObject.set(x, "getLabelValign", js.Any.fromFunction0(value))
    
    inline def setGetLinkWidth(value: () => Double): Self = StObject.set(x, "getLinkWidth", js.Any.fromFunction0(value))
    
    inline def setGetPoints(value: () => js.Array[Any]): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    inline def setGetSelected(value: () => Boolean): Self = StObject.set(x, "getSelected", js.Any.fromFunction0(value))
    
    inline def setGetStartConnectorOffset(value: () => Double): Self = StObject.set(x, "getStartConnectorOffset", js.Any.fromFunction0(value))
    
    inline def setGetStartId(value: () => Any): Self = StObject.set(x, "getStartId", js.Any.fromFunction0(value))
    
    inline def setIsPromoted(value: () => Boolean): Self = StObject.set(x, "isPromoted", js.Any.fromFunction0(value))
    
    inline def setSetCoordinateSpace(value: Any => Unit): Self = StObject.set(x, "setCoordinateSpace", js.Any.fromFunction1(value))
    
    inline def setSetLabelHalign(value: left | center | right => Unit): Self = StObject.set(x, "setLabelHalign", js.Any.fromFunction1(value))
    
    inline def setSetLabelPosition(value: Y => Unit): Self = StObject.set(x, "setLabelPosition", js.Any.fromFunction1(value))
    
    inline def setSetLabelRotationAngle(value: Double => Unit): Self = StObject.set(x, "setLabelRotationAngle", js.Any.fromFunction1(value))
    
    inline def setSetLabelRotationPoint(value: Y => Unit): Self = StObject.set(x, "setLabelRotationPoint", js.Any.fromFunction1(value))
    
    inline def setSetLabelValign(value: top | middle | bottom | baseline => Unit): Self = StObject.set(x, "setLabelValign", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: js.Array[Any] => Unit): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
  }
}
