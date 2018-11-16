package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Stash")
@js.native
class Stash ()
  extends nodegitLib.stashMod.Stash

@JSImport("nodegit", "Stash")
@js.native
object Stash extends js.Object {
  @JSName("apply")
  def apply(repo: nodegitLib.repositoryMod.Repository, index: scala.Double): stdLib.Promise[scala.Double] = js.native
  @JSName("apply")
  def apply(
    repo: nodegitLib.repositoryMod.Repository,
    index: scala.Double,
    options: nodegitLib.stashMod.StashApplyOptions
  ): stdLib.Promise[scala.Double] = js.native
  def applyInitOptions(opts: nodegitLib.stashMod.StashApplyOptions, version: scala.Double): scala.Double = js.native
  def drop(repo: nodegitLib.repositoryMod.Repository, index: scala.Double): stdLib.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository): stdLib.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository, callback: js.Function): stdLib.Promise[scala.Double] = js.native
  def pop(repo: nodegitLib.repositoryMod.Repository, index: scala.Double): stdLib.Promise[scala.Double] = js.native
  def pop(
    repo: nodegitLib.repositoryMod.Repository,
    index: scala.Double,
    options: nodegitLib.stashMod.StashApplyOptions
  ): stdLib.Promise[scala.Double] = js.native
  def save(
    repo: nodegitLib.repositoryMod.Repository,
    stasher: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    flags: scala.Double
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
}

