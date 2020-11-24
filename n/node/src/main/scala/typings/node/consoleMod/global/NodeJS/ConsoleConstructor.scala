package typings.node.consoleMod.global.NodeJS

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.node.NodeJS.WritableStream
import typings.node.consoleMod.global.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleConstructor
  extends Instantiable1[
      (/* options */ ConsoleConstructorOptions) | (/* stdout */ WritableStream), 
      Console_
    ]
     with Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, Console_]
     with Instantiable3[
      /* stdout */ WritableStream, 
      js.UndefOr[/* stderr */ WritableStream], 
      /* ignoreErrors */ Boolean, 
      Console_
    ]
