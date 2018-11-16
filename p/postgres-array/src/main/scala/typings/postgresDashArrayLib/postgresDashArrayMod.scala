package typings
package postgresDashArrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postgres-array", JSImport.Namespace)
@js.native
object postgresDashArrayMod extends js.Object {
  def parse(source: java.lang.String): js.Array[java.lang.String] = js.native
  def parse[T](source: java.lang.String, transform: js.Function1[/* value */ java.lang.String, T]): js.Array[T] = js.native
}

