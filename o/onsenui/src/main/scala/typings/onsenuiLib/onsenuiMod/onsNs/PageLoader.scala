package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description PageLoader class constructor
  */
trait PageLoader extends js.Object {
  var internalLoader: coreDashJsLib.Function
  def load(options: onsenuiLib.Anon_Page, done: coreDashJsLib.Function): scala.Unit
}

object PageLoader {
  @scala.inline
  def apply(
    internalLoader: coreDashJsLib.Function,
    load: js.Function2[onsenuiLib.Anon_Page, coreDashJsLib.Function, scala.Unit]
  ): PageLoader = {
    val __obj = js.Dynamic.literal(internalLoader = internalLoader, load = load)
  
    __obj.asInstanceOf[PageLoader]
  }
}

