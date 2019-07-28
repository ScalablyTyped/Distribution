package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.guid
  * @namespace
  * @description Basically a very large random number (128-bit) which means the probability of creating two that clash is vanishingly small.
  * GUIDs are used as the unique identifiers for Entities.
  */
@JSGlobal("pc.guid")
@js.native
object guidNs extends js.Object {
  /**
    * @function
    * @name pc.guid.create
    * @description Create an RFC4122 version 4 compliant GUID
    * @return {String} A new GUID
    */
  def create(): String = js.native
}

