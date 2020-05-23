package typings.memFsEditor.mod

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.memFsEditor.anon.Defaults
import typings.memFsEditor.anon.GlobOptions
import typings.memFsEditor.anon.GlobOptionsIOptions
import typings.memFsEditor.anon.Separator
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  def append(to: String, contents: Contents): String = js.native
  def append(to: String, contents: Contents, options: Separator): String = js.native
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
  def delete(paths: String, options: GlobOptions): Unit = js.native
  def delete(paths: js.Array[String]): Unit = js.native
  def delete(paths: js.Array[String], options: GlobOptions): Unit = js.native
  def exists(filepath: String): Boolean = js.native
  def move(from: String, to: String): Unit = js.native
  def move(from: String, to: String, options: GlobOptionsIOptions): Unit = js.native
  def move(from: js.Array[String], to: String): Unit = js.native
  def move(from: js.Array[String], to: String, options: GlobOptionsIOptions): Unit = js.native
  def read(filepath: String): String = js.native
  def read(filepath: String, options: Defaults): String = js.native
  def readJSON(filepath: String): js.Any = js.native
  def readJSON(filepath: String, defaults: js.Any): js.Any = js.native
  def write(filepath: String, contents: Contents): String = js.native
  def writeJSON(filepath: String, contents: js.Any): String = js.native
  def writeJSON(filepath: String, contents: js.Any, replacer: ReplacerFunc): String = js.native
  def writeJSON(filepath: String, contents: js.Any, replacer: ReplacerFunc, space: Space): String = js.native
}

