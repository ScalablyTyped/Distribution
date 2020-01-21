package typings.memoryPager.mod

import typings.memoryPager.memoryPagerBooleans.`false`
import typings.memoryPager.memoryPagerBooleans.`true`
import typings.node.Buffer
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
  def get(pageNumber: Double): Page = js.native
  @JSName("get")
  def get_false(pageNumber: Double, noAllocate: `false`): Page = js.native
  @JSName("get")
  def get_true(pageNumber: Double, noAllocate: `true`): js.UndefOr[Page] = js.native
  /**
    * Get the last page that was updated.
    */
  def lastUpdate(): Page | Null = js.native
  /**
    * Explicitly set the buffer for a page.
    */
  def set(pageNumber: Double, buffer: Buffer): Unit = js.native
  /**
    * Concat all pages allocated pages into a single buffer.
    */
  def toBuffer(): Buffer = js.native
  /**
    * Mark a page as updated.
    */
  def updated(page: Page): Unit = js.native
}

