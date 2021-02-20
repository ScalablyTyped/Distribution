package typings.nodegit

import typings.nodegit.indexEntryMod.IndexEntry
import typings.nodegit.nodegitNumbers.`-1`
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strArrayMod.Strarray
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("nodegit/index_", "Index")
  @js.native
  class Index () extends StObject {
    
    def add(sourceEntry: IndexEntry): Double = js.native
    
    def addAll(): js.Promise[Double] = js.native
    def addAll(pathspec: js.UndefOr[scala.Nothing], flags: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: js.UndefOr[scala.Nothing], flags: Double): js.Promise[Double] = js.native
    def addAll(pathspec: js.UndefOr[scala.Nothing], flags: Double, callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: String): js.Promise[Double] = js.native
    def addAll(pathspec: String, flags: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: String, flags: Double): js.Promise[Double] = js.native
    def addAll(pathspec: String, flags: Double, callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: js.Array[String]): js.Promise[Double] = js.native
    def addAll(pathspec: js.Array[String], flags: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: js.Array[String], flags: Double): js.Promise[Double] = js.native
    def addAll(pathspec: js.Array[String], flags: Double, callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: Strarray): js.Promise[Double] = js.native
    def addAll(pathspec: Strarray, flags: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
    def addAll(pathspec: Strarray, flags: Double): js.Promise[Double] = js.native
    def addAll(pathspec: Strarray, flags: Double, callback: js.Function): js.Promise[Double] = js.native
    
    def addByPath(path: String): js.Promise[Double] = js.native
    
    def caps(): Double = js.native
    
    def checksum(): Oid = js.native
    
    def clear(): Double = js.native
    
    def conflictAdd(ancestorEntry: IndexEntry, ourEntry: IndexEntry, theirEntry: IndexEntry): Double = js.native
    
    def conflictCleanup(): Double = js.native
    
    def conflictGet(path: String): js.Promise[IndexEntry] = js.native
    
    def conflictRemove(path: String): Double = js.native
    
    def entries(): js.Array[IndexEntry] = js.native
    
    def entryCount(): Double = js.native
    
    def findPrefix(atPos: Double, prefix: String): Double = js.native
    
    def getByIndex(n: Double): IndexEntry = js.native
    
    def getByPath(path: String): IndexEntry = js.native
    def getByPath(path: String, stage: Double): IndexEntry = js.native
    
    def hasConflicts(): Boolean = js.native
    
    def owner(): Repository = js.native
    
    def path(): String = js.native
    
    def read(force: Double): Double = js.native
    
    def readTree(tree: Tree): Double = js.native
    
    def remove(path: String, stage: Double): Double = js.native
    
    def removeAll(pathspec: String): js.Promise[Double] = js.native
    def removeAll(pathspec: String, callback: js.Function): js.Promise[Double] = js.native
    def removeAll(pathspec: js.Array[String]): js.Promise[Double] = js.native
    def removeAll(pathspec: js.Array[String], callback: js.Function): js.Promise[Double] = js.native
    def removeAll(pathspec: Strarray): js.Promise[Double] = js.native
    def removeAll(pathspec: Strarray, callback: js.Function): js.Promise[Double] = js.native
    
    def removeByPath(path: String): js.Promise[Double] = js.native
    
    def removeDirectory(dir: String, stage: Double): Double = js.native
    
    def setCaps(caps: Double): Double = js.native
    
    def setVersion(version: Double): Double = js.native
    
    def updateAll(pathspec: String): js.Promise[Double] = js.native
    def updateAll(pathspec: String, callback: js.Function): js.Promise[Double] = js.native
    def updateAll(pathspec: js.Array[String]): js.Promise[Double] = js.native
    def updateAll(pathspec: js.Array[String], callback: js.Function): js.Promise[Double] = js.native
    def updateAll(pathspec: Strarray): js.Promise[Double] = js.native
    def updateAll(pathspec: Strarray, callback: js.Function): js.Promise[Double] = js.native
    
    def version(): Double = js.native
    
    def write(): js.Promise[Double] = js.native
    
    def writeTree(): js.Promise[Oid] = js.native
    
    def writeTreeTo(repo: Repository): js.Promise[Oid] = js.native
  }
  /* static members */
  object Index {
    
    @JSImport("nodegit/index_", "Index.entryIsConflict")
    @js.native
    def entryIsConflict(entry: IndexEntry): Boolean = js.native
    
    @JSImport("nodegit/index_", "Index.entryStage")
    @js.native
    def entryStage(entry: IndexEntry): Double = js.native
    
    @JSImport("nodegit/index_", "Index.open")
    @js.native
    def open(indexPath: String): js.Promise[Index] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait ADD_OPTION extends StObject
    object ADD_OPTION {
      
      @scala.inline
      def ADD_CHECK_PATHSPEC: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def ADD_DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def ADD_DISABLE_PATHSPEC_MATCH: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def ADD_FORCE: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`-1`
    */
    trait CAP extends StObject
    object CAP {
      
      @scala.inline
      def FROM_OWNER: `-1` = -1.asInstanceOf[`-1`]
      
      @scala.inline
      def IGNORE_CASE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NO_FILEMODE: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def NO_SYMLINKS: `4` = 4.asInstanceOf[`4`]
    }
  }
}
