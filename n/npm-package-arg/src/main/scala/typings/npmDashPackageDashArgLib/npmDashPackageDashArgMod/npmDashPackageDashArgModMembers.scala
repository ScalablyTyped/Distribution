package typings
package npmDashPackageDashArgLib.npmDashPackageDashArgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-package-arg", JSImport.Namespace)
@js.native
object npmDashPackageDashArgModMembers extends js.Object {
  def apply(arg: java.lang.String): npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.Result = js.native
  def apply(arg: java.lang.String, where: java.lang.String): npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.Result = js.native
  /**
       * Throws if the package name is invalid, a dist-tag is invalid or a URL's protocol is not supported.
       * @param name The name of the module you want to install. For example: foo or @bar/foo.
       * @param spec The specifier indicating where and how you can get this module.
       * Something like: 1.2, ^1.7.17, http://x.com/foo.tgz, git+https://github.com/user/foo, bitbucket:user/foo, file:foo.tar.gz or file:../foo/bar/. If not included then the default is latest.
       * @param where Optionally the path to resolve file paths relative to. Defaults to process.cwd()
       */
  def resolve(name: java.lang.String, spec: java.lang.String): npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.FileResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.HostedGitResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.URLResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.AliasResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.RegistryResult = js.native
  /**
       * Throws if the package name is invalid, a dist-tag is invalid or a URL's protocol is not supported.
       * @param name The name of the module you want to install. For example: foo or @bar/foo.
       * @param spec The specifier indicating where and how you can get this module.
       * Something like: 1.2, ^1.7.17, http://x.com/foo.tgz, git+https://github.com/user/foo, bitbucket:user/foo, file:foo.tar.gz or file:../foo/bar/. If not included then the default is latest.
       * @param where Optionally the path to resolve file paths relative to. Defaults to process.cwd()
       */
  def resolve(name: java.lang.String, spec: java.lang.String, where: java.lang.String): npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.FileResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.HostedGitResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.URLResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.AliasResult | npmDashPackageDashArgLib.npmDashPackageDashArgMod.npaNs.RegistryResult = js.native
}

