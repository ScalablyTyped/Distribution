package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SkinInstance
  * @classdesc A skin instance is responsible for generating the matrix palette that is used to
  * skin vertices from object space to world space.
  * @param {pc.Skin} skin The skin that will provide the inverse bind pose matrices to
  * generate the final matrix palette.
  */
@JSGlobal("pc.SkinInstance")
@js.native
class SkinInstance protected () extends js.Object {
  def this(skin: Skin) = this()
}

