package typings.pacote

import typings.pacote.mod.Manifest_
import typings.pacote.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote/manifest", JSImport.Namespace)
@js.native
object manifestMod extends js.Object {
  /**
    * Fetches the manifest for a package. Manifest objects are similar and based on
    * the `package.json` for that package, but with pre-processed and limited
    * fields.
    *
    * Note that depending on the spec type, some additional fields might be
    * present. For example, packages from `registry.npmjs.org` have additional
    * metadata appended by the registry.
    */
  def apply(spec: String): js.Promise[Manifest_] = js.native
  def apply(spec: String, opts: Options): js.Promise[Manifest_] = js.native
}

