package typings.phantom

import typings.phantom.mod.IPhantomCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContents extends js.Object {
  var contents: IPhantomCallback
  var height: String
}

object AnonContents {
  @scala.inline
  def apply(contents: IPhantomCallback, height: String): AnonContents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContents]
  }
}

