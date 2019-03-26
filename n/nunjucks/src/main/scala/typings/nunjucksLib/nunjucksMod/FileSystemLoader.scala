package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nunjucksLib.nunjucksMod.ILoader because var conflicts: extend. Inlined async, getSource, getSource */ @JSImport("nunjucks", "FileSystemLoader")
@js.native
class FileSystemLoader () extends Loader {
  def this(searchPaths: java.lang.String) = this()
  def this(searchPaths: js.Array[java.lang.String]) = this()
  def this(searchPaths: java.lang.String, opts: FileSystemLoaderOptions) = this()
  def this(searchPaths: js.Array[java.lang.String], opts: FileSystemLoaderOptions) = this()
  var async: js.UndefOr[scala.Boolean] = js.native
  def getSource(name: java.lang.String): LoaderSource = js.native
  def getSource(
    name: java.lang.String,
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[LoaderSource], scala.Unit]
  ): scala.Unit = js.native
  def init(searchPaths: js.Array[java.lang.String], opts: js.Any): scala.Unit = js.native
}

