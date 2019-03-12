package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description PageLoader class constructor
  */
trait PageLoader extends js.Object {
  var internalLoader: js.Function
  def load(options: onsenuiLib.Anon_Page, done: js.Function): scala.Unit
}

object PageLoader {
  @scala.inline
  def apply(internalLoader: js.Function, load: (onsenuiLib.Anon_Page, js.Function) => scala.Unit): PageLoader = {
    val __obj = js.Dynamic.literal(internalLoader = internalLoader, load = js.Any.fromFunction2(load))
  
    __obj.asInstanceOf[PageLoader]
  }
}

