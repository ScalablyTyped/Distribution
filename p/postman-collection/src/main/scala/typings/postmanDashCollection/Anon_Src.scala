package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Src extends js.Object {
  var src: js.UndefOr[String] = js.undefined
}

object Anon_Src {
  @scala.inline
  def apply(src: String = null): Anon_Src = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Src]
  }
}

