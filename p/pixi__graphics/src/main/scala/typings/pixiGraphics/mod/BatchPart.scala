package typings.pixiGraphics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure to hold interim batch objects for Graphics.
  * @memberof PIXI.graphicsUtils
  */
@js.native
trait BatchPart extends StObject {
  
  var attribSize: Double = js.native
  
  var attribStart: Double = js.native
  
  def begin(style: FillStyle, startIndex: Double, attribStart: Double): Unit = js.native
  /**
    * Begin batch part.
    * @param style
    * @param startIndex
    * @param attribStart
    */
  def begin(style: LineStyle, startIndex: Double, attribStart: Double): Unit = js.native
  
  /**
    * End batch part.
    * @param endIndex
    * @param endAttrib
    */
  def end(endIndex: Double, endAttrib: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  var size: Double = js.native
  
  var start: Double = js.native
  
  var style: LineStyle | FillStyle = js.native
}
