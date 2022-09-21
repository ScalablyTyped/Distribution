package typings.minio.mod

import typings.minio.minioStrings.close
import typings.minio.minioStrings.data
import typings.minio.minioStrings.end
import typings.minio.minioStrings.error
import typings.minio.minioStrings.pause
import typings.minio.minioStrings.readable
import typings.minio.minioStrings.resume
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketStream[T] extends Readable {
  
  def on(event: end | pause | readable | resume | close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* item */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
}
