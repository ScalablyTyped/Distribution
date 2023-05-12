package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MimeMessage extends StObject {
  
  def asAttachments(): js.Array[MIMEMessageContent] = js.native
  
  def asEncoded(): String = js.native
  
  def asRaw(): String = js.native
  
  def generateBoundaries(): MailboxBoundaries = js.native
  
  def getHeader(key: String): js.UndefOr[String] = js.native
  
  def getMessageByType(`type`: String): js.UndefOr[MIMEMessageContent] = js.native
  
  def getRecipients(): js.Array[Mailbox] = js.native
  def getRecipients(options: RecipientOptions): js.Array[Mailbox] = js.native
  
  def getSender(): Mailbox = js.native
  
  def getSubject(): js.UndefOr[String] = js.native
  
  def setAttachment(name: String, `type`: MIMEType, attachment: String): MIMEMessageContent = js.native
  
  def setBcc(bcc: js.Array[MailLocation]): js.Array[Mailbox] = js.native
  def setBcc(bcc: MailLocation): js.Array[Mailbox] = js.native
  
  def setCc(cc: js.Array[MailLocation]): js.Array[Mailbox] = js.native
  def setCc(cc: MailLocation): js.Array[Mailbox] = js.native
  
  def setHeader(key: String, value: String): String = js.native
  
  def setMessage(format: TextFormat, message: String): MIMEMessageContent = js.native
  def setMessage(format: TextFormat, message: String, moreHeaders: MessageHeaders): MIMEMessageContent = js.native
  
  def setRecipient(recipient: js.Array[MailLocation]): js.Array[Mailbox] = js.native
  def setRecipient(recipient: js.Array[MailLocation], options: RecipientOptions): js.Array[Mailbox] = js.native
  def setRecipient(recipient: MailLocation): js.Array[Mailbox] = js.native
  def setRecipient(recipient: MailLocation, options: RecipientOptions): js.Array[Mailbox] = js.native
  
  def setSender(sender: js.Array[MailLocation]): Mailbox = js.native
  def setSender(sender: MailLocation): Mailbox = js.native
  
  def setSubject(subject: String): String = js.native
  
  def setTo(to: js.Array[MailLocation]): js.Array[Mailbox] = js.native
  def setTo(to: MailLocation): js.Array[Mailbox] = js.native
}
