package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BROWSERS extends StObject
@JSImport("openseadragon", "BROWSERS")
@js.native
object BROWSERS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BROWSERS & Double] = js.native
  
  @js.native
  sealed trait CHROME
    extends StObject
       with BROWSERS
  /* 4 */ val CHROME: typings.openseadragon.mod.BROWSERS.CHROME & Double = js.native
  
  @js.native
  sealed trait FIREFOX
    extends StObject
       with BROWSERS
  /* 2 */ val FIREFOX: typings.openseadragon.mod.BROWSERS.FIREFOX & Double = js.native
  
  @js.native
  sealed trait IE
    extends StObject
       with BROWSERS
  /* 1 */ val IE: typings.openseadragon.mod.BROWSERS.IE & Double = js.native
  
  @js.native
  sealed trait OPERA
    extends StObject
       with BROWSERS
  /* 5 */ val OPERA: typings.openseadragon.mod.BROWSERS.OPERA & Double = js.native
  
  @js.native
  sealed trait SAFARI
    extends StObject
       with BROWSERS
  /* 3 */ val SAFARI: typings.openseadragon.mod.BROWSERS.SAFARI & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with BROWSERS
  /* 0 */ val UNKNOWN: typings.openseadragon.mod.BROWSERS.UNKNOWN & Double = js.native
}
