package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComparison
  extends /* item */ StringDictionary[js.Any] {
  
  var __count: js.UndefOr[Double] = js.native
  
  var __offset: js.UndefOr[Double] = js.native
  
  var __order: js.UndefOr[String] = js.native
}
object IComparison {
  
  @scala.inline
  def apply(): IComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComparison]
  }
  
  @scala.inline
  implicit class IComparisonMutableBuilder[Self <: IComparison] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__count(value: Double): Self = StObject.set(x, "__count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__countUndefined: Self = StObject.set(x, "__count", js.undefined)
    
    @scala.inline
    def set__offset(value: Double): Self = StObject.set(x, "__offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__offsetUndefined: Self = StObject.set(x, "__offset", js.undefined)
    
    @scala.inline
    def set__order(value: String): Self = StObject.set(x, "__order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__orderUndefined: Self = StObject.set(x, "__order", js.undefined)
  }
}
