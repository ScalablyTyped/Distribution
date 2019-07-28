package typings.openDashGraph.openDashGraphMod

import typings.cheerio.Cheerio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("open-graph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String, callback: DataCallback): Unit = js.native
  def apply(url: String, callback: DataCallback, options: Options): Unit = js.native
  def getHTML(url: String, callback: RequestCallback): Unit = js.native
  def getHTML(url: Cheerio, callback: RequestCallback): Unit = js.native
  def parse(websiteContent: String): Data = js.native
  def parse(websiteContent: String, options: Options): Data = js.native
}

