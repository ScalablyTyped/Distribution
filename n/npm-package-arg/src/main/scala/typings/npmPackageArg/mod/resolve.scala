package typings.npmPackageArg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("npm-package-arg", "resolve")
@js.native
object resolve extends js.Object {
  
  /**
    * Throws if the package name is invalid, a dist-tag is invalid or a URL's protocol is not supported.
    * @param name The name of the module you want to install. For example: foo or @bar/foo.
    * @param spec The specifier indicating where and how you can get this module.
    * Something like: 1.2, ^1.7.17, http://x.com/foo.tgz, git+https://github.com/user/foo, bitbucket:user/foo, file:foo.tar.gz or file:../foo/bar/. If not included then the default is latest.
    * @param where Optionally the path to resolve file paths relative to. Defaults to process.cwd()
    */
  def apply(name: String, spec: String): FileResult | HostedGitResult | URLResult | AliasResult | RegistryResult = js.native
  def apply(name: String, spec: String, where: String): FileResult | HostedGitResult | URLResult | AliasResult | RegistryResult = js.native
}
