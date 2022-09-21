package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A skin instance is responsible for generating the matrix palette that is used to skin vertices
  * from object space to world space.
  */
@JSGlobal("pc.SkinInstance")
@js.native
open class SkinInstance protected ()
  extends typings.playcanvas.mod.SkinInstance {
  /**
    * Create a new SkinInstance instance.
    *
    * @param {Skin} skin - The skin that will provide the inverse bind pose matrices to generate
    * the final matrix palette.
    */
  def this(skin: typings.playcanvas.mod.Skin) = this()
}
