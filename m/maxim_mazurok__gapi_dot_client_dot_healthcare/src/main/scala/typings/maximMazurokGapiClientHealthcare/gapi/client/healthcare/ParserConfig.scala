package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserConfig extends StObject {
  
  /** Determines whether messages with no header are allowed. */
  var allowNullHeader: js.UndefOr[Boolean] = js.undefined
  
  /** Schemas used to parse messages in this store, if schematized parsing is desired. */
  var schema: js.UndefOr[SchemaPackage] = js.undefined
  
  /** Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator, matching the HL7 version 2 specification. */
  var segmentTerminator: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is
    * immutable after HL7v2 store creation.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ParserConfig {
  
  inline def apply(): ParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserConfig]
  }
  
  extension [Self <: ParserConfig](x: Self) {
    
    inline def setAllowNullHeader(value: Boolean): Self = StObject.set(x, "allowNullHeader", value.asInstanceOf[js.Any])
    
    inline def setAllowNullHeaderUndefined: Self = StObject.set(x, "allowNullHeader", js.undefined)
    
    inline def setSchema(value: SchemaPackage): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSegmentTerminator(value: String): Self = StObject.set(x, "segmentTerminator", value.asInstanceOf[js.Any])
    
    inline def setSegmentTerminatorUndefined: Self = StObject.set(x, "segmentTerminator", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
