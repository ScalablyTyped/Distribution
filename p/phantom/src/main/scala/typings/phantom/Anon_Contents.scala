package typings.phantom

import typings.phantom.phantomMod.IPhantomCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends js.Object {
  var contents: IPhantomCallback
  var height: String
}

object Anon_Contents {
  @scala.inline
  def apply(contents: IPhantomCallback, height: String): Anon_Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Contents]
  }
}

