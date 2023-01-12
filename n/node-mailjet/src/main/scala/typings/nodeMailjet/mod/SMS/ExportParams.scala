package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportParams extends StObject {
  
  var FromTS: Double
  
  var ToTS: Double
}
object ExportParams {
  
  inline def apply(FromTS: Double, ToTS: Double): ExportParams = {
    val __obj = js.Dynamic.literal(FromTS = FromTS.asInstanceOf[js.Any], ToTS = ToTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportParams] (val x: Self) extends AnyVal {
    
    inline def setFromTS(value: Double): Self = StObject.set(x, "FromTS", value.asInstanceOf[js.Any])
    
    inline def setToTS(value: Double): Self = StObject.set(x, "ToTS", value.asInstanceOf[js.Any])
  }
}
