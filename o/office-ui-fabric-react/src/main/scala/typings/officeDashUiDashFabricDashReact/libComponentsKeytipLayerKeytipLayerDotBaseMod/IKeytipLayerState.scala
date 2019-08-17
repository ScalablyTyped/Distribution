package typings.officeDashUiDashFabricDashReact.libComponentsKeytipLayerKeytipLayerDotBaseMod

import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipLayerState extends js.Object {
  var inKeytipMode: Boolean
  var keytips: js.Array[IKeytipProps]
  var visibleKeytips: js.Array[IKeytipProps]
}

object IKeytipLayerState {
  @scala.inline
  def apply(inKeytipMode: Boolean, keytips: js.Array[IKeytipProps], visibleKeytips: js.Array[IKeytipProps]): IKeytipLayerState = {
    val __obj = js.Dynamic.literal(inKeytipMode = inKeytipMode, keytips = keytips, visibleKeytips = visibleKeytips)
  
    __obj.asInstanceOf[IKeytipLayerState]
  }
}

