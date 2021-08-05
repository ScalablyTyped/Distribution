package typings.nodes7

import org.scalablytyped.runtime.StringDictionary
import typings.nodes7.nodes7Strings._COMMERR
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodes7", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with NodeS7 {
    def this(opts: Options) = this()
  }
  
  trait ConnectionOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var localTSAP: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var rack: js.UndefOr[Double] = js.undefined
    
    var remoteTSAP: js.UndefOr[Double] = js.undefined
    
    var slot: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocalTSAP(value: Double): Self = StObject.set(x, "localTSAP", value.asInstanceOf[js.Any])
      
      inline def setLocalTSAPUndefined: Self = StObject.set(x, "localTSAP", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRack(value: Double): Self = StObject.set(x, "rack", value.asInstanceOf[js.Any])
      
      inline def setRackUndefined: Self = StObject.set(x, "rack", js.undefined)
      
      inline def setRemoteTSAP(value: Double): Self = StObject.set(x, "remoteTSAP", value.asInstanceOf[js.Any])
      
      inline def setRemoteTSAPUndefined: Self = StObject.set(x, "remoteTSAP", js.undefined)
      
      inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type ItemList = String | _COMMERR
  
  @js.native
  trait NodeS7 extends StObject {
    
    def addItems(items: js.Array[ItemList]): Unit = js.native
    /**
      * Adds `items` to the internal read polling list.
      *
      * If `items` includes the value `_COMMERR` it will return current communication status.
      *
      * @param items Items to add
      */
    def addItems(items: ItemList): Unit = js.native
    
    /**
      * Disconnects from a PLC. This simply terminates the TCP connection.
      * @param callback The callback is called upon completion of the close.
      */
    def dropConnection(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Connects to a plc
      * @param options Contains options for the current connection only
      * @param callback err is either an error object, or undefined on successful connection.
      */
    def initiateConnection(options: ConnectionOptions, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    /**
      * Reads the internal polling list and calls `callback` when done
      *
      * @param callback err: `true` if ANY of the items have "bad quality" values: an object containing the values being read as keys and their value (from the PLC) as the value
      */
    def readAllItems(callback: js.Function2[/* err */ Boolean, /* values */ ReadValues, Unit]): Unit = js.native
    
    /**
      * Removes `items` to the internal read polling list.
      *
      * If `items` is not defined then all items are removed.
      *
      * @param items Items to remove
      */
    def removeItems(): Unit = js.native
    def removeItems(items: String): Unit = js.native
    def removeItems(items: js.Array[String]): Unit = js.native
    
    /**
      * Sets a callback for name - address translation.
      *
      * @remarks
      * This is optional - you can choose to use "addItem" etc with absolute addresses.
      *
      * If you use it, translator should be a function that takes a string as an argument, and returns a string in the
      * following format: `<data block number.><memory area><data type><byte offset><.array length>`
      *
      * Examples:
      *
      * - MR30 - MD30 as REAL
      * - DB10,LR32 - LREAL at byte offset 32 in DB10, for 1200/1500 only
      * - DB10,INT6 - DB10.DBW6 as INT
      * - DB10,I6 -same as above
      * - DB10,INT6.2 - DB10.DBW6 and DB10.DBW8 in an array with length 2
      * - PIW30 - PIW30 as INT
      * - DB10,S20.30 - String at offset 20 with length of 30 (actual array length 32 due to format of String type, length byte will be read/written)
      * - DB10,S20.30.3 - Array of 3 strings at offset 20, each with length of 30 (actual array length 32 due to format of String type, length byte will be read/written)
      * - DB10,C22.30 - Character array at offset 22 with length of 30 (best to not use this with strings as length byte is ignored)
      * - DB10,DT0 - Date and time
      * - DB10,DTZ0 - Date and time in UTC
      * - DB10,DTL0 - DTL in newer PLCs
      * - DB10,DTLZ0 - DTL in newer PLCs in UTC
      *
      * The DT type is the well-known DATE_AND_TIME type of S7-300/400 PLCs, a 8-byte-wide field with BCD-encoded parts
      *
      * The DTZ type is the same as the DT, but it expects that the timestamp is in UTC in the PLC (usually NOT the case)
      *
      * The DTL type is the one seen on newer S7-1200/1500 PLCs, is 12-byte long and encodes the timestamp differently
      * than the older DATE_AND_TIME
      *
      * The DTLZ type is also the same as the DTL, but expecting the timestamp in UTC in the PLC
      *
      * In the example above, an object is declared and the translator references that object. It could just as reference
      * a file or database. In any case, it allows cleaner Javascript code to be written that refers to a name instead of
      * an absolute address.
      * @param translator Function that converts names to address strings
      */
    def setTranslationCB(translator: js.Function1[/* name */ String, js.UndefOr[String]]): Unit = js.native
    
    /**
      * Writes the item to the PLC using the corresponding value and calls callback when done.
      *
      * You should monitor the return value - if it is non-zero, the write will not be processed as there is already one
      * it progress, and the callback will not be called.
      *
      * @param item The item to write
      * @param value The corresponding value
      * @param callback err: `true` if ANY of the items have "bad quality"
      */
    def writeItems(item: String, value: S7Types, callback: js.Function1[/* err */ Boolean, Unit]): Double = js.native
    /**
      * Writes items to the PLC using the corresponding values and calls callback when done.
      *
      * You should monitor the return value - if it is non-zero, the write will not be processed as there is already one
      * it progress, and the callback will not be called.
      *
      * @param items The items to write
      * @param values The corresponding values to the items
      * @param callback err: `true` if ANY of the items have "bad quality"
      */
    def writeItems(
      items: js.Array[String],
      values: js.Array[S7Types],
      callback: js.Function1[/* err */ Boolean, Unit]
    ): Double = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * If set to true, the NodeS7 library will output additional data to the console.
      *
      * This option is global and shared between instances of the NodeS7 class
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, the NodeS7 library will not output anything to the console.
      *
      * This option is global and shared between instances of the NodeS7 class
      */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type ReadValues = StringDictionary[S7Types]
  
  type S7Types = String | Double | Boolean
}
