package typings.nunjucks.nunjucksMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.nunjucks.nunjucksMod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "WebLoader")
@js.native
class WebLoader protected () extends Loader {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, opts: js.Any) = this()
  var async: js.UndefOr[Boolean] = js.native
  def getSource(name: String): LoaderSource = js.native
  def getSource(name: String, callback: Callback[Error, LoaderSource]): Unit = js.native
}

