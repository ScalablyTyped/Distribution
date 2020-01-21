package typings.pacote.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.pacoteBooleans.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest_
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

object Manifest_ {
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
  ): Manifest_ = {
    val __obj = js.Dynamic.literal(_integrity = _integrity.asInstanceOf[js.Any], _resolved = _resolved.asInstanceOf[js.Any], bundleDependencies = bundleDependencies.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any], peerDependencies = peerDependencies.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_shrinkwrap != null) __obj.updateDynamic("_shrinkwrap")(_shrinkwrap.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (engines != null) __obj.updateDynamic("engines")(engines.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest_]
  }
}

