package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventComposite[T]
  extends StObject
     with IEvent[T] {
  
  /**
    * EventObjects (may be a single body, constraint, composite or a mixed array of these)
    */
  var `object`: js.Any
}
object IEventComposite {
  
  inline def apply[T](name: String, `object`: js.Any, source: T): IEventComposite[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventComposite[T]]
  }
  
  extension [Self <: IEventComposite[?], T](x: Self & IEventComposite[T]) {
    
    inline def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
