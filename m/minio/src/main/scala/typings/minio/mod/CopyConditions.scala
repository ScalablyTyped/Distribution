package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "CopyConditions")
@js.native
open class CopyConditions () extends StObject {
  
  def setMatchETag(etag: String): Unit = js.native
  
  def setMatchETagExcept(etag: String): Unit = js.native
  
  def setModified(date: js.Date): Unit = js.native
  
  def setUnmodified(date: js.Date): Unit = js.native
}
