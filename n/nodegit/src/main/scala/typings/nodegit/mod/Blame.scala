package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Blame")
@js.native
class Blame ()
  extends typings.nodegit.blameMod.Blame
/* static members */
object Blame {
  
  @JSImport("nodegit", "Blame")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieve the blame of a file
    *
    * @param repo - Repository that contains the file
    * @param path - to the file to get the blame of
    * @param [options] - Options for the blame
    */
  inline def file(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[typings.nodegit.blameMod.Blame] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.blameMod.Blame]]
  inline def file(
    repo: typings.nodegit.repositoryMod.Repository,
    path: String,
    options: typings.nodegit.blameOptionsMod.BlameOptions
  ): js.Promise[typings.nodegit.blameMod.Blame] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.blameMod.Blame]]
  
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  inline def initOptions(opts: typings.nodegit.blameOptionsMod.BlameOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
