package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisjunctiveMatchStatement extends js.Object {
  
  /** Filters. There is a limit of 100 filters that can be set per disjunctive match statement. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.native
}
object DisjunctiveMatchStatement {
  
  @scala.inline
  def apply(): DisjunctiveMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisjunctiveMatchStatement]
  }
  
  @scala.inline
  implicit class DisjunctiveMatchStatementOps[Self <: DisjunctiveMatchStatement] (val x: Self) extends AnyVal {
    
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
    def setEventFiltersVarargs(value: EventFilter*): Self = this.set("eventFilters", js.Array(value :_*))
    
    @scala.inline
    def setEventFilters(value: js.Array[EventFilter]): Self = this.set("eventFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventFilters: Self = this.set("eventFilters", js.undefined)
  }
}
