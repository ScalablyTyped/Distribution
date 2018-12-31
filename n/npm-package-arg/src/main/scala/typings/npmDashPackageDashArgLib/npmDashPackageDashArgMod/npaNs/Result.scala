package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /** A version of name escaped to match the npm scoped packages specification. Mostly used when making requests against a registry. When name is null, escapedName will also be null. */
  var escapedName: java.lang.String | scala.Null
  /** The version of the specifier to be used to fetch this resource. null for shortcuts to hosted git dependencies as there isn't just one URL to try with them. */
  var fetchSpec: java.lang.String | scala.Null
  /** If set, this is the specific committish to use with a git dependency. */
  var gitCommittish: js.UndefOr[java.lang.String] = js.undefined
  /** If set, this is a semver specifier to match against git tags with */
  var gitRange: js.UndefOr[java.lang.String] = js.undefined
  /** If from === 'hosted' then this will be a hosted-git-info object. This property is not included when serializing the object as JSON. */
  var hosted: js.UndefOr[HostedGit] = js.undefined
  /** If known, the name field expected in the resulting pkg. */
  var name: java.lang.String | scala.Null
  /** The original un-modified string that was provided. If called as npa.resolve(name, spec) then this will be name + '@' + spec. */
  var raw: java.lang.String
  /** The specifier part that was parsed out in calls to npa(arg), or the value of spec in calls to `npa.resolve(name, spec). */
  var rawSpec: java.lang.String
  /** If true this specifier refers to a resource hosted on a registry. This is true for tag, version and range types. */
  var registry: scala.Boolean
  /** The normalized specifier, for saving to package.json files. null for registry dependencies. */
  var saveSpec: java.lang.String | scala.Null
  /** If a name is something like @org/module then the scope field will be set to @org. If it doesn't have a scoped name, then scope is null. */
  var scope: java.lang.String | scala.Null
  /**
    * One of the following strings:
    * * git - A git repo
    * * tag - A tagged version, like "foo@latest"
    * * version - A specific version number, like "foo@1.2.3"
    * * range - A version range, like "foo@2.x"
    * * file - A local .tar.gz, .tar or .tgz file.
    * * directory - A local directory.
    * * remote - An http url (presumably to a tgz)
    */
  var `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.git | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.tag | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.version | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.range | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.file | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.directory | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.remote | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.alias
}

