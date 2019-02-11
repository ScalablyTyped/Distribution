package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RayOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, scala.Unit]] = js.undefined
  var checkCollisionResponse: js.UndefOr[scala.Boolean] = js.undefined
  var collisionGroup: js.UndefOr[scala.Double] = js.undefined
  var collisionMask: js.UndefOr[scala.Double] = js.undefined
  var from: js.Tuple2[scala.Double, scala.Double]
  var mode: js.UndefOr[scala.Double] = js.undefined
  var skipBackfaces: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.Tuple2[scala.Double, scala.Double]
}

