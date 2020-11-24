package typings.nodeTlv.mod

import typings.node.Buffer
import typings.nodeTlv.anon.Clazz
import typings.nodeTlv.nodeTlvNumbers.`0`
import typings.nodeTlv.nodeTlvNumbers.`1`
import typings.nodeTlv.nodeTlvStrings.ascii
import typings.nodeTlv.nodeTlvStrings.buffer
import typings.nodeTlv.nodeTlvStrings.hex
import typings.nodeTlv.nodeTlvStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLV extends js.Object {
  
  var bLength: Buffer = js.native
  
  var bTag: Buffer = js.native
  
  var bValue: Buffer = js.native
  
  var child: js.Array[TLV] = js.native
  
  /**
    * Command used with ALV tags
    */
  var desc: js.UndefOr[js.Function1[/* tlv */ this.type, js.Array[String]]] = js.native
  
  var encodingMode: `0` | `1` = js.native
  
  /**
    * Find tlv object.
    */
  def find(tag: String): TLV = js.native
  def find(tag: Double): TLV = js.native
  
  /**
    * Find tlv object.
    */
  def findAll(tag: String): js.Array[TLV] = js.native
  def findAll(tag: Double): js.Array[TLV] = js.native
  
  /**
    * Get child TLV objects.
    */
  def getChild(): js.Array[TLV] = js.native
  
  /**
    * Command used with ALV tags
    */
  var getCommand: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  
  /**
    * Return the value of the encoding of the TLV.
    */
  def getEncoding(): Double = js.native
  
  /**
    * Return the value of the length field as a hex string
    *
    * @param flag When true measures the length of the value, when false measures the length of the buffer value
    */
  def getL(): String = js.native
  def getL(flag: Boolean): String = js.native
  
  /**
    * Return the value of the length, value field as a hex string
    *
    * @param flag When true measures the length of the value, when false measures the length of the buffer value
    */
  def getLV(): String = js.native
  def getLV(flag: Boolean): String = js.native
  
  /**
    * Return the value of the length field of the TLV.
    *
    * @param encoding return type ('number' / 'hex' / 'buffer'). 'number' is default
    */
  def getLength(): Double = js.native
  @JSName("getLength")
  def getLength_buffer(encoding: buffer): Buffer = js.native
  @JSName("getLength")
  def getLength_hex(encoding: hex): String = js.native
  @JSName("getLength")
  def getLength_number(encoding: number): Double = js.native
  
  /**
    * Return the name of the TLV.
    */
  def getName(): String = js.native
  
  /**
    * Return the length of the TLV (tag + length + value)
    */
  def getSize(): Double = js.native
  
  /**
    * Return the value of the tag, length fields as a hex string
    */
  def getTL(): String = js.native
  
  /**
    * Return the value of the tag, length, value field as a hex string
    */
  def getTLV(): String = js.native
  
  /**
    * Return the value of the tag, length fields as a hex string
    */
  def getTV(): String = js.native
  
  /**
    * Return the value of the tag field of the TLV.
    *
    * @param encoding return type ('number' / 'hex' / 'buffer'). 'hex' is default
    */
  def getTag(): String = js.native
  @JSName("getTag")
  def getTag_buffer(encoding: buffer): Buffer = js.native
  @JSName("getTag")
  def getTag_hex(encoding: hex): String = js.native
  @JSName("getTag")
  def getTag_number(encoding: number): Double = js.native
  
  /**
    * Get Child TLV objects.
    */
  def getTlvByTag(tag: String): js.Array[TLV] = js.native
  def getTlvByTag(tag: Double): js.Array[TLV] = js.native
  
  /**
    * Return the value of the value field of the TLV.
    */
  def getValue(): String = js.native
  @JSName("getValue")
  def getValue_ascii(encoding: ascii): String = js.native
  @JSName("getValue")
  def getValue_buffer(encoding: buffer): Buffer = js.native
  @JSName("getValue")
  def getValue_hex(encoding: hex): String = js.native
  
  var info: Clazz = js.native
  
  var isConstructed: Boolean = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  /**
    * @returns DOL
    */
  def parseDolValue(): DOL = js.native
  
  /**
    * Print the TLV structure.
    *
    * @param indent tab space. Defaults to 0
    */
  def print(): Unit = js.native
  def print(indent: Double): Unit = js.native
  
  /**
    * Print the TLV structure.
    * @deprecated Use print
    * @param indent tab space. Defaults to 0
    */
  def print2(): Unit = js.native
  def print2(indent: Double): Unit = js.native
  
  /**
    * Size:  tag length , length length, value length
    * Combined length of tag, length and value field
    */
  var size: Double = js.native
  
  var tag: String = js.native
  
  var value: String = js.native
}
