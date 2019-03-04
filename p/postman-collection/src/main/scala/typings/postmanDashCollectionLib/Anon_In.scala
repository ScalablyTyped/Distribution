package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_In extends js.Object {
  def in(`val`: js.Any): java.lang.String
  def out(`val`: java.lang.String): js.Any
}

object Anon_In {
  @scala.inline
  def apply(in: js.Function1[js.Any, java.lang.String], out: js.Function1[java.lang.String, js.Any]): Anon_In = {
    val __obj = js.Dynamic.literal(in = in, out = out)
  
    __obj.asInstanceOf[Anon_In]
  }
}

