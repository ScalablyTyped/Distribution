package typings.popmotion

import typings.popmotion.stepsMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popmotionStrings {
  
  @js.native
  sealed trait decay extends StObject
  inline def decay: decay = "decay".asInstanceOf[decay]
  
  @js.native
  sealed trait end
    extends StObject
       with Direction
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait keyframes extends StObject
  inline def keyframes: keyframes = "keyframes".asInstanceOf[keyframes]
  
  @js.native
  sealed trait loop extends StObject
  inline def loop: loop = "loop".asInstanceOf[loop]
  
  @js.native
  sealed trait mirror extends StObject
  inline def mirror: mirror = "mirror".asInstanceOf[mirror]
  
  @js.native
  sealed trait reverse extends StObject
  inline def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait spring extends StObject
  inline def spring: spring = "spring".asInstanceOf[spring]
  
  @js.native
  sealed trait start
    extends StObject
       with Direction
  inline def start: start = "start".asInstanceOf[start]
}
