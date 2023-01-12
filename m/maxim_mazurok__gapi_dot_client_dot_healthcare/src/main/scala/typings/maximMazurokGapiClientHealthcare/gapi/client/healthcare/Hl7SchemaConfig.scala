package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hl7SchemaConfig extends StObject {
  
  /** Map from each HL7v2 message type and trigger event pair, such as ADT_A04, to its schema configuration root group. */
  var messageSchemaConfigs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.healthcare.gapi.client.healthcare.SchemaGroup} */ js.Any
  ] = js.undefined
  
  /** Each VersionSource is tested and only if they all match is the schema used for the message. */
  var version: js.UndefOr[js.Array[VersionSource]] = js.undefined
}
object Hl7SchemaConfig {
  
  inline def apply(): Hl7SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hl7SchemaConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hl7SchemaConfig] (val x: Self) extends AnyVal {
    
    inline def setMessageSchemaConfigs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.healthcare.gapi.client.healthcare.SchemaGroup} */ js.Any
    ): Self = StObject.set(x, "messageSchemaConfigs", value.asInstanceOf[js.Any])
    
    inline def setMessageSchemaConfigsUndefined: Self = StObject.set(x, "messageSchemaConfigs", js.undefined)
    
    inline def setVersion(value: js.Array[VersionSource]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: VersionSource*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
