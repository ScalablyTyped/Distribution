package typings
package mermaidLib.mermaidAPIMod.mermaidAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("mermaid/mermaidAPI/mermaidAPI", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait Debug
    extends mermaidLib.mermaidAPIMod.mermaidAPINs.LogLevel
  
  @js.native
  sealed trait Error
    extends mermaidLib.mermaidAPIMod.mermaidAPINs.LogLevel
  
  @js.native
  sealed trait Fatal
    extends mermaidLib.mermaidAPIMod.mermaidAPINs.LogLevel
  
  @js.native
  sealed trait Info
    extends mermaidLib.mermaidAPIMod.mermaidAPINs.LogLevel
  
  @js.native
  sealed trait Warn
    extends mermaidLib.mermaidAPIMod.mermaidAPINs.LogLevel
  
}

