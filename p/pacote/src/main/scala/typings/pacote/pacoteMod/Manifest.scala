package typings.pacote.pacoteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.pacoteNumbers.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest
  extends /* key */ StringDictionary[js.Any] {
  var _id: js.UndefOr[String] = js.undefined
  var _integrity: String
  var _resolved: String
  var _shrinkwrap: (Record[String, _]) | Null
  var bin: (Record[String, String]) | Null
  var bundleDependencies: `false` | js.Array[String]
  var cpu: js.UndefOr[js.Array[String]] = js.undefined
  var dependencies: Record[String, String]
  var devDependencies: Record[String, String]
  var engines: js.UndefOr[Record[String, String]] = js.undefined
  var name: String
  var optionalDependencies: Record[String, String]
  var os: js.UndefOr[js.Array[String]] = js.undefined
  var peerDependencies: Record[String, String]
  var version: String
}

object Manifest {
  @scala.inline
  def apply(
    _integrity: String,
    _resolved: String,
    bundleDependencies: `false` | js.Array[String],
    dependencies: Record[String, String],
    devDependencies: Record[String, String],
    name: String,
    optionalDependencies: Record[String, String],
    peerDependencies: Record[String, String],
    version: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _id: String = null,
    _shrinkwrap: Record[String, _] = null,
    bin: Record[String, String] = null,
    cpu: js.Array[String] = null,
    engines: Record[String, String] = null,
    os: js.Array[String] = null
  ): Manifest = {
    val __obj = js.Dynamic.literal(_integrity = _integrity, _resolved = _resolved, bundleDependencies = bundleDependencies.asInstanceOf[js.Any], dependencies = dependencies, devDependencies = devDependencies, name = name, optionalDependencies = optionalDependencies, peerDependencies = peerDependencies, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_shrinkwrap != null) __obj.updateDynamic("_shrinkwrap")(_shrinkwrap)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu)
    if (engines != null) __obj.updateDynamic("engines")(engines)
    if (os != null) __obj.updateDynamic("os")(os)
    __obj.asInstanceOf[Manifest]
  }
}

@JSImport("pacote", "manifest")
@js.native
object manifest extends js.Object {
  /**
    * Fetches the manifest for a package. Manifest objects are similar and based on
    * the `package.json` for that package, but with pre-processed and limited
    * fields.
    *
    * Note that depending on the spec type, some additional fields might be
    * present. For example, packages from `registry.npmjs.org` have additional
    * metadata appended by the registry.
    */
  def apply(spec: String): js.Promise[Manifest] = js.native
  def apply(spec: String, opts: Options): js.Promise[Manifest] = js.native
}

