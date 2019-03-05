package typings
package openDashGraphLib.openDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("open-graph", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: java.lang.String, callback: openDashGraphLib.openDashGraphMod.ogNs.DataCallback): scala.Unit = js.native
  def apply(
    url: java.lang.String,
    callback: openDashGraphLib.openDashGraphMod.ogNs.DataCallback,
    options: openDashGraphLib.openDashGraphMod.ogNs.Options
  ): scala.Unit = js.native
  def getHTML(url: cheerioLib.Cheerio, callback: openDashGraphLib.openDashGraphMod.ogNs.RequestCallback): scala.Unit = js.native
  def getHTML(url: java.lang.String, callback: openDashGraphLib.openDashGraphMod.ogNs.RequestCallback): scala.Unit = js.native
  def parse(websiteContent: java.lang.String): openDashGraphLib.openDashGraphMod.ogNs.Data = js.native
  def parse(websiteContent: java.lang.String, options: openDashGraphLib.openDashGraphMod.ogNs.Options): openDashGraphLib.openDashGraphMod.ogNs.Data = js.native
}

