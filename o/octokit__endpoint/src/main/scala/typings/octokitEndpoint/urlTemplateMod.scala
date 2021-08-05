package typings.octokitEndpoint

import typings.octokitEndpoint.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlTemplateMod {
  
  @JSImport("@octokit/endpoint/dist-types/util/url-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseUrl(template: String): Expand = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(template.asInstanceOf[js.Any]).asInstanceOf[Expand]
}
