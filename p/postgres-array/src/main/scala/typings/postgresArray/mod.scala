package typings.postgresArray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postgres-array", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(source: String): js.Array[String] = js.native
  def parse[T](source: String, transform: js.Function1[/* value */ String, T]): js.Array[T] = js.native
}

