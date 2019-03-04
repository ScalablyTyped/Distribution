package typings
package multerLib.multerMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var file: multerLib.multerMod.Global.ExpressNs.MulterNs.File
  var files: org.scalablytyped.runtime.StringDictionary[js.Array[multerLib.multerMod.Global.ExpressNs.MulterNs.File]] | js.Array[multerLib.multerMod.Global.ExpressNs.MulterNs.File]
}

object Request {
  @scala.inline
  def apply(
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    files: org.scalablytyped.runtime.StringDictionary[js.Array[multerLib.multerMod.Global.ExpressNs.MulterNs.File]] | js.Array[multerLib.multerMod.Global.ExpressNs.MulterNs.File]
  ): Request = {
    val __obj = js.Dynamic.literal(file = file, files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

