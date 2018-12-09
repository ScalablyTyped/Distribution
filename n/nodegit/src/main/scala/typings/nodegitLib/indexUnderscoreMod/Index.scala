package typings
package nodegitLib.indexUnderscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/index_", "Index")
@js.native
class Index () extends js.Object {
  def add(sourceEntry: nodegitLib.indexDashEntryMod.IndexEntry): scala.Double = js.native
  def addAll(pathspec: java.lang.String, flags: scala.Double): js.Promise[scala.Double] = js.native
  def addAll(pathspec: java.lang.String, flags: scala.Double, callback: js.Function): js.Promise[scala.Double] = js.native
  def addAll(pathspec: js.Array[java.lang.String], flags: scala.Double): js.Promise[scala.Double] = js.native
  def addAll(pathspec: js.Array[java.lang.String], flags: scala.Double, callback: js.Function): js.Promise[scala.Double] = js.native
  def addAll(pathspec: nodegitLib.strDashArrayMod.Strarray, flags: scala.Double): js.Promise[scala.Double] = js.native
  def addAll(pathspec: nodegitLib.strDashArrayMod.Strarray, flags: scala.Double, callback: js.Function): js.Promise[scala.Double] = js.native
  def addByPath(path: java.lang.String): js.Promise[scala.Double] = js.native
  def caps(): scala.Double = js.native
  def checksum(): nodegitLib.oidMod.Oid = js.native
  def clear(): scala.Double = js.native
  def conflictAdd(
    ancestorEntry: nodegitLib.indexDashEntryMod.IndexEntry,
    ourEntry: nodegitLib.indexDashEntryMod.IndexEntry,
    theirEntry: nodegitLib.indexDashEntryMod.IndexEntry
  ): scala.Double = js.native
  def conflictCleanup(): scala.Double = js.native
  def conflictGet(path: java.lang.String): js.Promise[nodegitLib.indexDashEntryMod.IndexEntry] = js.native
  def conflictRemove(path: java.lang.String): scala.Double = js.native
  def entries(): js.Array[nodegitLib.indexDashEntryMod.IndexEntry] = js.native
  def entryCount(): scala.Double = js.native
  def findPrefix(atPos: scala.Double, prefix: java.lang.String): scala.Double = js.native
  def getByIndex(n: scala.Double): nodegitLib.indexDashEntryMod.IndexEntry = js.native
  def getByPath(path: java.lang.String, stage: scala.Double): nodegitLib.indexDashEntryMod.IndexEntry = js.native
  def hasConflicts(): scala.Boolean = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def path(): java.lang.String = js.native
  def read(force: scala.Double): scala.Double = js.native
  def readTree(tree: nodegitLib.treeMod.Tree): scala.Double = js.native
  def remove(path: java.lang.String, stage: scala.Double): scala.Double = js.native
  def removeAll(pathspec: java.lang.String): js.Promise[scala.Double] = js.native
  def removeAll(pathspec: java.lang.String, callback: js.Function): js.Promise[scala.Double] = js.native
  def removeAll(pathspec: js.Array[java.lang.String]): js.Promise[scala.Double] = js.native
  def removeAll(pathspec: js.Array[java.lang.String], callback: js.Function): js.Promise[scala.Double] = js.native
  def removeAll(pathspec: nodegitLib.strDashArrayMod.Strarray): js.Promise[scala.Double] = js.native
  def removeAll(pathspec: nodegitLib.strDashArrayMod.Strarray, callback: js.Function): js.Promise[scala.Double] = js.native
  def removeByPath(path: java.lang.String): js.Promise[scala.Double] = js.native
  def removeDirectory(dir: java.lang.String, stage: scala.Double): scala.Double = js.native
  def setCaps(caps: scala.Double): scala.Double = js.native
  def setVersion(version: scala.Double): scala.Double = js.native
  def updateAll(pathspec: java.lang.String): js.Promise[scala.Double] = js.native
  def updateAll(pathspec: java.lang.String, callback: js.Function): js.Promise[scala.Double] = js.native
  def updateAll(pathspec: js.Array[java.lang.String]): js.Promise[scala.Double] = js.native
  def updateAll(pathspec: js.Array[java.lang.String], callback: js.Function): js.Promise[scala.Double] = js.native
  def updateAll(pathspec: nodegitLib.strDashArrayMod.Strarray): js.Promise[scala.Double] = js.native
  def updateAll(pathspec: nodegitLib.strDashArrayMod.Strarray, callback: js.Function): js.Promise[scala.Double] = js.native
  def version(): scala.Double = js.native
  def write(): scala.Double = js.native
  def writeTree(): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def writeTreeTo(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.oidMod.Oid] = js.native
}

@JSImport("nodegit/index_", "Index")
@js.native
object Index extends js.Object {
  def entryIsConflict(entry: nodegitLib.indexDashEntryMod.IndexEntry): scala.Boolean = js.native
  def entryStage(entry: nodegitLib.indexDashEntryMod.IndexEntry): scala.Double = js.native
  def open(indexPath: java.lang.String): js.Promise[nodegitLib.indexUnderscoreMod.Index] = js.native
}

