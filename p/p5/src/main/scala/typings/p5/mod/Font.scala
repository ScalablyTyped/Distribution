package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends StObject {
  
  /**
    *   Underlying opentype font implementation
    */
  var font: Any = js.native
  
  /**
    *   Returns a tight bounding box for the given text
    *   string using this font
    *   @param line a line of text
    *   @param x x-position
    *   @param y y-position
    *   @param [fontSize] font size to use (optional)
    *   Default is 12.
    *   @param [options] opentype options (optional)
    *   opentype fonts contains alignment and baseline
    *   options. Default is 'LEFT' and 'alphabetic'
    *   @return a rectangle object with properties: x, y,
    *   w, h
    */
  def textBounds(line: String, x: Double, y: Double): js.Object = js.native
  def textBounds(line: String, x: Double, y: Double, fontSize: Double): js.Object = js.native
  def textBounds(line: String, x: Double, y: Double, fontSize: Double, options: js.Object): js.Object = js.native
  def textBounds(line: String, x: Double, y: Double, fontSize: Unit, options: js.Object): js.Object = js.native
  
  /**
    *   Computes an array of points following the path for
    *   specified text
    *   @param txt a line of text
    *   @param x x-position
    *   @param y y-position
    *   @param fontSize font size to use (optional)
    *   @param [options] an (optional) object that can
    *   contain:
    *
    *
    *   sampleFactor - the ratio of path-length to number
    *   of samples (default=.1); higher values yield more
    *   points and are therefore more precise
    *
    *
    *   simplifyThreshold - if set to a non-zero value,
    *   collinear points will be be removed from the
    *   polygon; the value represents the threshold angle
    *   to use when determining whether two edges are
    *   collinear
    *   @return an array of points, each with x, y, alpha
    *   (the path angle)
    */
  def textToPoints(txt: String, x: Double, y: Double, fontSize: Double): js.Array[Any] = js.native
  def textToPoints(txt: String, x: Double, y: Double, fontSize: Double, options: js.Object): js.Array[Any] = js.native
}
