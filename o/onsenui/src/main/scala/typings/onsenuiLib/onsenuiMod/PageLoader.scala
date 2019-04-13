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
class PageLoader protected () extends js.Object {
  def this(args: js.Any*) = this()
  var internalLoader: js.Function = js.native
  def load(options: onsenuiLib.Anon_Page, done: js.Function): scala.Unit = js.native
}

