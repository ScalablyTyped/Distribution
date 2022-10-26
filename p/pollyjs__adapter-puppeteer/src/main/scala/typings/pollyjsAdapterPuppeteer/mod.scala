package typings.pollyjsAdapterPuppeteer

import typings.pollyjsAdapterPuppeteer.anon.Page
import typings.pollyjsCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/adapter-puppeteer", JSImport.Default)
  @js.native
  open class default ()
    extends typings.pollyjsAdapter.mod.default[Page, Request[js.Object]]
  
  type PuppeteerAdapter = typings.pollyjsAdapter.mod.default[Page, Request[js.Object]]
}
