package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Odb")
@js.native
class Odb ()
  extends typings.nodegit.odbMod.Odb

/* static members */
@JSImport("nodegit", "Odb")
@js.native
object Odb extends js.Object {
  def open(objectsDir: String): js.Promise[typings.nodegit.odbMod.Odb] = js.native
}

