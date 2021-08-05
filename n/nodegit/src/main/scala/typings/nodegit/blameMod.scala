package typings.nodegit

import typings.nodegit.blameHunkMod.BlameHunk
import typings.nodegit.blameOptionsMod.BlameOptions
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blameMod {
  
  @JSImport("nodegit/blame", "Blame")
  @js.native
  class Blame () extends StObject {
    
    def buffer(buffer: String, bufferLen: Double): js.Promise[Blame] = js.native
    
    def free(): Unit = js.native
    
    /**
      * @returns - the hunk at the given index, or NULL on error
      */
    def getHunkByIndex(index: Double): BlameHunk = js.native
    
    /**
      * @returns - the hunk that contains the given line, or NULL on error
      */
    def getHunkByLine(lineNo: Double): BlameHunk = js.native
    
    def getHunkCount(): Double = js.native
  }
  /* static members */
  object Blame {
    
    @JSImport("nodegit/blame", "Blame")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieve the blame of a file
      *
      * @param repo - Repository that contains the file
      * @param path - to the file to get the blame of
      * @param [options] - Options for the blame
      */
    inline def file(repo: Repository, path: String): js.Promise[Blame] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blame]]
    inline def file(repo: Repository, path: String, options: BlameOptions): js.Promise[Blame] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blame]]
    
    /**
      * @param opts - The git_blame_options struct to initialize
      * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
      */
    inline def initOptions(opts: BlameOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
    */
    trait FLAG extends StObject
    object FLAG {
      
      inline def FIRST_PARENT: `16` = 16.asInstanceOf[`16`]
      
      inline def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      inline def TRACK_COPIES_ANY_COMMIT_COPIES: `8` = 8.asInstanceOf[`8`]
      
      inline def TRACK_COPIES_SAME_COMMIT_COPIES: `4` = 4.asInstanceOf[`4`]
      
      inline def TRACK_COPIES_SAME_COMMIT_MOVES: `2` = 2.asInstanceOf[`2`]
      
      inline def TRACK_COPIES_SAME_FILE: `1` = 1.asInstanceOf[`1`]
    }
  }
}
