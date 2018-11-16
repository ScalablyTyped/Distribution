package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * @description PageLoader class constructor
   */
@JSImport("onsenui", "PageLoader")
@js.native
class PageLoader protected ()
  extends onsenuiLib.onsenuiMod.onsNs.PageLoader {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override var internalLoader: js.Function = js.native
  /* CompleteClass */
  override def load(options: onsenuiLib.Anon_Page, done: js.Function): scala.Unit = js.native
}

