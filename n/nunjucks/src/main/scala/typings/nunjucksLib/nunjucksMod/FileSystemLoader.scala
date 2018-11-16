package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "FileSystemLoader")
@js.native
class FileSystemLoader ()
  extends Loader
     with ILoader {
  def this(searchPaths: java.lang.String) = this()
  def this(searchPaths: js.Array[java.lang.String]) = this()
  def this(searchPaths: java.lang.String, opts: FileSystemLoaderOptions) = this()
  def this(searchPaths: js.Array[java.lang.String], opts: FileSystemLoaderOptions) = this()
  def init(searchPaths: js.Array[java.lang.String], opts: js.Any): scala.Unit = js.native
}

