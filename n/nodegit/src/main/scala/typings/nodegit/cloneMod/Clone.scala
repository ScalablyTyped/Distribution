package typings.nodegit.cloneMod

import typings.nodegit.cloneDashOptionsMod.CloneOptions
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/clone", "Clone")
@js.native
class Clone () extends js.Object

/* static members */
@JSImport("nodegit/clone", "Clone")
@js.native
object Clone extends js.Object {
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  def clone(url: String, localPath: String): js.Promise[Repository] = js.native
  def clone(url: String, localPath: String, options: CloneOptions): js.Promise[Repository] = js.native
  def initOptions(opts: CloneOptions, version: Double): Double = js.native
}

