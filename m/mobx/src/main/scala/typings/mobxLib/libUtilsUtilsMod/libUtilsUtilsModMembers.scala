package typings
package mobxLib.libUtilsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/utils/utils", JSImport.Namespace)
@js.native
object libUtilsUtilsModMembers extends js.Object {
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  val OBFUSCATED_ERROR: /* An invariant failed, however the error is obfuscated because this is an production build. */ java.lang.String = js.native
  def addHiddenFinalProp(`object`: js.Any, propName: stdLib.PropertyKey, value: js.Any): scala.Unit = js.native
  def addHiddenProp(`object`: js.Any, propName: stdLib.PropertyKey, value: js.Any): scala.Unit = js.native
  def assertPropertyConfigurable(`object`: js.Any, prop: stdLib.PropertyKey): scala.Unit = js.native
  def createInstanceofPredicate[T](
    name: java.lang.String,
    clazz: ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  ): js.Function1[/* x */ js.Any, /* is T */scala.Boolean] = js.native
  def deprecated(msg: java.lang.String): scala.Boolean = js.native
  def deprecated(thing: java.lang.String, replacement: java.lang.String): scala.Boolean = js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  def fail(message: scala.Boolean): scala.Nothing = js.native
  def getMapLikeKeys[V](map: js.Any): js.Array[java.lang.String] = js.native
  def getMapLikeKeys[V](map: mobxLib.libTypesObservablemapMod.IKeyValueMap[V]): js.Array[java.lang.String] = js.native
  def getMapLikeKeys[K, V](map: mobxLib.libInternalMod.ObservableMap[K, V]): js.Array[K] = js.native
  def getNextId(): scala.Double = js.native
  def invariant(check: js.Any): scala.Unit = js.native
  def invariant(check: js.Any, message: java.lang.String): scala.Unit = js.native
  def invariant(check: js.Any, message: scala.Boolean): scala.Unit = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`false`): scala.Nothing = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`false`, message: java.lang.String): scala.Nothing = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`false`, message: scala.Boolean): scala.Nothing = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`true`): scala.Unit = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`true`, message: java.lang.String): scala.Unit = js.native
  def invariant(check: mobxLib.mobxLibNumbers.`true`, message: scala.Boolean): scala.Unit = js.native
  def isArrayLike(x: js.Any): scala.Boolean = js.native
  def isES6Map(thing: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def isPlainObject(value: js.Any): scala.Boolean = js.native
  def isPropertyConfigurable(`object`: js.Any, prop: stdLib.PropertyKey): scala.Boolean = js.native
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[stdLib.PropertyKey]): scala.Unit = js.native
  def noop(): scala.Unit = js.native
  def once(func: Lambda): Lambda = js.native
  def toPrimitive(value: js.Any): js.Any = js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
}

