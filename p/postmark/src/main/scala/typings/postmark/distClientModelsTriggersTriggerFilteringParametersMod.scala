package typings.postmark

import typings.postmark.distClientModelsClientFilteringParametersMod.FilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/triggers/TriggerFilteringParameters", JSImport.Namespace)
@js.native
object distClientModelsTriggersTriggerFilteringParametersMod extends js.Object {
  @js.native
  class TagTriggerFilteringParameters () extends FilteringParameters {
    def this(count: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: Double, offset: Double, match_name: String) = this()
    var match_name: js.UndefOr[String] = js.native
  }
  
}

