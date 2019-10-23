package typings.mockDashFs.libSymlinkMod

import typings.mockDashFs.libItemMod.ExtendedStats
import typings.mockDashFs.libItemMod.Item
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolicLink extends Item {
  /** Get the path (relative) to the source. */
  def getPath(): String
  /** Sets the path (relative) to the source. */
  def setPath(pathname: String): Unit
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
    getStats: () => ExtendedStats,
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
}

