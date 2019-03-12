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
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (expressLib.expressMod.eNs.Request, multerLib.multerMod.Global.ExpressNs.MulterNs.File, js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[stdLib.Partial[multerLib.multerMod.Global.ExpressNs.MulterNs.File]], 
      scala.Unit
    ]) => scala.Unit,
    _removeFile: (expressLib.expressMod.eNs.Request, multerLib.multerMod.Global.ExpressNs.MulterNs.File, js.Function1[/* error */ stdLib.Error, scala.Unit]) => scala.Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
  
    __obj.asInstanceOf[StorageEngine]
  }
}

