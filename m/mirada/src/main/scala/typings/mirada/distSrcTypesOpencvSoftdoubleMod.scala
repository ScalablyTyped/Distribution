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

object distSrcTypesOpencvSoftdoubleMod {
  
  @JSImport("mirada/dist/src/types/opencv/softdouble", "softdouble")
  @js.native
  open class softdouble () extends StObject {
    def this(arg159: Any | int32T | int64T | uint32T | uint64T) = this()
    def this(c: softdouble) = this()
    
    def getExp(): int = js.native
    
    /**
      *   Returns a number 1 <= x < 2 with the same significand
      */
    def getFrac(): softdouble = js.native
    
    def getSign(): bool = js.native
    
    def isInf(): bool = js.native
    
    def isNaN(): bool = js.native
    
    def isSubnormal(): bool = js.native
    
    def setExp(e: int): softdouble = js.native
    
    /**
      *   Constructs a copy of a number with significand taken from parameter
      */
    def setFrac(s: softdouble): softdouble = js.native
    
    def setSign(sign: bool): softdouble = js.native
    
    var v: uint64T = js.native
  }
  /* static members */
  object softdouble {
    
    @JSImport("mirada/dist/src/types/opencv/softdouble", "softdouble")
    @js.native
    val ^ : js.Any = js.native
    
    inline def eps(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("eps")().asInstanceOf[softdouble]
    
    /**
      *   Builds new value from raw binary representation
      */
    inline def fromRaw(a: uint64T): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRaw")(a.asInstanceOf[js.Any]).asInstanceOf[softdouble]
    
    inline def inf(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("inf")().asInstanceOf[softdouble]
    
    inline def max(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[softdouble]
    
    inline def min(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[softdouble]
    
    inline def nan(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("nan")().asInstanceOf[softdouble]
    
    inline def one(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[softdouble]
    
    inline def pi(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("pi")().asInstanceOf[softdouble]
    
    inline def zero(): softdouble = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[softdouble]
  }
}
