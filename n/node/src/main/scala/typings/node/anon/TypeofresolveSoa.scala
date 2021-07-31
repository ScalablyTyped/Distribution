package typings.node.anon

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.SoaRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofresolveSoa extends StObject {
  
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  
  def __promisify__(hostname: String): js.Promise[SoaRecord] = js.native
}
