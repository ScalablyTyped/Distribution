package typings.monacoEditor.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type IEvent[T] = js.Function2[
/* listener */ js.Function1[/* e */ T, Any], 
/* thisArg */ js.UndefOr[Any], 
IDisposable]

type Thenable[T] = PromiseLike[T]
