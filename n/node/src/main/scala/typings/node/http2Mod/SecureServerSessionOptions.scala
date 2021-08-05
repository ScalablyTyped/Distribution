package typings.node.http2Mod

import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureServerSessionOptions
  extends StObject
     with ServerSessionOptions
     with TlsOptions
object SecureServerSessionOptions {
  
  inline def apply(): SecureServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerSessionOptions]
  }
}
