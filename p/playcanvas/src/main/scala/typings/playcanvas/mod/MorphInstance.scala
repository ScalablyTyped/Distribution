package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, manages selection of active morph targets.
  * @param morph - The pc.Morph to instance.
  */
@JSImport("playcanvas", "MorphInstance")
@js.native
class MorphInstance protected ()
  extends typings.playcanvas.pc.MorphInstance {
  def this(morph: typings.playcanvas.pc.Morph) = this()
}
