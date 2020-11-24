package typings.nodeTlv.mod

import typings.node.Buffer
import typings.nodeTlv.nodeTlvNumbers.`0`
import typings.nodeTlv.nodeTlvNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-tlv", JSImport.Namespace)
@js.native
class ^ protected () extends TLV {
  // @param value Source code docs say "string" only but can support a "Buffer" as well
  // Source code has tests to use a buffer as a value
  def this(tag: String, value: String) = this()
  def this(tag: String, value: Buffer) = this()
  def this(tag: Double, value: String) = this()
  def this(tag: Double, value: Buffer) = this()
  def this(tag: String, value: String, encoding: Double) = this()
  def this(tag: String, value: Buffer, encoding: Double) = this()
  def this(tag: Double, value: String, encoding: Double) = this()
  def this(tag: Double, value: Buffer, encoding: Double) = this()
}
@JSImport("node-tlv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var DGI: `1` = js.native
  
  // FIXME:  Not sure how to make a property of a class as static class and not the instantiated object
  // Have split the class into two interfaces
  var DOL: typings.nodeTlv.mod.DOL = js.native
  
  var EMV: `0` = js.native
  
  /**
    * Return value of the length field as a hex string.
    */
  def L(value: String): String = js.native
  def L(value: String, flag: Boolean): String = js.native
  def L(value: Buffer): String = js.native
  def L(value: Buffer, flag: Boolean): String = js.native
  
  /**
    * Return value of the length field and the value field as hex string
    */
  def LV(value: String): String = js.native
  def LV(value: String, flag: Boolean): String = js.native
  def LV(value: Buffer): String = js.native
  def LV(value: Buffer, flag: Boolean): String = js.native
  
  /**
    * Return value of the length field as a hex string
    */
  def T(tag: String): String = js.native
  def T(tag: Double): String = js.native
  def T(tag: Buffer): String = js.native
  
  var TL: typings.nodeTlv.mod.TL = js.native
  
  def TLV(tag: String, value: String): String = js.native
  def TLV(tag: String, value: String, encoding: Double): String = js.native
  def TLV(tag: Double, value: String): String = js.native
  def TLV(tag: Double, value: String, encoding: Double): String = js.native
  
  /**
    * Return value of the value field as string
    */
  def V(value: String): String = js.native
  
  def adjustLength(): Double = js.native
  def adjustLength(length: String): Double = js.native
  def adjustLength(length: Double): Double = js.native
  
  def adjustTag(): String = js.native
  def adjustTag(tag: js.UndefOr[scala.Nothing], encoding: Double): String = js.native
  def adjustTag(tag: String): String = js.native
  def adjustTag(tag: String, encoding: Double): String = js.native
  def adjustTag(tag: Double): String = js.native
  def adjustTag(tag: Double, encoding: Double): String = js.native
  def adjustTag(tag: Buffer): String = js.native
  def adjustTag(tag: Buffer, encoding: Double): String = js.native
  
  def adjustValue(): String = js.native
  def adjustValue(value: String): String = js.native
  def adjustValue(value: Buffer): String = js.native
  
  def getBufferLength(len: Double): Buffer = js.native
  def getBufferLength(len: Double, encoding: Double): Buffer = js.native
  
  def getBufferTag(buf: Buffer, encoding: Double): Buffer = js.native
  
  def getName(tag: String): String = js.native
  /**
    * Return the name of the TLV.
    */
  def getName(tag: Double): String = js.native
  
  def log(): Unit = js.native
  
  /**
    * Parse
    * @param data TAG, LENGTH, VALUE hex string
    */
  def parse(): TLV = js.native
  def parse(data: js.UndefOr[scala.Nothing], encoding: Double): TLV = js.native
  def parse(data: String): TLV = js.native
  def parse(data: String, encoding: Double): TLV = js.native
  def parse(data: Buffer): TLV = js.native
  def parse(data: Buffer, encoding: Double): TLV = js.native
  
  /**
    * Get TLV objects.
    */
  def parseList(data: String): js.Array[TLV] = js.native
  def parseList(data: String, encoding: Double): js.Array[TLV] = js.native
  def parseList(data: Buffer): js.Array[TLV] = js.native
  def parseList(data: Buffer, encoding: Double): js.Array[TLV] = js.native
}
