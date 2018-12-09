package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Clone")
@js.native
class Clone ()
  extends nodegitLib.cloneMod.Clone

@JSImport("nodegit", "Clone")
@js.native
object Clone extends js.Object {
  /**
       * Patch repository cloning to automatically coerce objects.
       */
  def clone(url: java.lang.String, localPath: java.lang.String): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  /**
       * Patch repository cloning to automatically coerce objects.
       */
  def clone(
    url: java.lang.String,
    localPath: java.lang.String,
    options: nodegitLib.cloneDashOptionsMod.CloneOptions
  ): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def initOptions(opts: nodegitLib.cloneDashOptionsMod.CloneOptions, version: scala.Double): scala.Double = js.native
}

