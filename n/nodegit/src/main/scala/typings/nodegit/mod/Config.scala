package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Config")
@js.native
class Config ()
  extends typings.nodegit.configMod.Config

/* static members */
@JSImport("nodegit", "Config")
@js.native
object Config extends js.Object {
  def findGlobal(): js.Promise[String] = js.native
   // the docs says it's a buff but it's actually a string
  def findProgramdata(): js.Promise[typings.nodegit.bufMod.Buf] = js.native
  def findSystem(): js.Promise[typings.nodegit.bufMod.Buf] = js.native
  def findXdg(): js.Promise[typings.nodegit.bufMod.Buf] = js.native
  def openDefault(): js.Promise[typings.nodegit.configMod.Config] = js.native
  def openOndisk(path: String): js.Promise[typings.nodegit.configMod.Config] = js.native
}

