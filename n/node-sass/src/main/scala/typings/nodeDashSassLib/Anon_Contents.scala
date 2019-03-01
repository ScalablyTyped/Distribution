package typings
package nodeDashSassLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents
  extends nodeDashSassLib.nodeDashSassMod._ImporterReturnType {
  var contents: java.lang.String
  var file: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Contents {
  @scala.inline
  def apply(contents: java.lang.String, file: java.lang.String = null): Anon_Contents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contents")(contents)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[Anon_Contents]
  }
}

