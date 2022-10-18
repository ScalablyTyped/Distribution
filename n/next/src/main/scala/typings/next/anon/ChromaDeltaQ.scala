package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextInts.`-1`
import typings.next.nextInts.`33`
import typings.next.nextInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromaDeltaQ extends StObject {
  
  val chromaDeltaQ: `false`
  
  val cqAlphaLevel: `-1`
  
  val cqLevel: `33`
  
  val denoiseLevel: typings.next.nextInts.`0`
  
  val sharpness: typings.next.nextInts.`0`
  
  val speed: `6`
  
  val subsample: typings.next.nextInts.`1`
  
  val tileColsLog2: typings.next.nextInts.`0`
  
  val tileRowsLog2: typings.next.nextInts.`0`
  
  val tune: typings.next.nextInts.`0`
}
object ChromaDeltaQ {
  
  inline def apply(): ChromaDeltaQ = {
    val __obj = js.Dynamic.literal(chromaDeltaQ = false, cqAlphaLevel = -1, cqLevel = 33, denoiseLevel = 0, sharpness = 0, speed = 6, subsample = 1, tileColsLog2 = 0, tileRowsLog2 = 0, tune = 0)
    __obj.asInstanceOf[ChromaDeltaQ]
  }
  
  extension [Self <: ChromaDeltaQ](x: Self) {
    
    inline def setChromaDeltaQ(value: `false`): Self = StObject.set(x, "chromaDeltaQ", value.asInstanceOf[js.Any])
    
    inline def setCqAlphaLevel(value: `-1`): Self = StObject.set(x, "cqAlphaLevel", value.asInstanceOf[js.Any])
    
    inline def setCqLevel(value: `33`): Self = StObject.set(x, "cqLevel", value.asInstanceOf[js.Any])
    
    inline def setDenoiseLevel(value: typings.next.nextInts.`0`): Self = StObject.set(x, "denoiseLevel", value.asInstanceOf[js.Any])
    
    inline def setSharpness(value: typings.next.nextInts.`0`): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: `6`): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSubsample(value: typings.next.nextInts.`1`): Self = StObject.set(x, "subsample", value.asInstanceOf[js.Any])
    
    inline def setTileColsLog2(value: typings.next.nextInts.`0`): Self = StObject.set(x, "tileColsLog2", value.asInstanceOf[js.Any])
    
    inline def setTileRowsLog2(value: typings.next.nextInts.`0`): Self = StObject.set(x, "tileRowsLog2", value.asInstanceOf[js.Any])
    
    inline def setTune(value: typings.next.nextInts.`0`): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
  }
}
