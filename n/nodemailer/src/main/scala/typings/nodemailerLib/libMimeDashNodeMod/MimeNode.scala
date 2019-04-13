package typings
package nodemailerLib.libMimeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new mime tree node. Assumes 'multipart/ *' as the content type
  * if it is a branch, anything else counts as leaf. If rootNode is missing from
  * the options, assumes this is the root.
  */
@js.native
trait MimeNode extends js.Object {
  def addHeader(headers: js.Array[nodemailerLib.Anon_KeyValue]): this.type = js.native
  def addHeader(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  /**
    * Adds a header value. If the value for selected key exists, the value is appended
    * as a new field and old one is not touched.
    * You can set multiple values as well by using [{key:'', value:''}] or
    * {key: 'value'} as the first argument.
    */
  def addHeader(key: java.lang.String, value: java.lang.String): this.type = js.native
  /** Appends an existing node to the mime tree. Removes the node from an existing tree if needed */
  def appendChild(childNode: MimeNode): MimeNode = js.native
  /** Generate the message and return it with a callback */
  def build(callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  /** Builds the header block for the mime node. Append \r\n\r\n before writing the content */
  def buildHeaders(): java.lang.String = js.native
  /** Creates and appends a child node.Arguments provided are passed to MimeNode constructor */
  def createChild(contentType: java.lang.String): MimeNode = js.native
  def createChild(contentType: java.lang.String, options: Options): MimeNode = js.native
  /**
    * Streams the rfc2822 message from the current node. If this is a root node,
    * mandatory header fields are set if missing (Date, Message-Id, MIME-Version)
    */
  def createReadStream(): nodeLib.streamMod.Readable = js.native
  def createReadStream(options: nodeLib.streamMod.ReadableOptions): nodeLib.streamMod.Readable = js.native
  /** Generates and returns an object with parsed address fields */
  def getAddresses(): Addresses = js.native
  /** Generates and returns SMTP envelope with the sender address and a list of recipients addresses */
  def getEnvelope(): Envelope = js.native
  /** Retrieves the first mathcing value of a selected key */
  def getHeader(key: java.lang.String): java.lang.String = js.native
  def getTransferEncoding(): java.lang.String = js.native
  /** Returns Message-Id value. If it does not exist, then creates one */
  def messageId(): java.lang.String = js.native
  /**
    * Appends a post process function. The functon is run after transforms and
    * uses the following syntax
    *
    *   processFunc(input) -> outputStream
    */
  def processFunc(
    processFunc: js.Function1[/* outputStream */ nodeLib.streamMod.Readable, nodeLib.streamMod.Readable]
  ): scala.Unit = js.native
  /** Removes current node from the mime tree */
  def remove(): this.type = js.native
  /** Replaces current node with another node */
  def replace(node: MimeNode): MimeNode = js.native
  /**
    * Sets body content for current node. If the value is a string, charset is added automatically
    * to Content-Type (if it is text/ *). If the value is a Buffer, you need to specify
    * the charset yourself
    */
  def setContent(content: java.lang.String): this.type = js.native
  def setContent(content: nodeLib.Buffer): this.type = js.native
  def setContent(content: nodeLib.streamMod.Readable): this.type = js.native
  /** Sets envelope to be used instead of the generated one */
  def setEnvelope(envelope: nodemailerLib.libMailerMod.Envelope): this.type = js.native
  def setHeader(headers: js.Array[nodemailerLib.Anon_KeyValue]): this.type = js.native
  def setHeader(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  /**
    * Sets a header value. If the value for selected key exists, it is overwritten.
    * You can set multiple values as well by using [{key:'', value:''}] or
    * {key: 'value'} as the first argument.
    */
  def setHeader(key: java.lang.String, value: java.lang.String): this.type = js.native
  def setHeader(key: java.lang.String, value: js.Array[java.lang.String]): this.type = js.native
  /** Sets pregenerated content that will be used as the output of this node */
  def setRaw(raw: java.lang.String): this.type = js.native
  def setRaw(raw: nodeLib.Buffer): this.type = js.native
  def setRaw(raw: nodeLib.streamMod.Readable): this.type = js.native
  def stream(
    outputStream: nodeLib.streamMod.Readable,
    options: nodeLib.streamMod.ReadableOptions,
    done: js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Appends a transform stream object to the transforms list. Final output
    * is passed through this stream before exposing
    */
  def transform(transform: nodeLib.streamMod.Transform): scala.Unit = js.native
}

