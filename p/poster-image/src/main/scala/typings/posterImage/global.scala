package typings.posterImage

import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def poster(file: Blob): js.Promise[Blob] = js.Dynamic.global.applyDynamic("poster")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def poster(file: File): js.Promise[Blob] = js.Dynamic.global.applyDynamic("poster")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
}
