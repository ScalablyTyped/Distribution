package typings.ngDashGrid.ngGrid.service

import typings.ngDashGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilityService extends js.Object {
  def endsWith(str: String, suffix: String): Boolean
  def evalProperty(entity: js.Any, path: String): js.Any
  def forIn(obj: js.Any, action: js.Function2[/* value */ js.Any, /* property */ String, js.Object]): Unit
  def getElementsByClassName(cl: String): js.Array[_]
  def getInstanceType(o: js.Any): String
  def isNullOrUndefined(obj: js.Any): Boolean
  def newId(): String
  def seti18n($scope: IGridScope, language: String): Unit
  def visualLength(node: js.Any): Double
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
}

