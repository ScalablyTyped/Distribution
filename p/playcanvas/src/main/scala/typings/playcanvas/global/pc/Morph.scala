package typings.playcanvas.global.pc

import typings.playcanvas.anon.PreferHighPrecision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of {@link MorphTarget}, a combined delta AABB and some associated data.
  */
@JSGlobal("pc.Morph")
@js.native
open class Morph protected ()
  extends typings.playcanvas.mod.Morph {
  /**
    * Create a new Morph instance.
    *
    * @param {import('./morph-target.js').MorphTarget[]} targets - A list of morph targets.
    * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} graphicsDevice -
    * The graphics device used to manage this morph target.
    * @param {object} options - Object for passing optional arguments.
    * @param {boolean} options.preferHighPrecision - True if high precision storage should be
    * prefered. This is faster to create and allows higher precision, but takes more memory and
    * might be slower to render. Defaults to false.
    */
  def this(
    targets: js.Array[typings.playcanvas.mod.MorphTarget],
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice
  ) = this()
  def this(
    targets: js.Array[typings.playcanvas.mod.MorphTarget],
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice,
    options: PreferHighPrecision
  ) = this()
}
