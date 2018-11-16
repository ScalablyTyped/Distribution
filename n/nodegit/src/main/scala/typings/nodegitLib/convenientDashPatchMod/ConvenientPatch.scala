package typings
package nodegitLib.convenientDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/convenient-patch", "ConvenientPatch")
@js.native
class ConvenientPatch () extends js.Object {
  /**
       * The hunks in this patch
       */
  def hunks(): stdLib.Promise[js.Array[nodegitLib.convenientDashHunkMod.ConvenientHunk]] = js.native
  /**
       * Is this an added patch?
       */
  def isAdded(): scala.Boolean = js.native
  /**
       * Is this a conflicted patch?
       */
  def isConflicted(): scala.Boolean = js.native
  /**
       * Is this a copied patch?
       */
  def isCopied(): scala.Boolean = js.native
  /**
       * Is this a deleted patch?
       */
  def isDeleted(): scala.Boolean = js.native
  /**
       * Is this an ignored patch?
       */
  def isIgnored(): scala.Boolean = js.native
  /**
       * Is this an modified patch
       */
  def isModified(): scala.Boolean = js.native
  /**
       * Is this a renamed patch?
       */
  def isRenamed(): scala.Boolean = js.native
  /**
       * Is this a type change?
       */
  def isTypeChange(): scala.Boolean = js.native
  /**
       * Is this an unmodified patch?
       */
  def isUnmodified(): scala.Boolean = js.native
  /**
       * Is this an undreadable patch?
       */
  def isUnreadable(): scala.Boolean = js.native
  /**
       * Is this an untracked patch?
       */
  def isUntracked(): scala.Boolean = js.native
  /**
       * The line statistics of this patch (#contexts, #added, #deleted)
       */
  def lineStats(): js.Any = js.native
  /**
       * New attributes of the file
       */
  def newFile(): nodegitLib.diffDashFileMod.DiffFile = js.native
  /**
       * Old attributes of the file
       */
  def oldFile(): nodegitLib.diffDashFileMod.DiffFile = js.native
  /**
       * The number of hunks in this patch
       */
  def size(): scala.Double = js.native
  /**
       * The status of this patch (unmodified, added, deleted)
       */
  def status(): scala.Double = js.native
}

