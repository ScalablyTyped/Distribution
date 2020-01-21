package typings.mirrorx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _model extends js.Object {
  var name: String
  var reducers: js.Any
}

object _model {
  @scala.inline
  def apply(name: String, reducers: js.Any): _model = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_model]
  }
}

