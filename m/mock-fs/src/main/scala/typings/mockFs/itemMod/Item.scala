package typings.mockFs.itemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filesystem item.
  */
@js.native
trait Item extends js.Object {
  /**  Returns whether the current user has execute permission. */
  def canExecute(): Boolean = js.native
  /** Returns whether the current user has read permission. */
  def canRead(): Boolean = js.native
  /** Returns whether the current user has write permission. */
  def canWrite(): Boolean = js.native
  /** Get access time. */
  def getATime(): Date = js.native
  /** Get birth time. */
  def getBirthtime(): Date = js.native
  /** Get change time. */
  def getCTime(): Date = js.native
  /** Get group id. */
  def getGid(): Double = js.native
  /** Get modification time. */
  def getMTime(): Date = js.native
  /** Get mode (permission only, e.g 0666). */
  def getMode(): Double = js.native
  /** Get item stats. */
  def getStats(): Stats = js.native
  /** Get user id. */
  def getUid(): Double = js.native
  /** Set access time. */
  def setATime(atime: Date): Unit = js.native
  /** Set birth time. */
  def setBirthtime(birthtime: Date): Unit = js.native
  /** Set change time. */
  def setCTime(ctime: Date): Unit = js.native
  /** Set group id. */
  def setGid(gid: Double): Unit = js.native
  /** Set modification time. */
  def setMTime(mtime: Date): Unit = js.native
  /** Set mode (permission only, e.g 0666). */
  def setMode(mode: Double): Unit = js.native
  /** Set user id. */
  def setUid(uid: Double): Unit = js.native
}

object Item {
  @scala.inline
  def apply(
    canExecute: () => Boolean,
    canRead: () => Boolean,
    canWrite: () => Boolean,
    getATime: () => Date,
    getBirthtime: () => Date,
    getCTime: () => Date,
    getGid: () => Double,
    getMTime: () => Date,
    getMode: () => Double,
    getStats: () => Stats,
    getUid: () => Double,
    setATime: Date => Unit,
    setBirthtime: Date => Unit,
    setCTime: Date => Unit,
    setGid: Double => Unit,
    setMTime: Date => Unit,
    setMode: Double => Unit,
    setUid: Double => Unit
  ): Item = {
    val __obj = js.Dynamic.literal(canExecute = js.Any.fromFunction0(canExecute), canRead = js.Any.fromFunction0(canRead), canWrite = js.Any.fromFunction0(canWrite), getATime = js.Any.fromFunction0(getATime), getBirthtime = js.Any.fromFunction0(getBirthtime), getCTime = js.Any.fromFunction0(getCTime), getGid = js.Any.fromFunction0(getGid), getMTime = js.Any.fromFunction0(getMTime), getMode = js.Any.fromFunction0(getMode), getStats = js.Any.fromFunction0(getStats), getUid = js.Any.fromFunction0(getUid), setATime = js.Any.fromFunction1(setATime), setBirthtime = js.Any.fromFunction1(setBirthtime), setCTime = js.Any.fromFunction1(setCTime), setGid = js.Any.fromFunction1(setGid), setMTime = js.Any.fromFunction1(setMTime), setMode = js.Any.fromFunction1(setMode), setUid = js.Any.fromFunction1(setUid))
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setCanExecute(value: () => Boolean): Self = this.set("canExecute", js.Any.fromFunction0(value))
    @scala.inline
    def setCanRead(value: () => Boolean): Self = this.set("canRead", js.Any.fromFunction0(value))
    @scala.inline
    def setCanWrite(value: () => Boolean): Self = this.set("canWrite", js.Any.fromFunction0(value))
    @scala.inline
    def setGetATime(value: () => Date): Self = this.set("getATime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBirthtime(value: () => Date): Self = this.set("getBirthtime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCTime(value: () => Date): Self = this.set("getCTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGid(value: () => Double): Self = this.set("getGid", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMTime(value: () => Date): Self = this.set("getMTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMode(value: () => Double): Self = this.set("getMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStats(value: () => Stats): Self = this.set("getStats", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUid(value: () => Double): Self = this.set("getUid", js.Any.fromFunction0(value))
    @scala.inline
    def setSetATime(value: Date => Unit): Self = this.set("setATime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBirthtime(value: Date => Unit): Self = this.set("setBirthtime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCTime(value: Date => Unit): Self = this.set("setCTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGid(value: Double => Unit): Self = this.set("setGid", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMTime(value: Date => Unit): Self = this.set("setMTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMode(value: Double => Unit): Self = this.set("setMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUid(value: Double => Unit): Self = this.set("setUid", js.Any.fromFunction1(value))
  }
  
}

