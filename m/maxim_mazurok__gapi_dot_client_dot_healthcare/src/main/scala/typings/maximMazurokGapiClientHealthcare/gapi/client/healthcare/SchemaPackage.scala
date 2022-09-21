package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackage extends StObject {
  
  /** Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent. */
  var ignoreMinOccurs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same
    * message type and trigger event if their VersionSources all match an incoming message.
    */
  var schemas: js.UndefOr[js.Array[Hl7SchemaConfig]] = js.undefined
  
  /** Determines how messages that fail to parse are handled. */
  var schematizedParsingType: js.UndefOr[String] = js.undefined
  
  /**
    * Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices
    * with the same type name if their VersionSources all match an incoming message.
    */
  var types: js.UndefOr[js.Array[Hl7TypesConfig]] = js.undefined
  
  /** Determines how unexpected segments (segments not matched to the schema) are handled. */
  var unexpectedSegmentHandling: js.UndefOr[String] = js.undefined
}
object SchemaPackage {
  
  inline def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  
  extension [Self <: SchemaPackage](x: Self) {
    
    inline def setIgnoreMinOccurs(value: Boolean): Self = StObject.set(x, "ignoreMinOccurs", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMinOccursUndefined: Self = StObject.set(x, "ignoreMinOccurs", js.undefined)
    
    inline def setSchemas(value: js.Array[Hl7SchemaConfig]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: Hl7SchemaConfig*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setSchematizedParsingType(value: String): Self = StObject.set(x, "schematizedParsingType", value.asInstanceOf[js.Any])
    
    inline def setSchematizedParsingTypeUndefined: Self = StObject.set(x, "schematizedParsingType", js.undefined)
    
    inline def setTypes(value: js.Array[Hl7TypesConfig]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: Hl7TypesConfig*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUnexpectedSegmentHandling(value: String): Self = StObject.set(x, "unexpectedSegmentHandling", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedSegmentHandlingUndefined: Self = StObject.set(x, "unexpectedSegmentHandling", js.undefined)
  }
}
