package typings
package openDashGraphLib.openDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("open-graph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: java.lang.String, callback: DataCallback): scala.Unit = js.native
  def apply(url: java.lang.String, callback: DataCallback, options: Options): scala.Unit = js.native
  def getHTML(url: cheerioLib.Cheerio, callback: RequestCallback): scala.Unit = js.native
  def getHTML(url: java.lang.String, callback: RequestCallback): scala.Unit = js.native
  def parse(websiteContent: java.lang.String): Data = js.native
  def parse(websiteContent: java.lang.String, options: Options): Data = js.native
}

