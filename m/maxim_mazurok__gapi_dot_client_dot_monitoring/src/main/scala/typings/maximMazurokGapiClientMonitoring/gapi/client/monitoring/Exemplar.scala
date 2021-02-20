package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exemplar extends StObject {
  
  /**
    * Contextual information about the example value. Examples are:Trace: type.googleapis.com/google.monitoring.v3.SpanContextLiteral string:
    * type.googleapis.com/google.protobuf.StringValueLabels dropped during aggregation: type.googleapis.com/google.monitoring.v3.DroppedLabelsThere may be only a single attachment of any
    * given message type in a single exemplar, and this is enforced by the system.
    */
  var attachments: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.Exemplar with TopLevel[js.Any]
    ]
  ] = js.native
  
  /** The observation (sampling) time of the above value. */
  var timestamp: js.UndefOr[String] = js.native
  
  /** Value of the exemplar point. This value determines to which bucket the exemplar belongs. */
  var value: js.UndefOr[Double] = js.native
}
object Exemplar {
  
  @scala.inline
  def apply(): Exemplar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exemplar]
  }
  
  @scala.inline
  implicit class ExemplarMutableBuilder[Self <: Exemplar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.Exemplar with TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.Exemplar with TopLevel[js.Any])*
    ): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
