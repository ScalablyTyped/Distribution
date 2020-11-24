package typings.nodegit.cloneMod.Clone

import typings.nodegit.cloneOptionsMod.CloneOptions
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/clone", "Clone")
@js.native
object ^ extends js.Object {
  
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  def clone(url: String, localPath: String): js.Promise[Repository] = js.native
  def clone(url: String, localPath: String, options: CloneOptions): js.Promise[Repository] = js.native
  
  def initOptions(opts: CloneOptions, version: Double): Double = js.native
}
