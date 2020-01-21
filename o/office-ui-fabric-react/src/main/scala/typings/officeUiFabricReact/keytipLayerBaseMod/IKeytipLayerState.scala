package typings.officeUiFabricReact.keytipLayerBaseMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
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
    val __obj = js.Dynamic.literal(inKeytipMode = inKeytipMode.asInstanceOf[js.Any], keytips = keytips.asInstanceOf[js.Any], visibleKeytips = visibleKeytips.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeytipLayerState]
  }
}

