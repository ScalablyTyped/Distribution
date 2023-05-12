package typings.mimetext.mod

import typings.mimetext.anon.RequiredMailboxInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mailbox extends StObject {
  
  def createMailbox(): Unit
  
  def dump(): String
  
  def findInputType(input: String): InputType
  
  def getAddrDomain(): String
  
  def parseSpecCompliantText(text: String): MailLocationData
  
  def toObject(): RequiredMailboxInput
}
object Mailbox {
  
  inline def apply(
    createMailbox: () => Unit,
    dump: () => String,
    findInputType: String => InputType,
    getAddrDomain: () => String,
    parseSpecCompliantText: String => MailLocationData,
    toObject: () => RequiredMailboxInput
  ): Mailbox = {
    val __obj = js.Dynamic.literal(createMailbox = js.Any.fromFunction0(createMailbox), dump = js.Any.fromFunction0(dump), findInputType = js.Any.fromFunction1(findInputType), getAddrDomain = js.Any.fromFunction0(getAddrDomain), parseSpecCompliantText = js.Any.fromFunction1(parseSpecCompliantText), toObject = js.Any.fromFunction0(toObject))
    __obj.asInstanceOf[Mailbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mailbox] (val x: Self) extends AnyVal {
    
    inline def setCreateMailbox(value: () => Unit): Self = StObject.set(x, "createMailbox", js.Any.fromFunction0(value))
    
    inline def setDump(value: () => String): Self = StObject.set(x, "dump", js.Any.fromFunction0(value))
    
    inline def setFindInputType(value: String => InputType): Self = StObject.set(x, "findInputType", js.Any.fromFunction1(value))
    
    inline def setGetAddrDomain(value: () => String): Self = StObject.set(x, "getAddrDomain", js.Any.fromFunction0(value))
    
    inline def setParseSpecCompliantText(value: String => MailLocationData): Self = StObject.set(x, "parseSpecCompliantText", js.Any.fromFunction1(value))
    
    inline def setToObject(value: () => RequiredMailboxInput): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
  }
}
