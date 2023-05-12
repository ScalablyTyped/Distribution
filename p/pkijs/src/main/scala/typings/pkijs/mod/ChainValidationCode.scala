package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChainValidationCode extends StObject
@JSImport("pkijs", "ChainValidationCode")
@js.native
object ChainValidationCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChainValidationCode & Double] = js.native
  
  @js.native
  sealed trait noPath
    extends StObject
       with ChainValidationCode
  /* 60 */ val noPath: typings.pkijs.mod.ChainValidationCode.noPath & Double = js.native
  
  @js.native
  sealed trait noRevocation
    extends StObject
       with ChainValidationCode
  /* 11 */ val noRevocation: typings.pkijs.mod.ChainValidationCode.noRevocation & Double = js.native
  
  @js.native
  sealed trait noValidPath
    extends StObject
       with ChainValidationCode
  /* 97 */ val noValidPath: typings.pkijs.mod.ChainValidationCode.noValidPath & Double = js.native
  
  @js.native
  sealed trait success
    extends StObject
       with ChainValidationCode
  /* 0 */ val success: typings.pkijs.mod.ChainValidationCode.success & Double = js.native
  
  @js.native
  sealed trait unknown
    extends StObject
       with ChainValidationCode
  /* -1 */ val unknown: typings.pkijs.mod.ChainValidationCode.unknown & Double = js.native
}
