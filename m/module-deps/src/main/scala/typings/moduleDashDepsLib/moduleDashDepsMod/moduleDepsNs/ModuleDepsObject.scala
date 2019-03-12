package typings
package moduleDashDepsLib.moduleDashDepsMod.moduleDepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleDepsObject
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def _flush(): scala.Unit = js.native
  def _isTopLevel(file: java.lang.String): scala.Boolean = js.native
  def _transform(row: java.lang.String, enc: java.lang.String, next: js.Function0[scala.Unit]): scala.Unit = js.native
  def _transform(row: InputRow, enc: java.lang.String, next: js.Function0[scala.Unit]): scala.Unit = js.native
  def _transform(row: InputTransform, enc: java.lang.String, next: js.Function0[scala.Unit]): scala.Unit = js.native
  def getTransforms(file: java.lang.String, pkg: PackageObject): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def getTransforms(file: java.lang.String, pkg: PackageObject, opts: moduleDashDepsLib.Anon_Builtin): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def lookupPackage(
    file: java.lang.String,
    cb: js.Function3[/* a */ js.Any, /* b */ js.Any, /* c */ js.UndefOr[js.Any], _]
  ): scala.Unit = js.native
  /**
    * Every time a file is read, this event fires with the file path.
    */
  @JSName("on")
  def on_file(
    event: moduleDashDepsLib.moduleDashDepsLibStrings.file,
    listener: js.Function2[/* file */ java.lang.String, /* id */ java.lang.String, _]
  ): this.type = js.native
  /**
    * When opts.ignoreMissing is enabled, this event fires for each missing package.
    */
  @JSName("on")
  def on_missing(
    event: moduleDashDepsLib.moduleDashDepsLibStrings.missing,
    listener: js.Function2[/* id */ java.lang.String, /* parent */ moduleDashDepsLib.Anon_Filename, _]
  ): this.type = js.native
  /**
    * Every time a package is read, this event fires. The directory name of the package is available in pkg.__dirname.
    */
  @JSName("on")
  def on_package(
    event: moduleDashDepsLib.moduleDashDepsLibStrings.PACKAGE,
    listener: js.Function1[/* package */ PackageObject, _]
  ): this.type = js.native
  /**
    * Every time a transform is applied to a file, a 'transform' event fires with the instantiated transform stream tr.
    */
  @JSName("on")
  def on_transform(
    event: moduleDashDepsLib.moduleDashDepsLibStrings.transform,
    listener: js.Function2[/* tr */ js.Any, /* file */ java.lang.String, _]
  ): this.type = js.native
  def parseDeps(file: java.lang.String, src: java.lang.String, cb: js.Any): js.Array[_] = js.native
  def readFile(file: java.lang.String): nodeLib.NodeJSNs.ReadableStream = js.native
  def readFile(file: java.lang.String, id: js.Any): nodeLib.NodeJSNs.ReadableStream = js.native
  def readFile(file: java.lang.String, id: js.Any, pkg: PackageObject): nodeLib.NodeJSNs.ReadableStream = js.native
  def resolve(
    id: java.lang.String,
    parent: moduleDashDepsLib.Anon_Id,
    cb: js.Function4[
      /* err */ stdLib.Error | scala.Null, 
      /* file */ js.UndefOr[java.lang.String], 
      /* pkg */ js.UndefOr[PackageObject], 
      /* fakePath */ js.UndefOr[js.Any], 
      _
    ]
  ): js.Any = js.native
  def walk(
    id: java.lang.String,
    parent: moduleDashDepsLib.Anon_Modules,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* file */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def walk(
    id: moduleDashDepsLib.Anon_Entry,
    parent: moduleDashDepsLib.Anon_Modules,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* file */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

