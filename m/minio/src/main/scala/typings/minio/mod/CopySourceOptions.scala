package typings.minio.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "CopySourceOptions")
@js.native
open class CopySourceOptions protected () extends StObject {
  def this(options: typings.minio.anon.Encryption) = this()
  
  def getHeaders(): Record[String, String] = js.native
  
  def validate(): Boolean = js.native
}
