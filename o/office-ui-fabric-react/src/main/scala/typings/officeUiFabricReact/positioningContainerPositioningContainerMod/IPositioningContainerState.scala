package typings.officeUiFabricReact.positioningContainerPositioningContainerMod

import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositioningContainerState extends js.Object {
  
  /**
    * Tracks the current height offset and updates during
    * the height animation when props.finalHeight is specified.
    */
  var heightOffset: js.UndefOr[Double] = js.native
  
  /**
    * Current set of calcualted positions for the outermost parent container.
    */
  var positions: js.UndefOr[IPositionedData] = js.native
}
object IPositioningContainerState {
  
  @scala.inline
  def apply(): IPositioningContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositioningContainerState]
  }
  
  @scala.inline
  implicit class IPositioningContainerStateOps[Self <: IPositioningContainerState] (val x: Self) extends AnyVal {
    
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
    def setHeightOffset(value: Double): Self = this.set("heightOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightOffset: Self = this.set("heightOffset", js.undefined)
    
    @scala.inline
    def setPositions(value: IPositionedData): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
  }
}
