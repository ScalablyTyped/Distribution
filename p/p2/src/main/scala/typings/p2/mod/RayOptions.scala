package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RayOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, Unit]] = js.native
  var checkCollisionResponse: js.UndefOr[Boolean] = js.native
  var collisionGroup: js.UndefOr[Double] = js.native
  var collisionMask: js.UndefOr[Double] = js.native
  var from: js.Tuple2[Double, Double] = js.native
  var mode: js.UndefOr[Double] = js.native
  var skipBackfaces: js.UndefOr[Boolean] = js.native
  var to: js.Tuple2[Double, Double] = js.native
}

object RayOptions {
  @scala.inline
  def apply(from: js.Tuple2[Double, Double], to: js.Tuple2[Double, Double]): RayOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RayOptions]
  }
  @scala.inline
  implicit class RayOptionsOps[Self <: RayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrom(value: js.Tuple2[Double, Double]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: js.Tuple2[Double, Double]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: /* result */ RaycastResult => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCheckCollisionResponse(value: Boolean): Self = this.set("checkCollisionResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckCollisionResponse: Self = this.set("checkCollisionResponse", js.undefined)
    @scala.inline
    def setCollisionGroup(value: Double): Self = this.set("collisionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionGroup: Self = this.set("collisionGroup", js.undefined)
    @scala.inline
    def setCollisionMask(value: Double): Self = this.set("collisionMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionMask: Self = this.set("collisionMask", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSkipBackfaces(value: Boolean): Self = this.set("skipBackfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipBackfaces: Self = this.set("skipBackfaces", js.undefined)
  }
  
}

