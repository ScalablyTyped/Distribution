package typings.mimetext

import typings.mimetext.mod.InputType
import typings.mimetext.mod.MIMEPlacement
import typings.mimetext.mod.RecipientType
import typings.mimetext.mod.TextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimetextStrings {
  
  @js.native
  sealed trait OBJECT
    extends StObject
       with InputType
  inline def OBJECT: OBJECT = "OBJECT".asInstanceOf[OBJECT]
  
  @js.native
  sealed trait SPEC_COMPLIANT_TEXT
    extends StObject
       with InputType
  inline def SPEC_COMPLIANT_TEXT: SPEC_COMPLIANT_TEXT = "SPEC_COMPLIANT_TEXT".asInstanceOf[SPEC_COMPLIANT_TEXT]
  
  @js.native
  sealed trait TEXT
    extends StObject
       with InputType
  inline def TEXT: TEXT = "TEXT".asInstanceOf[TEXT]
  
  @js.native
  sealed trait bcc
    extends StObject
       with RecipientType
  inline def bcc: bcc = "bcc".asInstanceOf[bcc]
  
  @js.native
  sealed trait cc
    extends StObject
       with RecipientType
  inline def cc: cc = "cc".asInstanceOf[cc]
  
  @js.native
  sealed trait content
    extends StObject
       with MIMEPlacement
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait header
    extends StObject
       with MIMEPlacement
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait textSlashhtml
    extends StObject
       with TextFormat
  inline def textSlashhtml: textSlashhtml = "text/html".asInstanceOf[textSlashhtml]
  
  @js.native
  sealed trait textSlashplain
    extends StObject
       with TextFormat
  inline def textSlashplain: textSlashplain = "text/plain".asInstanceOf[textSlashplain]
  
  @js.native
  sealed trait to
    extends StObject
       with RecipientType
  inline def to: to = "to".asInstanceOf[to]
}
