package typings
package nodegitLib.treeDashEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree-entry", "TreeEntry")
@js.native
class TreeEntry () extends js.Object {
  def filemode(): nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE = js.native
  def filemodeRaw(): nodegitLib.treeDashEntryMod.TreeEntryNs.FILEMODE = js.native
  def free(): scala.Unit = js.native
  def getBlob(): stdLib.Promise[nodegitLib.blobMod.Blob] = js.native
  def getTree(): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def isBlob(): scala.Boolean = js.native
  def isDirectory(): scala.Boolean = js.native
  def isFile(): scala.Boolean = js.native
  def isSubmodule(): scala.Boolean = js.native
  def isTree(): scala.Boolean = js.native
  def name(): java.lang.String = js.native
  /**
       * Retrieve the SHA for this TreeEntry. Alias for sha
       */
  def oid(): java.lang.String = js.native
  /**
       * Returns the path for this entry.
       */
  def path(): java.lang.String = js.native
  /**
       * Retrieve the SHA for this TreeEntry.
       */
  def sha(): java.lang.String = js.native
  def toObject(repo: nodegitLib.repositoryMod.Repository): js.Object = js.native
  def `type`(): scala.Double = js.native
}

