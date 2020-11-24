package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncompleteData extends js.Object {
  
  // The service does not have source data before the specified time.
  var missingDataBeforeDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Some data was not recorded due to excessive activity.
  var wasThrottled: js.UndefOr[NullableOption[Boolean]] = js.native
}
object IncompleteData {
  
  @scala.inline
  def apply(): IncompleteData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncompleteData]
  }
  
  @scala.inline
  implicit class IncompleteDataOps[Self <: IncompleteData] (val x: Self) extends AnyVal {
    
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
    def setMissingDataBeforeDateTime(value: NullableOption[String]): Self = this.set("missingDataBeforeDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingDataBeforeDateTime: Self = this.set("missingDataBeforeDateTime", js.undefined)
    
    @scala.inline
    def setMissingDataBeforeDateTimeNull: Self = this.set("missingDataBeforeDateTime", null)
    
    @scala.inline
    def setWasThrottled(value: NullableOption[Boolean]): Self = this.set("wasThrottled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWasThrottled: Self = this.set("wasThrottled", js.undefined)
    
    @scala.inline
    def setWasThrottledNull: Self = this.set("wasThrottled", null)
  }
}
