package typings.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped [@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Longitude, @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Latitude] */ @js.native
trait GetWorkerByLocationProps extends js.Object {
  
  var radius: js.UndefOr[Double] = js.native
}
object GetWorkerByLocationProps {
  
  @scala.inline
  def apply(): GetWorkerByLocationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkerByLocationProps]
  }
  
  @scala.inline
  implicit class GetWorkerByLocationPropsOps[Self <: GetWorkerByLocationProps] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
