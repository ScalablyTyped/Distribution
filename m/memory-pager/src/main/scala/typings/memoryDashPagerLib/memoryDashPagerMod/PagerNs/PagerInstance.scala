package typings
package memoryDashPagerLib.memoryDashPagerMod.PagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerInstance extends js.Object {
  /**
    * Get a page. The page will be allocated at first access.
    * @param pageNumber
    * @param noAllocate will make the method return `undefined` if no page has been allocated already
    */
  def get(pageNumber: scala.Double): Page = js.native
  def get(pageNumber: scala.Double, noAllocate: memoryDashPagerLib.memoryDashPagerLibNumbers.`false`): Page = js.native
  def get(pageNumber: scala.Double, noAllocate: memoryDashPagerLib.memoryDashPagerLibNumbers.`true`): js.UndefOr[Page] = js.native
  /**
    * Get the last page that was updated.
    */
  def lastUpdate(): Page | scala.Null = js.native
  /**
    * Explicitly set the buffer for a page.
    */
  def set(pageNumber: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  /**
    * Concat all pages allocated pages into a single buffer.
    */
  def toBuffer(): nodeLib.Buffer = js.native
  /**
    * Mark a page as updated.
    */
  def updated(page: Page): scala.Unit = js.native
}

