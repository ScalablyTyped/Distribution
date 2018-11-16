package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-package-arg", "Result")
@js.native
class Result ()
  extends npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.Result {
  /** A version of name escaped to match the npm scoped packages specification. Mostly used when making requests against a registry. When name is null, escapedName will also be null. */
  /* CompleteClass */
  override var escapedName: java.lang.String | scala.Null = js.native
  /** The version of the specifier to be used to fetch this resource. null for shortcuts to hosted git dependencies as there isn't just one URL to try with them. */
  /* CompleteClass */
  override var fetchSpec: java.lang.String | scala.Null = js.native
  /** If known, the name field expected in the resulting pkg. */
  /* CompleteClass */
  override var name: java.lang.String | scala.Null = js.native
  /** The original un-modified string that was provided. If called as npa.resolve(name, spec) then this will be name + '@' + spec. */
  /* CompleteClass */
  override var raw: java.lang.String = js.native
  /** The specifier part that was parsed out in calls to npa(arg), or the value of spec in calls to `npa.resolve(name, spec). */
  /* CompleteClass */
  override var rawSpec: java.lang.String = js.native
  /** If true this specifier refers to a resource hosted on a registry. This is true for tag, version and range types. */
  /* CompleteClass */
  override var registry: scala.Boolean = js.native
  /** The normalized specifier, for saving to package.json files. null for registry dependencies. */
  /* CompleteClass */
  override var saveSpec: java.lang.String | scala.Null = js.native
  /** If a name is something like @org/module then the scope field will be set to @org. If it doesn't have a scoped name, then scope is null. */
  /* CompleteClass */
  override var scope: java.lang.String | scala.Null = js.native
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
  /* CompleteClass */
  override var `type`: npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.git | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.tag | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.version | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.range | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.file | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.directory | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.remote | npmDashPackageDashArgLib.npmDashPackageDashArgLibStrings.alias = js.native
}

