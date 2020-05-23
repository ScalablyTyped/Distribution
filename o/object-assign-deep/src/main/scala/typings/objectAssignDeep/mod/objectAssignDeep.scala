package typings.objectAssignDeep.mod

import typings.objectAssignDeep.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait objectAssignDeep extends js.Object {
  @JSName("noMutate")
  var noMutate_Original: FnCall = js.native
  def noMutate(target: js.Object, sources: js.Any*): js.Any = js.native
  def noMutate[T, U](target: T, source: U): T with U = js.native
  def noMutate[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
  def noMutate[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
  def withOptions(target: js.Any, objects: js.Array[_], options: Options): js.Any = js.native
  def withOptions[T, U](target: T, objects: js.Array[U], options: Options): T with U = js.native
  def withOptions[T, U, V](target: T, objects: js.Tuple2[U, V], options: Options): T with U with V = js.native
  def withOptions[T, U, V, W](target: T, objects: js.Tuple3[U, V, W], options: Options): T with U with V with W = js.native
}

