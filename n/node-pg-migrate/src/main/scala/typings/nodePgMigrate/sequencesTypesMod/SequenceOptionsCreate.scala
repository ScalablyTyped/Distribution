package typings.nodePgMigrate.sequencesTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceOptionsCreate
  extends SequenceOptions
     with IfNotExistsOption {
  
  var temporary: js.UndefOr[Boolean] = js.native
}
object SequenceOptionsCreate {
  
  @scala.inline
  def apply(): SequenceOptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceOptionsCreate]
  }
  
  @scala.inline
  implicit class SequenceOptionsCreateOps[Self <: SequenceOptionsCreate] (val x: Self) extends AnyVal {
    
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
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
  }
}
