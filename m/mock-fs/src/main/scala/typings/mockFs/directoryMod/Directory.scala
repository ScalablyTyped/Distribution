package typings.mockFs.directoryMod

import typings.mockFs.itemMod.Item
import typings.mockFs.itemMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directory extends Item {
  
  /**
    * Add an item to the directory.
    * @param name The name to give the item.
    * @param item The item to add.
    * @return The added item.
    */
  def addItem[T /* <: typings.mockFs.itemMod.^ */](name: String, item: T): T = js.native
  
  /** Get a named item (or null if none). */
  def getItem(name: String): typings.mockFs.itemMod.^  | Null = js.native
  
  /** Get sorted list of item names in this directory. */
  def list(): js.Array[String] = js.native
  
  /**
    * Remove an item. Will throw an error if not present.
    *
    * @param name Name of the item to remove.
    * @return The orphan item.
    */
  def removeItem(name: String): typings.mockFs.itemMod.^ = js.native
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
    getItem: String => typings.mockFs.itemMod.^  | Null,
    getMTime: () => Date,
    getMode: () => Double,
    getStats: () => Stats,
    getUid: () => Double,
    list: () => js.Array[String],
    removeItem: String => typings.mockFs.itemMod.^,
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
  
  @scala.inline
  implicit class DirectoryOps[Self <: Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddItem(value: (String, js.Any) => js.Any): Self = this.set("addItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItem(value: String => typings.mockFs.itemMod.^  | Null): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Array[String]): Self = this.set("list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveItem(value: String => typings.mockFs.itemMod.^): Self = this.set("removeItem", js.Any.fromFunction1(value))
  }
}
