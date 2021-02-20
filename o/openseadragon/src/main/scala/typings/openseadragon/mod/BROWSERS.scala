package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BROWSERS extends StObject
@JSImport("openseadragon", "BROWSERS")
@js.native
object BROWSERS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BROWSERS with Double] = js.native
  
  @js.native
  sealed trait CHROME extends BROWSERS
  /* 4 */ val CHROME: typings.openseadragon.mod.BROWSERS.CHROME with Double = js.native
  
  @js.native
  sealed trait FIREFOX extends BROWSERS
  /* 2 */ val FIREFOX: typings.openseadragon.mod.BROWSERS.FIREFOX with Double = js.native
  
  @js.native
  sealed trait IE extends BROWSERS
  /* 1 */ val IE: typings.openseadragon.mod.BROWSERS.IE with Double = js.native
  
  @js.native
  sealed trait OPERA extends BROWSERS
  /* 5 */ val OPERA: typings.openseadragon.mod.BROWSERS.OPERA with Double = js.native
  
  @js.native
  sealed trait SAFARI extends BROWSERS
  /* 3 */ val SAFARI: typings.openseadragon.mod.BROWSERS.SAFARI with Double = js.native
  
  @js.native
  sealed trait UNKNOWN extends BROWSERS
  /* 0 */ val UNKNOWN: typings.openseadragon.mod.BROWSERS.UNKNOWN with Double = js.native
}
