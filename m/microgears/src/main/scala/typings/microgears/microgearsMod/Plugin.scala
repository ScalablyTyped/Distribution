package typings.microgears.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var name: String
  def afterChain[T, M /* <: MetaInformation */](result: T, metaInfo: M): T
  def beforeChain[M /* <: MetaInformation */](args: js.Array[_], metaInfo: M): js.Array[_]
}

object Plugin {
  @scala.inline
  def apply(
    afterChain: (js.Any, js.Any) => js.Any,
    beforeChain: (js.Array[_], js.Any) => js.Array[_],
    name: String
  ): Plugin = {
    val __obj = js.Dynamic.literal(afterChain = js.Any.fromFunction2(afterChain), beforeChain = js.Any.fromFunction2(beforeChain), name = name)
  
    __obj.asInstanceOf[Plugin]
  }
}

