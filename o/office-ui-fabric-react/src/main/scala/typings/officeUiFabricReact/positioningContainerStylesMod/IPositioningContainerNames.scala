package typings.officeUiFabricReact.positioningContainerStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositioningContainerNames extends js.Object {
  
  var beak: js.UndefOr[String] = js.native
  
  var beakCurtain: js.UndefOr[String] = js.native
  
  var container: String = js.native
  
  var main: String = js.native
  
  var overFlowYHidden: String = js.native
  
  /**
    * Root html container for this component.
    */
  var root: String = js.native
}
object IPositioningContainerNames {
  
  @scala.inline
  def apply(container: String, main: String, overFlowYHidden: String, root: String): IPositioningContainerNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], overFlowYHidden = overFlowYHidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositioningContainerNames]
  }
  
  @scala.inline
  implicit class IPositioningContainerNamesOps[Self <: IPositioningContainerNames] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverFlowYHidden(value: String): Self = this.set("overFlowYHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeak(value: String): Self = this.set("beak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeak: Self = this.set("beak", js.undefined)
    
    @scala.inline
    def setBeakCurtain(value: String): Self = this.set("beakCurtain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakCurtain: Self = this.set("beakCurtain", js.undefined)
  }
}
