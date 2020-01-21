package typings.nodeJsonDb

import typings.nodeJsonDb.utilsMod.KeyValue
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-json-db/dist/lib/ArrayInfo", JSImport.Namespace)
@js.native
object arrayInfoMod extends js.Object {
  @js.native
  class ArrayInfo protected () extends js.Object {
    def this(property: String, index: js.Any) = this()
    val append: Boolean = js.native
    val index: Double = js.native
    val property: String = js.native
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
    /**
      * Check if the ArrayInfo is valid for the given data
      * @param data
      */
    def isValid(data: KeyValue): Boolean = js.native
    /**
      * Set the data for the array
      * @param data
      * @param value
      */
    def setData(data: KeyValue, value: js.Any): Unit = js.native
  }
  
  def arrayRegex(): RegExp = js.native
  /* static members */
  @js.native
  object ArrayInfo extends js.Object {
    /**
      * Check if the property want to access an Array
      * @param property
      */
    def processArray(): ArrayInfo | Null = js.native
    def processArray(property: String): ArrayInfo | Null = js.native
  }
  
}

