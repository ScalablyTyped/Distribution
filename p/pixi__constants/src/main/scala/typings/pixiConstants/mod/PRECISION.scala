package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PRECISION extends StObject
@JSImport("@pixi/constants", "PRECISION")
@js.native
object PRECISION extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PRECISION & String] = js.native
  
  @js.native
  sealed trait HIGH
    extends StObject
       with PRECISION
  /* "highp" */ val HIGH: typings.pixiConstants.mod.PRECISION.HIGH & String = js.native
  
  @js.native
  sealed trait LOW
    extends StObject
       with PRECISION
  /* "lowp" */ val LOW: typings.pixiConstants.mod.PRECISION.LOW & String = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with PRECISION
  /* "mediump" */ val MEDIUM: typings.pixiConstants.mod.PRECISION.MEDIUM & String = js.native
}
