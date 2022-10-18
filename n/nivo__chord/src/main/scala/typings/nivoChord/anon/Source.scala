package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: EndAngle
  
  var target: EndAngle
}
object Source {
  
  inline def apply(source: EndAngle, target: EndAngle): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: EndAngle): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: EndAngle): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
