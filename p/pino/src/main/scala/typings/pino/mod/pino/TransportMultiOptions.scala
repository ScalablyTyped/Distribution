package typings.pino.mod.pino

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportMultiOptions[TransportOptions]
  extends StObject
     with TransportBaseOptions[TransportOptions] {
  
  var dedupe: js.UndefOr[Boolean] = js.undefined
  
  var levels: js.UndefOr[Record[String, Double]] = js.undefined
  
  var targets: js.Array[TransportTargetOptions[TransportOptions]]
}
object TransportMultiOptions {
  
  inline def apply[TransportOptions](targets: js.Array[TransportTargetOptions[TransportOptions]]): TransportMultiOptions[TransportOptions] = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportMultiOptions[TransportOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransportMultiOptions[?], TransportOptions] (val x: Self & TransportMultiOptions[TransportOptions]) extends AnyVal {
    
    inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
    
    inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
    
    inline def setLevels(value: Record[String, Double]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setTargets(value: js.Array[TransportTargetOptions[TransportOptions]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: TransportTargetOptions[TransportOptions]*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
