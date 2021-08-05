package typings.onoff

import typings.onoff.mod.Direction
import typings.onoff.mod.Edge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onoffStrings {
  
  @js.native
  sealed trait both
    extends StObject
       with Edge
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait falling
    extends StObject
       with Edge
  inline def falling: falling = "falling".asInstanceOf[falling]
  
  @js.native
  sealed trait high
    extends StObject
       with Direction
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait in
    extends StObject
       with Direction
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait low
    extends StObject
       with Direction
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait none
    extends StObject
       with Edge
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait out
    extends StObject
       with Direction
  inline def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait rising
    extends StObject
       with Edge
  inline def rising: rising = "rising".asInstanceOf[rising]
}
