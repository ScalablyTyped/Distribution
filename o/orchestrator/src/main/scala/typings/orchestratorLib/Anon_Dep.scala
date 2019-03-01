package typings
package orchestratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dep extends js.Object {
  var dep: js.Array[java.lang.String]
}

object Anon_Dep {
  @scala.inline
  def apply(dep: js.Array[java.lang.String]): Anon_Dep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dep")(dep)
    __obj.asInstanceOf[Anon_Dep]
  }
}

