package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldDef extends StObject {
  
  var columnID: Double = js.native
  
  var dataTypeID: Double = js.native
  
  var dataTypeModifier: Double = js.native
  
  var dataTypeSize: Double = js.native
  
  var format: String = js.native
  
  var name: String = js.native
  
  var tableID: Double = js.native
}
object FieldDef {
  
  @scala.inline
  def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    tableID: Double
  ): FieldDef = {
    val __obj = js.Dynamic.literal(columnID = columnID.asInstanceOf[js.Any], dataTypeID = dataTypeID.asInstanceOf[js.Any], dataTypeModifier = dataTypeModifier.asInstanceOf[js.Any], dataTypeSize = dataTypeSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableID = tableID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDef]
  }
  
  @scala.inline
  implicit class FieldDefMutableBuilder[Self <: FieldDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnID(value: Double): Self = StObject.set(x, "columnID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeID(value: Double): Self = StObject.set(x, "dataTypeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeModifier(value: Double): Self = StObject.set(x, "dataTypeModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeSize(value: Double): Self = StObject.set(x, "dataTypeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableID(value: Double): Self = StObject.set(x, "tableID", value.asInstanceOf[js.Any])
  }
}
