package typings.opentelemetryCore

import typings.opentelemetryApi.buildSrcBaggageTypesMod.Baggage
import typings.opentelemetryApi.buildSrcBaggageTypesMod.BaggageEntryMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBaggageUtilsMod {
  
  @JSImport("@opentelemetry/core/build/src/baggage/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKeyPairs(baggage: Baggage): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairs")(baggage.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def parseKeyPairsIntoRecord(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyPairsIntoRecord")().asInstanceOf[Record[String, String]]
  inline def parseKeyPairsIntoRecord(value: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyPairsIntoRecord")(value.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def parsePairKeyValue(entry: String): js.UndefOr[ParsedBaggageKeyValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePairKeyValue")(entry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ParsedBaggageKeyValue]]
  
  inline def serializeKeyPairs(keyPairs: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeKeyPairs")(keyPairs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ParsedBaggageKeyValue extends StObject {
    
    var key: String
    
    var metadata: js.UndefOr[BaggageEntryMetadata] = js.undefined
    
    var value: String
  }
  object ParsedBaggageKeyValue {
    
    inline def apply(key: String, value: String): ParsedBaggageKeyValue = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedBaggageKeyValue]
    }
    
    extension [Self <: ParsedBaggageKeyValue](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: BaggageEntryMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
