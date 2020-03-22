package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetMeteorData[TOwnProps, TDataProps] extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
  def getMeteorData(props: TOwnProps): TDataProps
}

object AnonGetMeteorData {
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => TDataProps, pure: js.UndefOr[Boolean] = js.undefined): AnonGetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = js.Any.fromFunction1(getMeteorData))
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetMeteorData[TOwnProps, TDataProps]]
  }
}

