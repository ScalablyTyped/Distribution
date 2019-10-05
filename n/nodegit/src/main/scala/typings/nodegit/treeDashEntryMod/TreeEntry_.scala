package typings.nodegit.treeDashEntryMod

import typings.nodegit.blobMod.Blob
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeDashEntryMod.TreeEntry.FILEMODE
import typings.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree-entry", "TreeEntry")
@js.native
class TreeEntry_ () extends js.Object {
  def filemode(): FILEMODE = js.native
  def filemodeRaw(): FILEMODE = js.native
  def free(): Unit = js.native
  def getBlob(): js.Promise[Blob] = js.native
  def getTree(): js.Promise[Tree] = js.native
  def id(): Oid = js.native
  def isBlob(): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isFile(): Boolean = js.native
  def isSubmodule(): Boolean = js.native
  def isTree(): Boolean = js.native
  def name(): String = js.native
  /**
    * Retrieve the SHA for this TreeEntry. Alias for sha
    */
  def oid(): String = js.native
  /**
    * Returns the path for this entry.
    */
  def path(): String = js.native
  /**
    * Retrieve the SHA for this TreeEntry.
    */
  def sha(): String = js.native
  def toObject(repo: Repository): js.Object = js.native
  def `type`(): Double = js.native
}

