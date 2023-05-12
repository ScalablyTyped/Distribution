package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.int32T
import typings.mirada.distSrcTypesOpencvHacksMod.int64T
import typings.mirada.distSrcTypesOpencvHacksMod.uint32T
import typings.mirada.distSrcTypesOpencvHacksMod.uint64T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvSoftfloatMod {
  
  @JSImport("mirada/dist/src/types/opencv/softfloat", "softfloat")
  @js.native
  open class softfloat () extends StObject {
    def this(arg174: Any | int32T | int64T | uint32T | uint64T) = this()
    def this(c: softfloat) = this()
    
    def getExp(): int = js.native
    
    /**
      *   Returns a number 1 <= x < 2 with the same significand
      */
    def getFrac(): softfloat = js.native
    
    def getSign(): bool = js.native
    
    def isInf(): bool = js.native
    
    def isNaN(): bool = js.native
    
    def isSubnormal(): bool = js.native
    
    def setExp(e: int): softfloat = js.native
    
    /**
      *   Constructs a copy of a number with significand taken from parameter
      */
    def setFrac(s: softfloat): softfloat = js.native
    
    def setSign(sign: bool): softfloat = js.native
    
    var v: uint32T = js.native
  }
  /* static members */
  object softfloat {
    
    @JSImport("mirada/dist/src/types/opencv/softfloat", "softfloat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def eps(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("eps")().asInstanceOf[softfloat]
    
    /**
      *   Builds new value from raw binary representation
      */
    inline def fromRaw(a: uint32T): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRaw")(a.asInstanceOf[js.Any]).asInstanceOf[softfloat]
    
    inline def inf(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("inf")().asInstanceOf[softfloat]
    
    inline def max(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[softfloat]
    
    inline def min(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[softfloat]
    
    inline def nan(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("nan")().asInstanceOf[softfloat]
    
    inline def one(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[softfloat]
    
    inline def pi(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("pi")().asInstanceOf[softfloat]
    
    inline def zero(): softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[softfloat]
  }
}
