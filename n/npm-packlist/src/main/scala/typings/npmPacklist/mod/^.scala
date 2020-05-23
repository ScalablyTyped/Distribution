package typings.npmPacklist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-packlist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[js.Array[String]] = js.native
  def apply(options: Options): js.Promise[js.Array[String]] = js.native
  def apply[T](options: js.UndefOr[Options], callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = js.native
}

