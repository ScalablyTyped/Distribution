package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TransformFunction extends js.Object {
  var transform: js.Function
}

object Anon_TransformFunction {
  @scala.inline
  def apply(transform: js.Function): Anon_TransformFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_TransformFunction]
  }
}

