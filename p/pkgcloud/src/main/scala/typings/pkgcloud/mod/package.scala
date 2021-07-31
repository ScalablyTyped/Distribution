package typings.pkgcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def version: java.lang.String = typings.pkgcloud.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type ProviderOptions = typings.pkgcloud.mod.BaseProviderOptions & (typings.std.Partial[
typings.pkgcloud.mod.AmazonProviderOptions | typings.pkgcloud.mod.AzureProviderOptions | typings.pkgcloud.mod.GoogleProviderOptions | typings.pkgcloud.mod.OpenstackProviderOptions | typings.pkgcloud.mod.RackspaceProviderOptions])
