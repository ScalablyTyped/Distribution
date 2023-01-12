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

trait DvtDiagramLayoutContextNode extends StObject {
  
  def getBounds(): H
  
  def getChildNodes(): js.Array[Any]
  
  def getContentBounds(): H
  
  def getData(): js.Object
  
  def getId(): Any
  
  def getLabelBounds(): H
  
  def getLabelHalign(): left | center | right
  
  def getLabelPosition(): Y
  
  def getLabelRotationAngle(): Double
  
  def getLabelRotationPoint(): Y
  
  def getLabelValign(): top | middle | bottom | baseline
  
  def getPosition(): Y
  
  def getRelativePosition(containerId: Any): Y
  
  def getSelected(): Boolean
  
  def isDisclosed(): Boolean
  
  def setLabelHalign(halign: left | center | right): Unit
  
  def setLabelPosition(pos: Y): Unit
  
  def setLabelRotationAngle(angle: Double): Unit
  
  def setLabelRotationPoint(point: Y): Unit
  
  def setLabelValign(valign: top | middle | bottom | baseline): Unit
  
  def setPosition(pos: Y): Unit
}
object DvtDiagramLayoutContextNode {
  
  inline def apply(
    getBounds: () => H,
    getChildNodes: () => js.Array[Any],
    getContentBounds: () => H,
    getData: () => js.Object,
    getId: () => Any,
    getLabelBounds: () => H,
    getLabelHalign: () => left | center | right,
    getLabelPosition: () => Y,
    getLabelRotationAngle: () => Double,
    getLabelRotationPoint: () => Y,
    getLabelValign: () => top | middle | bottom | baseline,
    getPosition: () => Y,
    getRelativePosition: Any => Y,
    getSelected: () => Boolean,
    isDisclosed: () => Boolean,
    setLabelHalign: left | center | right => Unit,
    setLabelPosition: Y => Unit,
    setLabelRotationAngle: Double => Unit,
    setLabelRotationPoint: Y => Unit,
    setLabelValign: top | middle | bottom | baseline => Unit,
    setPosition: Y => Unit
  ): DvtDiagramLayoutContextNode = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getChildNodes = js.Any.fromFunction0(getChildNodes), getContentBounds = js.Any.fromFunction0(getContentBounds), getData = js.Any.fromFunction0(getData), getId = js.Any.fromFunction0(getId), getLabelBounds = js.Any.fromFunction0(getLabelBounds), getLabelHalign = js.Any.fromFunction0(getLabelHalign), getLabelPosition = js.Any.fromFunction0(getLabelPosition), getLabelRotationAngle = js.Any.fromFunction0(getLabelRotationAngle), getLabelRotationPoint = js.Any.fromFunction0(getLabelRotationPoint), getLabelValign = js.Any.fromFunction0(getLabelValign), getPosition = js.Any.fromFunction0(getPosition), getRelativePosition = js.Any.fromFunction1(getRelativePosition), getSelected = js.Any.fromFunction0(getSelected), isDisclosed = js.Any.fromFunction0(isDisclosed), setLabelHalign = js.Any.fromFunction1(setLabelHalign), setLabelPosition = js.Any.fromFunction1(setLabelPosition), setLabelRotationAngle = js.Any.fromFunction1(setLabelRotationAngle), setLabelRotationPoint = js.Any.fromFunction1(setLabelRotationPoint), setLabelValign = js.Any.fromFunction1(setLabelValign), setPosition = js.Any.fromFunction1(setPosition))
    __obj.asInstanceOf[DvtDiagramLayoutContextNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DvtDiagramLayoutContextNode] (val x: Self) extends AnyVal {
    
    inline def setGetBounds(value: () => H): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setGetChildNodes(value: () => js.Array[Any]): Self = StObject.set(x, "getChildNodes", js.Any.fromFunction0(value))
    
    inline def setGetContentBounds(value: () => H): Self = StObject.set(x, "getContentBounds", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => js.Object): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLabelBounds(value: () => H): Self = StObject.set(x, "getLabelBounds", js.Any.fromFunction0(value))
    
    inline def setGetLabelHalign(value: () => left | center | right): Self = StObject.set(x, "getLabelHalign", js.Any.fromFunction0(value))
    
    inline def setGetLabelPosition(value: () => Y): Self = StObject.set(x, "getLabelPosition", js.Any.fromFunction0(value))
    
    inline def setGetLabelRotationAngle(value: () => Double): Self = StObject.set(x, "getLabelRotationAngle", js.Any.fromFunction0(value))
    
    inline def setGetLabelRotationPoint(value: () => Y): Self = StObject.set(x, "getLabelRotationPoint", js.Any.fromFunction0(value))
    
    inline def setGetLabelValign(value: () => top | middle | bottom | baseline): Self = StObject.set(x, "getLabelValign", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Y): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetRelativePosition(value: Any => Y): Self = StObject.set(x, "getRelativePosition", js.Any.fromFunction1(value))
    
    inline def setGetSelected(value: () => Boolean): Self = StObject.set(x, "getSelected", js.Any.fromFunction0(value))
    
    inline def setIsDisclosed(value: () => Boolean): Self = StObject.set(x, "isDisclosed", js.Any.fromFunction0(value))
    
    inline def setSetLabelHalign(value: left | center | right => Unit): Self = StObject.set(x, "setLabelHalign", js.Any.fromFunction1(value))
    
    inline def setSetLabelPosition(value: Y => Unit): Self = StObject.set(x, "setLabelPosition", js.Any.fromFunction1(value))
    
    inline def setSetLabelRotationAngle(value: Double => Unit): Self = StObject.set(x, "setLabelRotationAngle", js.Any.fromFunction1(value))
    
    inline def setSetLabelRotationPoint(value: Y => Unit): Self = StObject.set(x, "setLabelRotationPoint", js.Any.fromFunction1(value))
    
    inline def setSetLabelValign(value: top | middle | bottom | baseline => Unit): Self = StObject.set(x, "setLabelValign", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Y => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
  }
}
