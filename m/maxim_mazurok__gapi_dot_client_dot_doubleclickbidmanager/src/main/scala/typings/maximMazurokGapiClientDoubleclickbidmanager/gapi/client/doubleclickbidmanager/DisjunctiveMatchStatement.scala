package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisjunctiveMatchStatement extends StObject {
  
  /** Filters. There is a limit of 100 filters that can be set per disjunctive match statement. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.undefined
}
object DisjunctiveMatchStatement {
  
  @scala.inline
  def apply(): DisjunctiveMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisjunctiveMatchStatement]
  }
  
  @scala.inline
  implicit class DisjunctiveMatchStatementMutableBuilder[Self <: DisjunctiveMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventFilters(value: js.Array[EventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    @scala.inline
    def setEventFiltersVarargs(value: EventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value :_*))
  }
}
