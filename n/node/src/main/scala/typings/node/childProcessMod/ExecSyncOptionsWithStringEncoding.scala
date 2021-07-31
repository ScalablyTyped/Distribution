package typings.node.childProcessMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecSyncOptionsWithStringEncoding
  extends StObject
     with ExecSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithStringEncoding: BufferEncoding
}
object ExecSyncOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecSyncOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class ExecSyncOptionsWithStringEncodingMutableBuilder[Self <: ExecSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
