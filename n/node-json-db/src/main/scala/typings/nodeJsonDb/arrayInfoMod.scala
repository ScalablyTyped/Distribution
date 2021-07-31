package typings.nodeJsonDb

import typings.nodeJsonDb.utilsMod.KeyValue
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayInfoMod {
  
  @JSImport("node-json-db/dist/lib/ArrayInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("node-json-db/dist/lib/ArrayInfo", "ArrayInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check if the property want to access an Array
      * @param property
      */
    @scala.inline
    def processArray(): ArrayInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processArray")().asInstanceOf[ArrayInfo | Null]
    @scala.inline
    def processArray(property: String): ArrayInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("processArray")(property.asInstanceOf[js.Any]).asInstanceOf[ArrayInfo | Null]
  }
  
  @scala.inline
  def arrayRegex(): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRegex")().asInstanceOf[RegExp]
}
