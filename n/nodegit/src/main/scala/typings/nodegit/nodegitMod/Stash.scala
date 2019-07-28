package typings.nodegit.nodegitMod

import typings.nodegit.stashMod.StashApplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Stash")
@js.native
class Stash ()
  extends typings.nodegit.stashMod.Stash

/* static members */
@JSImport("nodegit", "Stash")
@js.native
object Stash extends js.Object {
  @JSName("apply")
  def apply(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSName("apply")
  def apply(repo: typings.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  def drop(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def pop(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  def pop(repo: typings.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def save(
    repo: typings.nodegit.repositoryMod.Repository,
    stasher: typings.nodegit.signatureMod.Signature,
    message: String,
    flags: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
}

