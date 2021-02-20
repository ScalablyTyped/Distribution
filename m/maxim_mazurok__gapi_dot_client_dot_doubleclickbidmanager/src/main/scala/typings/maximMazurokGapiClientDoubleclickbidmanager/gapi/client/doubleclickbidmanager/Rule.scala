package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  var disjunctiveMatchStatements: js.UndefOr[js.Array[DisjunctiveMatchStatement]] = js.native
  
  /** Rule name. */
  var name: js.UndefOr[String] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisjunctiveMatchStatements(value: js.Array[DisjunctiveMatchStatement]): Self = StObject.set(x, "disjunctiveMatchStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveMatchStatementsUndefined: Self = StObject.set(x, "disjunctiveMatchStatements", js.undefined)
    
    @scala.inline
    def setDisjunctiveMatchStatementsVarargs(value: DisjunctiveMatchStatement*): Self = StObject.set(x, "disjunctiveMatchStatements", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
