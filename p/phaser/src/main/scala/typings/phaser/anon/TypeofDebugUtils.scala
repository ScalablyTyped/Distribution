package typings.phaser.anon

import typings.phaser.spine.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDebugUtils extends StObject {
  
  /* static member */
  def logBones(skeleton: Skeleton): Unit
}
object TypeofDebugUtils {
  
  inline def apply(logBones: Skeleton => Unit): TypeofDebugUtils = {
    val __obj = js.Dynamic.literal(logBones = js.Any.fromFunction1(logBones))
    __obj.asInstanceOf[TypeofDebugUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDebugUtils] (val x: Self) extends AnyVal {
    
    inline def setLogBones(value: Skeleton => Unit): Self = StObject.set(x, "logBones", js.Any.fromFunction1(value))
  }
}
