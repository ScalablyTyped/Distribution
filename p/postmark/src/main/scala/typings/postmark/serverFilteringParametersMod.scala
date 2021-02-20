package typings.postmark

import typings.postmark.filteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/server/ServerFilteringParameters", "ServerFilteringParameters")
  @js.native
  class ServerFilteringParameters () extends FilteringParameters {
    def this(count: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], name: String) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double, name: String) = this()
    def this(count: Double, offset: js.UndefOr[scala.Nothing], name: String) = this()
    def this(count: Double, offset: Double, name: String) = this()
    
    var name: js.UndefOr[String] = js.native
  }
}
