package typings.maximMazurokGapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generation extends js.Object {
  
  /** The generation of this object to use as the source. */
  var generation: js.UndefOr[String] = js.native
  
  /** The source object's name. All source objects must reside in the same bucket. */
  var name: js.UndefOr[String] = js.native
  
  /** Conditions that must be met for this operation to execute. */
  var objectPreconditions: js.UndefOr[IfGenerationMatch] = js.native
}
object Generation {
  
  @scala.inline
  def apply(): Generation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generation]
  }
  
  @scala.inline
  implicit class GenerationOps[Self <: Generation] (val x: Self) extends AnyVal {
    
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
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObjectPreconditions(value: IfGenerationMatch): Self = this.set("objectPreconditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectPreconditions: Self = this.set("objectPreconditions", js.undefined)
  }
}
