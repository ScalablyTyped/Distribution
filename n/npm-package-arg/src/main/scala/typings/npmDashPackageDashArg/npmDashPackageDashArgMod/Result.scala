package typings.npmDashPackageDashArg.npmDashPackageDashArgMod

import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.alias
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.directory
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.file
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.git
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.range
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.remote
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.tag
import typings.npmDashPackageDashArg.npmDashPackageDashArgStrings.version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-package-arg", "Result")
@js.native
class Result () extends js.Object {
  /** A version of name escaped to match the npm scoped packages specification. Mostly used when making requests against a registry. When name is null, escapedName will also be null. */
  var escapedName: String | Null = js.native
  /** The version of the specifier to be used to fetch this resource. null for shortcuts to hosted git dependencies as there isn't just one URL to try with them. */
  var fetchSpec: String | Null = js.native
  /** If set, this is the specific committish to use with a git dependency. */
  var gitCommittish: js.UndefOr[String] = js.native
  /** If set, this is a semver specifier to match against git tags with */
  var gitRange: js.UndefOr[String] = js.native
  /** If from === 'hosted' then this will be a hosted-git-info object. This property is not included when serializing the object as JSON. */
  var hosted: js.UndefOr[HostedGit] = js.native
  /** If known, the name field expected in the resulting pkg. */
  var name: String | Null = js.native
  /** The original un-modified string that was provided. If called as npa.resolve(name, spec) then this will be name + '@' + spec. */
  var raw: String = js.native
  /** The specifier part that was parsed out in calls to npa(arg), or the value of spec in calls to `npa.resolve(name, spec). */
  var rawSpec: String = js.native
  /** If true this specifier refers to a resource hosted on a registry. This is true for tag, version and range types. */
  var registry: Boolean = js.native
  /** The normalized specifier, for saving to package.json files. null for registry dependencies. */
  var saveSpec: String | Null = js.native
  /** If a name is something like @org/module then the scope field will be set to @org. If it doesn't have a scoped name, then scope is null. */
  var scope: String | Null = js.native
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
  var `type`: git | tag | version | range | file | directory | remote | alias = js.native
}

