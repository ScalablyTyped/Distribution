package typings.mz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object readlineMod {
  
  type AsyncCompleter = (js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[scala.Null | typings.std.Error], 
      /* result */ js.UndefOr[typings.node.readlineMod.CompleterResult], 
      scala.Unit
    ], 
    scala.Unit
  ]) | (js.Function1[/* line */ java.lang.String, js.Promise[typings.node.readlineMod.CompleterResult]])
  
  type Completer = typings.mz.readlineMod.AsyncCompleter | typings.node.readlineMod.Completer
  
  type ReadLine = typings.mz.readlineMod.Interface
}
