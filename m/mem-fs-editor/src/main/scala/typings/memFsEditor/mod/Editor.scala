package typings.memFsEditor.mod

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.jsonSchema.mod.JSONSchema7Type
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  def append(filepath: String, contents: WriteContents): String = js.native
  def append(filepath: String, contents: WriteContents, options: AppendOptions): String = js.native
  def commit(callback: CommitCallback): Unit = js.native
  def commit(filters: js.Array[Transform], callback: CommitCallback): Unit = js.native
  def copy(from: FilePaths, to: String): Unit = js.native
  def copy(
    from: FilePaths,
    to: String,
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    templateOptions: Options
  ): Unit = js.native
  def copy(from: FilePaths, to: String, options: js.UndefOr[scala.Nothing], context: Data): Unit = js.native
  def copy(
    from: FilePaths,
    to: String,
    options: js.UndefOr[scala.Nothing],
    context: Data,
    templateOptions: Options
  ): Unit = js.native
  def copy(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
  def copy(
    from: FilePaths,
    to: String,
    options: CopyOptions,
    context: js.UndefOr[scala.Nothing],
    templateOptions: Options
  ): Unit = js.native
  def copy(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
  def copy(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
  def copyTpl(from: FilePaths, to: String): Unit = js.native
  def copyTpl(
    from: FilePaths,
    to: String,
    context: js.UndefOr[scala.Nothing],
    templateOptions: js.UndefOr[scala.Nothing],
    copyOptions: CopyOptions
  ): Unit = js.native
  def copyTpl(from: FilePaths, to: String, context: js.UndefOr[scala.Nothing], templateOptions: Options): Unit = js.native
  def copyTpl(
    from: FilePaths,
    to: String,
    context: js.UndefOr[scala.Nothing],
    templateOptions: Options,
    copyOptions: CopyOptions
  ): Unit = js.native
  def copyTpl(from: FilePaths, to: String, context: Data): Unit = js.native
  def copyTpl(
    from: FilePaths,
    to: String,
    context: Data,
    templateOptions: js.UndefOr[scala.Nothing],
    copyOptions: CopyOptions
  ): Unit = js.native
  def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Options): Unit = js.native
  def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Options, copyOptions: CopyOptions): Unit = js.native
  def delete(filepath: FilePaths): Unit = js.native
  def delete(filepath: FilePaths, options: WithGlobOptions): Unit = js.native
  def exists(filepath: String): Boolean = js.native
  def extendJSON(filepath: String, contents: js.Any): Unit = js.native
  def extendJSON(filepath: String, contents: js.Any, replacer: js.UndefOr[WriteJsonReplacer], space: WriteJsonSpace): Unit = js.native
  def extendJSON(filepath: String, contents: js.Any, replacer: WriteJsonReplacer): Unit = js.native
  def move(from: FilePaths, to: String): Unit = js.native
  def move(from: FilePaths, to: String, options: WithGlobOptions): Unit = js.native
  def read(filepath: String): String = js.native
  def read(filepath: String, options: ReadRawOptions): ReadRawContents = js.native
  def read(filepath: String, options: ReadStringOptions): String = js.native
  def readJSON(filepath: String): js.UndefOr[JSONSchema7Type] = js.native
  def readJSON(filepath: String, defaults: JSONSchema7Type): JSONSchema7Type = js.native
  def write(filepath: String, contents: WriteContents): String = js.native
  def writeJSON(filepath: String, contents: js.Any): String = js.native
  def writeJSON(filepath: String, contents: js.Any, replacer: js.UndefOr[WriteJsonReplacer], space: WriteJsonSpace): String = js.native
  def writeJSON(filepath: String, contents: js.Any, replacer: WriteJsonReplacer): String = js.native
}

