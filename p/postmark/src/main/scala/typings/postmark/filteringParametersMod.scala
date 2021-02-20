package typings.postmark

import typings.postmark.supportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringParametersMod {
  
  @JSImport("postmark/dist/client/models/client/FilteringParameters", "FilteringParameters")
  @js.native
  class FilteringParameters ()
    extends Hash[js.Any] {
    def this(count: Double) = this()
    def this(count: js.UndefOr[scala.Nothing], offset: Double) = this()
    def this(count: Double, offset: Double) = this()
    
    var count: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
}
