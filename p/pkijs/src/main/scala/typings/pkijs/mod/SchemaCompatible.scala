package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompatible extends StObject {
  
  /**
    * Converts parsed ASN.1 object into current class
    * @param schema
    */
  def fromSchema(schema: SchemaType): Unit
  
  def toJSON(): Any
  
  /**
    * Convert current object to asn1js object and set correct values
    * @returns asn1js object
    */
  def toSchema(): SchemaType
}
object SchemaCompatible {
  
  inline def apply(fromSchema: SchemaType => Unit, toJSON: () => Any, toSchema: () => SchemaType): SchemaCompatible = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[SchemaCompatible]
  }
  
  extension [Self <: SchemaCompatible](x: Self) {
    
    inline def setFromSchema(value: SchemaType => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToSchema(value: () => SchemaType): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
  }
}
