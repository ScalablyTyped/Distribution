package typings
package microgearsLib.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var name: java.lang.String
  def afterChain[T, M /* <: MetaInformation */](result: T, metaInfo: M): T
  def beforeChain[M /* <: MetaInformation */](args: js.Array[_], metaInfo: M): js.Array[_]
}

object Plugin {
  @scala.inline
  def apply(
    afterChain: js.Function2[js.Any, js.Any, js.Any],
    beforeChain: js.Function2[js.Array[_], js.Any, js.Array[_]],
    name: java.lang.String
  ): Plugin = {
    val __obj = js.Dynamic.literal(afterChain = afterChain, beforeChain = beforeChain, name = name)
  
    __obj.asInstanceOf[Plugin]
  }
}

