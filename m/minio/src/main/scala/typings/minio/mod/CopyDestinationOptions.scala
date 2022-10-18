package typings.minio.mod

import typings.minio.anon.Bucket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "CopyDestinationOptions")
@js.native
open class CopyDestinationOptions protected () extends StObject {
  def this(options: Bucket) = this()
  
  def getHeaders(): Record[String, String] = js.native
  
  def validate(): Boolean = js.native
}
