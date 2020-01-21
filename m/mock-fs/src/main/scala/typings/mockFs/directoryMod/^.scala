package typings.mockFs.directoryMod

import typings.mockFs.itemMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs/lib/directory", JSImport.Namespace)
@js.native
class ^ () extends Directory {
  /**
    * Add an item to the directory.
    * @param name The name to give the item.
    * @param item The item to add.
    * @return The added item.
    */
  /* CompleteClass */
  override def addItem[T /* <: typings.mockFs.itemMod.^ */](name: String, item: T): T = js.native
  /**  Returns whether the current user has execute permission. */
  /* CompleteClass */
  override def canExecute(): Boolean = js.native
  /** Returns whether the current user has read permission. */
  /* CompleteClass */
  override def canRead(): Boolean = js.native
  /** Returns whether the current user has write permission. */
  /* CompleteClass */
  override def canWrite(): Boolean = js.native
  /** Get access time. */
  /* CompleteClass */
  override def getATime(): Date = js.native
  /** Get birth time. */
  /* CompleteClass */
  override def getBirthtime(): Date = js.native
  /** Get change time. */
  /* CompleteClass */
  override def getCTime(): Date = js.native
  /** Get group id. */
  /* CompleteClass */
  override def getGid(): Double = js.native
  /** Get a named item (or null if none). */
  /* CompleteClass */
  override def getItem(name: String): typings.mockFs.itemMod.^  | Null = js.native
  /** Get modification time. */
  /* CompleteClass */
  override def getMTime(): Date = js.native
  /** Get mode (permission only, e.g 0666). */
  /* CompleteClass */
  override def getMode(): Double = js.native
  /** Get item stats. */
  /* CompleteClass */
  override def getStats(): Stats = js.native
  /** Get user id. */
  /* CompleteClass */
  override def getUid(): Double = js.native
  /** Get sorted list of item names in this directory. */
  /* CompleteClass */
  override def list(): js.Array[String] = js.native
  /**
    * Remove an item. Will throw an error if not present.
    *
    * @param name Name of the item to remove.
    * @return The orphan item.
    */
  /* CompleteClass */
  override def removeItem(name: String): typings.mockFs.itemMod.^ = js.native
  /** Set access time. */
  /* CompleteClass */
  override def setATime(atime: Date): Unit = js.native
  /** Set birth time. */
  /* CompleteClass */
  override def setBirthtime(birthtime: Date): Unit = js.native
  /** Set change time. */
  /* CompleteClass */
  override def setCTime(ctime: Date): Unit = js.native
  /** Set group id. */
  /* CompleteClass */
  override def setGid(gid: Double): Unit = js.native
  /** Set modification time. */
  /* CompleteClass */
  override def setMTime(mtime: Date): Unit = js.native
  /** Set mode (permission only, e.g 0666). */
  /* CompleteClass */
  override def setMode(mode: Double): Unit = js.native
  /** Set user id. */
  /* CompleteClass */
  override def setUid(uid: Double): Unit = js.native
}

