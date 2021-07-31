package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypeField extends StObject {
  
  /** The different supported formats for each field in a data type. */
  var format: js.UndefOr[String] = js.undefined
  
  /** Defines the name and format of data. Unlike data type names, field names are not namespaced, and only need to be unique within the data type. */
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
}
object DataTypeField {
  
  @scala.inline
  def apply(): DataTypeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypeField]
  }
  
  @scala.inline
  implicit class DataTypeFieldMutableBuilder[Self <: DataTypeField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
