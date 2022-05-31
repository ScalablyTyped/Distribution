package typings.microtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object microtime {
    
    @JSGlobal("microtime")
    @js.native
    val ^ : js.Any = js.native
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def nowDouble(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nowDouble")().asInstanceOf[Double]
    
    inline def nowStruct(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nowStruct")().asInstanceOf[js.Array[Double]]
  }
}
