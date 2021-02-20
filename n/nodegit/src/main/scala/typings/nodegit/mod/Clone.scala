package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Clone")
@js.native
class Clone ()
  extends typings.nodegit.cloneMod.Clone
/* static members */
object Clone {
  
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  @JSImport("nodegit", "Clone.clone")
  @js.native
  def clone(url: String, localPath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  @JSImport("nodegit", "Clone.clone")
  @js.native
  def clone(url: String, localPath: String, options: typings.nodegit.cloneOptionsMod.CloneOptions): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  
  @JSImport("nodegit", "Clone.initOptions")
  @js.native
  def initOptions(opts: typings.nodegit.cloneOptionsMod.CloneOptions, version: Double): Double = js.native
}
