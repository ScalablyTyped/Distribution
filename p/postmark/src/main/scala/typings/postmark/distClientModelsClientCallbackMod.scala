package typings.postmark

import typings.postmark.distClientErrorsErrorsMod.PostmarkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsClientCallbackMod {
  
  type Callback[T] = js.Function2[/* error */ PostmarkError | Null, /* result */ T | Null, Unit]
}
