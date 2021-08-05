package typings.motorHat

import typings.motorHat.mod.Direction
import typings.motorHat.mod.Motor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motorHatStrings {
  
  @js.native
  sealed trait M1
    extends StObject
       with Motor
  inline def M1: M1 = "M1".asInstanceOf[M1]
  
  @js.native
  sealed trait M2
    extends StObject
       with Motor
  inline def M2: M2 = "M2".asInstanceOf[M2]
  
  @js.native
  sealed trait M3
    extends StObject
       with Motor
  inline def M3: M3 = "M3".asInstanceOf[M3]
  
  @js.native
  sealed trait M4
    extends StObject
       with Motor
  inline def M4: M4 = "M4".asInstanceOf[M4]
  
  @js.native
  sealed trait back
    extends StObject
       with Direction
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait double extends StObject
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait fwd
    extends StObject
       with Direction
  inline def fwd: fwd = "fwd".asInstanceOf[fwd]
  
  @js.native
  sealed trait interleaved extends StObject
  inline def interleaved: interleaved = "interleaved".asInstanceOf[interleaved]
  
  @js.native
  sealed trait microstep extends StObject
  inline def microstep: microstep = "microstep".asInstanceOf[microstep]
  
  @js.native
  sealed trait single extends StObject
  inline def single: single = "single".asInstanceOf[single]
}
