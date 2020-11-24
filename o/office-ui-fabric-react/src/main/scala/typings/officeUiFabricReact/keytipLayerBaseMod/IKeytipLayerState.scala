package typings.officeUiFabricReact.keytipLayerBaseMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeytipLayerState extends js.Object {
  
  var inKeytipMode: Boolean = js.native
  
  var keytips: js.Array[IKeytipProps] = js.native
  
  var visibleKeytips: js.Array[IKeytipProps] = js.native
}
object IKeytipLayerState {
  
  @scala.inline
  def apply(inKeytipMode: Boolean, keytips: js.Array[IKeytipProps], visibleKeytips: js.Array[IKeytipProps]): IKeytipLayerState = {
    val __obj = js.Dynamic.literal(inKeytipMode = inKeytipMode.asInstanceOf[js.Any], keytips = keytips.asInstanceOf[js.Any], visibleKeytips = visibleKeytips.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerState]
  }
  
  @scala.inline
  implicit class IKeytipLayerStateOps[Self <: IKeytipLayerState] (val x: Self) extends AnyVal {
    
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
    def setInKeytipMode(value: Boolean): Self = this.set("inKeytipMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeytipsVarargs(value: IKeytipProps*): Self = this.set("keytips", js.Array(value :_*))
    
    @scala.inline
    def setKeytips(value: js.Array[IKeytipProps]): Self = this.set("keytips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleKeytipsVarargs(value: IKeytipProps*): Self = this.set("visibleKeytips", js.Array(value :_*))
    
    @scala.inline
    def setVisibleKeytips(value: js.Array[IKeytipProps]): Self = this.set("visibleKeytips", value.asInstanceOf[js.Any])
  }
}
