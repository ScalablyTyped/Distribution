package typings
package phantomcssLib.phantomcssMod.Global.PhantomCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhantomCSS extends js.Object {
  def compareAll(exclude: java.lang.String): scala.Unit = js.native
  def compareAll(exclude: java.lang.String, diffList: js.Array[java.lang.String], include: java.lang.String): scala.Unit = js.native
  /**
    * Explicitly define what files you want to compare
    */
  def compareExplicit(list: js.Array[java.lang.String]): scala.Unit = js.native
  def compareFiles(baseFile: java.lang.String, diffFiles: java.lang.String): PhantomCSSTest = js.native
  def compareMatched(`match`: java.lang.String, exclude: java.lang.String): scala.Unit = js.native
  def compareMatched(`match`: stdLib.RegExp, exclude: stdLib.RegExp): scala.Unit = js.native
  /**
    * Compare image diffs generated in this test run only
    */
  def compareSession(): scala.Unit = js.native
  def compareSession(list: js.Array[_]): scala.Unit = js.native
  def done(): scala.Unit = js.native
  /**
    * Get a list of image diffs generated in this test run
    */
  def getCreatedDiffFiles(): js.Array[java.lang.String] = js.native
  def getExitStatus(): scala.Double = js.native
  def init(options: PhantomCSSOptions): scala.Unit = js.native
  /**
    * Take a screenshot of the targeted HTML element
    * FileName is required if addIteratorToImage option is set to false
    */
  def screenshot(target: java.lang.String): scala.Unit = js.native
  def screenshot(target: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  /**
    * Take a screenshot of the targeted HTML element
    * FileName is required if addIteratorToImage option is set to false
    */
  def screenshot(target: java.lang.String, timeToWait: scala.Double, hideSelector: java.lang.String): scala.Unit = js.native
  def screenshot(
    target: java.lang.String,
    timeToWait: scala.Double,
    hideSelector: java.lang.String,
    fileName: java.lang.String
  ): scala.Unit = js.native
  /**
    * Take a screenshot of the targeted HTML element
    * FileName is required if addIteratorToImage option is set to false
    */
  def screenshot(target: phantomjsLib.ClipRect): scala.Unit = js.native
  def screenshot(target: phantomjsLib.ClipRect, fileName: java.lang.String): scala.Unit = js.native
  /**
    * Turn off CSS transitions and jQuery animations
    */
  def turnOffAnimations(): scala.Unit = js.native
  def update(options: PhantomCSSOptions): scala.Unit = js.native
  def waitForTests(tests: js.Array[PhantomCSSTest]): scala.Unit = js.native
}

