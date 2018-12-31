package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsLazyRepeatElement
  extends stdLib.HTMLElement {
  /**
    * @Specify a delegate object to load and unload item elements.
    */
  var delegate: onsenuiLib.onsenuiMod.LazyRepeatOptions = js.native
  /**
    * @description Refresh the list. Use this method when the data has changed.
    */
  def refresh(): scala.Unit = js.native
}

