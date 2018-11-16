package typings
package multerLib.multerMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StorageEngine extends js.Object {
  def _handleFile(
    req: expressLib.expressMod.eNs.Request,
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[stdLib.Partial[multerLib.multerMod.Global.ExpressNs.MulterNs.File]], 
      scala.Unit
    ]
  ): scala.Unit
  def _removeFile(
    req: expressLib.expressMod.eNs.Request,
    file: multerLib.multerMod.Global.ExpressNs.MulterNs.File,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit
}

