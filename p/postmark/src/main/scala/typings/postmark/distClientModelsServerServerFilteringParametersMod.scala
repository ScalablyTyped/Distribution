package typings.postmark

import typings.postmark.distClientModelsClientFilteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsServerServerFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/server/ServerFilteringParameters", "ServerFilteringParameters")
  @js.native
  open class ServerFilteringParameters () extends FilteringParameters {
    def this(count: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: Unit, offset: Double) = this()
    def this(count: Double, offset: Double, name: String) = this()
    def this(count: Double, offset: Unit, name: String) = this()
    def this(count: Unit, offset: Double, name: String) = this()
    def this(count: Unit, offset: Unit, name: String) = this()
    
    var name: js.UndefOr[String] = js.native
  }
}
