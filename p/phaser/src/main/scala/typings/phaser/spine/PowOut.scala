package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowOut
  extends StObject
     with Pow
object PowOut {
  
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double, power: Double): PowOut = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal), power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowOut]
  }
}
