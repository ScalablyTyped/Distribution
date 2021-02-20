package typings.nodeJsonDb

import typings.nodeJsonDb.utilsMod.KeyValue
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayInfoMod {
  
  @JSImport("node-json-db/dist/lib/ArrayInfo", "ArrayInfo")
  @js.native
  class ArrayInfo protected () extends StObject {
    def this(property: String, index: js.Any) = this()
    
    val append: Boolean = js.native
    
    /**
      * Delete the index from the array
      * @param data
      */
    def delete(data: KeyValue): Unit = js.native
    
    /**
      * Get the Data
      * @param data
      */
    def getData(data: KeyValue): js.Any = js.native
    
    /**
      * Get the index for the array
      * @param data
      * @param avoidProperty
      */
    def getIndex(data: KeyValue): Double = js.native
    def getIndex(data: KeyValue, avoidProperty: Boolean): Double = js.native
    
    val index: Double = js.native
    
    /**
      * Check if the ArrayInfo is valid for the given data
      * @param data
      */
    def isValid(data: KeyValue): Boolean = js.native
    
    val property: String = js.native
    
    /**
      * Set the data for the array
      * @param data
      * @param value
      */
    def setData(data: KeyValue, value: js.Any): Unit = js.native
  }
  /* static members */
  object ArrayInfo {
    
    /**
      * Check if the property want to access an Array
      * @param property
      */
    @JSImport("node-json-db/dist/lib/ArrayInfo", "ArrayInfo.processArray")
    @js.native
    def processArray(): ArrayInfo | Null = js.native
    @JSImport("node-json-db/dist/lib/ArrayInfo", "ArrayInfo.processArray")
    @js.native
    def processArray(property: String): ArrayInfo | Null = js.native
  }
  
  @JSImport("node-json-db/dist/lib/ArrayInfo", "arrayRegex")
  @js.native
  def arrayRegex(): RegExp = js.native
}
