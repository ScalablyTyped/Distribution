package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPromisify[TCustom /* <: js.Function */]
  extends js.Function {
  var __promisify__ : TCustom = js.native
}

