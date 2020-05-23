package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMeteorData[TOwnProps, TDataProps] extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
  def getMeteorData(props: TOwnProps): TDataProps
}

object GetMeteorData {
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => TDataProps, pure: js.UndefOr[Boolean] = js.undefined): GetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = js.Any.fromFunction1(getMeteorData))
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeteorData[TOwnProps, TDataProps]]
  }
}

