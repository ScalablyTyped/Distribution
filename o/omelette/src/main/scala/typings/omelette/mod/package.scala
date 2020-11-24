package typings.omelette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* obj */ typings.omelette.mod.CallbackValue, scala.Unit]
  
  type CallbackAsync = js.Function1[/* obj */ typings.omelette.mod.CallbackAsyncValue, js.Promise[scala.Unit]]
  
  type Choices = js.Array[java.lang.String]
  
  type ReplyFn[T] = js.Function1[/* value */ T, scala.Unit]
  
  type TemplatePrimativeValue = java.lang.String | typings.omelette.mod.Choices
  
  type TemplateValue = typings.omelette.mod.TemplatePrimativeValue | typings.omelette.mod.Callback
  
  type TreeValue = org.scalablytyped.runtime.StringDictionary[typings.omelette.mod.Choices]
}
