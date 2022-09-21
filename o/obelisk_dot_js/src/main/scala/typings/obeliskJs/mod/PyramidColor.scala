package typings.obeliskJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "PyramidColor")
@js.native
open class PyramidColor () extends AbstractColor {
  def this(border: Double) = this()
  def this(border: Double, borderHighlight: Double) = this()
  def this(border: Unit, borderHighlight: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double) = this()
  def this(border: Double, borderHighlight: Unit, left: Double) = this()
  def this(border: Unit, borderHighlight: Double, left: Double) = this()
  def this(border: Unit, borderHighlight: Unit, left: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Double, right: Double) = this()
  def this(border: Double, borderHighlight: Double, left: Unit, right: Double) = this()
  def this(border: Double, borderHighlight: Unit, left: Double, right: Double) = this()
  def this(border: Double, borderHighlight: Unit, left: Unit, right: Double) = this()
  def this(border: Unit, borderHighlight: Double, left: Double, right: Double) = this()
  def this(border: Unit, borderHighlight: Double, left: Unit, right: Double) = this()
  def this(border: Unit, borderHighlight: Unit, left: Double, right: Double) = this()
  def this(border: Unit, borderHighlight: Unit, left: Unit, right: Double) = this()
  
  var BRIGHTNESS_GAIN: Double = js.native
  
  def getByRightColor(horizontal: Double): PyramidColor = js.native
}
