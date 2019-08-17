package typings.pixlDashXml.pixlDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixl-xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def alwaysArray[T](input: T): js.Array[T] = js.native
  def alwaysArray[T](input: js.Array[T]): js.Array[T] = js.native
  def decodeEntities(xml: String): String = js.native
  def encodeAttribEntities(xml: String): String = js.native
  def encodeEntities(xml: String): String = js.native
  def firstKey(hash: js.Object): String = js.native
  def hashKeysToArray(input: js.Object): js.Array[String] = js.native
  def isaArray(input: js.Any): Boolean = js.native
  def isaHash(input: js.Any): Boolean = js.native
  def numKeys(hash: js.Object): Double = js.native
  def parse(xml: String): js.Object = js.native
  def parse(xml: String, options: PixlParseOptions): js.Object = js.native
  def stringify(doc: js.Object): String = js.native
  def stringify(doc: js.Object, outerElName: String): String = js.native
  def stringify(doc: js.Object, outerElName: String, indentSize: Double): String = js.native
  def stringify(doc: js.Object, outerElName: String, indentSize: Double, indentCharacter: String): String = js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String
  ): String = js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
}

