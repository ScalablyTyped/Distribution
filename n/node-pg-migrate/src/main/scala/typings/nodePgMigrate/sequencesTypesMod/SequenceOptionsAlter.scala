package typings.nodePgMigrate.sequencesTypesMod

import typings.nodePgMigrate.nodePgMigrateBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceOptionsAlter extends SequenceOptions {
  
  var restart: js.UndefOr[Double | `true`] = js.native
}
object SequenceOptionsAlter {
  
  @scala.inline
  def apply(): SequenceOptionsAlter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceOptionsAlter]
  }
  
  @scala.inline
  implicit class SequenceOptionsAlterOps[Self <: SequenceOptionsAlter] (val x: Self) extends AnyVal {
    
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
    def setRestart(value: Double | `true`): Self = this.set("restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
  }
}
