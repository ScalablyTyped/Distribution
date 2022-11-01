package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolStyle extends StObject
/**
  * SymbolStyle
  */
@JSGlobal("naver.maps.SymbolStyle")
@js.native
object SymbolStyle extends StObject {
  
  @js.native
  sealed trait CIRCLE
    extends StObject
       with SymbolStyle
  
  @js.native
  sealed trait CLOSED_PATH
    extends StObject
       with SymbolStyle
  
  @js.native
  sealed trait PATH
    extends StObject
       with SymbolStyle
}
