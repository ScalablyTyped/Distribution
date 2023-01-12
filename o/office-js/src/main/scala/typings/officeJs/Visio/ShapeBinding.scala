package typings.officeJs.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Shape binding informations required for data visualizer diagram
  *
  * [Api set:  1.1]
  */
trait ShapeBinding extends StObject {
  
  /**
    *
    * Column for alternative text for shape.
    *
    * [Api set:  1.1]
    */
  var alternativeTextColumnName: String
  
  /**
    *
    * Column for Shape label.
    *
    * [Api set:  1.1]
    */
  var labelColumnName: String
  
  /**
    *
    * Unique Id column.
    *
    * [Api set:  1.1]
    */
  var uniqueIDColumnName: String
}
object ShapeBinding {
  
  inline def apply(alternativeTextColumnName: String, labelColumnName: String, uniqueIDColumnName: String): ShapeBinding = {
    val __obj = js.Dynamic.literal(alternativeTextColumnName = alternativeTextColumnName.asInstanceOf[js.Any], labelColumnName = labelColumnName.asInstanceOf[js.Any], uniqueIDColumnName = uniqueIDColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeBinding] (val x: Self) extends AnyVal {
    
    inline def setAlternativeTextColumnName(value: String): Self = StObject.set(x, "alternativeTextColumnName", value.asInstanceOf[js.Any])
    
    inline def setLabelColumnName(value: String): Self = StObject.set(x, "labelColumnName", value.asInstanceOf[js.Any])
    
    inline def setUniqueIDColumnName(value: String): Self = StObject.set(x, "uniqueIDColumnName", value.asInstanceOf[js.Any])
  }
}
