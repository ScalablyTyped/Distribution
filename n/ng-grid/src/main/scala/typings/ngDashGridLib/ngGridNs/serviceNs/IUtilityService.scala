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

