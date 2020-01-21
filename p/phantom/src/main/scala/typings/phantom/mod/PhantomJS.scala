package typings.phantom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhantomJS extends js.Object {
  def callback(fn: js.Function2[/* pageNum */ Double, /* numPages */ Double, String]): IPhantomCallback = js.native
  def createPage(): js.Promise[WebPage] = js.native
  def exit(): Unit = js.native
  def exit(returnValue: Double): Unit = js.native
}

