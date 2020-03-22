package typings.nodemailer.mimeNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Transform
import typings.nodemailer.AnonValue
import typings.std.Error
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
  def addHeader(headers: js.Array[AnonValue]): this.type = js.native
  def addHeader(headers: StringDictionary[String]): this.type = js.native
  /**
    * Adds a header value. If the value for selected key exists, the value is appended
    * as a new field and old one is not touched.
    * You can set multiple values as well by using [{key:'', value:''}] or
    * {key: 'value'} as the first argument.
    */
  def addHeader(key: String, value: String): this.type = js.native
  /** Appends an existing node to the mime tree. Removes the node from an existing tree if needed */
  def appendChild(childNode: MimeNode): MimeNode = js.native
  def build(): js.Promise[Buffer] = js.native
  /** Generate the message and return it with a callback or promise */
  def build(callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
  /** Builds the header block for the mime node. Append \r\n\r\n before writing the content */
  def buildHeaders(): String = js.native
  /** Creates and appends a child node.Arguments provided are passed to MimeNode constructor */
  def createChild(contentType: String): MimeNode = js.native
  def createChild(contentType: String, options: Options): MimeNode = js.native
  /**
    * Streams the rfc2822 message from the current node. If this is a root node,
    * mandatory header fields are set if missing (Date, Message-Id, MIME-Version)
    */
  def createReadStream(): Readable = js.native
  def createReadStream(options: ReadableOptions): Readable = js.native
  /** Generates and returns an object with parsed address fields */
  def getAddresses(): Addresses = js.native
  /** Generates and returns SMTP envelope with the sender address and a list of recipients addresses */
  def getEnvelope(): Envelope = js.native
  /** Retrieves the first mathcing value of a selected key */
  def getHeader(key: String): String = js.native
  def getTransferEncoding(): String = js.native
  /** Returns Message-Id value. If it does not exist, then creates one */
  def messageId(): String = js.native
  /**
    * Appends a post process function. The functon is run after transforms and
    * uses the following syntax
    *
    *   processFunc(input) -> outputStream
    */
  def processFunc(processFunc: js.Function1[/* outputStream */ Readable, Readable]): Unit = js.native
  /** Removes current node from the mime tree */
  def remove(): this.type = js.native
  /** Replaces current node with another node */
  def replace(node: MimeNode): MimeNode = js.native
  /**
    * Sets body content for current node. If the value is a string, charset is added automatically
    * to Content-Type (if it is text/ *). If the value is a Buffer, you need to specify
    * the charset yourself
    */
  def setContent(content: String): this.type = js.native
  def setContent(content: Buffer): this.type = js.native
  def setContent(content: Readable): this.type = js.native
  /** Sets envelope to be used instead of the generated one */
  def setEnvelope(envelope: typings.nodemailer.mailerMod.Envelope): this.type = js.native
  def setHeader(headers: js.Array[AnonValue]): this.type = js.native
  def setHeader(headers: StringDictionary[String]): this.type = js.native
  /**
    * Sets a header value. If the value for selected key exists, it is overwritten.
    * You can set multiple values as well by using [{key:'', value:''}] or
    * {key: 'value'} as the first argument.
    */
  def setHeader(key: String, value: String): this.type = js.native
  def setHeader(key: String, value: js.Array[String]): this.type = js.native
  /** Sets pregenerated content that will be used as the output of this node */
  def setRaw(raw: String): this.type = js.native
  def setRaw(raw: Buffer): this.type = js.native
  def setRaw(raw: Readable): this.type = js.native
  def stream(
    outputStream: Readable,
    options: ReadableOptions,
    done: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  /**
    * Appends a transform stream object to the transforms list. Final output
    * is passed through this stream before exposing
    */
  def transform(transform: Transform): Unit = js.native
}

