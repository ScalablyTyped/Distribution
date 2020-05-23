package typings.phantom.anon

import typings.phantom.mod.IPhantomCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: IPhantomCallback
  var height: String
}

object Contents {
  @scala.inline
  def apply(contents: IPhantomCallback, height: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

