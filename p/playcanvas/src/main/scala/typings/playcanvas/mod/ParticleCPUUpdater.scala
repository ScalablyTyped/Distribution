package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleCPUUpdater extends StObject {
  
  var _emitter: Any
  
  def calcSpawnPosition(particleTex: Any, spawnMatrix: Any, extentsInnerRatioUniform: Any, emitterPos: Any, i: Any): Unit
  
  def update(
    data: Any,
    vbToSort: Any,
    particleTex: Any,
    spawnMatrix: Any,
    extentsInnerRatioUniform: Any,
    emitterPos: Any,
    delta: Any,
    isOnStop: Any
  ): Unit
}
object ParticleCPUUpdater {
  
  inline def apply(
    _emitter: Any,
    calcSpawnPosition: (Any, Any, Any, Any, Any) => Unit,
    update: (Any, Any, Any, Any, Any, Any, Any, Any) => Unit
  ): ParticleCPUUpdater = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], calcSpawnPosition = js.Any.fromFunction5(calcSpawnPosition), update = js.Any.fromFunction8(update))
    __obj.asInstanceOf[ParticleCPUUpdater]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticleCPUUpdater] (val x: Self) extends AnyVal {
    
    inline def setCalcSpawnPosition(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "calcSpawnPosition", js.Any.fromFunction5(value))
    
    inline def setUpdate(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction8(value))
    
    inline def set_emitter(value: Any): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
  }
}
