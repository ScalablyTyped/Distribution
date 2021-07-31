package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeytipLayerState
  extends StObject
     with typings.officeUiFabricReact.keytipLayerBaseMod.IKeytipLayerState
object IKeytipLayerState {
  
  @scala.inline
  def apply(
    inKeytipMode: Boolean,
    keytips: js.Array[typings.officeUiFabricReact.keytipTypesMod.IKeytipProps],
    visibleKeytips: js.Array[typings.officeUiFabricReact.keytipTypesMod.IKeytipProps]
  ): IKeytipLayerState = {
    val __obj = js.Dynamic.literal(inKeytipMode = inKeytipMode.asInstanceOf[js.Any], keytips = keytips.asInstanceOf[js.Any], visibleKeytips = visibleKeytips.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerState]
  }
}
