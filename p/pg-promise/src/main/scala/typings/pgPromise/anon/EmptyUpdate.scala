package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyUpdate extends StObject {
  
  var emptyUpdate: js.UndefOr[js.Any] = js.undefined
  
  var tableAlias: js.UndefOr[String] = js.undefined
  
  var valueAlias: js.UndefOr[String] = js.undefined
}
object EmptyUpdate {
  
  @scala.inline
  def apply(): EmptyUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmptyUpdate]
  }
  
  @scala.inline
  implicit class EmptyUpdateMutableBuilder[Self <: EmptyUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmptyUpdate(value: js.Any): Self = StObject.set(x, "emptyUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUpdateUndefined: Self = StObject.set(x, "emptyUpdate", js.undefined)
    
    @scala.inline
    def setTableAlias(value: String): Self = StObject.set(x, "tableAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableAliasUndefined: Self = StObject.set(x, "tableAlias", js.undefined)
    
    @scala.inline
    def setValueAlias(value: String): Self = StObject.set(x, "valueAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAliasUndefined: Self = StObject.set(x, "valueAlias", js.undefined)
  }
}
