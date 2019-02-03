package typings
package nodegitLib.stashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/stash", "Stash")
@js.native
class Stash () extends js.Object

/* static members */
@JSImport("nodegit/stash", "Stash")
@js.native
object Stash extends js.Object {
  @JSName("apply")
  def apply(repo: nodegitLib.repositoryMod.Repository, index: scala.Double): js.Promise[scala.Double] = js.native
  @JSName("apply")
  def apply(
    repo: nodegitLib.repositoryMod.Repository,
    index: scala.Double,
    options: nodegitLib.stashMod.StashApplyOptions
  ): js.Promise[scala.Double] = js.native
  def applyInitOptions(opts: nodegitLib.stashMod.StashApplyOptions, version: scala.Double): scala.Double = js.native
  def drop(repo: nodegitLib.repositoryMod.Repository, index: scala.Double): js.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository, callback: js.Function): js.Promise[scala.Double] = js.native
  def pop(repo: nodegitLib.repositoryMod.Repository, index: scala.Double): js.Promise[scala.Double] = js.native
  def pop(
    repo: nodegitLib.repositoryMod.Repository,
    index: scala.Double,
    options: nodegitLib.stashMod.StashApplyOptions
  ): js.Promise[scala.Double] = js.native
  def save(
    repo: nodegitLib.repositoryMod.Repository,
    stasher: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    flags: scala.Double
  ): js.Promise[nodegitLib.oidMod.Oid] = js.native
}

