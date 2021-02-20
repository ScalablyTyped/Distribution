package typings.pgEars

import typings.pgEars.anon.ClientConfigmaxAttemptsnu
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-ears", JSImport.Namespace)
  @js.native
  def apply(opts: ClientConfigmaxAttemptsnu): PgEars = js.native
  
  @js.native
  trait PgEars extends StObject {
    
    def listen(channel: String, cb: js.Function2[/* err */ Error | Null, /* payload */ js.UndefOr[String], Unit]): Null = js.native
    
    def notify(channel: String, payload: js.Any): Unit = js.native
    def notify(channel: String, payload: js.Any, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
}
