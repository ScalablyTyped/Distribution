package typings.nodegit

import typings.nodegit.convenientHunkMod.ConvenientHunk
import typings.nodegit.diffFileMod.DiffFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/convenient-patch", JSImport.Namespace)
@js.native
object convenientPatchMod extends js.Object {
  @js.native
  class ConvenientPatch () extends js.Object {
    /**
      * The hunks in this patch
      */
    def hunks(): js.Promise[js.Array[ConvenientHunk]] = js.native
    /**
      * Is this an added patch?
      */
    def isAdded(): Boolean = js.native
    /**
      * Is this a conflicted patch?
      */
    def isConflicted(): Boolean = js.native
    /**
      * Is this a copied patch?
      */
    def isCopied(): Boolean = js.native
    /**
      * Is this a deleted patch?
      */
    def isDeleted(): Boolean = js.native
    /**
      * Is this an ignored patch?
      */
    def isIgnored(): Boolean = js.native
    /**
      * Is this an modified patch
      */
    def isModified(): Boolean = js.native
    /**
      * Is this a renamed patch?
      */
    def isRenamed(): Boolean = js.native
    /**
      * Is this a type change?
      */
    def isTypeChange(): Boolean = js.native
    /**
      * Is this an unmodified patch?
      */
    def isUnmodified(): Boolean = js.native
    /**
      * Is this an undreadable patch?
      */
    def isUnreadable(): Boolean = js.native
    /**
      * Is this an untracked patch?
      */
    def isUntracked(): Boolean = js.native
    /**
      * The line statistics of this patch (#contexts, #added, #deleted)
      */
    def lineStats(): js.Any = js.native
    /**
      * New attributes of the file
      */
    def newFile(): DiffFile = js.native
    /**
      * Old attributes of the file
      */
    def oldFile(): DiffFile = js.native
    /**
      * The number of hunks in this patch
      */
    def size(): Double = js.native
    /**
      * The status of this patch (unmodified, added, deleted)
      */
    def status(): Double = js.native
  }
  
}

