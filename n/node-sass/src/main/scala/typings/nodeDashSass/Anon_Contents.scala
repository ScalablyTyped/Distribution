package typings.nodeDashSass

import typings.nodeDashSass.nodeDashSassMod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends _ImporterReturnType {
  var contents: String
  var file: js.UndefOr[String] = js.undefined
}

object Anon_Contents {
  @scala.inline
  def apply(contents: String, file: String = null): Anon_Contents = {
    val __obj = js.Dynamic.literal(contents = contents)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[Anon_Contents]
  }
}

