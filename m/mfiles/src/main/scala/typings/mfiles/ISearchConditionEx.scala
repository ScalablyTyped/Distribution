package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchConditionEx extends StObject {
  
  def Clone(): ISearchConditionEx
  
  var Enabled: Boolean
  
  var Ignored: Boolean
  
  var SearchCondition: ISearchCondition
  
  def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit
  
  var SpecialNULL: Boolean
}
object ISearchConditionEx {
  
  @scala.inline
  def apply(
    Clone: () => ISearchConditionEx,
    Enabled: Boolean,
    Ignored: Boolean,
    SearchCondition: ISearchCondition,
    Set: (ISearchCondition, Boolean, Boolean, Boolean) => Unit,
    SpecialNULL: Boolean
  ): ISearchConditionEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Enabled = Enabled.asInstanceOf[js.Any], Ignored = Ignored.asInstanceOf[js.Any], SearchCondition = SearchCondition.asInstanceOf[js.Any], Set = js.Any.fromFunction4(Set), SpecialNULL = SpecialNULL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchConditionEx]
  }
  
  @scala.inline
  implicit class ISearchConditionExMutableBuilder[Self <: ISearchConditionEx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISearchConditionEx): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "Ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchCondition(value: ISearchCondition): Self = StObject.set(x, "SearchCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (ISearchCondition, Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSpecialNULL(value: Boolean): Self = StObject.set(x, "SpecialNULL", value.asInstanceOf[js.Any])
  }
}
