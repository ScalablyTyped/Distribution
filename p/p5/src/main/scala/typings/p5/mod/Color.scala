package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  /**
    *   The setAlpha function sets the transparency
    *   (alpha) value of a color. The range depends on
    *   your color mode, in the default RGB mode it's
    *   between 0 and 255.
    *   @param alpha the new alpha value
    */
  def setAlpha(alpha: Double): Unit = js.native
  
  /**
    *   The setBlue function sets the blue component of a
    *   color. The range depends on your color mode, in
    *   the default RGB mode it's between 0 and 255.
    *   @param blue the new blue value
    */
  def setBlue(blue: Double): Unit = js.native
  
  /**
    *   The setGreen function sets the green component of
    *   a color. The range depends on your color mode, in
    *   the default RGB mode it's between 0 and 255.
    *   @param green the new green value
    */
  def setGreen(green: Double): Unit = js.native
  
  /**
    *   The setRed function sets the red component of a
    *   color. The range depends on your color mode, in
    *   the default RGB mode it's between 0 and 255.
    *   @param red the new red value
    */
  def setRed(red: Double): Unit = js.native
  
  def toString(format: String): String = js.native
}
