package typings.mirada.distSrcTypesOpencvMod

import typings.mirada.distSrcTypesOpencvHacksMod.int32T
import typings.mirada.distSrcTypesOpencvHacksMod.int64T
import typings.mirada.distSrcTypesOpencvHacksMod.uint32T
import typings.mirada.distSrcTypesOpencvHacksMod.uint64T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv", "softfloat")
@js.native
open class softfloat ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.softfloat {
  def this(arg174: Any | int32T | int64T | uint32T | uint64T) = this()
  def this(c: typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat) = this()
}
/* static members */
object softfloat {
  
  @JSImport("mirada/dist/src/types/opencv", "softfloat")
  @js.native
  val ^ : js.Any = js.native
  
  inline def eps(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("eps")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  /**
    *   Builds new value from raw binary representation
    */
  inline def fromRaw(a: uint32T): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRaw")(a.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def inf(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("inf")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def max(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def min(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def nan(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("nan")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def one(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def pi(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("pi")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
  
  inline def zero(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat]
}
