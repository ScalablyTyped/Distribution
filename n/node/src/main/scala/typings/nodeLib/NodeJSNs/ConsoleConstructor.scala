package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleConstructor
  extends ScalablyTyped.runtime.Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, nodeLib.Console]
     with ScalablyTyped.runtime.Instantiable3[
      /* stdout */ WritableStream, 
      /* stderr */ WritableStream, 
      /* ignoreErrors */ scala.Boolean, 
      nodeLib.Console
    ]
     with ScalablyTyped.runtime.Instantiable1[
      (/* stdout */ WritableStream) | (/* options */ ConsoleConstructorOptions), 
      nodeLib.Console
    ]

