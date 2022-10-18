package typings.nodemailer

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSmtpConnectionDataStreamMod {
  
  /**
    * Escapes dots in the beginning of lines. Ends the stream with <CR><LF>.<CR><LF>
    * Also makes sure that only <CR><LF> sequences are used for linebreaks
    */
  @JSImport("nodemailer/lib/smtp-connection/data-stream", JSImport.Namespace)
  @js.native
  open class ^ () extends Transform
  
  /**
    * Escapes dots in the beginning of lines. Ends the stream with <CR><LF>.<CR><LF>
    * Also makes sure that only <CR><LF> sequences are used for linebreaks
    */
  type DataStream = Transform
}
