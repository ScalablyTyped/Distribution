package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/lib/path-match", JSImport.Namespace)
@js.native
object pathMatchMod extends js.Object {
  def default(): js.Function1[
    /* path */ String, 
    js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[_], _]
  ] = js.native
}

