package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicProps extends js.Object {
  var content: js.UndefOr[Content | js.Array[Content]] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
}

object IntrinsicProps {
  @scala.inline
  def apply(content: Content | js.Array[Content] = null, key: Key = null): IntrinsicProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicProps]
  }
}

