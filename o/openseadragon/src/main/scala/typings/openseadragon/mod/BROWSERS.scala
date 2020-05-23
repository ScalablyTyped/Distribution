package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BROWSERS extends js.Object

@JSImport("openseadragon", "BROWSERS")
@js.native
object BROWSERS extends js.Object {
  @js.native
  sealed trait CHROME extends BROWSERS
  
  @js.native
  sealed trait FIREFOX extends BROWSERS
  
  @js.native
  sealed trait IE extends BROWSERS
  
  @js.native
  sealed trait OPERA extends BROWSERS
  
  @js.native
  sealed trait SAFARI extends BROWSERS
  
  @js.native
  sealed trait UNKNOWN extends BROWSERS
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BROWSERS with Double] = js.native
  /* 4 */ @js.native
  object CHROME extends TopLevel[CHROME with Double]
  
  /* 2 */ @js.native
  object FIREFOX extends TopLevel[FIREFOX with Double]
  
  /* 1 */ @js.native
  object IE extends TopLevel[IE with Double]
  
  /* 5 */ @js.native
  object OPERA extends TopLevel[OPERA with Double]
  
  /* 3 */ @js.native
  object SAFARI extends TopLevel[SAFARI with Double]
  
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
}

