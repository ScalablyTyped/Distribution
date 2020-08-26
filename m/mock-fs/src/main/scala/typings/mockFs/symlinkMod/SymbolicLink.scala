package typings.mockFs.symlinkMod

import typings.mockFs.itemMod.Item
import typings.mockFs.itemMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolicLink extends Item {
  /** Get the path (relative) to the source. */
  def getPath(): String = js.native
  /** Sets the path (relative) to the source. */
  def setPath(pathname: String): Unit = js.native
}

object SymbolicLink {
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
    getPath: () => String,
    getStats: () => Stats,
    getUid: () => Double,
    setATime: Date => Unit,
    setBirthtime: Date => Unit,
    setCTime: Date => Unit,
    setGid: Double => Unit,
    setMTime: Date => Unit,
    setMode: Double => Unit,
    setPath: String => Unit,
    setUid: Double => Unit
  ): SymbolicLink = {
    val __obj = js.Dynamic.literal(canExecute = js.Any.fromFunction0(canExecute), canRead = js.Any.fromFunction0(canRead), canWrite = js.Any.fromFunction0(canWrite), getATime = js.Any.fromFunction0(getATime), getBirthtime = js.Any.fromFunction0(getBirthtime), getCTime = js.Any.fromFunction0(getCTime), getGid = js.Any.fromFunction0(getGid), getMTime = js.Any.fromFunction0(getMTime), getMode = js.Any.fromFunction0(getMode), getPath = js.Any.fromFunction0(getPath), getStats = js.Any.fromFunction0(getStats), getUid = js.Any.fromFunction0(getUid), setATime = js.Any.fromFunction1(setATime), setBirthtime = js.Any.fromFunction1(setBirthtime), setCTime = js.Any.fromFunction1(setCTime), setGid = js.Any.fromFunction1(setGid), setMTime = js.Any.fromFunction1(setMTime), setMode = js.Any.fromFunction1(setMode), setPath = js.Any.fromFunction1(setPath), setUid = js.Any.fromFunction1(setUid))
    __obj.asInstanceOf[SymbolicLink]
  }
  @scala.inline
  implicit class SymbolicLinkOps[Self <: SymbolicLink] (val x: Self) extends AnyVal {
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
    def setGetPath(value: () => String): Self = this.set("getPath", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPath(value: String => Unit): Self = this.set("setPath", js.Any.fromFunction1(value))
  }
  
}

