package typings.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "pathToFileURL")
@js.native
object pathToFileURL extends js.Object {
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  def apply(url: java.lang.String): URL = js.native
}

