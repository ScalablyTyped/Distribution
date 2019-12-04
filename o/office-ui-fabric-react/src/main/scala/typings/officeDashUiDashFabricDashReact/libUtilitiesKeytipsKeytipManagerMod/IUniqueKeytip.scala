package typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsKeytipManagerMod

import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUniqueKeytip extends js.Object {
  var keytip: IKeytipProps
  var uniqueID: String
}

object IUniqueKeytip {
  @scala.inline
  def apply(keytip: IKeytipProps, uniqueID: String): IUniqueKeytip = {
    val __obj = js.Dynamic.literal(keytip = keytip.asInstanceOf[js.Any], uniqueID = uniqueID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUniqueKeytip]
  }
}

