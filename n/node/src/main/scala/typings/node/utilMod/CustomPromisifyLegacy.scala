package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPromisifyLegacy[TCustom /* <: js.Function */]
  extends js.Function
     with CustomPromisify[TCustom] {
  var __promisify__ : TCustom = js.native
}

