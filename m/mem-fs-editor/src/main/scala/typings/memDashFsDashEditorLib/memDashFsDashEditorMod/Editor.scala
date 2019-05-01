package typings
package memDashFsDashEditorLib.memDashFsDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  def append(to: java.lang.String, contents: Contents): java.lang.String = js.native
  def append(to: java.lang.String, contents: Contents, options: memDashFsDashEditorLib.Anon_Separator): java.lang.String = js.native
  def commit(callback: Callback): scala.Unit = js.native
  def commit(filters: js.Array[nodeLib.streamMod.Transform], callback: Callback): scala.Unit = js.native
  def copy(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def copy(from: java.lang.String, to: java.lang.String, options: CopyOptions): scala.Unit = js.native
  def copy(from: java.lang.String, to: java.lang.String, options: CopyOptions, context: ejsLib.ejsMod.Data): scala.Unit = js.native
  def copy(
    from: java.lang.String,
    to: java.lang.String,
    options: CopyOptions,
    context: ejsLib.ejsMod.Data,
    templateOptions: ejsLib.ejsMod.Options
  ): scala.Unit = js.native
  def copy(from: js.Array[java.lang.String], to: java.lang.String): scala.Unit = js.native
  def copy(from: js.Array[java.lang.String], to: java.lang.String, options: CopyOptions): scala.Unit = js.native
  def copy(
    from: js.Array[java.lang.String],
    to: java.lang.String,
    options: CopyOptions,
    context: ejsLib.ejsMod.Data
  ): scala.Unit = js.native
  def copy(
    from: js.Array[java.lang.String],
    to: java.lang.String,
    options: CopyOptions,
    context: ejsLib.ejsMod.Data,
    templateOptions: ejsLib.ejsMod.Options
  ): scala.Unit = js.native
  def copyTpl(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def copyTpl(from: java.lang.String, to: java.lang.String, context: ejsLib.ejsMod.Data): scala.Unit = js.native
  def copyTpl(
    from: java.lang.String,
    to: java.lang.String,
    context: ejsLib.ejsMod.Data,
    templateOptions: ejsLib.ejsMod.Options
  ): scala.Unit = js.native
  def copyTpl(
    from: java.lang.String,
    to: java.lang.String,
    context: ejsLib.ejsMod.Data,
    templateOptions: ejsLib.ejsMod.Options,
    copyOptions: CopyOptions
  ): scala.Unit = js.native
  def copyTpl(from: js.Array[java.lang.String], to: java.lang.String): scala.Unit = js.native
  def copyTpl(from: js.Array[java.lang.String], to: java.lang.String, context: ejsLib.ejsMod.Data): scala.Unit = js.native
  def copyTpl(
    from: js.Array[java.lang.String],
    to: java.lang.String,
    context: ejsLib.ejsMod.Data,
    templateOptions: ejsLib.ejsMod.Options
  ): scala.Unit = js.native
  def copyTpl(
    from: js.Array[java.lang.String],
    to: java.lang.String,
    context: ejsLib.ejsMod.Data,
    templateOptions: ejsLib.ejsMod.Options,
    copyOptions: CopyOptions
  ): scala.Unit = js.native
  def delete(paths: java.lang.String): scala.Unit = js.native
  def delete(paths: java.lang.String, options: memDashFsDashEditorLib.Anon_GlobOptions): scala.Unit = js.native
  def delete(paths: js.Array[java.lang.String]): scala.Unit = js.native
  def delete(paths: js.Array[java.lang.String], options: memDashFsDashEditorLib.Anon_GlobOptions): scala.Unit = js.native
  def exists(filepath: java.lang.String): scala.Boolean = js.native
  def move(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def move(
    from: java.lang.String,
    to: java.lang.String,
    options: memDashFsDashEditorLib.Anon_GlobOptionsIOptions
  ): scala.Unit = js.native
  def move(from: js.Array[java.lang.String], to: java.lang.String): scala.Unit = js.native
  def move(
    from: js.Array[java.lang.String],
    to: java.lang.String,
    options: memDashFsDashEditorLib.Anon_GlobOptionsIOptions
  ): scala.Unit = js.native
  def read(filepath: java.lang.String): java.lang.String = js.native
  def read(filepath: java.lang.String, options: memDashFsDashEditorLib.Anon_Defaults): java.lang.String = js.native
  def readJSON(filepath: java.lang.String): js.Any = js.native
  def readJSON(filepath: java.lang.String, defaults: js.Any): js.Any = js.native
  def write(filepath: java.lang.String, contents: Contents): java.lang.String = js.native
  def writeJSON(filepath: java.lang.String, contents: js.Any): java.lang.String = js.native
  def writeJSON(filepath: java.lang.String, contents: js.Any, replacer: ReplacerFunc): java.lang.String = js.native
  def writeJSON(filepath: java.lang.String, contents: js.Any, replacer: ReplacerFunc, space: Space): java.lang.String = js.native
}

