package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nyaapi", "pantsu.upload")
@js.native
object upload extends js.Object {
  def apply(opts: UploadData): js.Promise[Response[Torrent]] = js.native
}

