package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Renderer")
@js.native
class Renderer protected ()
  extends p5Lib.p5Mod.p5Ns.Renderer {
  /**
    *   Main graphics and rendering context, as well as
    *   the base API implementation for p5.js "core". To
    *   be used as the superclass for Renderer2D and
    *   Renderer3D classes, respecitvely.
    *
    *   @param elt DOM node that is wrapped
    *   @param [pInst] pointer to p5 instance
    *   @param [isMainCanvas] whether we're using it as
    *   main canvas
    */
  def this(elt: java.lang.String) = this()
  def this(elt: java.lang.String, pInst: p5) = this()
  def this(elt: java.lang.String, pInst: p5, isMainCanvas: scala.Boolean) = this()
}

