package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Reflect")
@js.native
object ReflectNs extends js.Object {
  @JSName("apply")
  def apply(target: pDashEventLib.Function, thisArgument: js.Any, argumentsList: pDashEventLib.ArrayLike[_]): js.Any = js.native
  def construct(target: pDashEventLib.Function, argumentsList: pDashEventLib.ArrayLike[_]): js.Any = js.native
  def construct(target: pDashEventLib.Function, argumentsList: pDashEventLib.ArrayLike[_], newTarget: js.Any): js.Any = js.native
  def defineProperty(
    target: js.Object,
    propertyKey: pDashEventLib.PropertyKey,
    attributes: pDashEventLib.PropertyDescriptor
  ): scala.Boolean = js.native
  def deleteProperty(target: js.Object, propertyKey: pDashEventLib.PropertyKey): scala.Boolean = js.native
  def enumerate(target: js.Object): pDashEventLib.IterableIterator[_] = js.native
  def get(target: js.Object, propertyKey: pDashEventLib.PropertyKey): js.Any = js.native
  def get(target: js.Object, propertyKey: pDashEventLib.PropertyKey, receiver: js.Any): js.Any = js.native
  def getOwnPropertyDescriptor(target: js.Object, propertyKey: pDashEventLib.PropertyKey): js.UndefOr[pDashEventLib.PropertyDescriptor] = js.native
  def getPrototypeOf(target: js.Object): js.Object = js.native
  def has(target: js.Object, propertyKey: pDashEventLib.PropertyKey): scala.Boolean = js.native
  def isExtensible(target: js.Object): scala.Boolean = js.native
  def ownKeys(target: js.Object): pDashEventLib.Array[pDashEventLib.PropertyKey] = js.native
  def preventExtensions(target: js.Object): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: pDashEventLib.PropertyKey, value: js.Any): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: pDashEventLib.PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = js.native
  def setPrototypeOf(target: js.Object, proto: js.Any): scala.Boolean = js.native
}

