package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetMeteorData[TOwnProps, TDataProps] extends js.Object {
  var pure: js.UndefOr[scala.Boolean] = js.undefined
  def getMeteorData(props: TOwnProps): TDataProps
}

object Anon_GetMeteorData {
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: js.Function1[TOwnProps, TDataProps], pure: js.UndefOr[scala.Boolean] = js.undefined): Anon_GetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = getMeteorData)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    __obj.asInstanceOf[Anon_GetMeteorData[TOwnProps, TDataProps]]
  }
}

