package typings.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtraLib extends js.Object {
  var content: String
  var version: Double
}

object IExtraLib {
  @scala.inline
  def apply(content: String, version: Double): IExtraLib = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtraLib]
  }
}

