package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BROWSERS extends js.Object
@JSImport("openseadragon", "BROWSERS")
@js.native
object BROWSERS extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BROWSERS with Double] = js.native
  
  @js.native
  sealed trait CHROME extends BROWSERS
  /* 4 */ @js.native
  object CHROME extends TopLevel[CHROME with Double]
  
  @js.native
  sealed trait FIREFOX extends BROWSERS
  /* 2 */ @js.native
  object FIREFOX extends TopLevel[FIREFOX with Double]
  
  @js.native
  sealed trait IE extends BROWSERS
  /* 1 */ @js.native
  object IE extends TopLevel[IE with Double]
  
  @js.native
  sealed trait OPERA extends BROWSERS
  /* 5 */ @js.native
  object OPERA extends TopLevel[OPERA with Double]
  
  @js.native
  sealed trait SAFARI extends BROWSERS
  /* 3 */ @js.native
  object SAFARI extends TopLevel[SAFARI with Double]
  
  @js.native
  sealed trait UNKNOWN extends BROWSERS
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
