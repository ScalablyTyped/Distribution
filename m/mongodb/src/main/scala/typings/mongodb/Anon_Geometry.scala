package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometry extends js.Object {
  @JSName("$geometry")
  var $geometry: js.Object
}

object Anon_Geometry {
  @scala.inline
  def apply($geometry: js.Object): Anon_Geometry = {
    val __obj = js.Dynamic.literal($geometry = $geometry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Geometry]
  }
}

