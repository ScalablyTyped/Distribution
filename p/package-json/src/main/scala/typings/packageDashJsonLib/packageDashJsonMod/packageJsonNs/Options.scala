package typings
package packageDashJsonLib.packageDashJsonMod.packageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Return the [main entry](https://registry.npmjs.org/ava) containing all versions.
    * @default false
    */
  var allVersions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, only an abbreviated metadata object is returned for performance reasons.
    * [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
    * @default false
    */
  var fullMetadata: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Package version such as `1.0.0` or a [dist tag](https://docs.npmjs.com/cli/dist-tag) such as `latest`.
    *
    * The version can also be in any format supported by the [semver](https://github.com/npm/node-semver) module.
    * For example:
    * - `1` - Get the latest `1.x.x`
    * - `1.2` - Get the latest `1.2.x`
    * - `^1.2.3` - Get the latest `1.x.x` but at least `1.2.3`
    * - `~1.2.3` - Get the latest `1.2.x` but at least `1.2.3`
    *
    * @default 'latest'
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

