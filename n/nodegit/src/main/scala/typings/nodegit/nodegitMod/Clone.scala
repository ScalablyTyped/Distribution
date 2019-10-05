package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Clone")
@js.native
class Clone ()
  extends typings.nodegit.cloneMod.Clone

/* static members */
@JSImport("nodegit", "Clone")
@js.native
object Clone extends js.Object {
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  def clone(url: String, localPath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def clone(url: String, localPath: String, options: typings.nodegit.cloneDashOptionsMod.CloneOptions): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def initOptions(opts: typings.nodegit.cloneDashOptionsMod.CloneOptions, version: Double): Double = js.native
  type LOCAL = typings.nodegit.cloneMod.Clone.LOCAL
}

