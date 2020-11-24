package typings.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalloutPositionProps extends IPositionProps {
  
  /**
    * The width of the beak.
    */
  var beakWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not the beak is visible
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.native
}
object ICalloutPositionProps {
  
  @scala.inline
  def apply(): ICalloutPositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutPositionProps]
  }
  
  @scala.inline
  implicit class ICalloutPositionPropsOps[Self <: ICalloutPositionProps] (val x: Self) extends AnyVal {
    
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
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakWidth: Self = this.set("beakWidth", js.undefined)
    
    @scala.inline
    def setIsBeakVisible(value: Boolean): Self = this.set("isBeakVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBeakVisible: Self = this.set("isBeakVisible", js.undefined)
  }
}
