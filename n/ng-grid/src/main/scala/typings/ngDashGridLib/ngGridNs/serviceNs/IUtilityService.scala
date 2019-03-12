package typings
package ngDashGridLib.ngGridNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilityService extends js.Object {
  def endsWith(str: java.lang.String, suffix: java.lang.String): scala.Boolean
  def evalProperty(entity: js.Any, path: java.lang.String): js.Any
  def forIn(obj: js.Any, action: js.Function2[/* value */ js.Any, /* property */ java.lang.String, js.Object]): scala.Unit
  def getElementsByClassName(cl: java.lang.String): js.Array[_]
  def getInstanceType(o: js.Any): java.lang.String
  def isNullOrUndefined(obj: js.Any): scala.Boolean
  def newId(): java.lang.String
  def seti18n($scope: ngDashGridLib.ngGridNs.IGridScope, language: java.lang.String): scala.Unit
  def visualLength(node: js.Any): scala.Double
}

object IUtilityService {
  @scala.inline
  def apply(
    endsWith: (java.lang.String, java.lang.String) => scala.Boolean,
    evalProperty: (js.Any, java.lang.String) => js.Any,
    forIn: (js.Any, js.Function2[/* value */ js.Any, /* property */ java.lang.String, js.Object]) => scala.Unit,
    getElementsByClassName: java.lang.String => js.Array[_],
    getInstanceType: js.Any => java.lang.String,
    isNullOrUndefined: js.Any => scala.Boolean,
    newId: () => java.lang.String,
    seti18n: (ngDashGridLib.ngGridNs.IGridScope, java.lang.String) => scala.Unit,
    visualLength: js.Any => scala.Double
  ): IUtilityService = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction2(endsWith), evalProperty = js.Any.fromFunction2(evalProperty), forIn = js.Any.fromFunction2(forIn), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getInstanceType = js.Any.fromFunction1(getInstanceType), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), newId = js.Any.fromFunction0(newId), seti18n = js.Any.fromFunction2(seti18n), visualLength = js.Any.fromFunction1(visualLength))
  
    __obj.asInstanceOf[IUtilityService]
  }
}

