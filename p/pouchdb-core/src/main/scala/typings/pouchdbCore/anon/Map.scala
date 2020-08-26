package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  var map: String = js.native
  var reduce: js.UndefOr[String] = js.native
}

object Map {
  @scala.inline
  def apply(map: String): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  @scala.inline
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
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
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setReduce(value: String): Self = this.set("reduce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
  }
  
}

