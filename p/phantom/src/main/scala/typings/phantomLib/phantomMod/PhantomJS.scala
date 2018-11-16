package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhantomJS extends js.Object {
  def callback(fn: js.Function2[/* pageNum */ scala.Double, /* numPages */ scala.Double, java.lang.String]): IPhantomCallback = js.native
  def createPage(): stdLib.Promise[WebPage] = js.native
  def exit(): scala.Unit = js.native
  def exit(returnValue: scala.Double): scala.Unit = js.native
}

