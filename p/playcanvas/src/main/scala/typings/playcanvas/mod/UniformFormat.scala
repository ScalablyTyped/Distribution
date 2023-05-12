package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class storing description of an individual uniform, stored inside a uniform buffer.
  *
  * @ignore
  */
trait UniformFormat extends StObject {
  
  /** @type {number} */
  var byteSize: Double
  
  def calculateOffset(offset: Any): Unit
  
  /**
    * Count of elements for arrays, otherwise 0.
    *
    * @type {number}
    */
  var count: Double
  
  var invalid: Boolean
  
  /** @type {string} */
  var name: String
  
  /**
    * Index of the uniform in an array of 32bit values (Float32Array and similar)
    *
    * @type {number}
    */
  var offset: Double
  
  /** @type {import('./scope-id.js').ScopeId} */
  var scopeId: ScopeId
  
  var shortName: Any
  
  /** @type {number} */
  var `type`: Double
  
  var updateType: Any
}
object UniformFormat {
  
  inline def apply(
    byteSize: Double,
    calculateOffset: Any => Unit,
    count: Double,
    invalid: Boolean,
    name: String,
    offset: Double,
    scopeId: ScopeId,
    shortName: Any,
    `type`: Double,
    updateType: Any
  ): UniformFormat = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], calculateOffset = js.Any.fromFunction1(calculateOffset), count = count.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniformFormat] (val x: Self) extends AnyVal {
    
    inline def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
    
    inline def setCalculateOffset(value: Any => Unit): Self = StObject.set(x, "calculateOffset", js.Any.fromFunction1(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setScopeId(value: ScopeId): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: Any): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateType(value: Any): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
