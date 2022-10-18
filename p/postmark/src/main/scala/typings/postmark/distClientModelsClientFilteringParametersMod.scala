package typings.postmark

import typings.postmark.distClientModelsClientSupportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsClientFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/client/FilteringParameters", "FilteringParameters")
  @js.native
  open class FilteringParameters ()
    extends StObject
       with Hash[Any] {
    def this(count: Double) = this()
    def this(count: Double, offset: Double) = this()
    def this(count: Unit, offset: Double) = this()
    
    var count: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
}
