package typings.nodegit.mod

import typings.nodegit.stashMod.StashApplyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Stash")
@js.native
class Stash ()
  extends typings.nodegit.stashMod.Stash
/* static members */
object Stash {
  
  @JSImport("nodegit", "Stash.apply")
  @js.native
  def apply(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSImport("nodegit", "Stash.apply")
  @js.native
  def apply(repo: typings.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.applyInitOptions")
  @js.native
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Stash.drop")
  @js.native
  def drop(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.foreach")
  @js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  @JSImport("nodegit", "Stash.foreach")
  @js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.pop")
  @js.native
  def pop(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSImport("nodegit", "Stash.pop")
  @js.native
  def pop(repo: typings.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.save")
  @js.native
  def save(
    repo: typings.nodegit.repositoryMod.Repository,
    stasher: typings.nodegit.signatureMod.Signature,
    message: String,
    flags: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
}
