package typings
package memDashFsDashEditorLib.memDashFsDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mem-fs-editor", "memFsEditor")
@js.native
object memFsEditorNs extends js.Object {
  
  trait CopyOptions extends js.Object {
    var globOptions: js.UndefOr[globLib.globMod.GNs.IOptions] = js.undefined
    var process: js.UndefOr[ProcessFunc] = js.undefined
  }
  
  @js.native
  trait Editor extends js.Object {
    def append(filepath: java.lang.String, contents: Contents): scala.Unit = js.native
    def append(filepath: java.lang.String, contents: Contents, options: memDashFsDashEditorLib.Anon_TrimEnd): scala.Unit = js.native
    def commit(callback: Callback): scala.Unit = js.native
    def commit(filters: js.Array[nodeLib.streamMod.Transform], callback: Callback): scala.Unit = js.native
    def copy(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def copy(from: java.lang.String, to: java.lang.String, options: CopyOptions): scala.Unit = js.native
    def copyTpl(from: java.lang.String, to: java.lang.String, context: js.Object): scala.Unit = js.native
    def copyTpl(
      from: java.lang.String,
      to: java.lang.String,
      context: js.Object,
      templateOptions: ejsLib.ejsMod.Options
    ): scala.Unit = js.native
    def copyTpl(
      from: java.lang.String,
      to: java.lang.String,
      context: js.Object,
      templateOptions: ejsLib.ejsMod.Options,
      copyOptions: CopyOptions
    ): scala.Unit = js.native
    def delete(filepath: java.lang.String): scala.Unit = js.native
    def delete(filepath: java.lang.String, options: memDashFsDashEditorLib.Anon_GlobOptions): scala.Unit = js.native
    def exists(filepath: java.lang.String): scala.Boolean = js.native
    def extendJSON(filepath: java.lang.String, contents: js.Object): scala.Unit = js.native
    def extendJSON(filepath: java.lang.String, contents: js.Object, replacer: ReplacerFunc): scala.Unit = js.native
    def extendJSON(filepath: java.lang.String, contents: js.Object, replacer: ReplacerFunc, space: Space): scala.Unit = js.native
    def move(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def move(from: java.lang.String, to: java.lang.String, options: memDashFsDashEditorLib.Anon_GlobOptions): scala.Unit = js.native
    def read(filepath: java.lang.String): java.lang.String = js.native
    def read(filepath: java.lang.String, options: memDashFsDashEditorLib.Anon_Raw): java.lang.String = js.native
    def readJSON(filepath: java.lang.String): js.Any = js.native
    def readJSON(filepath: java.lang.String, defaults: js.Any): js.Any = js.native
    def write(filepath: java.lang.String, contents: Contents): scala.Unit = js.native
    def writeJSON(filepath: java.lang.String, contents: js.Any): scala.Unit = js.native
    def writeJSON(filepath: java.lang.String, contents: js.Any, replacer: ReplacerFunc): scala.Unit = js.native
    def writeJSON(filepath: java.lang.String, contents: js.Any, replacer: ReplacerFunc, space: Space): scala.Unit = js.native
  }
  
  type Callback = js.Function1[/* err */ js.Any, js.Any]
  type Contents = java.lang.String | nodeLib.Buffer
  type ProcessFunc = js.Function1[/* contents */ nodeLib.Buffer, Contents]
  type ReplacerFunc = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
  type Space = java.lang.String | scala.Double
}

