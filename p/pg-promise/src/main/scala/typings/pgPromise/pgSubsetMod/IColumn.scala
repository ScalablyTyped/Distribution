package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn extends StObject {
  
  var columnID: Double
  
  var dataTypeID: Double
  
  var dataTypeModifier: Double
  
  var dataTypeSize: Double
  
  var format: String
  
  var name: String
  
  var oid: Double
  
  // NOTE: properties below are not available within Native Bindings:
  var tableID: Double
}
object IColumn {
  
  @scala.inline
  def apply(
    columnID: Double,
    dataTypeID: Double,
    dataTypeModifier: Double,
    dataTypeSize: Double,
    format: String,
    name: String,
    oid: Double,
    tableID: Double
  ): IColumn = {
    val __obj = js.Dynamic.literal(columnID = columnID.asInstanceOf[js.Any], dataTypeID = dataTypeID.asInstanceOf[js.Any], dataTypeModifier = dataTypeModifier.asInstanceOf[js.Any], dataTypeSize = dataTypeSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], tableID = tableID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  @scala.inline
  implicit class IColumnMutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
    
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
    def setOid(value: Double): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableID(value: Double): Self = StObject.set(x, "tableID", value.asInstanceOf[js.Any])
  }
}
