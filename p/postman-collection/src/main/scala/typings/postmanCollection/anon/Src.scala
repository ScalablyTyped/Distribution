package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Src extends js.Object {
  var src: js.UndefOr[String] = js.undefined
}

object Src {
  @scala.inline
  def apply(src: String = null): Src = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
}

