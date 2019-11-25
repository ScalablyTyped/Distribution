package typings.pacote.pacoteMod

import org.scalablytyped.runtime.StringDictionary
import typings.pacote.Anon_Latest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packument
  extends /* key */ StringDictionary[js.Any] {
  var `dist-tags`: Anon_Latest with (Record[String, String])
  var name: String
  var versions: Record[String, PackageVersion]
}

object Packument {
  @scala.inline
  def apply(
    `dist-tags`: Anon_Latest with (Record[String, String]),
    name: String,
    versions: Record[String, PackageVersion],
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Packument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Packument]
  }
}

@JSImport("pacote", "packument")
@js.native
object packument extends js.Object {
  /**
    * Fetches the packument for a package. Packument objects are general metadata
    * about a project corresponding to registry metadata, and include version and
    * `dist-tag` information about a package's available versions, rather than a
    * specific version. It may include additional metadata not usually available
    * through the individual package metadata objects.
    *
    * Note that depending on the spec type, some additional fields might be
    * present. For example, packages from `registry.npmjs.org` have additional
    * metadata appended by the registry.
    */
  def apply(spec: String): js.Promise[Packument] = js.native
  def apply(spec: String, opts: Options): js.Promise[Packument] = js.native
}

