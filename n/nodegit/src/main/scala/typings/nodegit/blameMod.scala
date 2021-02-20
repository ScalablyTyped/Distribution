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
import scala.scalajs.js.`|`
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
    
    /**
      * Retrieve the blame of a file
      *
      * @param repo - Repository that contains the file
      * @param path - to the file to get the blame of
      * @param [options] - Options for the blame
      */
    @JSImport("nodegit/blame", "Blame.file")
    @js.native
    def file(repo: Repository, path: String): js.Promise[Blame] = js.native
    @JSImport("nodegit/blame", "Blame.file")
    @js.native
    def file(repo: Repository, path: String, options: BlameOptions): js.Promise[Blame] = js.native
    
    /**
      * @param opts - The git_blame_options struct to initialize
      * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
      */
    @JSImport("nodegit/blame", "Blame.initOptions")
    @js.native
    def initOptions(opts: BlameOptions, version: Double): Double = js.native
    
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
      
      @scala.inline
      def FIRST_PARENT: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def TRACK_COPIES_ANY_COMMIT_COPIES: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def TRACK_COPIES_SAME_COMMIT_COPIES: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def TRACK_COPIES_SAME_COMMIT_MOVES: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def TRACK_COPIES_SAME_FILE: `1` = 1.asInstanceOf[`1`]
    }
  }
}
