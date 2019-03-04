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
    endsWith: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    evalProperty: js.Function2[js.Any, java.lang.String, js.Any],
    forIn: js.Function2[
      js.Any, 
      js.Function2[/* value */ js.Any, /* property */ java.lang.String, js.Object], 
      scala.Unit
    ],
    getElementsByClassName: js.Function1[java.lang.String, js.Array[_]],
    getInstanceType: js.Function1[js.Any, java.lang.String],
    isNullOrUndefined: js.Function1[js.Any, scala.Boolean],
    newId: js.Function0[java.lang.String],
    seti18n: js.Function2[ngDashGridLib.ngGridNs.IGridScope, java.lang.String, scala.Unit],
    visualLength: js.Function1[js.Any, scala.Double]
  ): IUtilityService = {
    val __obj = js.Dynamic.literal(endsWith = endsWith, evalProperty = evalProperty, forIn = forIn, getElementsByClassName = getElementsByClassName, getInstanceType = getInstanceType, isNullOrUndefined = isNullOrUndefined, newId = newId, seti18n = seti18n, visualLength = visualLength)
  
    __obj.asInstanceOf[IUtilityService]
  }
}

