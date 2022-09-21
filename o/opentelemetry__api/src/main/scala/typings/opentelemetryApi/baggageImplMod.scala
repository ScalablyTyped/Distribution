package typings.opentelemetryApi

import typings.opentelemetryApi.typesMod.Baggage
import typings.opentelemetryApi.typesMod.BaggageEntry
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baggageImplMod {
  
  @JSImport("@opentelemetry/api/build/src/baggage/internal/baggage-impl", "BaggageImpl")
  @js.native
  open class BaggageImpl ()
    extends StObject
       with Baggage {
    def this(entries: Map[String, BaggageEntry]) = this()
    
    /* private */ var _entries: Any = js.native
    
    /**
      * Returns a new baggage with no entries
      */
    /* CompleteClass */
    override def clear(): Baggage = js.native
    
    /**
      * Get a list of all entries in the Baggage
      */
    /* CompleteClass */
    override def getAllEntries(): js.Array[js.Tuple2[String, BaggageEntry]] = js.native
    
    /**
      * Get an entry from Baggage if it exists
      *
      * @param key The key which identifies the BaggageEntry
      */
    /* CompleteClass */
    override def getEntry(key: String): js.UndefOr[BaggageEntry] = js.native
    
    /**
      * Returns a new baggage with the entries from the current bag except the removed entries
      *
      * @param key keys identifying the entries to be removed
      */
    /* CompleteClass */
    override def removeEntries(key: String*): Baggage = js.native
    
    /**
      * Returns a new baggage with the entries from the current bag except the removed entry
      *
      * @param key key identifying the entry to be removed
      */
    /* CompleteClass */
    override def removeEntry(key: String): Baggage = js.native
    
    /**
      * Returns a new baggage with the entries from the current bag and the specified entry
      *
      * @param key string which identifies the baggage entry
      * @param entry BaggageEntry for the given key
      */
    /* CompleteClass */
    override def setEntry(key: String, entry: BaggageEntry): Baggage = js.native
  }
}
