package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: StartAngle
  
  var target: StartAngle
}
object Source {
  
  inline def apply(source: StartAngle, target: StartAngle): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: StartAngle): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: StartAngle): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
