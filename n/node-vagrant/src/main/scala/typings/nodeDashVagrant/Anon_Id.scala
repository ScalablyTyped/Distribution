package typings.nodeDashVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var name: String
  var provider: String
  var state: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, name: String, provider: String, state: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, name = name, provider = provider, state = state)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

