package typings.phantomcss.mod.global.PhantomCSS

import typings.phantomjs.ClipRect
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhantomCSS extends js.Object {
  def compareAll(exclude: String): Unit = js.native
  def compareAll(exclude: String, diffList: js.Array[String], include: String): Unit = js.native
  /**
    * Explicitly define what files you want to compare
    */
  def compareExplicit(list: js.Array[String]): Unit = js.native
  def compareFiles(baseFile: String, diffFiles: String): PhantomCSSTest = js.native
  def compareMatched(`match`: String, exclude: String): Unit = js.native
  def compareMatched(`match`: RegExp, exclude: RegExp): Unit = js.native
  /**
    * Compare image diffs generated in this test run only
    */
  def compareSession(): Unit = js.native
  def compareSession(list: js.Array[_]): Unit = js.native
  def done(): Unit = js.native
  /**
    * Get a list of image diffs generated in this test run
    */
  def getCreatedDiffFiles(): js.Array[String] = js.native
  def getExitStatus(): Double = js.native
  def init(options: PhantomCSSOptions): Unit = js.native
  /**
    * Take a screenshot of the targeted HTML element
    * FileName is required if addIteratorToImage option is set to false
    */
  def screenshot(target: String): Unit = js.native
  def screenshot(target: String, fileName: String): Unit = js.native
  /**
    * Take a screenshot of the targeted HTML element
    * FileName is required if addIteratorToImage option is set to false
    */
  def screenshot(target: String, timeToWait: Double, hideSelector: String): Unit = js.native
  def screenshot(target: String, timeToWait: Double, hideSelector: String, fileName: String): Unit = js.native
  /**
    * Take a screenshot of the targeted HTML element
    * FileName is required if addIteratorToImage option is set to false
    */
  def screenshot(target: ClipRect): Unit = js.native
  def screenshot(target: ClipRect, fileName: String): Unit = js.native
  /**
    * Turn off CSS transitions and jQuery animations
    */
  def turnOffAnimations(): Unit = js.native
  def update(options: PhantomCSSOptions): Unit = js.native
  def waitForTests(tests: js.Array[PhantomCSSTest]): Unit = js.native
}

