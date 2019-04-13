package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsProgressCircularElement
  extends stdLib.HTMLElement {
  /**
    * @description If this property is `true`, an infinite looping animation will be shown.
    */
  var indeterminate: scala.Boolean = js.native
  /**
    * @description Current secondary progress. Should be a value between 0 and 100.
    */
  var secondaryValue: scala.Double = js.native
  /**
    * @description Current progress. Should be a value between 0 and 100.
    */
  var value: scala.Double = js.native
}

