package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMeteorData[TOwnProps, TDataProps] extends js.Object {
  var pure: js.UndefOr[Boolean] = js.native
  def getMeteorData(props: TOwnProps): TDataProps = js.native
}

object GetMeteorData {
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => TDataProps): GetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = js.Any.fromFunction1(getMeteorData))
    __obj.asInstanceOf[GetMeteorData[TOwnProps, TDataProps]]
  }
  @scala.inline
  implicit class GetMeteorDataOps[Self <: GetMeteorData[_, _], TOwnProps, TDataProps] (val x: Self with (GetMeteorData[TOwnProps, TDataProps])) extends AnyVal {
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
    def setGetMeteorData(value: TOwnProps => TDataProps): Self = this.set("getMeteorData", js.Any.fromFunction1(value))
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
  }
  
}

