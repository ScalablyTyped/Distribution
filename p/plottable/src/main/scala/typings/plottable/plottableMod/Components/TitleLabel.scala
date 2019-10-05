package typings.plottable.plottableMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.TitleLabel")
@js.native
/**
  * @constructor
  * @param {string} [text]
  * @param {number} [angle] One of -90/0/90. 0 is horizontal.
  */
class TitleLabel ()
  extends typings.plottable.buildSrcComponentsMod.TitleLabel {
  def this(text: String) = this()
  def this(text: String, angle: Double) = this()
}

/* static members */
@JSImport("plottable", "Components.TitleLabel")
@js.native
object TitleLabel extends js.Object {
  var TITLE_LABEL_CLASS: String = js.native
}

