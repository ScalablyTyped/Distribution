package typings.ngGrid.ngGrid.service

import typings.ngGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilityService extends js.Object {
  
  def endsWith(str: String, suffix: String): Boolean = js.native
  
  def evalProperty(entity: js.Any, path: String): js.Any = js.native
  
  def forIn(obj: js.Any, action: js.Function2[/* value */ js.Any, /* property */ String, js.Object]): Unit = js.native
  
  def getElementsByClassName(cl: String): js.Array[_] = js.native
  
  def getInstanceType(o: js.Any): String = js.native
  
  def isNullOrUndefined(obj: js.Any): Boolean = js.native
  
  def newId(): String = js.native
  
  def seti18n($scope: IGridScope, language: String): Unit = js.native
  
  def visualLength(node: js.Any): Double = js.native
}
object IUtilityService {
  
  @scala.inline
  def apply(
    endsWith: (String, String) => Boolean,
    evalProperty: (js.Any, String) => js.Any,
    forIn: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Unit,
    getElementsByClassName: String => js.Array[_],
    getInstanceType: js.Any => String,
    isNullOrUndefined: js.Any => Boolean,
    newId: () => String,
    seti18n: (IGridScope, String) => Unit,
    visualLength: js.Any => Double
  ): IUtilityService = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction2(endsWith), evalProperty = js.Any.fromFunction2(evalProperty), forIn = js.Any.fromFunction2(forIn), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getInstanceType = js.Any.fromFunction1(getInstanceType), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), newId = js.Any.fromFunction0(newId), seti18n = js.Any.fromFunction2(seti18n), visualLength = js.Any.fromFunction1(visualLength))
    __obj.asInstanceOf[IUtilityService]
  }
  
  @scala.inline
  implicit class IUtilityServiceOps[Self <: IUtilityService] (val x: Self) extends AnyVal {
    
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
    def setEndsWith(value: (String, String) => Boolean): Self = this.set("endsWith", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEvalProperty(value: (js.Any, String) => js.Any): Self = this.set("evalProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setForIn(value: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Unit): Self = this.set("forIn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElementsByClassName(value: String => js.Array[_]): Self = this.set("getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInstanceType(value: js.Any => String): Self = this.set("getInstanceType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNullOrUndefined(value: js.Any => Boolean): Self = this.set("isNullOrUndefined", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewId(value: () => String): Self = this.set("newId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeti18n(value: (IGridScope, String) => Unit): Self = this.set("seti18n", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisualLength(value: js.Any => Double): Self = this.set("visualLength", js.Any.fromFunction1(value))
  }
}
