package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFleetAutoscaler extends js.Object {
  
  /** The name of the Agones autoscaler. */
  var name: js.UndefOr[String] = js.native
  
  /** Encapsulates the source of the Agones fleet spec. Details about the Agones autoscaler spec. */
  var specSource: js.UndefOr[SpecSource] = js.native
}
object TargetFleetAutoscaler {
  
  @scala.inline
  def apply(): TargetFleetAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleetAutoscaler]
  }
  
  @scala.inline
  implicit class TargetFleetAutoscalerOps[Self <: TargetFleetAutoscaler] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSpecSource(value: SpecSource): Self = this.set("specSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecSource: Self = this.set("specSource", js.undefined)
  }
}
