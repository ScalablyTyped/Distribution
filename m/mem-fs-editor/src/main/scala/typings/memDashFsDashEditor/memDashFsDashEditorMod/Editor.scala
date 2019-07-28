package typings.memDashFsDashEditor.memDashFsDashEditorMod

import typings.ejs.ejsMod.Data
import typings.ejs.ejsMod.Options
import typings.memDashFsDashEditor.Anon_Defaults
import typings.memDashFsDashEditor.Anon_GlobOptions
import typings.memDashFsDashEditor.Anon_GlobOptionsIOptions
import typings.memDashFsDashEditor.Anon_Separator
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  def append(to: String, contents: Contents): String = js.native
  def append(to: String, contents: Contents, options: Anon_Separator): String = js.native
  def commit(callback: Callback): Unit = js.native
  def commit(filters: js.Array[Transform], callback: Callback): Unit = js.native
  def copy(from: String, to: String): Unit = js.native
  def copy(from: String, to: String, options: CopyOptions): Unit = js.native
  def copy(from: String, to: String, options: CopyOptions, context: Data): Unit = js.native
  def copy(from: String, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
  def copy(from: js.Array[String], to: String): Unit = js.native
  def copy(from: js.Array[String], to: String, options: CopyOptions): Unit = js.native
  def copy(from: js.Array[String], to: String, options: CopyOptions, context: Data): Unit = js.native
  def copy(from: js.Array[String], to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
  def copyTpl(from: String, to: String): Unit = js.native
  def copyTpl(from: String, to: String, context: Data): Unit = js.native
  def copyTpl(from: String, to: String, context: Data, templateOptions: Options): Unit = js.native
  def copyTpl(from: String, to: String, context: Data, templateOptions: Options, copyOptions: CopyOptions): Unit = js.native
  def copyTpl(from: js.Array[String], to: String): Unit = js.native
  def copyTpl(from: js.Array[String], to: String, context: Data): Unit = js.native
  def copyTpl(from: js.Array[String], to: String, context: Data, templateOptions: Options): Unit = js.native
  def copyTpl(
    from: js.Array[String],
    to: String,
    context: Data,
    templateOptions: Options,
    copyOptions: CopyOptions
  ): Unit = js.native
  def delete(paths: String): Unit = js.native
  def delete(paths: String, options: Anon_GlobOptions): Unit = js.native
  def delete(paths: js.Array[String]): Unit = js.native
  def delete(paths: js.Array[String], options: Anon_GlobOptions): Unit = js.native
  def exists(filepath: String): Boolean = js.native
  def move(from: String, to: String): Unit = js.native
  def move(from: String, to: String, options: Anon_GlobOptionsIOptions): Unit = js.native
  def move(from: js.Array[String], to: String): Unit = js.native
  def move(from: js.Array[String], to: String, options: Anon_GlobOptionsIOptions): Unit = js.native
  def read(filepath: String): String = js.native
  def read(filepath: String, options: Anon_Defaults): String = js.native
  def readJSON(filepath: String): js.Any = js.native
  def readJSON(filepath: String, defaults: js.Any): js.Any = js.native
  def write(filepath: String, contents: Contents): String = js.native
  def writeJSON(filepath: String, contents: js.Any): String = js.native
  def writeJSON(filepath: String, contents: js.Any, replacer: ReplacerFunc): String = js.native
  def writeJSON(filepath: String, contents: js.Any, replacer: ReplacerFunc, space: Space): String = js.native
}

