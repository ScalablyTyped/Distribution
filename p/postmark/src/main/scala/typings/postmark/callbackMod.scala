package typings.postmark

import typings.postmark.errorsMod.PostmarkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  type Callback[T] = js.Function2[/* error */ PostmarkError | Null, /* result */ T | Null, Unit]
}
