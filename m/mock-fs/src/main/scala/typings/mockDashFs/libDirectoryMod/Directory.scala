package typings.mockDashFs.libDirectoryMod

import typings.mockDashFs.libItemMod.Item
import typings.mockDashFs.libItemMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directory extends Item {
  /**
    * Add an item to the directory.
    * @param name The name to give the item.
    * @param item The item to add.
    * @return The added item.
    */
  def addItem[T /* <: typings.mockDashFs.libItemMod.^ */](name: String, item: T): T
  /** Get a named item (or null if none). */
  def getItem(name: String): typings.mockDashFs.libItemMod.^  | Null
  /** Get sorted list of item names in this directory. */
  def list(): js.Array[String]
  /**
    * Remove an item. Will throw an error if not present.
    *
    * @param name Name of the item to remove.
    * @return The orphan item.
    */
  def removeItem(name: String): typings.mockDashFs.libItemMod.^
}

object Directory {
  @scala.inline
  def apply(
    addItem: (String, js.Any) => js.Any,
    canExecute: () => Boolean,
    canRead: () => Boolean,
    canWrite: () => Boolean,
    getATime: () => Date,
    getBirthtime: () => Date,
    getCTime: () => Date,
    getGid: () => Double,
    getItem: String => typings.mockDashFs.libItemMod.^  | Null,
    getMTime: () => Date,
    getMode: () => Double,
    getStats: () => Stats,
    getUid: () => Double,
    list: () => js.Array[String],
    removeItem: String => typings.mockDashFs.libItemMod.^,
    setATime: Date => Unit,
    setBirthtime: Date => Unit,
    setCTime: Date => Unit,
    setGid: Double => Unit,
    setMTime: Date => Unit,
    setMode: Double => Unit,
    setUid: Double => Unit
  ): Directory = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), canExecute = js.Any.fromFunction0(canExecute), canRead = js.Any.fromFunction0(canRead), canWrite = js.Any.fromFunction0(canWrite), getATime = js.Any.fromFunction0(getATime), getBirthtime = js.Any.fromFunction0(getBirthtime), getCTime = js.Any.fromFunction0(getCTime), getGid = js.Any.fromFunction0(getGid), getItem = js.Any.fromFunction1(getItem), getMTime = js.Any.fromFunction0(getMTime), getMode = js.Any.fromFunction0(getMode), getStats = js.Any.fromFunction0(getStats), getUid = js.Any.fromFunction0(getUid), list = js.Any.fromFunction0(list), removeItem = js.Any.fromFunction1(removeItem), setATime = js.Any.fromFunction1(setATime), setBirthtime = js.Any.fromFunction1(setBirthtime), setCTime = js.Any.fromFunction1(setCTime), setGid = js.Any.fromFunction1(setGid), setMTime = js.Any.fromFunction1(setMTime), setMode = js.Any.fromFunction1(setMode), setUid = js.Any.fromFunction1(setUid))
  
    __obj.asInstanceOf[Directory]
  }
}

