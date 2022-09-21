package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Clone")
@js.native
open class Clone ()
  extends typings.nodegit.cloneMod.Clone
/* static members */
object Clone {
  
  @JSImport("nodegit", "Clone")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  inline def clone(url: String, localPath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  inline def clone(url: String, localPath: String, options: typings.nodegit.cloneOptionsMod.CloneOptions): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  
  inline def initOptions(opts: typings.nodegit.cloneOptionsMod.CloneOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
