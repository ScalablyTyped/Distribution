package typings.moduleDashDeps.moduleDashDepsMod

import typings.moduleDashDeps.Anon_Builtin
import typings.moduleDashDeps.Anon_Entry
import typings.moduleDashDeps.Anon_Filename
import typings.moduleDashDeps.Anon_Id
import typings.moduleDashDeps.Anon_Modules
import typings.moduleDashDeps.moduleDashDepsStrings.PACKAGE
import typings.moduleDashDeps.moduleDashDepsStrings.file
import typings.moduleDashDeps.moduleDashDepsStrings.missing
import typings.moduleDashDeps.moduleDashDepsStrings.transform
import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleDepsObject extends ReadWriteStream {
  def _flush(): Unit = js.native
  def _isTopLevel(file: String): Boolean = js.native
  def _transform(row: String, enc: String, next: js.Function0[Unit]): Unit = js.native
  def _transform(row: InputRow, enc: String, next: js.Function0[Unit]): Unit = js.native
  def _transform(row: InputTransform, enc: String, next: js.Function0[Unit]): Unit = js.native
  def getTransforms(file: String, pkg: PackageObject): ReadWriteStream = js.native
  def getTransforms(file: String, pkg: PackageObject, opts: Anon_Builtin): ReadWriteStream = js.native
  def lookupPackage(file: String, cb: js.Function3[/* a */ js.Any, /* b */ js.Any, /* c */ js.UndefOr[js.Any], _]): Unit = js.native
  /**
    * Every time a file is read, this event fires with the file path.
    */
  @JSName("on")
  def on_file(event: file, listener: js.Function2[/* file */ String, /* id */ String, _]): this.type = js.native
  /**
    * When opts.ignoreMissing is enabled, this event fires for each missing package.
    */
  @JSName("on")
  def on_missing(event: missing, listener: js.Function2[/* id */ String, /* parent */ Anon_Filename, _]): this.type = js.native
  /**
    * Every time a package is read, this event fires. The directory name of the package is available in pkg.__dirname.
    */
  @JSName("on")
  def on_package(event: PACKAGE, listener: js.Function1[/* package */ PackageObject, _]): this.type = js.native
  /**
    * Every time a transform is applied to a file, a 'transform' event fires with the instantiated transform stream tr.
    */
  @JSName("on")
  def on_transform(event: transform, listener: js.Function2[/* tr */ js.Any, /* file */ String, _]): this.type = js.native
  def parseDeps(file: String, src: String, cb: js.Any): js.Array[_] = js.native
  def readFile(file: String): ReadableStream = js.native
  def readFile(file: String, id: js.Any): ReadableStream = js.native
  def readFile(file: String, id: js.Any, pkg: PackageObject): ReadableStream = js.native
  def resolve(
    id: String,
    parent: Anon_Id,
    cb: js.Function4[
      /* err */ Error | Null, 
      /* file */ js.UndefOr[String], 
      /* pkg */ js.UndefOr[PackageObject], 
      /* fakePath */ js.UndefOr[js.Any], 
      _
    ]
  ): js.Any = js.native
  def walk(
    id: String,
    parent: Anon_Modules,
    cb: js.Function2[/* err */ Error | Null, /* file */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def walk(
    id: Anon_Entry,
    parent: Anon_Modules,
    cb: js.Function2[/* err */ Error | Null, /* file */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

