package typings.posterImage

import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(file: Blob): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  @scala.inline
  def apply(file: File): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  
  @JSImport("poster-image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
