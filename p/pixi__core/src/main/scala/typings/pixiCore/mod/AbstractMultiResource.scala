package typings.pixiCore.mod

import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@pixi/core", "AbstractMultiResource")
@js.native
open class AbstractMultiResource protected ()
  extends typings.pixiCore.libTexturesResourcesMod.AbstractMultiResource {
  /**
    * @param length
    * @param options - Options to for Resource constructor
    * @param {number} [options.width] - Width of the resource
    * @param {number} [options.height] - Height of the resource
    */
  def this(length: Double) = this()
  def this(length: Double, options: ISize) = this()
}
