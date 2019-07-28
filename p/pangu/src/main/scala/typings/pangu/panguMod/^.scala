package typings.pangu.panguMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pangu", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def spacing(text: String): String = js.native
  def spacingElementByClassName(className: String): Unit = js.native
  def spacingElementById(id: String): Unit = js.native
  def spacingElementByTagName(tagName: String): Unit = js.native
  def spacingFile(path: String): js.Promise[String] = js.native
  def spacingFile(path: String, callback: js.Function2[/* error */ Error, /* data */ String, Unit]): Unit = js.native
  def spacingFileSync(path: String): String = js.native
  def spacingPage(): Unit = js.native
  def spacingText(text: String): js.Promise[String] = js.native
  def spacingText(text: String, callback: js.Function2[/* error */ Error, /* data */ String, Unit]): Unit = js.native
}

