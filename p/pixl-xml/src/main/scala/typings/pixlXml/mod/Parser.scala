package typings.pixlXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixl-xml", "Parser")
@js.native
class Parser[OutputJsonInterface] protected () extends js.Object {
  def this(xml: String) = this()
  def this(xml: String, options: PixlParseOptions) = this()
  var attribsKey: String = js.native
  var dataKey: String = js.native
  var documentNodeName: String = js.native
  var dtdNodeList: js.Array[String] = js.native
  var errors: js.Array[_] = js.native
  var piNodeList: js.Array[String] = js.native
  /**
    * The XML input that was provided to the constructor
    */
  var text: String = js.native
  /**
    * The resulting JSON from the parse operation
    */
  var tree: OutputJsonInterface = js.native
  /**
    * Returns an XML string with formatting determined by the params provided
    * @param indentCharacter
    * @param eol
    */
  def compose(): String = js.native
  def compose(indentCharacter: String): String = js.native
  def compose(indentCharacter: String, eol: String): String = js.native
  /**
    * Returns the parsed XML tree. This tree is mutable and can be modified
    * as necessary.
    */
  def getTree(): OutputJsonInterface = js.native
}

