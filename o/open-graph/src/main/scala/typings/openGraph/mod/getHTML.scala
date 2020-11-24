package typings.openGraph.mod

import typings.cheerio.cheerio.Cheerio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("open-graph", "getHTML")
@js.native
object getHTML extends js.Object {
  
  def apply(url: String, callback: RequestCallback): Unit = js.native
  def apply(url: Cheerio, callback: RequestCallback): Unit = js.native
}
