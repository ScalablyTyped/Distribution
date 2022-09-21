package typings.opentelemetryApi

import typings.opentelemetryApi.typesMod.Baggage
import typings.opentelemetryApi.typesMod.BaggageEntry
import typings.opentelemetryApi.typesMod.BaggageEntryMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@opentelemetry/api/build/src/baggage/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baggageEntryMetadataFromString(str: String): BaggageEntryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageEntryMetadataFromString")(str.asInstanceOf[js.Any]).asInstanceOf[BaggageEntryMetadata]
  
  inline def createBaggage(): Baggage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaggage")().asInstanceOf[Baggage]
  inline def createBaggage(entries: Record[String, BaggageEntry]): Baggage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaggage")(entries.asInstanceOf[js.Any]).asInstanceOf[Baggage]
}
