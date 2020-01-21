package typings.mobservable

import typings.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def deepEquals(a: js.Any, b: js.Any): Boolean = js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  def makeNonEnumerable(`object`: js.Any, props: js.Array[String]): Unit = js.native
  def once(func: Lambda): Lambda = js.native
  def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
}

