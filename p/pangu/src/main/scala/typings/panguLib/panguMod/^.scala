package typings
package panguLib.panguMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pangu", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def spacing(text: java.lang.String): java.lang.String = js.native
  def spacingElementByClassName(className: java.lang.String): scala.Unit = js.native
  def spacingElementById(id: java.lang.String): scala.Unit = js.native
  def spacingElementByTagName(tagName: java.lang.String): scala.Unit = js.native
  def spacingFile(path: java.lang.String): js.Promise[java.lang.String] = js.native
  def spacingFile(
    path: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def spacingFileSync(path: java.lang.String): java.lang.String = js.native
  def spacingPage(): scala.Unit = js.native
  def spacingText(text: java.lang.String): js.Promise[java.lang.String] = js.native
  def spacingText(
    text: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

