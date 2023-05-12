package typings.mimetext.mod

import typings.mimetext.anon.PartialEnvironmentContext
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIMEMessageContent extends StObject {
  
  def dump(envctx: PartialEnvironmentContext, boundaries: MailboxBoundaries): String
  
  def getHeader(key: String): js.UndefOr[String]
  
  def getHeaders(): Record[String, String]
  
  def isAttachment(): Boolean
  
  def setHeader(key: String, value: String): this.type
  
  def setHeaders(headers: MessageHeaders): this.type
}
object MIMEMessageContent {
  
  inline def apply(
    dump: (PartialEnvironmentContext, MailboxBoundaries) => String,
    getHeader: String => js.UndefOr[String],
    getHeaders: () => Record[String, String],
    isAttachment: () => Boolean,
    setHeader: (String, String) => MIMEMessageContent,
    setHeaders: MessageHeaders => MIMEMessageContent
  ): MIMEMessageContent = {
    val __obj = js.Dynamic.literal(dump = js.Any.fromFunction2(dump), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), isAttachment = js.Any.fromFunction0(isAttachment), setHeader = js.Any.fromFunction2(setHeader), setHeaders = js.Any.fromFunction1(setHeaders))
    __obj.asInstanceOf[MIMEMessageContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIMEMessageContent] (val x: Self) extends AnyVal {
    
    inline def setDump(value: (PartialEnvironmentContext, MailboxBoundaries) => String): Self = StObject.set(x, "dump", js.Any.fromFunction2(value))
    
    inline def setGetHeader(value: String => js.UndefOr[String]): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaders(value: () => Record[String, String]): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    inline def setIsAttachment(value: () => Boolean): Self = StObject.set(x, "isAttachment", js.Any.fromFunction0(value))
    
    inline def setSetHeader(value: (String, String) => MIMEMessageContent): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    
    inline def setSetHeaders(value: MessageHeaders => MIMEMessageContent): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
  }
}
