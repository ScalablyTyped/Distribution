package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rectangle
  */
@js.native
trait Rectangle
  extends StObject
     with AbstractShapeOverlay {
  
  def getAreaSize(): Double = js.native
  
  def getBounds(): Bounds = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: BoundsLiteral): Unit = js.native
  
  def setOptions(options: RectangleOptions): Unit = js.native
  
  def setStyles(options: RectangleOptions): Unit = js.native
}
