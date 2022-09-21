package typings.playcanvas.global.pc

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
    * @param {MorphTarget[]} targets - A list of morph targets.
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this morph
    * target. If it is not provided, a device is obtained from the {@link Application}.
    */
  def this(
    targets: js.Array[typings.playcanvas.mod.MorphTarget],
    graphicsDevice: typings.playcanvas.mod.GraphicsDevice
  ) = this()
}
object Morph {
  
  @JSGlobal("pc.Morph")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("pc.Morph.FORMAT_FLOAT")
  @js.native
  def FORMAT_FLOAT: Double = js.native
  inline def FORMAT_FLOAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_FLOAT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("pc.Morph.FORMAT_HALF_FLOAT")
  @js.native
  def FORMAT_HALF_FLOAT: Double = js.native
  inline def FORMAT_HALF_FLOAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_HALF_FLOAT")(x.asInstanceOf[js.Any])
}
