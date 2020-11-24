package typings.pkgcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ProviderOptions = typings.pkgcloud.mod.BaseProviderOptions with (typings.std.Partial[
    typings.pkgcloud.mod.AmazonProviderOptions | typings.pkgcloud.mod.AzureProviderOptions | typings.pkgcloud.mod.GoogleProviderOptions | typings.pkgcloud.mod.OpenstackProviderOptions | typings.pkgcloud.mod.RackspaceProviderOptions
  ])
}
