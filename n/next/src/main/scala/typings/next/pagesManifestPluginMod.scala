package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/build/webpack/plugins/pages-manifest-plugin", JSImport.Namespace)
@js.native
object pagesManifestPluginMod extends js.Object {
  @js.native
  trait PagesManifestPlugin extends Plugin {
    var serverless: Boolean = js.native
  }
  
  @js.native
  class default protected () extends PagesManifestPlugin {
    def this(serverless: Boolean) = this()
  }
  
  type PagesManifest = StringDictionary[String]
}

