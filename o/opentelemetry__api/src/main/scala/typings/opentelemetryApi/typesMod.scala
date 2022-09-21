package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Baggage extends StObject {
    
    /**
      * Returns a new baggage with no entries
      */
    def clear(): Baggage
    
    /**
      * Get a list of all entries in the Baggage
      */
    def getAllEntries(): js.Array[js.Tuple2[String, BaggageEntry]]
    
    /**
      * Get an entry from Baggage if it exists
      *
      * @param key The key which identifies the BaggageEntry
      */
    def getEntry(key: String): js.UndefOr[BaggageEntry]
    
    /**
      * Returns a new baggage with the entries from the current bag except the removed entries
      *
      * @param key keys identifying the entries to be removed
      */
    def removeEntries(key: String*): Baggage
    
    /**
      * Returns a new baggage with the entries from the current bag except the removed entry
      *
      * @param key key identifying the entry to be removed
      */
    def removeEntry(key: String): Baggage
    
    /**
      * Returns a new baggage with the entries from the current bag and the specified entry
      *
      * @param key string which identifies the baggage entry
      * @param entry BaggageEntry for the given key
      */
    def setEntry(key: String, entry: BaggageEntry): Baggage
  }
  object Baggage {
    
    inline def apply(
      clear: () => Baggage,
      getAllEntries: () => js.Array[js.Tuple2[String, BaggageEntry]],
      getEntry: String => js.UndefOr[BaggageEntry],
      removeEntries: /* repeated */ String => Baggage,
      removeEntry: String => Baggage,
      setEntry: (String, BaggageEntry) => Baggage
    ): Baggage = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getAllEntries = js.Any.fromFunction0(getAllEntries), getEntry = js.Any.fromFunction1(getEntry), removeEntries = js.Any.fromFunction1(removeEntries), removeEntry = js.Any.fromFunction1(removeEntry), setEntry = js.Any.fromFunction2(setEntry))
      __obj.asInstanceOf[Baggage]
    }
    
    extension [Self <: Baggage](x: Self) {
      
      inline def setClear(value: () => Baggage): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGetAllEntries(value: () => js.Array[js.Tuple2[String, BaggageEntry]]): Self = StObject.set(x, "getAllEntries", js.Any.fromFunction0(value))
      
      inline def setGetEntry(value: String => js.UndefOr[BaggageEntry]): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
      
      inline def setRemoveEntries(value: /* repeated */ String => Baggage): Self = StObject.set(x, "removeEntries", js.Any.fromFunction1(value))
      
      inline def setRemoveEntry(value: String => Baggage): Self = StObject.set(x, "removeEntry", js.Any.fromFunction1(value))
      
      inline def setSetEntry(value: (String, BaggageEntry) => Baggage): Self = StObject.set(x, "setEntry", js.Any.fromFunction2(value))
    }
  }
  
  trait BaggageEntry extends StObject {
    
    /**
      * Metadata is an optional string property defined by the W3C baggage specification.
      * It currently has no special meaning defined by the specification.
      */
    var metadata: js.UndefOr[BaggageEntryMetadata] = js.undefined
    
    /** `String` value of the `BaggageEntry`. */
    var value: String
  }
  object BaggageEntry {
    
    inline def apply(value: String): BaggageEntry = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaggageEntry]
    }
    
    extension [Self <: BaggageEntry](x: Self) {
      
      inline def setMetadata(value: BaggageEntryMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaggageEntryMetadata extends StObject {
    
    var __TYPE__ : js.Symbol
  }
  object BaggageEntryMetadata {
    
    inline def apply(__TYPE__ : js.Symbol): BaggageEntryMetadata = {
      val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaggageEntryMetadata]
    }
    
    extension [Self <: BaggageEntryMetadata](x: Self) {
      
      inline def set__TYPE__(value: js.Symbol): Self = StObject.set(x, "__TYPE__", value.asInstanceOf[js.Any])
    }
  }
}
